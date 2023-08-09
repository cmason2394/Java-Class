import java.util.Scanner;

public class NestedLoopSpacedOutput {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();
      scnr.close();

      /* Outer for loop to print integers from 0 to userNum  */
      /*inner while loop prints a leading space before each integer
       * as long as the inner loop counter is less than the outer
       * loop counter*/
      for (i = 0; i <= userNum; ++i) {
         j = 0;
         while (j < i) {
            System.out.print(" ");
            ++j;
         }
         System.out.println(i);
      }

   }
}
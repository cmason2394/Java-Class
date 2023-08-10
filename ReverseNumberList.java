import java.util.Scanner;

public class ReverseNumberList {
      public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list

      System.out.print("Enter the number of elements in your list: ");
      numElements = scnr.nextInt();   // Input begins with number of integers that follow

      //for loop to input the numbers into an array
      for (int i = 0; i < numElements; ++i) {
        System.out.print("Enter number " + (i + 1) + ": ");
        userList[i] = scnr.nextInt();
        System.out.println();
      }

      scnr.close();

      //for loop to output the array in reverse
      for (int i = numElements - 1; i >= 0; --i) {
        System.out.print(userList[i] + " ");
      }
   }
}

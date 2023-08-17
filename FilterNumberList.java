import java.util.Scanner;

public class FilterNumberList {
    public static void getUserValues(int[] array, int arrSize, Scanner scnr) {
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter next integer: ");
            array[i] = scnr.nextInt();
            System.out.println();
        }
    }

    public static void outputIntsLessThanOrEqualToThreshold(int[] array, int arrSize, int threshold) {
        for (int i = 0; i < arrSize; i++) {
            if (array[i] <= threshold) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];
      int upperThreshold;
      int numVals;

      System.out.print("Enter number of integers in your list: ");
      numVals = scnr.nextInt();
      getUserValues(userValues, numVals, scnr);
      System.out.println();

      System.out.print("Enter the upper threshold by which to filter: ");
      upperThreshold = scnr.nextInt();
      scnr.close();
      System.out.println();

      outputIntsLessThanOrEqualToThreshold(userValues, numVals, upperThreshold);
   }
}

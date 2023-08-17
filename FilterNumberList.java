import java.util.Scanner;

public class FilterNumberList {
    public static void getUserValues(int[] array, int arrSize, Scanner scnr) {
        for (int i = 0; i < arrSize; i++) {
            array[i] = scnr.nextInt();
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

      numVals = scnr.nextInt();
      getUserValues(userValues, numVals, scnr);

      upperThreshold = scnr.nextInt();
      outputIntsLessThanOrEqualToThreshold(userValues, numVals, upperThreshold);
   }
}

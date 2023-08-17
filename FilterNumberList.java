import java.util.Scanner;

public class FilterNumberList {
    /**
     * The purpose of this program is to take a list of integers and filter 
     * them with an threshold.
     * @author Cassi Mason
     * @version 1.0
     * 
     */
    public static void getUserValues(int[] array, int arrSize, Scanner scnr) {
        /**
         * Use a for loop to input user numbers into an array
         * @param array is an empty array of integers, max length 20, into which to put the user numbers
         * @param arrSize is the length of the array, determined in main
         */
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter next integer: ");
            array[i] = scnr.nextInt();
            System.out.println();
        }
    }

    public static void outputIntsLessThanOrEqualToThreshold(int[] array, int arrSize, int threshold) {
        /**
         * Use a for loop to compare each user value to the maximum threshold limit
         * Filters results to only output values less than or equal to the maximum threshold
         * @param array: the user array collected in the method 'getUserValues'
         * @param arrSize: length of the array, see main method
         * @param threshold: the upper limit value to which to compare. From user input in main.
         */
        for (int i = 0; i < arrSize; i++) {
            if (array[i] <= threshold) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        /**
         * Method to get the length of the array and the upper threshold from the user
         * Calls the methods to populate the array and then filter its content to output only numbers less than or equal to the threshold
         */
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20]; //max 20 elements
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

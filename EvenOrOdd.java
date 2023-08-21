import java.util.Scanner;

public class EvenOrOdd {
    /**
     * Determines if an inputed list of integers contains all even numbers,
     * all odd numbers, or a mix of both
     * @param arrayValues array of user input integers
     * @param arraySize length of the array
     * 
     */
    public static boolean isArrayEven(int[] arrayValues, int arraySize) {
        /**
         * Determine if every element in an array is even
         * @return boolean value, true if all even, false if not
         */
        boolean isEven = true;

        for (int i = 0; i < arraySize; i++) {
            if (arrayValues[i] % 2 != 0) { //element not evenly divisible by 2
                isEven = false;
                break;
            }
        }

        return isEven;
    }

    public static boolean isArrayOdd(int[] arrayValues, int arraySize) {
        /**
         * Determine if every element in an array is odd
         * @return boolean value, true if all odd, false if not
         */

        boolean isOdd = true;

        for (int i = 0; i < arraySize; i++) {
            if (arrayValues[i] % 2 == 0) { //element evenly divisible by 2
                isOdd = false;
                break;
            }
        }

        return isOdd;
    }

    public static void main(String[] args) {
        /**
         * puts user input into an array with a for loop
         * if/else statement to call the even and odd functions
         * determines if the array is all odd, all even, or neither
         * outputs an appropriate response
         */

         int i = 0;
         int arrayLength = 0;
         Scanner scnr = new Scanner(System.in);
        
         System.out.println("How many integers do you wish to enter?");
         arrayLength = scnr.nextInt();

         int[] userInputs = new int[arrayLength];

         for (i = 0; i < arrayLength; i++) {
            System.out.print("Enter next input: ");
            userInputs[i] = scnr.nextInt();
            }

         scnr.close();


        if (isArrayEven(userInputs, arrayLength) == true) {
            System.out.println("all even");
        }

        else if (isArrayOdd(userInputs, arrayLength) == true) {
            System.out.println("all odd");
        }

        else {
            System.out.println("not even or odd");
        }

    }
}

import java.util.Scanner;

public class NormalizeValues {
    public static void main(String[] args) {
        //initialize variables
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        final int NUM_VALS = scnr.nextInt();    //length of array
        int[] dataSet = new int[NUM_VALS];      //array of user inputs
        int minVal;


        //for loop to get inputs
        for (int i = 0; i < dataSet.length; ++i) {
            System.out.print("\nEnter integer " + (i + 1) + ": ");
            dataSet[i] = scnr.nextInt();
            System.out.println();
        }

        scnr.close();

        //for loop to find the smallest value
        minVal = dataSet[0];
        for (int i = 0; i < dataSet.length; ++i) {
            if (dataSet[i] < minVal) {
                minVal = dataSet[i];
            }
        }

        //for loop to subtract the smallest value from every element
        //and print it to the terminal
        System.out.print("Normalized data set: ");
        for (int i = 0; i < dataSet.length; ++i) {
            dataSet[i] -= minVal;
            System.out.print(dataSet[i] + " ");
        }

        System.out.println();
    }
}

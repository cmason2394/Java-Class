import java.util.Scanner;

public class smallestNumber {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int smallestNum;

        System.out.print("Enter the first integer: ");
        num1 = scnr.nextInt();
        System.out.print("\nEnter the second integer: ");
        num2 = scnr.nextInt();
        System.out.print("\n1Enter the third integer: ");
        num3 = scnr.nextInt();

        if ((num1 <= num2) && (num1 <= num3)) {
            smallestNum = num1;
        } 
        else if ((num2 < num1) && (num2 <= num3)) {
            smallestNum = num2;
        } else {
            smallestNum = num3;
        }

        System.out.println(smallestNum);

    }
}

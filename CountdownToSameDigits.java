import java.util.Scanner;

public class CountdownToSameDigits {
    public static void main(String[] args) {
        //declare variables
        int userInt;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter an integer between 11 and 100: ");
        userInt = scnr.nextInt();
        scnr.close();
        System.out.println();

        if (userInt < 11 || userInt > 100) {
            System.out.println("Input must be 11-100");
        }

        else {
            while (userInt % 11 != 0) {
                System.out.print(userInt + " ");
                --userInt;
            }

            System.out.print(userInt);
        }

    }
}

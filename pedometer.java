import java.util.Scanner;

public class pedometer {
    public static int feetToSteps(double feetWalked) {
        final double feetPerStep = 2.5;
        int numSteps = (int)(feetWalked / feetPerStep);
        return numSteps;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userFeet = 0;
        
        System.out.print("Enter the number of feet you walked: ");
        userFeet = scnr.nextDouble();
        scnr.close();
        System.out.println();

        System.out.print("Number of steps: ");
        System.out.println(feetToSteps(userFeet));
    }
}

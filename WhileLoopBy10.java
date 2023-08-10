import java.util.Scanner;

public class WhileLoopBy10 {
    public static void main(String[] args) {
        //declare variables
        int int1;
        int int2;
        Scanner scnr = new Scanner(System.in);

        //initialize variables
        System.out.print("Enter first integer: ");
        int1 = scnr.nextInt();
        System.out.print("\nEnter second integer: ");
        int2 = scnr.nextInt();

        //check to make sure second integer is bigger than the first
        if (int1 > int2) {
            System.out.println("Second integer can't be less than the first.");
        }
        
        //while loop to increment in1 by 10 while int1 <= int2
        while (int1 <= int2) {
            System.out.print(int1 + " ");
            int1 += 10;
        }
    }
}

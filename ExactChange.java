import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int totalChange;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the total amount of change (in pennies): ");
        totalChange = scnr.nextInt();
        scnr.close();

        if (totalChange < 0) {
            System.out.println("Invalid amount of change. Re-enter change: ");
            totalChange = scnr.nextInt();
        }

        else if (totalChange == 0) {
            System.out.println("No change");
        }

        else {

            if (totalChange >= 100) {
                dollars = totalChange / 100;

                if (dollars == 1) {
                    System.out.println("1 Dollar");
                } else {
                    System.out.println(dollars + " Dollars");
                }

                totalChange %= 100;
            }

            if (totalChange >= 25) {
                quarters = totalChange / 25;

                if (quarters == 1) {
                    System.out.println("1 Quarter");
                } else {
                    System.out.println(quarters + " Quarters");
                }

                totalChange %= 25;
            }

            if (totalChange >= 10) {
                dimes = totalChange / 10;

                if (dimes == 1) {
                    System.out.println("1 Dime");
                } else {
                    System.out.println(dimes + " Dimes");
                }

                totalChange %= 10;
            }
            
            if (totalChange >= 5) {
                nickels = totalChange / 5;

                if (nickels == 1) {
                    System.out.println("1 Nickel");
                } else {
                    System.out.println(nickels + " Nickels");
                }

                totalChange %= 5;
            } 

            if (0 < totalChange) {
                pennies = totalChange;

                if (pennies == 1) {
                        System.out.println("1 Penny");
                    } else {
                        System.out.println(pennies + " Pennies");
                    }
            }
        }
    }
}

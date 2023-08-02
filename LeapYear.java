import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;
        boolean isCenturyYear;
        boolean isDivisibleBy4;

        isLeapYear = false;

        System.out.print("Enter year: ");
        inputYear = scnr.nextInt();
        scnr.close();

        isCenturyYear = ((inputYear % 100) == 0);
        isDivisibleBy4 = ((inputYear % 4) == 0);

        //nested if statements to see if an input year divisible by 4 is a century year
        //and if it is a century year, only make it a leap year if it is divisible by 400
        //the rest of the divisible by 4 inputYears are leap years
        if (isDivisibleBy4) {
            if (isCenturyYear) {
                if (inputYear % 400 == 0) {
                    isLeapYear = true;
                }
            }

            else {
                isLeapYear = true;
            }
        }

        //if statement to print if a year is a leap year or not
        if (isLeapYear) {
            System.out.println(inputYear + " - leap year");
        }
        else {
            System.out.println(inputYear + " - not a leap year");
        }
        
    }
}

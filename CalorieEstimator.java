import java.util.Scanner;

public class CalorieEstimator {
   public static void main(String[] args) {
      //declare variables
      double caloriesBurnedWomen;
      double caloriesBurnedMen;
      int ageYears;
      double weightPounds;
      int heartRatePbm;
      int timeMinutes;
      Scanner scnr = new Scanner(System.in);

      //initialize variables
      System.out.print("Enter your age in years: ");
      ageYears = scnr.nextInt();
      System.out.print("Enter your weight in pounds: ");
      weightPounds = scnr.nextDouble();
      System.out.print("Enter your heart rate in beats per minute: ");
      heartRatePbm = scnr.nextInt();
      System.out.print("Enter the length of the workout in minutes: ");
      timeMinutes = scnr.nextInt();

      scnr.close();

      //calculate calories burned during workout
      caloriesBurnedWomen = ((ageYears * 0.074) - (weightPounds * 0.05741) + (heartRatePbm * 0.4472) - 20.4022) * (timeMinutes / 4.184);
      caloriesBurnedMen = ((ageYears * 0.2017) + (weightPounds * 0.09036) + (heartRatePbm * 0.6309) - 55.0969) * (timeMinutes / 4.184);

      //print results
      System.out.print("Women: ");
      System.out.printf("%.2f", caloriesBurnedWomen);
      System.out.println(" calories");
      System.out.print("Men: ");
      System.out.printf("%.2f", caloriesBurnedMen);
      System.out.println(" calories");
   }
} 

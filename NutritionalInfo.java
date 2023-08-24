import java.util.Scanner;

public class NutritionalInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      //foodItem object with no initial values, calls on default constructor
      FoodItem foodItem1 = new FoodItem();
      
      System.out.println("What food are you eating?");
      String itemName = scnr.next();
      System.out.println("How many grams of fat does one serving contain?");
      double amountFat = scnr.nextDouble();
      System.out.println("How many grams of carbohydrates does one serving contain?");
      double amountCarbs = scnr.nextDouble();
      System.out.println("How many grams of protein does one serving contain?");
      double amountProtein = scnr.nextDouble();
      
      //foodItem object with initial values, calls on second constructor
      FoodItem foodItem2 = new FoodItem(itemName, amountFat, amountCarbs, amountProtein);
      
      System.out.print("Enter number of servings: ");
      double numServings = scnr.nextDouble();
      System.out.println();

      scnr.close();
      
      //calls on printInfo of first fooditem object, default constructor initialized values to "None" for name and 0 for all other values
      //which will be printed by printInfo
      foodItem1.printInfo();
      System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings, 
                          foodItem1.getCalories(numServings));
                           
      System.out.println("\n");
        
      //calls on printInfo of second fooditem object, constructor initialized inputted values, which will be printed by printInfo
      foodItem2.printInfo();
      System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
                          foodItem2.getCalories(numServings));
   }
}

import java.util.Scanner;
import java.lang.Math;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Car myCar = new Car();
      
      System.out.print("Enter model year: ");
      int userYear = scnr.nextInt();
      System.out.print("\nEnter purchase price: ");
      int userPrice = scnr.nextInt();
      System.out.print("\nEnter the current year: ");
      int userCurrentYear = scnr.nextInt();
      scnr.close();
      
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);
      
      myCar.printInfo();
   }
}

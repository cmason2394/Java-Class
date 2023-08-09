import java.util.Scanner;

public class PrintColumnsAndRows {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      System.out.print("Enter the number of rows: ");
      numRows = scnr.nextInt();
      System.out.print("\nEnter the number of columns: ");
      numColumns = scnr.nextInt();
      System.out.println();

      /* Your solution goes here  */
      for (currentRow = 1; currentRow <= numRows; ++currentRow) {
         for (currentColumn = 'A'; currentColumn < 'A' + numColumns; ++currentColumn) {
            currentColumnLetter = (char)currentColumn;
            System.out.print("" + currentRow + "" + currentColumnLetter + " ");
         }
      }

      System.out.println("");
   }
}

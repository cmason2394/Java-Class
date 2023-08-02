import java.util.Scanner;

public class welcome {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        String userName;

        System.out.println("Please enter your username: ");
        userName = scnr.next();
        scnr.close();

        System.out.println("Hello " + userName + ", and welcome to CS Online!");
    }
}

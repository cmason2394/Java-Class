import java.util.Scanner;

public class WordFrequency {
    //method to determine how often a word in an array occurs
    public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
        //initiate variables
        int wordCount = 0;
        
        /*
         *for loop that compares currWord to every word in the array
         *and increases wordCount if they match
        */
        for (int i = 0; i < listSize; i++) {
            if (currWord.equals(wordsList[i])) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        //initiate variables
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many words will you enter?");
        final int LENGTH = scnr.nextInt();
        String[] userWords = new String[LENGTH];   //array of user words
        String compareWord = "";
        int[] frequencies = new int[LENGTH];   //array of frequency of each word

        //for loop to enter user words into an array
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Enter next word: ");
            userWords[i] = scnr.next();
            System.out.println();
        }

        scnr.close();

        //for loop to compare compareWord to every word in the array
        for (int i = 0; i< LENGTH; i++) {
            compareWord = userWords[i];
            frequencies[i] = getFrequencyOfWord(userWords, LENGTH, compareWord);
        }

        //for loop to print each word and its frequency
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(userWords[i] + " " + frequencies[i]);
        }

    }
}

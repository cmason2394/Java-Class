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
        //loop is only executing once rather than going through entire array
        //i starts and ends as the same value as the i for the loop that is calling it in main
        //I have tried changing the "inner i" to j, doesn't change
        //listLength doesn't change, so I don't know why the loop stops before it gets to its stopping condition
        //oh, it is going through the loop, but the condition of the if statement not working correctly
        //if statement not recognizing when 2 words are the same...
        //Lesson learned: for strings, compare with method equals() rather than equality operator
        for (int i = 0; i < listSize; i++) {
            System.out.println("   inner i: " + i);
            System.out.println("      " + currWord.equals(wordsList[i]));
            if (currWord.equals(wordsList[i])) {
                wordCount++;
                System.out.println("      if statement inner i: " + i);
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
            System.out.println("outer i: " + i);
            compareWord = userWords[i];
            frequencies[i] = getFrequencyOfWord(userWords, LENGTH, compareWord);
        }

        //for loop to print each word and its frequency
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(userWords[i] + " " + frequencies[i]);
        }

    }
}

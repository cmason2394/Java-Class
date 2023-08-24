import java.util.Scanner;

public class WordFrequency {
    public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
        int wordCount = 0;
        
        for (int i = 0; i < listSize; i++) {
            if (currWord == wordsList[i]) {
                wordCount++;
                System.out.println("current word: " + currWord);
                System.out.println("compared to " + wordsList[i]);
                System.out.println("word count: " + wordCount);
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        //initiate variables
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many words will you enter?");
        int listLength = scnr.nextInt();
        String[] userWords = new String[listLength];
        String compareWord = "";
        int frequency = 0;

        for (int i = 0; i < listLength; i++) {
            System.out.print("Enter next word: ");
            userWords[i] = scnr.next();
            System.out.println();
        }

        scnr.close();

        compareWord = userWords[0];

        while (compareWord <= userWords[listLength - 1]) {
            frequency = getFrequencyOfWord(userWords, listLength, compareWord);
            System.out.println(compareWord + " " + frequency);
            ++i;
            compareWord = userWords[i];
        }

    }
}

package Lesson06;
/*5. Write a Java method to count all words in a string.
Test Data: Input the string: The quick brown fox jumps over the lazy dog.
Expected Output: Number of words in the string: 9*/

import java.util.Scanner;

public class DU06OptionalTask05 {

    static int wordCount (String input) {
            String[] splitInputSentence = input.split(" ");
            int numberOfWords = splitInputSentence.length;
            return numberOfWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text in which you would like to count words: ");
        String inputText = scanner.nextLine();
        int numberOfWords = wordCount(inputText);
        System.out.println("This text contains " + numberOfWords + " words.");
    }
}

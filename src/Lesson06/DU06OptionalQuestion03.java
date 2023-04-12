package Lesson06;

/*Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
 and otherwise returns false.
 In main() method accept a string from user and count number of vowels in that string.*/

import java.util.Scanner;

public class DU06OptionalQuestion03 {

    static boolean isVowel (char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine().toLowerCase();

        int vowelsCount = 0;
        for (int x = 0; x < inputText.length(); x++) {
            if (isVowel(inputText.charAt(x))) {
                vowelsCount++;
            }
        }

        System.out.println("The number of vowels in this text is: " + vowelsCount);

    }


}

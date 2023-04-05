package Lesson5;

/*Enter a string of text from the keyboard, followed by one character.
Output indexes and the number of matches (look for occurrences of a character in a string) to the console. If no match
is found, output the corresponding text. */

import java.util.Arrays;
import java.util.Scanner;

public class L05DU01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String input = scanner.nextLine();

        System.out.println("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        int matchCount = 0;
        int[] indexes = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                indexes[matchCount] = i;
                matchCount++;
            }
        }
        //System.out.println("Indexes: " + Arrays.toString(indexes));
        // this is shorter but prints all indexes, including those that contain 0
        System.out.print("Indexes: [");
        for (int i = 0; i < matchCount; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(indexes[i]);
        }
        System.out.println("]");
        System.out.println("Count: " + matchCount);
    }
}

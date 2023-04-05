package Lesson5;

/*Write a program that creates a string, in which all
the integers starting from 1 are written out in one line
“123456789101112131415...”.
The string should be no longer than 1000 characters.
For the number n (entered from the keyboard), output the digit
on the n position (numbering starts with 1).*/

import java.util.Scanner;

public class L05DU02 {

    public static void main(String[] args) {

        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        String numberString = "";
        for (int i = 0; i < numbers.length; i++) {
            numberString = numberString + numbers[i];
        }

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = inputNumber.nextInt();

        char digit = numberString.charAt(n - 1);
        System.out.println("Digit at position " + n + ": " + digit);
    }
}

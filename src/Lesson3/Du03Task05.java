/*Positive, negative or zero
Write a program that prompts the user to input a number. The program should then output the number and a message saying whether the number is positive, negative, or zero.*/

package Lesson3;

import java.util.Scanner;

public class Du03Task05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and I'll tell if it is positive, negative, or zero: ");
        int x = input.nextInt();

        if (x > 0) {
            System.out.println("You've entered a positive number.");
        } else if (x < 0) {
            System.out.println("You've entered a negative number.");
        }
        else {
            System.out.println("You've entered a zero.");
        }

    }
}

package Lesson3;/*Write a program that asks the user to enter a number and displays the absolute value of that number.*/

import java.util.Scanner;

public class Du3Task02 {

    public static void main (String[] args) {
        Scanner inputnumber = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = inputnumber.nextInt();
        System.out.println("The absolute value of this number is: " + Math.abs(x));
    }
}


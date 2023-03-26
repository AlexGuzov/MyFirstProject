/* Leap Year
Any year is input by the user. Write a program to determine whether the year is a leap year or not.
Leap Years are any year that can be evenly divided by 4.
A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
Example : 1992      Leap Year
          2000      Leap Year
          1900      NOT a Leap Year*/
package Lesson3;

import java.util.Scanner;

public class Du03Task07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year in the format XXXX: ");
        int year = input.nextInt();

        if ( (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ) {
            System.out.println("This year is a leap year.");
        }
        else {
            System.out.println("This year is not a leap year.");
        }
    }
}

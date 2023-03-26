/*Largest Number
Write a program that asks the user to enter a numbers in three variables and then displays the largest number.*/

package Lesson3;

import java.util.Scanner;

public class Du03Task04 {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int y = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the third number and I will finally be able to compare all three and fulfil my purpose: ");
        int z = input3.nextInt();

        if (x > y && x > z) {
            System.out.println("The largest number of these three numbers is: " + x);
        }
        else if (y > z) {
            System.out.println("The largest number of these three numbers is: " + y);
        }
        else {
            System.out.println("The largest number of these three numbers is: " + z);
        }
    }
}

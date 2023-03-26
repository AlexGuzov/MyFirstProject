/*Valid Triangle
A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that asks the user to enter three integers as angles and check whether a triangle is valid or not.*/

package Lesson3;

import java.util.Scanner;

public class Du03Task06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value of a triangle's angle A: ");
        int a = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter an integer value of a triangle's angle B: ");
        int b = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter an integer value of a triangle's angle C: ");
        int c = input2.nextInt();

        if (a+b+c==180) {
            System.out.println("This triangle is valid.");
        }
        else {
            System.out.println("There can't be a triangle with such angles.");
        }
    }
}

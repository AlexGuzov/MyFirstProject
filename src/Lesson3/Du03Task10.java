/* Meaning of Grade
Write a program that prompts the user to enter grade. Your program should display the corresponding meaning of grade as per the following table
Grade   Meaning
A       Excellent
B       Good
C       Average
D       Deficient
F       Failing */

package Lesson3;

import java.util.Scanner;

public class Du03Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade in the 'X' format: ");
        char grade = input.next().charAt(0);

        switch (grade)

        {
            case 'A':
                System.out.print("Excellent!");
                break;
            case 'B':
                System.out.print("Good!");
                break;
            case 'C':
                System.out.print("Average");
                break;
            case 'D':
                System.out.print("Deficient");
                break;
            case 'F':
                System.out.print("Failing");
                break;
            case 'a':
                System.out.print("Excellent!");
                break;
            case 'b':
                System.out.print("Good!");
                break;
            case 'c':
                System.out.print("Average");
                break;
            case 'd':
                System.out.print("Deficient");
                break;
            case 'f':
                System.out.print("Failing");
                break;
        }
    }
}

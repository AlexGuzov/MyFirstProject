/* Grade Calculator
The marks obtained by a student in 3 different subjects are input by the user. Your program should calculate the average of subjects.
The student gets a grade as per the following rules:
Average Grade
90-100  A
80-89   B
70-79   C
60-69   D
0-59    F */

package Lesson3;

import java.util.Scanner;

public class Du03Task09 {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your grade for subject X: ");
        int grade1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your grade for subject Y: ");
        int grade2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your grade for subject Z: ");
        int grade3 = input3.nextInt();

        int average = ((grade1 + grade2 + grade3)/3);

        if (average <=100 && average >=90) {
            System.out.print("Your grade is: A");
        }
            else if (average <=89 && average >=80) {
            System.out.print("Your grade is: B");
        }
            else if (average <=79 && average >=70) {
            System.out.print("Your grade is: C");
        }
            else if (average <=69 && average >=60) {
            System.out.print("Your grade is: D");
        }
            else {
            System.out.print("Your grade is: F");
        }
    }
}

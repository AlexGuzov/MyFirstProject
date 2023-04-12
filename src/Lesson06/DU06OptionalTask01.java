package Lesson06;

/* Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0*/

import java.util.Scanner;

public class DU06OptionalTask01 {

    static int compareNumbers(int x, int y, int z) {
            return ( x < y ) ? ( x < z ? x : z) : ( y < z ? y : z);
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter another number: ");
        int number2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter another number: ");
        int number3 = scanner3.nextInt();

        int theSmallest = compareNumbers(number1, number2, number3);

        System.out.println("The smallest number is: " + theSmallest);
    }

}

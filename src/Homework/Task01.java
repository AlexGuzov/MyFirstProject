package Homework;

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {

        Scanner inputnumber = new Scanner(System.in);

        System.out.print("Enter x: ");

        int x = inputnumber.nextInt();

        System.out.print("Enter y: ");

        int y = inputnumber.nextInt();

        int intDividing = x / y;
        int remainder = x % y;
        double squareRoot = Math.sqrt(x);

        System.out.println("Result of dividing is: " + intDividing);
        System.out.println("Remainder of dividing is: " + remainder);
        System.out.println("Square root of is: " + squareRoot);
    }
}
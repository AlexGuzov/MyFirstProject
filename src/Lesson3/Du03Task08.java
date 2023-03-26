/*Telephone Bill
Write a program to calculate the monthly telephone bills as per the following rule:
Minimum Rs. 200 for up to 100 calls.
Plus Rs. 0.60 per call for next 50 calls.
Plus Rs. 0.50 per call for next 50 calls.
Plus Rs. 0.40 per call for any call beyond 200 calls.*/

package Lesson3;

import java.util.Scanner;

public class Du03Task08 {

    public static void main(String[] args) {

        Scanner callsinput = new Scanner(System.in);
        System.out.print("Enter the number calls you've made: ");

        int numberOfCalls = callsinput.nextInt();

        if (numberOfCalls <= 100) {
            System.out.print("Your telephone bill is Rs. 200");
        }
        else if (numberOfCalls <=150) {
            System.out.print("Your telephone bill is Rs. " + (200 + (numberOfCalls - 100) * 0.60));
        }

        else if (numberOfCalls <=200) {
            System.out.print("Your telephone bill is Rs. " + (200 + 50 * 0.60 + (numberOfCalls - 150) * 0.50));
        }

        else if (numberOfCalls >200) {
            System.out.print("Your telephone bill is Rs. " + (200 + 50 * 0.60 + 50 * 0.50 + (numberOfCalls - 200) * 0.40));
        }
    }
}

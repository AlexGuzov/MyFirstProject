package Lesson3;/*Discount and Revenue
 Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
 Write a program that asks the user to enter product price and quantity and then calculate the revenue.
 If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.*/

import java.util.Scanner;

public class Du3Task03 {
    public static void main(String[] args) {
        Scanner inputnumber = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = inputnumber.nextDouble();
        System.out.print("Enter product quantity : ");
        double quantity = inputnumber.nextDouble();

        double revenue = price * quantity;
        double discount = 0;

        if (revenue > 5000) {
            discount = revenue * 10/100;
            revenue = revenue - discount;
        }
        System.out.println("The discount is: " + discount);
        System.out.println("The net revenue is: " + revenue);
    }
}
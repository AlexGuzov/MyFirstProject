/*Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.*/
import java.util.Scanner;

public class Du3Task01 {
    public static void main (String[] args) {
        Scanner inputnumber = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = inputnumber.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " is an even number.");
            }
            else {
                System.out.println(x + " is an odd number.");
            }
    }
}

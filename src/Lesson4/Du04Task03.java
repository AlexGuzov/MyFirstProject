/* A narcissistic number or an Armstrong number is a natural number that is equal to the sum of its own digits each raised to
the power of the number of its digits. Output all Armstrong numbers in the range from 10 to 1,000,000 to the screen.
For example:
153 = 13
 + 53
 + 33 */

package Lesson4;

public class Du04Task03 {

    public static void main(String[] args) {

        for (int x = 10; x <= 1000000; x++) {
            int sum = 0;
            int digits = 0;
            int temp = x;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = x;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int j = 0; j < digits; j++) {
                    power = power * digit;
                }
                sum = sum + power;
                temp = temp / 10;
            }
            if (x == sum) {
                System.out.println(x);
            }
        }
    }
}
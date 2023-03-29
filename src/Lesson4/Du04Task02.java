/*Task 2
A prime number is a natural (positive integer) number that has exactly two varying natural divisors, one and itself.
In other words, the number N is prime, if it is greater than 1 and is thus divisible without remainder by _only_ 1 and N (itself).
 x > 1
 x % 1 == 0
 x % x == 0
Write a program that displays all the prime numbers in the range from 2 to 1,000,00.
Try not to perform unnecessary actions (for example, after you have found at least one nontrivial divisor, it is already clear that the number is composite and you do not
need to continue the check). Also note that the smallest divisor of a natural number n, if there is any, is located in the interval
[2; √n].*/

package Lesson4;

public class Du04Task02 {

    public static void main(String[] args) {

        for (int x = 2; x <= 1000000; x++) {
            if (x > 2 && x % 2 == 0) {
                continue;
            }
            boolean isPrime = true;
            for (int y = 2; y <= Math.sqrt(x); y++) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(x);
            }
        }
    }
}
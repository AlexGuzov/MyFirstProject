/*Task 1
Fibonacci numbers are a sequence of numbers, in which the first two numbers of the sequence are 0 and 1, and each successive
number is equal to the sum of two preceding ones.
Output all Fibonacci numbers in the range from 0 to 10,000,000
to the screen. */

package Lesson4;

    public class Du04Task01 {
        public static void main (String[] args) {

            int n1 = 0, n2 = 1, n3;
                System.out.print(n1 + " ");
            n3 = n1 + n2;
            while (n3 <= 10000) {
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
        }
    }

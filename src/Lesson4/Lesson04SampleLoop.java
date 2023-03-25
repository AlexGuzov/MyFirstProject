package Lesson4;

public class Lesson04SampleLoop {
    public static void main(String[] args) {
        long number = 5, faktorial = 1;

        for (int j = 1; j <= number; j++) {
            faktorial = faktorial * j;
        }
        System.out.print("Faktorial cisla " + number + " = " + faktorial);

/*     Example, in which all blocks are filled:
            for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }*/

/*        Example without the counter variable declaration
        (it is required if you need access to the counter
        beyond the loop body):*/

/*        int i;
        for (i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
        i=i+2;
        System.out.println(i);*/


    }
}

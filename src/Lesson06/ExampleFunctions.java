package Lesson06;

import java.util.Scanner;

public class ExampleFunctions {

    public static int convertAndShowSum (String string1, String string2) {
        int a = Integer.parseInt(string1);
        int b = Integer.parseInt(string2);
        return a+b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in) ;
        System.out.print ("Enter a number: ") ;
        String firstString = input.nextLine();

        System.out.print ("Enter another number: ") ;
        String secondString = input.nextLine();

        System.out.println ( "The sum is: " + convertAndShowSum(firstString, secondString) );
        }

/*    public static int random (int range) {
            return (int)(Math.random() * range);
    }
    public static void main(String[] args) {
        int x = 50;
        int r = random(x);
        System.out.println("Random number is: " + r);
    }*/
}


/*
vstup 2 strgingi
skonvertovat stringi na cisla a */
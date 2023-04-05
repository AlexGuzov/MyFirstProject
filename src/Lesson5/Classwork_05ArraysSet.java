package Lesson05Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Classwork_05ArraysSet {

    public static void main(String[] args) {
        Set<Integer> mnozina = new HashSet<>();

        for (int i = 0; i < 5; i++) {
           mnozina.add((int) (Math.random() * 10));
        }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Try to guess one of the five numbers I've generated: ");
            int input = scanner.nextInt();

            System.out.println(mnozina.contains(input) ? "Binho! You have guessed one" : "Sorry, you did not ques anything :(1" +
                    "");
            System.out.println("I've generated the following numbers: " + mnozina);
        }
    }

//generiruetsa 5 cisel, user enters a number, the program checks the list and tells the user if the number he entered is present in this set.
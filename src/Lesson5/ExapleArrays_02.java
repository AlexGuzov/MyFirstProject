package Lesson05Arrays;

import java.util.ArrayList;
import java.util.Random;

public class ExapleArrays_02 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(); //here we create a list

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100)); //here we add to items to the list
            }

            int average = 0;

            for (int i = 0; i < list.size(); i++)
                  average = average + list.get(i);

            average = average / list.size();

            System.out.println(list);
            System.out.println("The average of these numbers is: " + average);
        }
    }

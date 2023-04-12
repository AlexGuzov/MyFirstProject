package Lesson06;

public class HomeworkSandbox {

             static void checkAge(int age) {

                if ( age < 18 ) {
                    System.out.println("Access denied - you are now old enough");
                }

                else {
                    System.out.println("Access granted. Welcome to Pornhub!");
                }

            }

    public static void main(String[] args) {
                int age = 15;
                checkAge(age);

    }

    }


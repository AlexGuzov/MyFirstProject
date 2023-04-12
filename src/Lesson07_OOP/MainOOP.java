package Lesson07_OOP;

public class MainOOP {

    public static void main(String[] args) {

        Book someBook = new Book("Some random book title", 4);
            System.out.println(someBook);

        boolean success = someBook.borrow();
        success = someBook.returnBook();
        System.out.println("Pozicanie bolo " + success);
        System.out.println(someBook);
        success = someBook.borrow();
        System.out.println("Pozicanie bolo " + success);
        System.out.println(someBook);
        success = someBook.borrow();
        System.out.println("Pozicanie bolo " + success);
        System.out.println(someBook);
        success = someBook.borrow();
        System.out.println("Pozicanie bolo " + success);
        System.out.println(someBook);
        success = someBook.borrow();
        System.out.println("Pozicanie bolo " + success);
        System.out.println(someBook);
        success = someBook.borrow();
        System.out.println("Pozicanie bolo " + success);
        System.out.println(someBook);
        success = someBook.returnBook();
        System.out.println("Vratenie bolo " + success);
        System.out.println(someBook);
        success = someBook.returnBook();
        System.out.println("Vratenie bolo " + success);
        System.out.println(someBook);
        success = someBook.returnBook();
        System.out.println("Vratenie bolo " + success);
    }
}
/zoznam knih a
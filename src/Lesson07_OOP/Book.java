package Lesson07_OOP;

public class Book {
    private String title; //variable
    private int quantity;

    private int maxQuantity;

    public Book(String initialTitle, int initialQuantity) {
        this.title = initialTitle;
        this.quantity = initialQuantity;
        this.maxQuantity = initialQuantity;
    }

    public boolean borrow() {
        if (this.quantity == 0)
        return false;

        this.quantity--;
        return true;
    }

    public boolean returnBook() {
        if (this.quantity == this.maxQuantity)
            return false;

        this.quantity++;
        return true;
    }

    public String toString() {
        return "Kniha: " + this.title + " (pocet na skalde:" + this.quantity + " )";
    }

}
//
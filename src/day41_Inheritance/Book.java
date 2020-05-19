package day41_Inheritance;

public class Book {

    public String title;
    public String author;
    public double price;


    @Override
    public String toString() {
        return "Title: "+title+"\nAuthor: "+author+"\nPrice: $"+price;
    }
}

package day41_Inheritance;

public class BooksObjects {

    public static void main(String[] args) {

        Ebook book1 = new Ebook();
        book1.title = "Harry Potter";
        book1.author = "J.K. Rowling";
        book1.price = 15.50;
        book1.size = "1.5 mb";
        book1.pages = 1800;

        System.out.println(book1);
        System.out.println("Size: "+ book1.size);
        System.out.println("Pages: "+ book1.pages);
        book1.readbook();

        System.out.println("==========================================================================");

        AudioBook book2 = new AudioBook();
        book2.title = "Hamlet";
        book2.author = "Shakespeare";
        book2.price = 10.00;
        book2.length = "40 hours";

        System.out.println(book2);
        System.out.println(book2.length);
        book2.listen();





    }


}

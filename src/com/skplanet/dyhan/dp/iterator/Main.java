package com.skplanet.dyhan.dp.iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-legs"));
        bookShelf.appendBook(new Book("Daddy-long-legs 2"));
        bookShelf.appendBook(new Book("Daddy-long-legs 3"));
        bookShelf.appendBook(new Book("Daddy-long-legs 4"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
            if (book.getName() == "Bible") {
                Iterator it2 =bookShelf.iterator();
                while (it2.hasNext()) {
                    Book book2 = (Book)it2.next();
                    System.out.println("\t" + book2.getName());
                }
            }
        }
    }
}

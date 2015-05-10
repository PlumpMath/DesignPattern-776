package com.skplanet.dyhan.dp.iterator;
import java.util.ArrayList;

/**
 * Created by 1001235 on 2015. 5. 10..
 */
public class BookShelf implements Aggregate {
    private ArrayList books = new ArrayList();

    //private int last = 0;
    public BookShelf() {}

    public Book getBookAt(int index) {
        return (Book)books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

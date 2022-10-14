package ru.mish.task7;

import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    BookShelf() {}

    public void addBook(Book book) {
        books.add(book);
        books_amount = books.size();
    }

    public Book getEarliest() {
        if (books_amount < 1) { return null; }

        int year_min = books.get(0).getYear();
        int idx = 0;
        for (int i = 1; i < books_amount; ++i) {
            if (year_min > books.get(i).year) {
                year_min = books.get(i).year;
                idx = i;
            }
        }
        return books.get(idx);
    }

    public Book getLatest() {
        if (books_amount < 1) { return null; }

        int year_max = books.get(0).getYear();
        int idx = 0;
        for (int i = 1; i < books_amount; ++i) {
            if (year_max < books.get(i).year) {
                year_max = books.get(i).year;
                idx = i;
            }
        }
        return books.get(idx);
    }

    public void sortAscending() {
        //Collections.sort(books);
        //FIX ME
    }

    private boolean compareYear(Book a, Book b) {
        return a.getYear() > b.getYear();
    }

    ArrayList<Book> books = new ArrayList<>();
    int books_amount = 0;
}

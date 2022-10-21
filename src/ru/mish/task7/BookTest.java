package ru.mish.task7;

public class BookTest {
    public static void main(String[] args) {
        Book t = new Book("Harry Potter", "J.K.Rowling", 1997);
        System.out.printf("author: %s\ntitle: %s\nyear: %d\n", t.getAuthor(), t.getTitle(), t.getYear());
        t.setAuthor("test author");
        t.setTitle("test title");
        t.setYear(1000);
        System.out.printf("author: %s\ntitle: %s\nyear: %d\n", t.getAuthor(), t.getTitle(), t.getYear());

        BookShelf bs = new BookShelf();
        bs.addBook(new Book("b1", "a1", 201878));
        bs.addBook(new Book("b2", "a2", 159));
        bs.addBook(new Book("b3", "a3", 1978));
        bs.addBook(new Book("b4", "a4", 2018));
        bs.addBook(new Book("b5", "a5", 1077));
        bs.addBook(new Book("b6", "a6", 2021));

        bs.sortAscending();
        System.out.println(bs);
        System.out.println(bs.getEarliest());
        System.out.println(bs.getLatest());
    }
}

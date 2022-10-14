package ru.mish.task7;

public class BookTest {
    public static void main(String[] args) {
        Book t = new Book("Harry Potter", "J.K.Rowling", 1997);
        System.out.printf("author: %s\ntitle: %s\nyear: %d\n", t.getAuthor(), t.getTitle(), t.getYear());
        t.setAuthor("test author");
        t.setTitle("test title");
        t.setYear(1000);
        System.out.printf("author: %s\ntitle: %s\nyear: %d\n", t.getAuthor(), t.getTitle(), t.getYear());
    }
}

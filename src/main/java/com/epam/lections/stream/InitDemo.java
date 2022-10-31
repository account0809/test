package com.epam.lections.stream;

import java.util.ArrayList;
import java.util.List;

public class InitDemo {

    // show books younger than 1953
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1997, "Harry Potter"));
        bookList.add(new Book(1954, "The Lord of the rings"));
        bookList.add(new Book(1897, "The Invisible man"));
        bookList.add(new Book(1953, "Fahrenheit 451"));

        for(Book b: bookList) {
            if (b.getYear() > 1953 && b.getName().startsWith("T")) {
                System.out.println(b.getName());
            }
        }
    }
}

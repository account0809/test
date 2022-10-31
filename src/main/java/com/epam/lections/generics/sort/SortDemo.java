package com.epam.lections.generics.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1, "Harry Potter"));
        list.add(new Book(2, "The Lord of the rings"));
        list.add(new Book(3, "Dandelion wine"));
        list.add(new Book(4, "Fahrenheit 451"));

        for (Book book : list) {
            System.out.println(book);
        }

//        Collections.sort(list);
//
//        for (Book book : list) {
//            System.out.println(book);
//        }

        Collections.sort(list, new BookComparator());

        for (Book book : list) {
            System.out.println(book);
        }
    }
}

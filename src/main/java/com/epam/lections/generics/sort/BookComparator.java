package com.epam.lections.generics.sort;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareToIgnoreCase(o2.getName()) * (-1);
    }
}
package com.epam.lections.generics;

import com.epam.lections.generics.generic.Book;

public class GenericsDemo {

    public static void main(String[] args) {
        Book<Integer> book1 = new Book(123, "Harry Potter");
        System.out.println(String.format("%s %s", book1.getId(), book1.getName()));

        Book<String> book2 = new Book("ba1245", "The Lord of the rings");
        System.out.printf("%s %s", book2.getId(), book2.getName());

        Integer id1 = (Integer) book1.getId();
        System.out.println(id1);

        String id2 = book2.getId();
        System.out.println(id2);
        // id cast
    }
}

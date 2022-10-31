package com.epam.lections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsDemo {

    public static void main(String[] args) {
//        Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .filter(e -> (e.length() >= 4) && (e.startsWith("M")))
//                .forEach(e -> System.out.println(e));

//        Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .map(e -> e.length())
//                .forEach(e -> System.out.println(e));

//        List<Book> bookList = new ArrayList<>();
//        bookList.add(new Book(1997, "Harry Potter"));
//        bookList.add(new Book(1954, "The Lord of the rings"));
//
//        List<Book> bookList2 = new ArrayList<>();
//        bookList.add(new Book(2004, "Harry Potter"));
//        bookList.add(new Book(2000, "The Lord of the rings"));
//
//        List<Book> result = Stream.of(bookList, bookList2)
//                .flatMap(e -> e.stream())
//                //.forEach(e -> System.out.println(e));
//        .collect(Collectors.toList());
//
//        result.forEach(System.out::println);

//        Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .sorted()
//                .forEach(e -> System.out.println(e));
//
//        System.out.println("----------------");
//
//        Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .sorted((a, b) -> a.length() - b.length())
//                .forEach(e -> System.out.println(e));

//        Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .limit(2)
//                .forEach(e -> System.out.println(e));
//
//        Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .skip(3)
//                .forEach(e -> System.out.println(e));

        Consumer consumer = e -> System.out.println(e);
        Stream.of("Barbara", "James", "Mary", "Barbara", "James", "Mary", "Robert", "Michael", "Linda")
                //.distinct()
                .forEach(consumer);

    }

    private static void order() {
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
                .filter(n -> n < 10)
                .map(n -> n * 2)
                .limit(3)
                .forEach(System.out::println);
    }

    private static void print(Object x) {
        System.out.println("o"+x);
    }
}

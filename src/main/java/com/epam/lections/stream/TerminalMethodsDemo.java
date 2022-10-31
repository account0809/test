package com.epam.lections.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalMethodsDemo {

    public static void main(String[] args) {
        String findFirst = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
                .filter(e -> (e.length() > 3) && (e.startsWith("N")))
                .findFirst().orElse("none");
        System.out.println(findFirst);
//
//        String findAny = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .filter(e -> (e.length() > 3) && (e.startsWith("M")))
//                .findAny().orElse("none");
//        System.out.println(findAny);
//
//        long count = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                //.filter(e -> (e.length() > 3) && (e.startsWith("M")))
//                .count();
//        System.out.println(count);

//        boolean allMatch = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .allMatch(e -> (e.length() > 3));
//        System.out.println(allMatch);
//
//        boolean anyMatch = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .anyMatch(e -> (e.length() > 3) && (e.startsWith("M")));
//        System.out.println(anyMatch);
//
//        boolean noneMatch = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .noneMatch(e -> (e.length() < 3) && (e.startsWith("M")));
//        System.out.println(noneMatch);

//        int sum = Stream.of(1, 2, 3, 4)
//                .reduce((a, b) -> a + b).get();
//        System.out.println(sum);

//        String min = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
//                .min((a, b) -> a.length() - b.length()).get();
//        System.out.println(min);
//
        Optional optional = Stream.of("Barbara", "James", "Mary", "Robert", "Michael", "Linda")
                .max((a, b) -> a.length() - b.length());
        System.out.println(optional);
    }

}

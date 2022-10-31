package com.epam.lections.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo {

    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtering result: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapping result: " + e))
                .collect(Collectors.toList());
    }
}

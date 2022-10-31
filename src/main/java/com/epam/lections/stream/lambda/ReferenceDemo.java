package com.epam.lections.stream.lambda;

import java.util.Arrays;
import java.util.function.Supplier;

@SuppressWarnings("Convert2MethodRef")
public class ReferenceDemo {

    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "Mary", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, (a, b) -> a.compareToIgnoreCase(b));
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        Arrays.asList(stringArray).forEach(System.out::println);

        Supplier<MyObject> supplier1 = () -> new MyObject();
        System.out.println(supplier1.get());

        Supplier<MyObject> supplier2 = MyObject::new;
        System.out.println(supplier2.get());
    }
}
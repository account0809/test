package com.epam.lections.generics.genmethod;

public class Printer {

    public <T> void print(T[] array) {
        for (T item: array) {
            System.out.println(item);
        }
    }
}

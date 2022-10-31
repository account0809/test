package com.epam.lections.generics.maps;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        treeMapDemo();
    }

    private static void treeMapDemo() {
        Map<Integer, String> map = new TreeMap<>();

        map.put(6, "Harry Potter");
        map.put(7, "The Lord of the rings");
        map.put(1, "Dandelion wine");
        map.put(8, "Fahrenheit 451");

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%d '%s'\n", item.getKey(), item.getValue());
        }
    }

    private static void hashMapDemo() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Harry Potter");
        map.put(9, "The Lord of the rings");
        map.put(8, "Dandelion wine");
        map.put(4, "Fahrenheit 451");

        map.replace(9, "New book");
        map.remove(1);

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%d '%s'\n", item.getKey(), item.getValue());
        }
    }
}

package com.epam.lections.generics.collections;

import com.epam.lections.generics.generic.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        list.set(0, "zero");

        if (!list.contains("one")) System.out.println("Element does not exist");
        if (list.contains("two")) System.out.println("Element exists");
    }

    private static void arrayListDemo() {
    }

    private static void linkedListDemo() {
    }

}
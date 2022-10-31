package com.epam.lections.generics.collections;

import java.util.*;

// null

public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
//
//        System.out.println(set.add("one"));
//
//        for (String item: set) {
//            System.out.println(item);
//        }

        treeSet(set);
    }

    public static void linkedHashSet() {
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("one");
        linkedSet.add("two");
        linkedSet.add("three");
        linkedSet.add("four");
        linkedSet.add(null);

        for (String item: linkedSet) {
            System.out.println(item);
        }
    }

    public static void treeSet(Set<String> set) {
        TreeSet<String> treeSet = new TreeSet<>(set);

        for (String item: treeSet) {
            System.out.println(item);
        }

        treeSet.add("Five");
        treeSet.add("ten");

        treeSet.remove("one");

        for (String item: treeSet) {
            System.out.println(item);
        }

        NavigableSet<String> desc = treeSet.descendingSet();

        System.out.println("----------");
        for (String item: desc) {
            System.out.println(item);
        }
    }
}

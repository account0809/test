package com.epam.lections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings({"ResultOfMethodCallIgnored", "MismatchedQueryAndUpdateOfCollection"})
public class CreateDemo {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        Arrays.stream(array);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.stream();

        Stream stream = Stream.of(1, 2, 3);

        Stream.empty();
    }
}
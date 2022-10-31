package com.epam.lections.stream.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

@SuppressWarnings("Convert2MethodRef")
public class UtilFIDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mary");
        list.add("Anry");
        list.add("ffff");
        list.add("bbbbb");
        list.add("ooooo");
        list.add("ddddd");

        List<String> list2 = new ArrayList<>();
        list2.add("1234");
        list2.add("77774");
        list2.add("1234");
        list2.add("77774");
        list2.add("1234");
        list2.add("77774");

        Stream.of(list,list2)
                .flatMap(e -> e.stream())
                .skip(5)
                .limit(3)
                .forEach(e -> System.out.println(e));
        System.out.println("----------------");
        list.forEach(e -> System.out.println(e));
//
//        Consumer<String> consumer = a -> System.out.println(a);
//        Supplier<Double> supplier = () -> Math.random();
//        Predicate<Integer> predicate = a -> a > 5;
//        Function<Integer, String> function = a -> "Number = " + a;
//        UnaryOperator<Integer> unaryOperator = a -> a * 10;
//        BinaryOperator<Integer> binaryOperator = (a, b) -> a / b;
//
//        consumer.accept("Hello world");
//        System.out.println(supplier.get());
//
//        System.out.println(predicate.test(10));
//        System.out.println(predicate.test(1));
//
//        System.out.println(function.apply(100));
//        System.out.println(unaryOperator.apply(2));
//        System.out.println(binaryOperator.apply(21, 3));
    }
}

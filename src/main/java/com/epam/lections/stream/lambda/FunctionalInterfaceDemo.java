package com.epam.lections.stream.lambda;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        MyFunctionalInterface consumer = o -> System.out.println("Name: " + o);

        MyFunctionalInterface consumer2 = o -> {
            System.out.println("Last Name: " + o);
            int i = 1 + 2;
            System.out.println("Last Name: " + i + o);
        };

        MyFunctionalInterface consumer3 = new MyFunctionalInterface() {
            @Override
            public void print(Object o) {
                System.out.println("Second Name: " + o);
            }
        };

        consumer.print(true);
        consumer2.print("Kate");
        consumer3.print("Kate");
    }
}

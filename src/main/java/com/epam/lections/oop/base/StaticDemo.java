package com.epam.lections.oop.base;

public class StaticDemo {
    static int sNumber;
    static boolean isNegative;

    int number;
    boolean isPositive = true;

    public static void main(String[] args) {
        StaticDemo.print();
        //StaticDemo.printRef();

        StaticDemo staticDemo = new StaticDemo();
        staticDemo.print();
        staticDemo.printRef();

        //Integer.MAX_VALUE
    }

    static void print() {
        System.out.println(isNegative);
    }

    void printRef() {
        System.out.println(isPositive);
    }

}

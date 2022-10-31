package com.epam.lections.exceptions.excep;

public class ExceptionsDemo {

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionsDemo exceptionsDemo = new ExceptionsDemo();
        System.out.println(exceptionsDemo.divide(100, 5));
        System.out.println(exceptionsDemo.divide(100, 0));
        System.out.println(exceptionsDemo.divide(8, 3));
    }
}

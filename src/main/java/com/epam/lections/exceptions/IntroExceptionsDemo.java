package com.epam.lections.exceptions;

public class IntroExceptionsDemo {

    public int divide(int a, int b) {
        return divideLayer(a,b);
    }

    public int divideLayer(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        IntroExceptionsDemo exceptionsDemo = new IntroExceptionsDemo();
        System.out.println(exceptionsDemo.divide(100, 5));
        System.out.println(exceptionsDemo.divide(100, 0));
        System.out.println(exceptionsDemo.divide(8, 3));

    }
}

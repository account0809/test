package com.epam.lections.exceptions.first;

public class NpeExceptionDemo {
    String a = "a";

    public static void main(String[] args) {
        NpeExceptionDemo demo = new NpeExceptionDemo();

        demo.a.startsWith("q");
    }
}

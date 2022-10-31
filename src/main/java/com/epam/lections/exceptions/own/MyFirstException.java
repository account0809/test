package com.epam.lections.exceptions.own;

public class MyFirstException extends IllegalArgumentException {

    public MyFirstException() {
    }

    public MyFirstException(String message) {
        super(message);
    }

   // public static void main(String[] args) {
//        throw new MyFirstException();
//    }
}

package com.epam.lections.exceptions.own;

public class MySecondException extends IllegalAccessException {

    public MySecondException() {

    }

    public MySecondException(String message) {

    }

    public static void main(String[] args) {
        try {
            throw new MySecondException();
        } catch (MySecondException e) {
            e.printStackTrace();
        }
    }
}

package com.epam.lections.exceptions.own;

public class MyDemo {

    public void print() {
        throw new MyFirstException("My first exception");
    }

    public static void main(String[] args) {
        MyDemo demo = new MyDemo();

        demo.print();
    }
}

package com.epam.lections.oop.abstraction.interfacedemo;

public interface Scrollable {

    int position = 0;

    int a = 10;
    final int b = 10;
    static int c = 10;
    public int d = 10;
    static final int e = 10;
    public static final int f = 10;

    //int i; // compilation error

    void scrollDown();
    void scrollUp();

    default int getPosition() {
        System.out.println("Scrollable");
        return 0;
    }

    default int getHorizontalPosition() {
        System.out.println("Scrollable Horizontal");
        return -100;
    }



}

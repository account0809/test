package com.epam.lections.oop.abstraction.interfacedemo;

public class MyScrollableClass implements Scrollable, Clickable {
    @Override
    public void scrollDown() {
        System.out.println("Scroll down");
    }

    @Override
    public void scrollUp() {
        System.out.println("Scroll Up");
    }

    public int getPosition() {
        System.out.println("My Class");
        return 10;
    }
}

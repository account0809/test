package com.epam.lections.oop.abstraction.interfacedemo;

public interface Clickable extends Scrollable {

    static void clickJs() {
        //...
    }

    private boolean isPresent() {
        System.out.println("Present = true");
        return true;
    }

    default void printIsPresent() {
        isPresent();
    }

}

package com.epam.lections.oop.abstraction.interfacedemo;

/*

 */
public class InterfaceDemo {

    public static void main(String[] args) {
        MyScrollableClass myScrollableClass = new MyScrollableClass();

        myScrollableClass.scrollDown();
        myScrollableClass.scrollUp();
        myScrollableClass.getPosition();
        myScrollableClass.getHorizontalPosition();

        myScrollableClass.printIsPresent();
    }
}

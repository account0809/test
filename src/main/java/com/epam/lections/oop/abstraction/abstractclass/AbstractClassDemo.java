package com.epam.lections.oop.abstraction.abstractclass;
/*
    - constructor
    - with/without abs method
    - tostr()
 */
public class AbstractClassDemo {

    public static void main(String[] args) {
        Element element = new TextBox(true, "TextBox");

        element.getElement();
        element.getPosition();

        element = new Button(false, "Button");

        element.getElement();
        element.getPosition();
    }
}

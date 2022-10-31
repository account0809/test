package com.epam.lections.oop.abstraction.abstractclass;

public class TextBox extends Element {

    public TextBox(boolean isVisible, String name) {
        super(isVisible, name);
    }

    @Override
    void getElement() {
        System.out.println("TextBox element");
    }

    @Override
    int getPosition() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("TextBox{%s, %s}", isVisible, name);
    }
}

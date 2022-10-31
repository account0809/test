package com.epam.lections.oop.abstraction.abstractclass;

public class Button extends Element {

    public Button(boolean isVisible, String name) {
        super(isVisible, name);
    }

    @Override
    void getElement() {
        System.out.println("Button element");
    }

    @Override
    int getPosition() {
        return 20;
    }
}

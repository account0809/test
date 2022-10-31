package com.epam.lections.oop.abstraction.abstractclass;

import com.epam.lections.oop.abstraction.interfacedemo.Clickable;

public abstract class Element {

    protected boolean isVisible;
    protected String name;

    abstract void getElement();

    abstract int getPosition();

    public Element(boolean isVisible, String name) {
        this.isVisible = isVisible;
        this.name = name;
    }

}

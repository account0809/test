package com.epam.lections.oop.abstraction.design.factorymethod.browser;

public class CustomChrome implements Browser {
    @Override
    public void start() {
        System.out.println("Starting Chrome...");
    }
}

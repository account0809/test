package com.epam.lections.oop.abstraction.design.factorymethod.browser;

public class CustomSafari implements Browser {

    @Override
    public void start() {
        System.out.println("Starting Safari...");
    }
}

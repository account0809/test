package com.epam.lections.oop.abstraction.design.factorymethod.browser;

public class FireFoxBrowser implements Browser {
    @Override
    public void start() {
        System.out.println("FireFox starting...");
    }
}

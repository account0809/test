package com.epam.lections.oop.abstraction.design.abstractfactory.os;

public class MacOs implements OperatingSystem {
    @Override
    public void connect() {
        System.out.println("Connecting to MacOS...");
    }
}

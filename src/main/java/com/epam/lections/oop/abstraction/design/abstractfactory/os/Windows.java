package com.epam.lections.oop.abstraction.design.abstractfactory.os;

public class Windows implements OperatingSystem {
    @Override
    public void connect() {
        System.out.println("Connecting to Windows...");
    }
}

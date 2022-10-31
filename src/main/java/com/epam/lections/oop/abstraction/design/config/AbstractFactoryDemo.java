package com.epam.lections.oop.abstraction.design.config;

public class AbstractFactoryDemo {
    Configuration configuration;

    private void runOnConfiguration(String os) {

        if (os.equalsIgnoreCase("win")) {
            configuration = new WindowsConfiguration();
        } else if (os.equalsIgnoreCase("mac")) {
            configuration = new MacConfiguration();
        } else {
            System.err.println("Configuration is not defined");
        }
    }

    public static void main(String[] args) {
        AbstractFactoryDemo abstractFactoryDemo = new AbstractFactoryDemo();
        abstractFactoryDemo.runOnConfiguration("win");
        abstractFactoryDemo.configuration.getOs().connect();
        abstractFactoryDemo.configuration.getBrowser().start();
    }
}

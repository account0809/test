package com.epam.lections.oop.abstraction.design.factorymethod;

import com.epam.lections.oop.abstraction.design.factorymethod.BrowserFactory;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.Browser;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        BrowserFactory browserFactory = new BrowserFactory();
        Browser browser = browserFactory.getBrowser("chrome");
        browser.start();

        browser = browserFactory.getBrowser("safari");
        browser.start();

        browserFactory.getBrowser("Firefox").start();

    }
}

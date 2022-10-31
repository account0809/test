package com.epam.lections.oop.abstraction.design.config;

import com.epam.lections.oop.abstraction.design.abstractfactory.os.OperatingSystem;
import com.epam.lections.oop.abstraction.design.abstractfactory.os.Windows;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.Browser;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.CustomChrome;

public class WindowsConfiguration implements Configuration {

    public WindowsConfiguration() {
        System.out.println("Windows configuration running");
    }

    @Override
    public OperatingSystem getOs() {
        return new Windows();
    }

    @Override
    public Browser getBrowser() {
        return new CustomChrome();
    }
}

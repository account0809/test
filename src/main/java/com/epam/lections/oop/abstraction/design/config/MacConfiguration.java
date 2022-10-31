package com.epam.lections.oop.abstraction.design.config;

import com.epam.lections.oop.abstraction.design.abstractfactory.os.MacOs;
import com.epam.lections.oop.abstraction.design.abstractfactory.os.OperatingSystem;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.Browser;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.CustomSafari;

public class MacConfiguration implements Configuration {

    public MacConfiguration() {
        System.out.println("MacOs configuration running");
    }

    @Override
    public OperatingSystem getOs() {
        return new MacOs();
    }

    @Override
    public Browser getBrowser() {
        return new CustomSafari();
    }
}

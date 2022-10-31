package com.epam.lections.oop.abstraction.design.config;

import com.epam.lections.oop.abstraction.design.abstractfactory.os.OperatingSystem;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.Browser;

public interface Configuration {

    OperatingSystem getOs();
    Browser getBrowser();
}

package com.epam.lections.oop.abstraction.design.abstractfactory;

import com.epam.lections.oop.abstraction.design.abstractfactory.os.MacOs;
import com.epam.lections.oop.abstraction.design.abstractfactory.os.OperatingSystem;
import com.epam.lections.oop.abstraction.design.abstractfactory.os.Windows;

public class OsFactory {

    public OperatingSystem getOs(String osName) {
        if (osName.equalsIgnoreCase("win")) {
            return new Windows();
        } else if (osName.equalsIgnoreCase("mac")) {
            return new MacOs();
        }
        return null;
    }
}

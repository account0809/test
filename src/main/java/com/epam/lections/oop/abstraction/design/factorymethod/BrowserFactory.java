package com.epam.lections.oop.abstraction.design.factorymethod;

import com.epam.lections.oop.abstraction.design.factorymethod.browser.Browser;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.CustomChrome;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.CustomSafari;
import com.epam.lections.oop.abstraction.design.factorymethod.browser.FireFoxBrowser;

public class BrowserFactory {

    public Browser getBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            return new CustomChrome();
        } else if (browserName.equalsIgnoreCase("Safari")) {
            return new CustomSafari();
        } else if (browserName.equalsIgnoreCase("firefox")){
            return new FireFoxBrowser();
        }
        return null;
    }
}

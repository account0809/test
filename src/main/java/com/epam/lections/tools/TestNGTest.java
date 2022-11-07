package com.epam.lections.tools;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest {
    Calculator calculator = new Calculator();

    @Test(dataProvider = "numberProvider")
    public void sumTest(int a, int b, int expected) {
        Assert.assertEquals(calculator.sum(a, b), expected, "Sum is calculated incorrectly");
    }

    @DataProvider
    public static Object[][] numberProvider() {
        return new Object[][] {
                {1, 2, 3},
                {1, 1, 2},
                {4, 9, 13}
        };
    }
}

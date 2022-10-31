package com.epam.lections.exceptions.second;

public class ThrowDemo {

    public void find(String companyName) throws Exception {
        if (!companyName.endsWith("INC")) {
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        ThrowDemo throwDemo = new ThrowDemo();

        throwDemo.find("Systems INC");
        throwDemo.find("Systems");

        throwDemo.find("Systems INC");
    }
}

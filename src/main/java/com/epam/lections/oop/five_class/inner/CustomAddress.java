package com.epam.lections.oop.five_class.inner;

public class CustomAddress extends Student.Address {

    public CustomAddress() {
        new Student().super();
    }

    public CustomAddress(String country, String city, String street, int building, int apartment) {
        new Student().super();
    }
}

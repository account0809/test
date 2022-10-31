package com.epam.lections.oop.five_class.inner;

public class LocalStudent extends Student {

    public LocalStudent(int id, String name) {
        super(id, name);
    }

    public class LocalAddress extends Address {

        public LocalAddress(String country, String city, String street, int building, int apartment) {
            super(country, city, street, building, apartment);
        }
    }
}

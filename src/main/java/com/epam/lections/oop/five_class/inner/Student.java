package com.epam.lections.oop.five_class.inner;

public class Student {
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public class Address {
        private String country;
        private String city;
        private String street;
        private int building;
        private int apartment;

        public Address() {

        }
        public Address(String country, String city, String street, int building, int apartment) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.building = building;
            this.apartment = apartment;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    ", apartment=" + apartment +
                    '}';
        }
    }
}

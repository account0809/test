package com.epam.lections.oop.base;

public class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 20)) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {

    }
}
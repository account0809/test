package com.epam.lections.generics.io.objectstream;

import java.io.Serializable;

public class Dog implements Serializable {

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

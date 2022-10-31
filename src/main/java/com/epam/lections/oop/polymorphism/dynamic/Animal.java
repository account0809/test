package com.epam.lections.oop.polymorphism.dynamic;

public class Animal {

    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Make noise!");
    }

    public String getName() {
        return name;
    }

    public void printMe() {
        System.out.println(name);
        makeNoise();
    }
}

package com.epam.lections.oop.polymorphism.dynamic;

public class Dog extends Animal {

    public Dog(int age, String name) {
        super(age, name);
    }

    public void makeNoise() {
        System.out.println("Gauphh!");
    }

}
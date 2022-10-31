package com.epam.lections.oop.polymorphism.dynamic;

public class Cat extends Animal {

    public Cat(int age, String name) {
        super(age, name);
    }

    public void makeNoise() {
        System.out.println("Meowww!");
    }
}

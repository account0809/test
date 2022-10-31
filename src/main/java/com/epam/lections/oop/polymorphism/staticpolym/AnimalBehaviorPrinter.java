package com.epam.lections.oop.polymorphism.staticpolym;

import com.epam.lections.oop.polymorphism.dynamic.Cat;
import com.epam.lections.oop.polymorphism.dynamic.Dog;

public class AnimalBehaviorPrinter {

    void print(Cat cat) {
        System.out.println("Lazy, sleep " + cat.getName());
    }

    void print(Dog dog) {
        System.out.println("Funny, run " + dog.getName());
    }

    void print(Dog dog, Cat cat) {
        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }
}

package com.epam.lections.oop.polymorphism.staticpolym;

import com.epam.lections.oop.polymorphism.dynamic.Cat;
import com.epam.lections.oop.polymorphism.dynamic.Dog;

public class StaticDemo {

    public static void main(String[] args) {
        AnimalBehaviorPrinter animalBehaviorPrinter = new AnimalBehaviorPrinter();

        animalBehaviorPrinter.print(new Dog(2, "Dog"));
        animalBehaviorPrinter.print(new Cat(3, "Cat"));

        String str = "";
    }
}

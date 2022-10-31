package com.epam.lections.oop.polymorphism.dynamic;

/*
    - makeNoise(), @
    - printMe()
    - equals()
    - final
 */
public class DynamicDemo {

    public static void main(String[] args) {
        Animal animal = new Animal(1, "Fox");
        Animal dog = new Dog(2, "Dog");
        Animal cat = new Cat(5, "Cat");

        animal.printMe();
        dog.printMe();
        cat.printMe();
    }
}

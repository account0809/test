package com.epam.lections.oop.encapsulation;

import com.epam.lections.oop.inheritance.Dog;

/*
    - public, default
    - protected, default
    - private
    - invalid field, getter/setter
 */
public class EncapsulationDemo extends Encapsulation{

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setAge(10);
        dog.setName("Perl");

        System.out.println(String.format("%s %s", dog.getName(), dog.getAge()));
    }

}

package com.epam.lections.oop.five_class.anonymous;

public class AnonymousDemo {

    Animal animal1 = new Animal() {
        @Override
        public void makeNoise() {
            System.out.println("Blablabla");
        }
    };

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Blablabla");
            }
        };

        Movable movable = new Movable() {
            @Override
            public void move() {
                System.out.println("---->");
            }
        };

        animal.makeNoise();
        movable.move();
    }
}

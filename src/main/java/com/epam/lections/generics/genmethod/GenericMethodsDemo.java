package com.epam.lections.generics.genmethod;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5,6,7,8};
        String[] stringArray = {"Harry Potter", "The Lord of the rings", "Dandelion wine", "Fahrenheit 451"};

        Printer printer = new Printer();
        printer.print(integerArray);
        printer.print(stringArray);
    }
}

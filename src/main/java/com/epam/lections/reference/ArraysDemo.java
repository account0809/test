package com.epam.lections.reference;
/*
    - create/init
    - char arr to str
    - for+length
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[2] = 150;

//        for (int i = 0; i < intArray.length; i+=2) {
//            System.out.println(intArray[i]);
//        }

        for (int element : intArray) {
            System.out.println(element);
        }

    }
}

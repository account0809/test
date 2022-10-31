package com.epam.lections.exceptions.excep;

/*
    - method for checked/not-checked
 */
public class ThrowDemo {

    public static void main(String[] args) {
        ThrowDemo throwDemo = new ThrowDemo();

        try {
            throwDemo.test();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("unchecked");
        }

        try {
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("Checked");
        }
    }

    public void test() {
        throw new IllegalArgumentException();
    }

    public void test2() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
}
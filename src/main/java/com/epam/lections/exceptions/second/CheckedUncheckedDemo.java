package com.epam.lections.exceptions.second;

public class CheckedUncheckedDemo {

    public void uncheckedTest() {
        throw new IllegalArgumentException();
    }

    public void checkedTest() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    public static void main(String[] args) {
        CheckedUncheckedDemo demo = new CheckedUncheckedDemo();

        demo.uncheckedTest();
        try {
            demo.checkedTest();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
package com.epam.lections.exceptions.third;

@SuppressWarnings("ALL")
public class NestedTryDemo {

    public void calculate(boolean isThrow) {
        try {
            if (isThrow) {
                throw new IndexOutOfBoundsException();
            } else {
                throw new NullPointerException();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void print() {
        try {
            calculate(true);  // true
        } catch (NullPointerException e) {
            System.out.println("Catch above in stack");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        NestedTryDemo demo = new NestedTryDemo();

        demo.print();
        //demo.calculate(false);
    }
}

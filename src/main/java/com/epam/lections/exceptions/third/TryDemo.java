package com.epam.lections.exceptions.third;

@SuppressWarnings("ALL")
public class TryDemo {

    public int divide(int[] array, int b, int i) {
        return 1 / b / array[i];
    }

    public static void main(String[] args) {
        TryDemo demo = new TryDemo();
        int[] array = new int[] {1, 2, 3};

//        try {
//            System.out.println(demo.divide(array, 0, 3));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("1 - " + e);
//        } catch (ArithmeticException e) {
//            System.out.println("2 - " + e);
//        }

        try {
            System.out.println(demo.divide(array, 0, 3));
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("Final");
    }
}

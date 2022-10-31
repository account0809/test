package com.epam.lections.exceptions.third;

public class FinallyDemo {

    public static boolean isVisited() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            //hhh
        } catch (ArithmeticException e) {
            //hhh
        } finally {

            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isVisited());
    }
}

package com.epam.lections.loops;
/*
    - countdown
 */
public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        recursion.countdown(10);
    }

    public void countdown(int i) {
        System.out.println(i);
        if (i > 0) {
            countdown(i - 1);
        }
        return;
    }
}
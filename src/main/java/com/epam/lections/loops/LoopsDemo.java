package com.epam.lections.loops;
/*
    - for/while/do /foreach
    - infinity
    - several vars for
 */
public class LoopsDemo {

    public static void main(String[] args) {
        LoopsDemo loopsDemo = new LoopsDemo();
        loopsDemo.whileDemo();
    }

    public static void whileDemo() {
        int i = 5;

        while (i > 1) {
            System.out.println(i);
            i--;
            if (i == 2) {
                continue;
            }
            System.out.println("full iteration");
        }
    }
}

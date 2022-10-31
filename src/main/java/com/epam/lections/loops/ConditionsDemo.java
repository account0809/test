package com.epam.lections.loops;

public class ConditionsDemo {

    public static void main(String[] args) {
        switchDemo("Hello");
    }

    public static void ifDemo(String str) {
        if ((str.startsWith("H") || str.endsWith("d")) && (str.length() > 3)) {
            System.out.println(str);
        }
    }

    public static String ternaryDemo(int i) {
        int value = (i > 0) ? 9 : -9;
        return (i > 0) ? "Positive" : "Negative";
    }

    public static void switchDemo(String str) {
        switch (str) {
            case "Hello" :
                System.out.println(str);
                break;
            case "Hi" :
                System.out.println(str);
                break;
            default:
                System.out.println("Error!");
        }
    }
}

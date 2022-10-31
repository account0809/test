package com.epam.lections.generics.io.init;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2 :
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid operation");
                    scanner.close();
                    return;
            }
        }
    }
}

package com.epam.lections.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        while (true) {
            printMenu();
            try {
                opt = readOptionFromConsole();
                if (opt == 1) {
                    FileService.readFile();
                } else if (opt == 2) {
                    //scanner.next();
                    System.out.println("Insert your text");
                    //scanner.nextLine();
                    FileService.writeToFile(scanner.nextLine());
                } else if (opt == 3) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printMenu() {
        System.out.println("press 1 to read the file");
        System.out.println("press 2 to write to the file");
        System.out.println("press 3 to quit");
    }

    private static int readOptionFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
}

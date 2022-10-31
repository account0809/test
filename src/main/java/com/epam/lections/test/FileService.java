package com.epam.lections.test;

import java.io.*;

public class FileService {
    private static String fileName = "src/Demo.txt";

    public static void readFile() {
        /* BufferedReader reader = new BufferedReader(new FileReader("src/Demo.txt"));
        while (reader.ready()) {
            System.out.println(reader.readLine());
            reader.close();
         */

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static void writeToFile(String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(str + "\n");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Not able to add");
        }
    }
}

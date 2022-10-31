package com.epam.lections.exceptions.third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        TryWithResourcesDemo demo = new TryWithResourcesDemo();

        try {
            demo.test("C:\\FILES\\LECT\\init\\init.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("123");
    }

    private void test(String path) throws IOException {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
    }
}

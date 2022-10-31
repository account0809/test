package com.epam.lections.exceptions.excep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
    }

    private void test(String path) throws IOException {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
    }

}

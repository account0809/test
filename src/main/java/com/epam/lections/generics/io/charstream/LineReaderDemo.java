package com.epam.lections.generics.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineReaderDemo {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(".\\src\\main\\resources\\io.txt"))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

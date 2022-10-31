package com.epam.lections.generics.io.init;

import java.io.*;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        TryWithResourcesDemo demo = new TryWithResourcesDemo();

        demo.test("C:\\FILES\\LECT\\init\\init.txt");
    }

    private void test(String path) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//            FileWriter fileWriter = new FileWriter(path);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            bufferedWriter.flush();
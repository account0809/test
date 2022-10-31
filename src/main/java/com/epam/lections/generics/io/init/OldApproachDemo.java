package com.epam.lections.generics.io.init;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OldApproachDemo {

    public void readFile(String path) {
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader(path);
            bufferedReader = new BufferedReader(reader);

            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        OldApproachDemo demo = new OldApproachDemo();

        demo.readFile("C:\\FILES\\LECT\\init\\init.txt");
    }






//    public void readFile(String path) {
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//
//        try {
//            fileReader = new FileReader(path);
//            bufferedReader = new BufferedReader(fileReader);
//
//            System.out.println(bufferedReader.readLine());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileReader != null) {
//                    fileReader.close();
//                }
//                if (fileReader != null) {
//                    bufferedReader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
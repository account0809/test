package com.epam.lections.generics.io.bytestream;

import java.io.*;
/*
    - skip()
    - availab()
    - read()
    - markSupported()
 */
public class CopyContentDemo {

    public static void main(String[] args){
        try (FileInputStream from = new FileInputStream(".\\src\\main\\resources\\io.txt");
             FileOutputStream to = new FileOutputStream(".\\src\\main\\resources\\copy.txt")) {

            while (from.available() > 0) {
                System.out.println(from.available());
                to.write(from.read());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

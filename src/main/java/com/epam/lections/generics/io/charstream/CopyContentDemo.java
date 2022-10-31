package com.epam.lections.generics.io.charstream;

import java.io.*;

/*
    - append() x2
    - replace
    - ready()
    - after close()
 */
public class CopyContentDemo {

    public static void main(String[] args) throws IOException {
        FileReader from = new FileReader(".\\src\\main\\resources\\io.txt");
        FileWriter to = new FileWriter(".\\src\\main\\resources\\copy.txt", true);

        while (from.ready()) {
            int i = from.read();

            System.out.println(i);

            if (((char) i) == '!' ) {
                to.write(".");
            } else {
                to.write(i);
            }
        }

        to.close();
        from.close();
    }
}

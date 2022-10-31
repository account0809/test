package com.epam.lections.generics.io.charstream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {

    public static void main(String[] args) throws IOException {
        String text = "new string to write to char array";

        CharArrayReader reader = new CharArrayReader(text.toCharArray());  //+ constr with index

        int i = 0;

        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
    }
}

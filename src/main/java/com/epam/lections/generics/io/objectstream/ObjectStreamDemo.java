package com.epam.lections.generics.io.objectstream;

import java.io.*;

public class ObjectStreamDemo {

    public static void main(String[] args) {
        try (ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(arrayOut)){

            System.out.println(arrayOut.size());
           // out.writeObject(new Cat());
            out.writeObject(new Dog(7, "Perl"));
            System.out.println(arrayOut.size());

            byte[] array = arrayOut.toByteArray();

            for (byte b : array) {
                System.out.print((char) b);
            }

            System.out.println();

            ByteArrayInputStream arrayIn = new ByteArrayInputStream(array);
            ObjectInputStream in = new ObjectInputStream(arrayIn);

            Dog dog = (Dog) in.readObject();
            System.out.println(dog);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

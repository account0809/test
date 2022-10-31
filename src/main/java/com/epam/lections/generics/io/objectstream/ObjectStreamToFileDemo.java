package com.epam.lections.generics.io.objectstream;

import java.io.*;

public class ObjectStreamToFileDemo {

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(".\\src\\main\\resources\\file\\object.txt"))) {
            Dog dog = new Dog(2, "Inu");
            out.writeObject(dog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(".\\src\\main\\resources\\file\\object.txt"))) {
            Dog dog = (Dog) in.readObject();
            System.out.println(dog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package com.epam.lections.generics.io.path;

import java.io.IOException;
import java.nio.file.*;

public class FilesDemo {

//    public void pathView() {
//        //Path paths = Paths.get("C:\\FILES\\LECT\\init\\init.txt");
//        Path path = Path.of("C:\\FILES\\LECT\\init\\init.txt");
//
//        // starts/endsWith
//        System.out.println(path.endsWith("init.txt"));
//        System.out.println(path.startsWith("C:\\FILES"));
//    }

//    public void pathTypes() {
//        Path path = Path.of(".\\src\\main\\resources\\io.txt");
//        System.out.println(String.format("%s\\%s", path.getParent(), path.getFileName()));
//
//        System.out.println(path.isAbsolute());
//        System.out.println(path.normalize());
//        System.out.println(path.toAbsolutePath());
//
//        Path pathDeeper = Path.of(".\\src\\main\\resources\\io\\hello.txt");
//
//        System.out.println(pathDeeper.relativize(path));
//    }

    public static void main(String[] args) {
        FilesDemo filesDemo = new FilesDemo();

        //--- delete
        try {
            filesDemo.deleteFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void read() {
        Path path = Path.of("C:\\FILES\\LECT\\init-copy\\copy.txt");
        try {
            Files.readAllLines(path).forEach(l -> System.out.println(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() throws IOException {
        String text = "qweuqirqdqmb";
        Path path = Path.of("C:\\FILES\\LECT\\init-copy\\copy.txt");

        Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
    }

    public void processFile() throws IOException {
        Path pathFrom = Path.of("C:\\FILES\\LECT\\init\\init.txt");
        Path pathTo = Path.of("C:\\FILES\\LECT\\init-copy\\copy.txt");

        Files.move(pathFrom, pathTo, StandardCopyOption.REPLACE_EXISTING);
    }

    public void deleteFiles() throws IOException {
        Files.delete(Path.of("C:\\FILES\\LECT\\init"));
        Files.delete(Path.of("C:\\FILES\\LECT\\init-copy\\copy.txt"));
    }

    public void filesExistence() throws IOException {
        Path pathToNotExisted = Path.of("C:\\FILES\\LECT\\init\\init.txt");
        Path pathToExisted = Path.of(".\\src\\main\\resources\\io.txt");

        System.out.println(Files.exists(pathToNotExisted));
        System.out.println(Files.exists(pathToExisted.toAbsolutePath().normalize()));

        Files.createDirectory(pathToNotExisted.getParent());
        Files.createFile(pathToNotExisted);

        System.out.println(Files.exists(pathToNotExisted));
    }

}

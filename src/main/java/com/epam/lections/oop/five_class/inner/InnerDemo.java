package com.epam.lections.oop.five_class.inner;

public class InnerDemo {

    public static void main(String[] args) {
        Student student = new Student(1, "Ivan");
        Student.Address address = student.new Address("USA", "Irvine", "45 lane", 48, 123);

        Student.Address address1 = student.new Address("CA", "Toronto", "67 lane", 56, 342);

        System.out.println(address);
        System.out.println(address1);
    }
}

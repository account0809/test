package com.epam.lections.oop.five_class.nested;

public class NestedDemo {

    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", 21);
        Student student2 = new Student(2, "Pavel", 21);
        Student student3 = new Student(3, "Ivan", 23);

        Student.NameComparator nameComparator = new Student.NameComparator();
        Student.AgeComparator ageComparator = new Student.AgeComparator();

        System.out.println(nameComparator.compare(student, student2));
        System.out.println(nameComparator.compare(student3, student2));
        System.out.println(nameComparator.compare(student, student3));

        System.out.println(ageComparator.compare(student, student2));
        System.out.println(ageComparator.compare(student3, student2));
        System.out.println(ageComparator.compare(student, student3));
    }
}

package com.epam.lections.oop.five_class.nested;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static class NameComparator {
        public boolean compare(Student student1, Student student2) {
            return student1.name.equals(student2.name);
        }
    }

    public static class AgeComparator {
        public boolean compare(Student student1, Student student2) {
            return student1.age == (student2.age);
        }
    }
}

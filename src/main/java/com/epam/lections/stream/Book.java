package com.epam.lections.stream;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int year;
    private String name;

        public Book(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }
}

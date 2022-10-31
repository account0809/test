package com.epam.lections.generics.init;

public class Book {
    private Object id;
    private String name;

        public Book(Object id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

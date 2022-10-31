package com.epam.lections.stream.lambda;

public class MyObject {
    private int id;
    private String name;

    public MyObject() {
        this.id = 1;
        this.name = "Supplier";
    }

    public MyObject(int id) {
        this.id = id;
        this.name = "Supplier";
    }

    @Override
    public String toString() {
        return "NewSupplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.epam.lections.generics.geninterface;

// 2 ways
public class Book implements Readable<String> {
    @Override
    public String getId() {
        return "null";
    }

    @Override
    public String calculateId() {
        return "qwerty";
    }
}

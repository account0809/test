package com.epam.lections.db;

import java.util.List;

public interface Dao<T> {
    T get(int id);
    T get(int id, String city);
    List<T> getAll();
    void add(T object);
    void add();
}
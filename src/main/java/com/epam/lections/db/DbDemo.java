package com.epam.lections.db;

public class DbDemo {

    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        customerDao.getAll().stream().forEach(System.out::println);
    }
}
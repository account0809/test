package com.epam.lections.db.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    private static java.sql.Connection conn;

    private static void registerDriver() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver is not found");
        }
        System.out.println("Driver is registered");
    }

    private static java.sql.Connection create() {
        registerDriver();
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost;encrypt=false;username=qwe;password=qwe12345qwe;database=mydb;sslProtocol=TLSv1.2");
            System.out.println("We are connected");
        } catch (SQLException e) {
            System.err.println("Connection is not established");
        }
        return conn;
    }

    public static java.sql.Connection getConnection() {
        if (conn == null) {
            return create();
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                System.err.println("Error while closing the connection");
            }
        }
    }
}

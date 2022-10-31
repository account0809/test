package com.epam.lections.db;

import java.sql.*;

public class ConnectionDemo {
    private static Connection conn;

    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver is registered");

            conn = DriverManager.getConnection("jdbc:sqlserver://localhost;encrypt=false;username=qwe;password=qwe12345qwe;database=mydb;sslProtocol=TLSv1.2");

            System.out.println("We are connected");

            //changeData();
            //getData();
            getData("Paris");

        } catch (ClassNotFoundException e) {
            System.err.println("Driver is not found");
        } catch (SQLException e) {
            System.err.println("Connection is not established");
//            System.out.println(e.getErrorCode());
//            System.out.println(e.getSQLState());
//            System.out.println(e.getCause());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("Error while closing the connection");
            }
        }
    }

    private static void changeData() {
        try (Statement statement = conn.createStatement()) {
            statement.executeUpdate("INSERT INTO [mydb].[dbo].[Customer] VALUES (4, 'New Customer', 'New City')");
        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }

    }

    private static void getData() {
        try (Statement statement = conn.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM [mydb].[dbo].[Customer]");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
    }

    private static void getData(String city) {
        String sql = "SELECT * FROM [mydb].[dbo].[Customer] WHERE city=? and id=?";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, city);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
    }
}
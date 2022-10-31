package com.epam.lections.db;

import com.epam.lections.db.bo.Customer;
import com.epam.lections.db.connection.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements Dao<Customer>{

    @Override
    public Customer get(int id) {
        String sql = "SELECT * FROM [mydb].[dbo].[Customer] WHERE id=?";
        Customer customer = null;

        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)) {

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                customer = new Customer(resultSet.getInt(1), resultSet.getString(2).trim(), resultSet.getString(3).trim());
            }

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
        Connection.close();

        return customer;
    }

    @Override
    public Customer get(int id, String city) {
        String sql = "SELECT * FROM [mydb].[dbo].[Customer] WHERE city=? and id=?";
        Customer customer = null;

        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)) {

            statement.setString(1, city);
            statement.setInt(2, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                customer = new Customer(resultSet.getInt(1), resultSet.getString(2).trim(), resultSet.getString(3).trim());
            }

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
        Connection.close();

        return customer;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();

        try (Statement statement = Connection.getConnection().createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM [mydb].[dbo].[Customer]");

            while (resultSet.next()) {
                customers.add(new Customer(
                        resultSet.getInt(1),
                        resultSet.getString(2).trim(),
                        resultSet.getString(3).trim()));
            }

        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
        Connection.close();

        return customers;
    }

    @Override
    public void add(Customer customer) {
        String sql = "INSERT INTO [mydb].[dbo].[Customer] VALUES (?, ?, ?)";
        try (PreparedStatement statement = Connection.getConnection().prepareStatement(sql)) {

            statement.setInt(1, customer.getId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getCity());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
        Connection.close();
    }

    @Override
    public void add() {
        try (Statement statement = Connection.getConnection().createStatement()) {
            statement.executeUpdate("INSERT INTO [mydb].[dbo].[Customer] VALUES (4, 'New Customer', 'New City')");
        } catch (SQLException e) {
            System.err.println("Exception during the statement execution");
        }
        Connection.close();
    }
}
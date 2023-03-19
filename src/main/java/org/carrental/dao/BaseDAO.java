package org.carrental.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    final String DB_URL = "jdbc:mysql://localhost:3306/car_rental";
    final String USER = "root";
    final String PASSWORD = "root";

    Connection conn;

    BaseDAO(){
        try {
            conn= DriverManager.getConnection(DB_URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

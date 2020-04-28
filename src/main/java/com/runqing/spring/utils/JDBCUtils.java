package com.runqing.spring.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    public static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mall";
            connection = DriverManager.getConnection(url, "root", "123456");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

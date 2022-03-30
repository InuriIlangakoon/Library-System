package controllers;


import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class ConnectionClass {
    public Connection connection;


    public Connection getConnection() {

        String dbName = "library_db";
        String userName = "root";
        String password = "root";

        try {
            forName("com.mysql.jdbc.Driver");

            // creating the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName, userName, password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
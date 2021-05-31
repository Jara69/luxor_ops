package cz.educanet;

import java.sql.*;

public class SelectExample {
    public static void main(String args[]) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM knihy");

        while(resultSet.next()) {
            System.out.println(resultSet.getString("title"));
            System.out.println(resultSet.getString("author"));
            System.out.println("-----");
        }

        connection.close();
    }
}

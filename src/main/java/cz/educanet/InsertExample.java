package cz.educanet;

import java.sql.*;
import java.util.Scanner;

public class InsertExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        String title = "mega kniha";
        String autor = "Antonín Mrtka";
        String obsah = "obsahnevim";
        int newcena = 69420;

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO knihy VALUES(NULL, ?, ?, ?, ?);");

        preparedStatement.setString(1, title);
        preparedStatement.setString(2, autor);
        preparedStatement.setString(3, obsah);
        preparedStatement.setInt(4, newcena);

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }
}

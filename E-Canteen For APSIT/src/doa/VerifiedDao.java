/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;
/**
 *
 * @author avo.v
 */
public class VerifiedDao {
    public static User login(String username, String password) {
        User user = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecanteen?useSSL=false", "root", "@zgardi@n#1234");
            String selectQuery = "SELECT * FROM verified WHERE username=? AND password=?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, username);
            selectStatement.setString(2, password);

            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setStatus(resultSet.getString("status"));
                // set other properties as needed
            }

            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    // Add other methods for database operations as needed
}

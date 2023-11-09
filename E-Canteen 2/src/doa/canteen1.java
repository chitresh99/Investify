/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author avo.v
 */
public class canteen1 {
private Connection connect() {
        // MySQL connection string
        String url = "jdbc:mysql://localhost:3306/ecanteen?useSSL=false";
        String username = "root";
        String password = "@zgardi@n#1234";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertDataFromTable(JTable table) {
        String sql = "INSERT INTO canteen1(item, quantity, price) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // insert data from the table
            for (int i = 0; i < table.getRowCount(); i++) {
                String item = table.getValueAt(i, 0).toString();
                int quantity = Integer.parseInt(table.getValueAt(i, 1).toString());
                double price = Double.parseDouble(table.getValueAt(i, 2).toString());

                pstmt.setString(1, item);
                pstmt.setInt(2, quantity);
                pstmt.setDouble(3, price);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doa;

import javax.swing.JOptionPane;
import java.sql.*; 
/**
 *
 * @author avo.v
 */
public class DbOperations {
    public static void setDataOrDelete (String Query,String msg) {
        try {
             Connection con = ConnectionProvider.getCon ();
             Statement st = con.createStatement();
             st.executeUpdate(Query);
             if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query) {
        try {
             Connection con = ConnectionProvider.getCon ();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query);
             return rs;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

public class DBConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ecanteen?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "@zgardi@n#1234";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
}

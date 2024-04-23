/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doa;
import java.sql.*;
/**
 *
 * @author avo.v
 */
public class ConnectionProvider {
    public static Connection getCon () {
        try {
             Class.forName ("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecanteen?useSSL=false","root","@zgardi@n#1234");
             return con;
        }
        catch(Exception e){
            return null;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doa;

import doa.DbOperations.DBConnection;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author avo.v
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,username,mobileNumber,password,securityQuestion,answer,moodleId,status) values('" + user.getName() + "','" + user.getUsername() + "','" + user.getMobileNumber() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','" + user.getMoodleId() + "','FALSE')";
        DbOperations.setDataOrDelete(query, "Registered Successfully ! Wait for Admin Approval !");

    }

    public static User login(String username, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where username='" + username + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public String getSecurityQuestion(String username) {
    Connection con = ConnectionProvider.getCon();
    try {
        PreparedStatement ps = con.prepareStatement("SELECT securityQuestion FROM user WHERE username=?");
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getString("securityQuestion");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return null;
}
    
    public static void update(String username, String newPassword) {
        Connection con = Connectionpro.getCon();
        try {
            PreparedStatement ps = con.prepareStatement("update users set password=? where username=?");
            ps.setString(1, newPassword);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
        public static boolean isVerified(String username) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean verified = false;

        try {
            con = DBConnection.getConnection();
            String query = "SELECT * FROM verified WHERE username = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();

            if (rs.next()) {
                String status = rs.getString("status");
                if (status.equals("TRUE")) {
                    verified = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return verified;
    }
        
    public static boolean verifyPassword(String username, String password) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    boolean passwordVerified = false;

    try {
        con = DBConnection.getConnection();
        String query = "SELECT * FROM verified WHERE username = ? AND password = ?";
        ps = con.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password);
        rs = ps.executeQuery();

        if (rs.next()) {
            passwordVerified = true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return passwordVerified;
}

        

    public boolean updatePassword(String username, String newPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSecurityAnswer(String searchUsername) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

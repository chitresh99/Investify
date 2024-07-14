/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alumni;

import java.util.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Abhijit
 */
public class adminlog extends javax.swing.JFrame {

    ;

    
    public adminlog() {
        initComponents();

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        id = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        p = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        left.setBackground(new java.awt.Color(255, 255, 255));
        left.setPreferredSize(new java.awt.Dimension(800, 500));
        left.setLayout(null);

        right.setBackground(new java.awt.Color(0, 102, 102));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumni");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/img/images-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        left.add(right);
        right.setBounds(0, 0, 400, 500);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ADMIN");
        left.add(jLabel1);
        jLabel1.setBounds(530, 40, 130, 48);

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setText("Email ID :");
        left.add(label1);
        label1.setBounds(430, 150, 80, 24);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        left.add(id);
        id.setBounds(430, 180, 330, 30);

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Password :");
        left.add(label2);
        label2.setBounds(430, 240, 90, 24);
        left.add(p);
        p.setBounds(430, 280, 330, 30);

        login.setBackground(new java.awt.Color(0, 102, 102));
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        left.add(login);
        login.setBounds(600, 340, 140, 30);

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        left.add(back);
        back.setBounds(430, 340, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        String username = id.getText();
        String Password = new String(p.getPassword());
        //JOptionPane.showMessageDialog(this, Password);
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Mane2004@");
            Statement stm = conn.createStatement();
            String sql = "select * from admin where ID = '"+username+"' and Password = '"+Password+"';";
            //JOptionPane.showMessageDialog(this, sql);
            java.sql.ResultSet rst = stm .executeQuery(sql);
            if(rst.next()){
                Adminhome adminhome = new Adminhome();
                adminhome.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        

    }//GEN-LAST:event_loginActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        login loginFrame = new login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(loginFrame);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPanel left;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField p;
    private javax.swing.JPanel right;
    // End of variables declaration//GEN-END:variables

    private static class JoptionPane {

        private static void showMessageDialog(adminlog aThis, String username_or_password_wrong) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JoptionPane() {
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class Manager {

        public Manager() {
        }
    }
}

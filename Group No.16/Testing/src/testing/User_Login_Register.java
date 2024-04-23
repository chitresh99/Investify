/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author sdewr
 */
public class User_Login_Register extends javax.swing.JFrame {

    /**
     * Creates new form User_Login_Register
     */
    public User_Login_Register() {
        initComponents();
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
       
       
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new scrollbar.ScrollPaneWin11();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        mobileno = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        city = new javax.swing.JComboBox<>();
        jScrollPane2 = new scrollbar.ScrollPaneWin11();
        address = new javax.swing.JTextArea();
        repassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        usernamelog = new javax.swing.JTextField();
        passwordlog = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkGradientFocus(1500);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkGradientFocus(1500);
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("CropBuddy");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 210, 100));

        jLabel7.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("User Register /Login");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 260, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-48.png"))); // NOI18N
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 50, 100));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-button-85.png"))); // NOI18N
        back.setText("jLabel4");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        kGradientPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 80));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 100));

        jLabel6.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buy Fresh Vegetables");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 410, 50));

        jLabel8.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("through farm");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 190, 50));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(565, 650));
        jPanel6.setMinimumSize(new java.awt.Dimension(434, 1255));
        jPanel6.setPreferredSize(new java.awt.Dimension(434, 1255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 204, 255));
        jLabel35.setText("Username :");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, 40));

        jLabel36.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 204, 255));
        jLabel36.setText("Email:");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, 40));

        jLabel37.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 204, 255));
        jLabel37.setText("Confirm Pasword:");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 940, -1, 40));

        jLabel38.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 204, 255));
        jLabel38.setText("Password:");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, -1, 40));

        jLabel39.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 204, 255));
        jLabel39.setText("Address:");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, 40));

        jLabel40.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 204, 255));
        jLabel40.setText("City:");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 50, 40));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel6.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 210, 50));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel6.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 50));

        jLabel41.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 204, 255));
        jLabel41.setText("Contact Number :");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 40));

        mobileno.setBackground(new java.awt.Color(255, 255, 255));
        mobileno.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        mobileno.setForeground(new java.awt.Color(0, 0, 0));
        mobileno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 210, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 255));
        jButton3.setText("register");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1080, 130, 50));

        city.setBackground(new java.awt.Color(255, 255, 255));
        city.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        city.setForeground(new java.awt.Color(0, 0, 0));
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select city--", "Mumbai", "Nagpur", "Pune", "Aurangabad", "Satara", " " }));
        city.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel6.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, 120, 50));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setRows(5);
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jScrollPane2.setViewportView(address);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, -1));

        repassword.setBackground(new java.awt.Color(255, 255, 255));
        repassword.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        repassword.setForeground(new java.awt.Color(0, 0, 0));
        repassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repasswordActionPerformed(evt);
            }
        });
        jPanel6.add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1000, 180, 40));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 870, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-96.png"))); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 90));

        jScrollPane1.setViewportView(jPanel6);

        jTabbedPane2.addTab("tab1", jScrollPane1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 204, 255));
        jLabel45.setText("PASSWORD:");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 30));

        usernamelog.setBackground(new java.awt.Color(255, 255, 255));
        usernamelog.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        usernamelog.setForeground(new java.awt.Color(0, 0, 0));
        usernamelog.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel3.add(usernamelog, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 220, 40));

        passwordlog.setBackground(new java.awt.Color(255, 255, 255));
        passwordlog.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        passwordlog.setForeground(new java.awt.Color(0, 0, 0));
        passwordlog.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel3.add(passwordlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 220, 40));

        jLabel5.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("username :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("login");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-96.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, 80));

        jTabbedPane2.addTab("tab2", jPanel3);

        kGradientPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 390, 560));

        kGradientPanel3.setkGradientFocus(150);
        kGradientPanel3.setkStartColor(new java.awt.Color(51, 204, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("login");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 200, 50));

        kGradientPanel4.setkGradientFocus(150);
        kGradientPanel4.setkStartColor(new java.awt.Color(51, 204, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("register");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 200, 50));

        jLabel11.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Delivered directly  ");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 880));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Username,Email,Password,mobile_no,Address,City,Repassword,query;
        String SUrl,SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/info";
        SUser = "root";
        SPass = "1234567890";
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
           Statement st = con.createStatement();
           if("".equals(username.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
               
           }else  if("".equals(email.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(mobileno.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Mobile no is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(address.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Address is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(city.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "City is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           } else if("".equals(password.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else{
               Username = username.getText();
               mobile_no = mobileno.getText();
               Email = email.getText();
               Password = password.getText();
               Address = address.getText();
               City = city.getSelectedItem().toString();
               Repassword  = repassword.getText();
               query = "INSERT INTO user(username,mobileno,email,pass,city,address,re_pass)"+
                       "VALUES('"+Username+"', '"+mobile_no+"' , '"+Email+"' , '"+Password+"','"+City+"','"+Address+"','"+Repassword+"')";
                st.execute(query);
                username.setText("");
                mobileno.setText("");
                email.setText("");
                password.setText("");
                address.setText("");
                city.setSelectedItem("--select city--");
                repassword.setText("");
                showMessageDialog(null, "New account has been created successfully!");
                
                
           }
               
           }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);

    }//GEN-LAST:event_jLabel10MouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void repasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        String Username, Password, query,emaildb,mobiledb,addressdb,citydb,passDb = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/info";
        SUser = "root";
        SPass = "1234567890";
        int notFound = 0;
        emaildb = null;
        mobiledb = null;
        addressdb = null;
        citydb = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(usernamelog.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(passwordlog.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else {
            Username = usernamelog.getText();
            Password = passwordlog.getText();
            
            query = "SELECT * FROM user WHERE username = '"+Username+"'";
       
            ResultSet rs = st.executeQuery(query);
           
            
            while(rs.next()){
                passDb = rs.getString("pass");
                notFound = 1;
            }
            if(notFound == 1 && Password.equals(passDb)){
                successful ss = new successful();
                ss.show();
                dispose();
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Incorrect username or password", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
               
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
           System.out.println("Error!" + e.getMessage()); 
        }
        
        
        try {
            SUrl = "jdbc:MySQL://localhost:3306/info";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            Username = usernamelog.getText();
            query = "INSERT INTO loguser (username)" + "VALUES('"+Username+"')";
            st.execute(query);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_Login_Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User_Login_Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
        passwordlog.setText("");
        usernamelog.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
       home_page1 hp = new home_page1();
        hp.show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User_Login_Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    public keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JTextField mobileno;
    private javax.swing.JPasswordField password;
    public javax.swing.JPasswordField passwordlog;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField username;
    private javax.swing.JTextField usernamelog;
    // End of variables declaration//GEN-END:variables
}

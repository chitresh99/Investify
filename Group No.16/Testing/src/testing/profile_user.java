/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;


import java.awt.Image;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public  class profile_user extends javax.swing.JFrame {

    
    public profile_user() {
        initComponents();
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        
        try {
            DisplayProfile();
        } catch (SQLException ex) {
            Logger.getLogger(profile_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    String Username,Email,Address,Mobile,City;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
   
    
    
    
   public void DisplayProfile() throws SQLException{   // Function to display the profile
    try {
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/info";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("select username from loguser order by id desc"); // first query to fetch username from loguser table
            rs = pst.executeQuery();
            rs.next();
            Username = rs.getString("username");
            profile_user.setText(Username);
            
            pst = con.prepareStatement("select * from user where username = '"+Username+"'"); // second query to fetch rest of the details from main user table
            rs = pst.executeQuery();
            rs.next();
            Email = rs.getString("email");
            Address = rs.getString("address");
            Mobile = rs.getString("mobileno");
            City = rs.getString("city");
            profile_email.setText(Email);
            profile_mobileno.setText(Mobile);
            profile_address.setText(Address);
            profile_city.setText(City);
 
            
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dasboard.class.getName()).log(Level.SEVERE, null, ex);
        }  
   }
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new scrollbar.ScrollPaneWin11();
        profile_address = new javax.swing.JTextArea();
        profile_city = new javax.swing.JLabel();
        profile_user = new javax.swing.JLabel();
        profile_email = new javax.swing.JLabel();
        profile_mobileno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkGradientFocus(700);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("profile");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 150, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-48.png"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 50, 60));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("username  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, 40));

        jLabel5.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Email  :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, 40));

        jLabel7.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("mobile no  :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 110, 40));

        jLabel9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("address  :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 90, 40));

        jLabel11.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("city  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 60, 40));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        profile_address.setEditable(false);
        profile_address.setBackground(new java.awt.Color(255, 255, 255));
        profile_address.setColumns(20);
        profile_address.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        profile_address.setForeground(new java.awt.Color(0, 204, 255));
        profile_address.setLineWrap(true);
        profile_address.setRows(5);
        profile_address.setTabSize(5);
        profile_address.setWrapStyleWord(true);
        jScrollPane2.setViewportView(profile_address);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 230, 130));

        profile_city.setBackground(new java.awt.Color(255, 255, 255));
        profile_city.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        profile_city.setForeground(new java.awt.Color(0, 204, 255));
        profile_city.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profile_city.setOpaque(true);
        jPanel1.add(profile_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 160, 40));

        profile_user.setBackground(new java.awt.Color(255, 255, 255));
        profile_user.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        profile_user.setForeground(new java.awt.Color(0, 204, 255));
        profile_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profile_user.setOpaque(true);
        jPanel1.add(profile_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 160, 40));

        profile_email.setBackground(new java.awt.Color(255, 255, 255));
        profile_email.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        profile_email.setForeground(new java.awt.Color(0, 204, 255));
        profile_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profile_email.setOpaque(true);
        jPanel1.add(profile_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 260, 40));

        profile_mobileno.setBackground(new java.awt.Color(255, 255, 255));
        profile_mobileno.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        profile_mobileno.setForeground(new java.awt.Color(0, 204, 255));
        profile_mobileno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profile_mobileno.setOpaque(true);
        jPanel1.add(profile_mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 160, 40));

        jScrollPane1.setViewportView(jPanel1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 780, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-button-85.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 80));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Dasboard ds = new Dasboard();
        ds.show();
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    
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
            java.util.logging.Logger.getLogger(profile_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextArea profile_address;
    public javax.swing.JLabel profile_city;
    public javax.swing.JLabel profile_email;
    public javax.swing.JLabel profile_mobileno;
    public javax.swing.JLabel profile_user;
    // End of variables declaration//GEN-END:variables
}

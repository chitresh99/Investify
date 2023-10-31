package testing;

import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sdewr
 */
public class Dasboard extends javax.swing.JFrame {

   
    public Dasboard() {
        initComponents();
        try {
            DisplayUser();
         } catch (SQLException ex) {
            Logger.getLogger(Dasboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    String Username;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void DisplayUser() throws SQLException{                    //function to display username
        try {
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/info";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("select username from loguser order by id desc");
            rs = pst.executeQuery();
            rs.next();
            Username = rs.getString("username");
            user.setText(Username);
                             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dasboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
//  String UsernameDB,emaildb,addressdb,mobiledb,citydb;
//   public void DisplayUser(String Password) throws SQLException{
//     
//        try {
//            String SUrl,SUser,SPass,PasswordStr;
//            SUrl = "jdbc:MySQL://localhost:3306/info";
//            SUser = "root";
//            SPass = "1234567890";
//            PasswordStr = Password;
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(SUrl,SUser,SPass);
//            pst = con.prepareStatement("select * from user where pass = '"+PasswordStr+"'");
//            rs = pst.executeQuery();
//            while(rs.next()){
//            user.setText(rs.getString("username"));
//            emaildb = rs.getString("email");
//            addressdb = rs.getString("address");
//            mobiledb = rs.getString("mobileno");
//            citydb = rs.getString("city");
//            }
            
            
//            rs.next();
//            user.setText(rs.getString("username"));
//            emaildb = rs.getString("email");
//            addressdb = rs.getString("address");
//            mobiledb = rs.getString("mobileno");
//            citydb = rs.getString("city");
//                
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Dasboard.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    // }
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        city1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(117, 255, 61));
        setPreferredSize(new java.awt.Dimension(850, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkGradientFocus(400);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-48.png"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 50, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-75 (1).png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 110));

        jLabel17.setBackground(new java.awt.Color(51, 204, 255));
        jLabel17.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("profile");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 153, 255)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 40));

        address.setBackground(new java.awt.Color(22, 76, 255));
        address.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, 30));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 180));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cart-75.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 120));

        jLabel18.setBackground(new java.awt.Color(51, 204, 255));
        jLabel18.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 204, 255));
        jLabel18.setText("shop products");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 153, 255)));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 40));

        city.setBackground(new java.awt.Color(22, 76, 255));
        city.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, 30));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 30));

        kGradientPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 210, 180));

        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome ");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-shutdown-50.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 100, 80));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 204, 255));
        jLabel8.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("articles");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 153, 255)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 40));

        city1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-article-75.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 140));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 210, 180));

        jPanel2.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        search_product_user ss = new  search_product_user();
        ss.show();
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
       search_product_user ss = new  search_product_user();
        ss.show();
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        profile_user ps =new profile_user();
//        ps.profile_user.setText(user.getText());
//        ps.profile_address.setText(addressdb);
//        ps.profile_city.setText(citydb);
//        ps.profile_mobileno.setText(mobiledb);
//        ps.profile_email.setText(emaildb);
        ps.show();
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
         profile_user ps =new profile_user();
//         ps.profile_user.setText(user.getText());
//         ps.profile_address.setText(addressdb);
//         ps.profile_city.setText(citydb);
//         ps.profile_mobileno.setText(mobiledb);
//         ps.profile_email.setText(emaildb);
         ps.show();
         dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        home_page1 hp = new home_page1();
        hp.show();
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Article_page ap = new Article_page();
        ap.show();
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Article_page ap = new Article_page();
        ap.show();
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dasboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel address;
    public javax.swing.JLabel city;
    public javax.swing.JLabel city1;
    public javax.swing.JLabel email;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
 


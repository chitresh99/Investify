/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Gov_Policies extends javax.swing.JFrame {

   
    public Gov_Policies() {
        initComponents();
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportBorder(null);
        try {
            DisplayPolicy();
        } catch (SQLException ex) {
            Logger.getLogger(Gov_Policies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    
    public void DisplayPolicy() throws SQLException{    //function to display latest government policies added
        try {
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/articles";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("select * from gov_policies order by id desc");
            rs = pst.executeQuery();
            rs.next();
            policy_name1.setText(rs.getString("policy_name"));
            policy_details1.setText(rs.getString("policy_details"));
            pollink1.setText(rs.getString("policylink"));
            
            
            rs.next();
            policy_name2.setText(rs.getString("policy_name"));
            policy_details2.setText(rs.getString("policy_details"));
            pollink2.setText(rs.getString("policylink"));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gov_Policies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new scrollbar.ScrollPaneWin11();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        policy_name2 = new javax.swing.JLabel();
        jScrollPane2 = new scrollbar.ScrollPaneWin11();
        policy_details2 = new javax.swing.JTextArea();
        policy_name1 = new javax.swing.JLabel();
        jScrollPane3 = new scrollbar.ScrollPaneWin11();
        policy_details1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pollink1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pollink2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(950, 820));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(692, 3200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("government policies");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 400, -1));

        policy_name2.setBackground(new java.awt.Color(255, 255, 255));
        policy_name2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        policy_name2.setForeground(new java.awt.Color(0, 153, 255));
        policy_name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        policy_name2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        policy_name2.setOpaque(true);
        jPanel1.add(policy_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1740, 590, 60));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        policy_details2.setEditable(false);
        policy_details2.setBackground(new java.awt.Color(255, 255, 255));
        policy_details2.setColumns(20);
        policy_details2.setFont(new java.awt.Font("The Bold Font", 0, 16)); // NOI18N
        policy_details2.setForeground(new java.awt.Color(0, 153, 255));
        policy_details2.setLineWrap(true);
        policy_details2.setRows(5);
        policy_details2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(policy_details2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1860, 690, 1160));

        policy_name1.setBackground(new java.awt.Color(255, 255, 255));
        policy_name1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        policy_name1.setForeground(new java.awt.Color(0, 153, 255));
        policy_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        policy_name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 255)));
        policy_name1.setOpaque(true);
        jPanel1.add(policy_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 590, 60));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(0, 153, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        policy_details1.setEditable(false);
        policy_details1.setBackground(new java.awt.Color(255, 255, 255));
        policy_details1.setColumns(20);
        policy_details1.setFont(new java.awt.Font("The Bold Font", 0, 16)); // NOI18N
        policy_details1.setForeground(new java.awt.Color(0, 153, 255));
        policy_details1.setLineWrap(true);
        policy_details1.setRows(5);
        policy_details1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(policy_details1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 690, 1150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-document-75.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 80));

        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Policy  Link :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1460, 130, 50));

        pollink1.setFont(new java.awt.Font("The Bold Font", 0, 16)); // NOI18N
        pollink1.setForeground(new java.awt.Color(0, 153, 255));
        pollink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pollink1MouseClicked(evt);
            }
        });
        jPanel1.add(pollink1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1460, 520, 50));

        jLabel6.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Policy  Link :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3050, 130, 50));

        pollink2.setFont(new java.awt.Font("The Bold Font", 0, 16)); // NOI18N
        pollink2.setForeground(new java.awt.Color(0, 153, 255));
        pollink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pollink2MouseClicked(evt);
            }
        });
        jPanel1.add(pollink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 3050, 520, 50));

        jScrollPane1.setViewportView(jPanel1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -5, 750, 800));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-button-85.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        DashboardFarmer ds = new DashboardFarmer();
        ds.show();
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void pollink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pollink1MouseClicked
        try {
            // TODO add your handling code here:
            URI uri = new URI(pollink1.getText());
            
            // Use the Desktop class to open the default web browser
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Gov_Policies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Gov_Policies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pollink1MouseClicked

    private void pollink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pollink2MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            URI uri = new URI(pollink2.getText());
            
            // Use the Desktop class to open the default web browser
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Gov_Policies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Gov_Policies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pollink2MouseClicked

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
            java.util.logging.Logger.getLogger(Gov_Policies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gov_Policies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gov_Policies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gov_Policies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gov_Policies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextArea policy_details1;
    private javax.swing.JTextArea policy_details2;
    private javax.swing.JLabel policy_name1;
    private javax.swing.JLabel policy_name2;
    private javax.swing.JLabel pollink1;
    private javax.swing.JLabel pollink2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Prachi
 */
public class Courses extends javax.swing.JFrame {

    /**
     * Creates new form Courses
     */
    public Courses() {
        initComponents();
        //startLabelAnimation();
        
           }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        profbtn = new javax.swing.JButton();
        coursesbtn = new javax.swing.JButton();
        statusbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hackerbtn = new javax.swing.JButton();
        oraclebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AICTEbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 600));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        profbtn.setBackground(new java.awt.Color(51, 51, 51));
        profbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        profbtn.setForeground(new java.awt.Color(255, 255, 255));
        profbtn.setText("> PROFILE");
        profbtn.setBorder(null);
        profbtn.setBorderPainted(false);
        profbtn.setContentAreaFilled(false);
        profbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profbtnMouseClicked(evt);
            }
        });
        profbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profbtnActionPerformed(evt);
            }
        });

        coursesbtn.setBackground(new java.awt.Color(51, 51, 51));
        coursesbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coursesbtn.setForeground(new java.awt.Color(255, 255, 255));
        coursesbtn.setText("> COURSES");
        coursesbtn.setBorder(null);
        coursesbtn.setBorderPainted(false);
        coursesbtn.setContentAreaFilled(false);

        statusbtn.setBackground(new java.awt.Color(51, 51, 51));
        statusbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusbtn.setForeground(new java.awt.Color(255, 255, 255));
        statusbtn.setText("> QUERY");
        statusbtn.setBorder(null);
        statusbtn.setBorderPainted(false);
        statusbtn.setContentAreaFilled(false);
        statusbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusbtnMouseClicked(evt);
            }
        });
        statusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusbtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusbtn)
                    .addComponent(profbtn)
                    .addComponent(coursesbtn)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(profbtn)
                .addGap(28, 28, 28)
                .addComponent(coursesbtn)
                .addGap(35, 35, 35)
                .addComponent(statusbtn)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        logoutbtn.setBackground(new java.awt.Color(51, 51, 51));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Log Out");
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(1196, Short.MAX_VALUE)
                .addComponent(logoutbtn)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logoutbtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Courses");

        hackerbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hackerbtn.setText("> Hackerrank");
        hackerbtn.setBorder(null);
        hackerbtn.setBorderPainted(false);
        hackerbtn.setContentAreaFilled(false);
        hackerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hackerbtnMouseClicked(evt);
            }
        });
        hackerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hackerbtnActionPerformed(evt);
            }
        });

        oraclebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        oraclebtn.setText("> Oracle");
        oraclebtn.setBorder(null);
        oraclebtn.setBorderPainted(false);
        oraclebtn.setContentAreaFilled(false);
        oraclebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oraclebtnMouseClicked(evt);
            }
        });
        oraclebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oraclebtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Prachi\\Pictures\\courses 1.jpg")); // NOI18N

        AICTEbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AICTEbtn.setText("> AICTE");
        AICTEbtn.setBorder(null);
        AICTEbtn.setBorderPainted(false);
        AICTEbtn.setContentAreaFilled(false);
        AICTEbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AICTEbtnMouseClicked(evt);
            }
        });
        AICTEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AICTEbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cohort-5");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cohort-6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oraclebtn)
                                    .addComponent(hackerbtn)
                                    .addComponent(AICTEbtn))))
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(AICTEbtn)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(hackerbtn)
                                .addGap(30, 30, 30)
                                .addComponent(oraclebtn)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profbtnMouseClicked
        // TODO add your handling code here:
        profile prof = new profile();
        prof.setVisible(true);
    }//GEN-LAST:event_profbtnMouseClicked

    private void statusbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusbtnMouseClicked
        // TODO add your handling code here:
        status stat = new status();
        stat.setVisible(true);
    }//GEN-LAST:event_statusbtnMouseClicked

    private void oraclebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oraclebtnMouseClicked
        // TODO add your handling code here:
        oracle oracle = new oracle();
        oracle.setVisible(true);
    }//GEN-LAST:event_oraclebtnMouseClicked

    private void AICTEbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AICTEbtnMouseClicked
        // TODO add your handling code here:
        cohort5 coho = new cohort5();
        coho.setVisible(true);
    }//GEN-LAST:event_AICTEbtnMouseClicked

    private void hackerbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hackerbtnMouseClicked
        // TODO add your handling code here:
        hackerrank hacker = new hackerrank();
        hacker.setVisible(true);
    }//GEN-LAST:event_hackerbtnMouseClicked

    private void profbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profbtnActionPerformed
        // TODO add your handling code here:
        profile prof = new profile();
        prof.show();
        dispose();
    }//GEN-LAST:event_profbtnActionPerformed

    private void statusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusbtnActionPerformed
        // TODO add your handling code here:
         status status = new status();
        status.show();
        dispose();
    }//GEN-LAST:event_statusbtnActionPerformed

    private void AICTEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AICTEbtnActionPerformed
        // TODO add your handling code here:
        cohort5 coho = new cohort5();
        coho.show();
        dispose();
        
    }//GEN-LAST:event_AICTEbtnActionPerformed

    private void hackerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hackerbtnActionPerformed
        // TODO add your handling code here:
        hackerrank hacker = new hackerrank();
        hacker.show();
        dispose();
    }//GEN-LAST:event_hackerbtnActionPerformed

    private void oraclebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oraclebtnActionPerformed
        // TODO add your handling code here:
        oracle oracle = new oracle();
        oracle.show();
        dispose();
    }//GEN-LAST:event_oraclebtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_logoutbtnActionPerformed

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        // TODO add your handling code here:
        admstdpage log = new admstdpage();
        log.setVisible(true);
    }//GEN-LAST:event_logoutbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AICTEbtn;
    private javax.swing.JButton coursesbtn;
    private javax.swing.JButton hackerbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton oraclebtn;
    private javax.swing.JButton profbtn;
    private javax.swing.JButton statusbtn;
    // End of variables declaration//GEN-END:variables
}

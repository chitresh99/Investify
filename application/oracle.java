/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Prachi
 */
public class oracle extends javax.swing.JFrame {

    private JLabel imagePathLabel;
    private JFileChooser fileChooser;

    /**
     * Creates new form oracle
     */
    public oracle() {
        initComponents();
        fileChooser = new JFileChooser();
        imagePathLabel = new JLabel("Selected Image Path: ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        profilebtn = new javax.swing.JButton();
        coursebtn = new javax.swing.JButton();
        statusbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textname = new javax.swing.JTextField();
        upload = new javax.swing.JButton();
        save2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 600));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        profilebtn.setBackground(new java.awt.Color(51, 51, 51));
        profilebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        profilebtn.setForeground(new java.awt.Color(255, 255, 255));
        profilebtn.setText("> PROFILE");
        profilebtn.setBorder(null);
        profilebtn.setBorderPainted(false);
        profilebtn.setContentAreaFilled(false);
        profilebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilebtnMouseClicked(evt);
            }
        });
        profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebtnActionPerformed(evt);
            }
        });

        coursebtn.setBackground(new java.awt.Color(51, 51, 51));
        coursebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coursebtn.setForeground(new java.awt.Color(255, 255, 255));
        coursebtn.setText("> COURSES");
        coursebtn.setBorder(null);
        coursebtn.setBorderPainted(false);
        coursebtn.setContentAreaFilled(false);
        coursebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursebtnMouseClicked(evt);
            }
        });

        statusbtn.setBackground(new java.awt.Color(51, 51, 51));
        statusbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusbtn.setForeground(new java.awt.Color(255, 255, 255));
        statusbtn.setText(">QUERY");
        statusbtn.setBorder(null);
        statusbtn.setBorderPainted(false);
        statusbtn.setContentAreaFilled(false);
        statusbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusbtnMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("MENU");

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("> ANNOUNCE");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(statusbtn)
                    .addComponent(profilebtn)
                    .addComponent(coursebtn)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(profilebtn)
                .addGap(28, 28, 28)
                .addComponent(coursebtn)
                .addGap(34, 34, 34)
                .addComponent(statusbtn)
                .addGap(31, 31, 31)
                .addComponent(jButton7)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        logoutbtn.setBackground(new java.awt.Color(51, 51, 51));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Log Out");
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbtn)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logoutbtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Oracle");

        jLabel4.setText("It is one of the oldest database management companies");

        jLabel5.setText("in the world. It has always focused on enterprise needs and");

        jLabel6.setText("kept up with the newest technological developments.");

        jLabel7.setText("As a result, its products are constantly updated with new ");

        jLabel8.setText("features. For example the most recent Oracle Database,");

        jLabel9.setText("19C, is available on Oracle Cloud. Oracle allows users to ");

        jLabel10.setText("select from various database aditions to meet their specific");

        jLabel11.setText("demands with a cost-effective solution.");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Link");

        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("https://academy.oracle.com/en/oa-web-overview.html");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        upload.setBackground(new java.awt.Color(51, 51, 51));
        upload.setForeground(new java.awt.Color(255, 255, 255));
        upload.setText("Upload Certificate");
        upload.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        save2.setText("save");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Name");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/oracle.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save2)
                            .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textname))
                                .addGap(18, 18, 18)
                                .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(save2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusbtnMouseClicked
        // TODO add your handling code here:
        status stat = new status();
        stat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_statusbtnMouseClicked

    private void coursebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursebtnMouseClicked
        // TODO add your handling code here:
        Courses1 cour = new Courses1();
        cour.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_coursebtnMouseClicked

    private void profilebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMouseClicked
        // TODO add your handling code here:
        profile prof = new profile();
        prof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilebtnMouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        // TODO add your handling code here:
        admstdpage log = new admstdpage();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        // TODO add your handling code here:
        profile prof = new profile();
        prof.show();
        dispose();
    }//GEN-LAST:event_profilebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Desktop desk = Desktop.getDesktop();
        try {
            desk.browse(new URI("https://academy.oracle.com/en/oa-web-overview.html"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(oracle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        int result = fileChooser.showOpenDialog(oracle.this);
        //display the filechooser dialog box
        if (result == JFileChooser.APPROVE_OPTION)
        //checks if the user clicked "open" or equivalent in the file choose dialog
        {
            // User selected a file, set the selected file path in the label
            File selectedFile = fileChooser.getSelectedFile();
            //If the user selected a file, this line retrieves the selected file as a File object
            imagePathLabel.setText("Selected Image Path:" + selectedFile.getAbsolutePath());
            //sets the text of imagePathLabel to display the path of the selected file
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        // TODO add your handling code here:
        String name = textname.getText();
        // line gets the text entered in a text input field named txtname
        String imagePath = imagePathLabel.getText().replace("Selected Image Path:", "");
        //line gets the text from a label named imagePathLabel

        try {
            byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));
            //reads all the bytes from the file located at the imagePath and stores them in a byte array named imageBytes

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "root", "@group1816");

            // Insert data into the database
            String insertQuery = "INSERT INTO upload (name, image) VALUES (?, ?)";
            //line defines sql insert query as string
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            // prepares the SQL statement for execution It allows you to insert parameters into a SQL query
            preparedStatement.setString(1, name);
            //first parameter in the prepared statement to the name obtained earlier
            preparedStatement.setBytes(2, imageBytes);
            //the second parameter in the prepared statement to the imageBytes obtained from reading the image file
            preparedStatement.executeUpdate();
            //executes the SQL query to insert the data into the database

            // Optionally, display a success message
            JOptionPane.showMessageDialog(this, "Data saved successfully!");

            // Close the database connection
            connection.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "File Not Found: " + ex.getMessage());
        } catch (IOException | SQLException ex) {
            ex.printStackTrace();
             //prints the details of the exception to the console
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_save2ActionPerformed

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
            java.util.logging.Logger.getLogger(oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oracle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coursebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton profilebtn;
    private javax.swing.JButton save2;
    private javax.swing.JButton statusbtn;
    private javax.swing.JTextField textname;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}

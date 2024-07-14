/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package article_tabs;

import java.awt.Image;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import testing.Article_page;

/**
 *
 * @author DELL
 */
public class B8 extends javax.swing.JFrame {

    /**
     * Creates new form N1
     */
    public B8() {
        initComponents();
        
        
        Connection sqlConn;
    Statement st;
    ResultSet rs = null;
    
    try
    {
         Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/articles","root", "1234567890");
            st = sqlConn.createStatement();
            
            rs = st.executeQuery("select * from articles where Type = 'blog' order by SrNo desc");
           
                 
                 for(int i=1;i<=6;i++){
                  rs.next();
                 }
                byte[] img8 = rs.getBytes("photo");
                ImageIcon image8 = new ImageIcon(img8);
                Image im8 = image8.getImage();
                Image myimg8 = im8.getScaledInstance(i8.getWidth(), i8.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage8 = new ImageIcon(myimg8);
                i8.setIcon(newImage8);
                 txtTitle.setText(rs.getString("Title")); 
                 txtDate.setText(rs.getString("Date"));                
                 txtDescription.setText(rs.getString("Description"));           
    }
    catch (ClassNotFoundException ex) 
    {
          java.util.logging.Logger.getLogger(B8.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
    }  
    catch (SQLException ex)
      {
          java.util.logging.Logger.getLogger(B8.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
          
      }
        
        
        
        
        
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        i8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(0, 0, 0));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 796, 144));

        txtDate.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 212, 36));

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Publish Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-button-45.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, -1, -1));

        i8.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        i8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 590, 310));

        txtDescription.setEditable(false);
        txtDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(0, 0, 0));
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDescription);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1170, 760));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1442, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
//        Article_page ap = new Article_page();
//        ap.show();
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(B8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel i8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtDate;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}

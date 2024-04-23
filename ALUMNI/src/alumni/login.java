
package alumni;

import java.sql.*;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        id = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        p = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/img/images-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        left.add(right);
        right.setBounds(0, 0, 400, 500);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");
        left.add(jLabel1);
        jLabel1.setBounds(550, 40, 110, 48);

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setText("Login as ");
        left.add(label1);
        label1.setBounds(430, 330, 80, 24);
        label1.getAccessibleContext().setAccessibleName("Moodle ID ");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        left.add(id);
        id.setBounds(430, 140, 330, 30);

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Password :");
        left.add(label2);
        label2.setBounds(430, 190, 90, 24);
        left.add(p);
        p.setBounds(430, 230, 330, 30);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ALUMNI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        left.add(jButton3);
        jButton3.setBounds(620, 360, 140, 30);
        left.add(jSeparator1);
        jSeparator1.setBounds(410, 410, 380, 3);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Student ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        left.add(jButton6);
        jButton6.setBounds(430, 360, 140, 30);

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 102, 102));
        label3.setText("Moodle ID :");
        left.add(label3);
        label3.setBounds(430, 110, 80, 24);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADMIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        left.add(jButton4);
        jButton4.setBounds(550, 450, 100, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CLOSE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        left.add(jButton1);
        jButton1.setBounds(700, 10, 80, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        
        String username = id.getText();
        String Password = new String(p.getPassword());
        //JOptionPane.showMessageDialog(this, Password);
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Mane2004@");
            Statement stm = conn.createStatement();
            String sql = "select * from alumni where ID = '"+username+"' and Password = '"+Password+"';";
            //JOptionPane.showMessageDialog(this, sql);
            java.sql.ResultSet rst = stm .executeQuery(sql);
            if(rst.next()){
                 alumnihome    alumnihomeFrame = new    alumnihome();
          alumnihomeFrame.setVisible(true);
         alumnihomeFrame.pack();
        alumnihomeFrame.setLocationRelativeTo(   alumnihomeFrame);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
       
          
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        String username = id.getText();
        String Password = new String(p.getPassword());
        //JOptionPane.showMessageDialog(this, Password);
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Mane2004@");
            Statement stm = conn.createStatement();
            String sql = "select * from student where ID = '"+username+"' and Password = '"+Password+"';";
            //JOptionPane.showMessageDialog(this, sql);
            java.sql.ResultSet rst = stm .executeQuery(sql);
            if(rst.next()){
                studenthome studenthome = new studenthome();
                studenthome.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        adminlog    adminlogFrame = new    adminlog();
          adminlogFrame.setVisible(true);
         adminlogFrame.pack();
        adminlogFrame.setLocationRelativeTo(   adminlogFrame);
        this.dispose(); 
       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do u really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0); //used to close application
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JPanel left;
    private javax.swing.JPasswordField p;
    private javax.swing.JPanel right;
    // End of variables declaration//GEN-END:variables
}

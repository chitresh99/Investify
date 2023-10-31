/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class admin_page extends javax.swing.JFrame {

    /**
     * Creates new form admin_page
     */
    public admin_page() {
        initComponents();
        showTableData();
        showTableDataUser();
        showTableDataFarmer();
        showTableDataProduct();
        showTableDataGovernmentPolicy();
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane4.setOpaque(false);
        jScrollPane4.getViewport().setOpaque(false);
        jScrollPane4.setBorder(null);
        jScrollPane4.setViewportBorder(null);
        jScrollPane5.setOpaque(false);
        jScrollPane5.getViewport().setOpaque(false);
        jScrollPane5.setBorder(null);
        jScrollPane5.setViewportBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        jScrollPane10.setOpaque(false);
        jScrollPane10.getViewport().setOpaque(false);
        jScrollPane10.setBorder(null);
        jScrollPane10.setViewportBorder(null);
        jScrollPane8.setOpaque(false);
        jScrollPane8.getViewport().setOpaque(false);
        jScrollPane8.setBorder(null);
        jScrollPane8.setViewportBorder(null);
        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportBorder(null);
        jScrollPane9.setOpaque(false);
        jScrollPane9.getViewport().setOpaque(false);
        jScrollPane9.setBorder(null);
        jScrollPane9.setViewportBorder(null);
        jScrollPane6.setOpaque(false);
        jScrollPane6.getViewport().setOpaque(false);
        jScrollPane6.setBorder(null);
        jScrollPane6.setViewportBorder(null);
        jScrollPane7.setOpaque(false);
        jScrollPane7.getViewport().setOpaque(false);
        jScrollPane7.setBorder(null);
        jScrollPane7.setViewportBorder(null);
    }

    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    
    public final void showTableData(){  //function to display admin details in table

try{

con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","1234567890");
String sql = "SELECT * FROM admin";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}

catch(SQLException ex){
JOptionPane.showMessageDialog(null, ex);
}

}
 
    
    
    public final void showTableDataUser(){   //function to display user function in table

try{

con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","1234567890");
String sql = "SELECT * FROM user";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
jTable3.setModel(DbUtils.resultSetToTableModel(rs));
}

catch(SQLException ex){
JOptionPane.showMessageDialog(null, ex);
}

}
    
    
    
    
public final void showTableDataFarmer(){   //function to display farmer data in table

try{

con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","1234567890");
String sql = "SELECT * FROM farmer";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
jTable4.setModel(DbUtils.resultSetToTableModel(rs));
}

catch(SQLException ex){
JOptionPane.showMessageDialog(null, ex);
}

}    
    
    
public final void showTableDataProduct(){   //function to display product added by farmer and admin

try{

con = DriverManager.getConnection("jdbc:mysql://localhost/sell_pro","root","1234567890");
String sql = "SELECT * FROM product";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
jTable2.setModel(DbUtils.resultSetToTableModel(rs));
}

catch(SQLException ex){
JOptionPane.showMessageDialog(null, ex);
}

}    
    





public final void showTableDataGovernmentPolicy(){         //function to display government policy added

try{

con = DriverManager.getConnection("jdbc:mysql://localhost/articles","root","1234567890");
String sql = "SELECT * FROM gov_policies";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
jTable5.setModel(DbUtils.resultSetToTableModel(rs));
}

catch(SQLException ex){
JOptionPane.showMessageDialog(null, ex);
}

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        menui2 = new javax.swing.JLabel();
        dashboardbtn = new javax.swing.JLabel();
        recordsbtn = new javax.swing.JLabel();
        manageuserbtn = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        logoutbtn1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manageuserbtn1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutbtn2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboardTab = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane6 = new scrollbar.ScrollPaneWin11();
        jTable3 = new javax.swing.JTable();
        jScrollPane7 = new scrollbar.ScrollPaneWin11();
        jTable4 = new javax.swing.JTable();
        add_prod = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        policy_name = new javax.swing.JTextField();
        jScrollPane8 = new scrollbar.ScrollPaneWin11();
        policy_details = new javax.swing.JTextArea();
        jScrollPane10 = new scrollbar.ScrollPaneWin11();
        jTable5 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        policylink = new javax.swing.JTextField();
        update_info = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        manage_admin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new scrollbar.ScrollPaneWin11();
        jTable1 = new javax.swing.JTable();
        Add = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminpass = new javax.swing.JTextField();
        adminuser = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jScrollPane4 = new scrollbar.ScrollPaneWin11();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new scrollbar.ScrollPaneWin11();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price_per_unit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        por = new javax.swing.JLabel();
        jScrollPane2 = new scrollbar.ScrollPaneWin11();
        pro_description = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        price_unit = new javax.swing.JComboBox<>();
        unit = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        pro_name = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setAutoscrolls(true);
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Admin");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-customer-48.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 50, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 60));

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menui2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(menui2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 60, 40));

        dashboardbtn.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        dashboardbtn.setText("Dashboard");
        dashboardbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardbtnMouseClicked(evt);
            }
        });
        jPanel7.add(dashboardbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 160, 60));

        recordsbtn.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        recordsbtn.setText("add product");
        recordsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordsbtnMouseClicked(evt);
            }
        });
        jPanel7.add(recordsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, 60));

        manageuserbtn.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        manageuserbtn.setText("Product added");
        manageuserbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserbtnMouseClicked(evt);
            }
        });
        jPanel7.add(manageuserbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 170, 60));

        logoutbtn.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        jPanel7.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 160, 50));

        logoutbtn1.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        logoutbtn1.setText("article");
        logoutbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtn1MouseClicked(evt);
            }
        });
        jPanel7.add(logoutbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-laptop-metrics-50.png"))); // NOI18N
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-product-60.png"))); // NOI18N
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 70));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-article-48.png"))); // NOI18N
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 50));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-shutdown-50.png"))); // NOI18N
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-48.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        manageuserbtn1.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        manageuserbtn1.setText("Manage admin");
        manageuserbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserbtn1MouseClicked(evt);
            }
        });
        jPanel7.add(manageuserbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 170, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cart-40.png"))); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, 60));

        logoutbtn2.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        logoutbtn2.setText("add gov policies");
        logoutbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtn2MouseClicked(evt);
            }
        });
        jPanel7.add(logoutbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 170, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-policy-document-48.png"))); // NOI18N
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 50, 50));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 740));

        dashboardTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(942, 1211));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(942, 1211));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel23.setText("Farmers");
        kGradientPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 120, 40));

        jLabel24.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel24.setText("Users");
        kGradientPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, 40));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Username", "Email", "Mobile No", "Address", "City", "Password", "Repass"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        kGradientPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 670, -1));

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setBackground(new java.awt.Color(255, 255, 255));
        jTable4.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Username", "Email", "Mobile No", "Farmer Unique Id", "Address", "City", "Password", "Repassword"
            }
        ));
        jScrollPane7.setViewportView(jTable4);

        kGradientPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 660, 380));

        jScrollPane5.setViewportView(kGradientPanel2);

        dashboardTab.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 930, 750));

        jTabbedPane1.addTab("tab1", dashboardTab);

        add_prod.setPreferredSize(new java.awt.Dimension(1200, 1200));
        add_prod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setPreferredSize(new java.awt.Dimension(960, 750));

        kGradientPanel5.setkEndColor(new java.awt.Color(0, 0, 153));
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 255, 255));
        kGradientPanel5.setPreferredSize(new java.awt.Dimension(964, 1152));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel7.setText("add gov policies");
        kGradientPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel8.setText("policy description  :");
        kGradientPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 50));

        jLabel9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel9.setText("policy name :");
        kGradientPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, 50));

        policy_name.setBackground(new java.awt.Color(255, 255, 255));
        policy_name.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        policy_name.setBorder(null);
        kGradientPanel5.add(policy_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 230, 40));

        jScrollPane8.setBackground(null);

        policy_details.setBackground(new java.awt.Color(255, 255, 255));
        policy_details.setColumns(20);
        policy_details.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        policy_details.setLineWrap(true);
        policy_details.setRows(5);
        jScrollPane8.setViewportView(policy_details);

        kGradientPanel5.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 540, 270));

        jScrollPane10.setBackground(null);

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setBackground(new java.awt.Color(255, 255, 255));
        jTable5.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Policy Name", "Policy Description"
            }
        ));
        jScrollPane10.setViewportView(jTable5);

        kGradientPanel5.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 800, 740, 270));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton1.setText("add");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        kGradientPanel5.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 140, 60));

        jLabel13.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Policy Link :");
        kGradientPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        policylink.setBackground(new java.awt.Color(255, 255, 255));
        policylink.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        kGradientPanel5.add(policylink, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 410, 50));

        jScrollPane9.setViewportView(kGradientPanel5);

        add_prod.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 770));

        jTabbedPane1.addTab("tab2", add_prod);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout update_infoLayout = new javax.swing.GroupLayout(update_info);
        update_info.setLayout(update_infoLayout);
        update_infoLayout.setHorizontalGroup(
            update_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        update_infoLayout.setVerticalGroup(
            update_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", update_info);

        jPanel6.setBackground(new java.awt.Color(245, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel4.setkGradientFocus(700);
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 0, 204));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Manage Admin");
        kGradientPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 270, 80));

        jTable1.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 350, 150));

        Add.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 204, 255));
        Add.setText("add");
        Add.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        kGradientPanel4.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 160, 60));

        jToggleButton3.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton3.setText("delete");
        jToggleButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        kGradientPanel4.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 160, 60));

        jToggleButton4.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(0, 204, 255));
        jToggleButton4.setText("reset");
        jToggleButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        kGradientPanel4.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 160, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("The Bold Font", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("Password  :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 204, 255));
        jLabel6.setFont(new java.awt.Font("The Bold Font", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("  Username  :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        adminpass.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        adminpass.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        adminpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel3.add(adminpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, 40));

        adminuser.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        adminuser.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        adminuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel3.add(adminuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 190, 40));

        kGradientPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 380, 190));

        jPanel6.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 740));

        javax.swing.GroupLayout manage_adminLayout = new javax.swing.GroupLayout(manage_admin);
        manage_admin.setLayout(manage_adminLayout);
        manage_adminLayout.setHorizontalGroup(
            manage_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manage_adminLayout.setVerticalGroup(
            manage_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manage_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", manage_admin);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 0, 153));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 153, 255));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(960, 750));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Category", "Product Name ", "Quantity", "Unit", "Price Per Unit", "Description", "Price Unit", "Photo"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        kGradientPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 630, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel3.setText("Products added");
        kGradientPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 290, -1));

        jPanel4.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 750));

        jTabbedPane1.addTab("tab5", jPanel4);

        kGradientPanel1.setDoubleBuffered(false);
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(770, 1075));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(770, 1075));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("The Bold Font", 1, 36)); // NOI18N
        jLabel14.setText("Add Products");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, 60));

        jButton1.setFont(new java.awt.Font("Thunder", 0, 24)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 940, 100, 40));

        price_per_unit.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        price_per_unit.setToolTipText("Fertililzer Name");
        price_per_unit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(84, 132, 255)));
        kGradientPanel1.add(price_per_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 250, 40));

        jLabel10.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel10.setText("product image  :");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, -1, 30));

        por.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        por.setText("product name  :");
        kGradientPanel1.add(por, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 40));

        pro_description.setColumns(20);
        pro_description.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        pro_description.setLineWrap(true);
        pro_description.setRows(5);
        pro_description.setTabSize(5);
        pro_description.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(84, 132, 255)));
        jScrollPane2.setViewportView(pro_description);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 270, 160));

        jLabel12.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel12.setText("product descrption  :");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, 30));

        image.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 200, 200));

        jButton2.setFont(new java.awt.Font("Thunder", 0, 24)); // NOI18N
        jButton2.setText("Upload");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 870, 100, 40));

        address.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        kGradientPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 870, 230, 40));

        category.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select category--", "fertilizer", "pesticide" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        kGradientPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 240, 40));

        jLabel11.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel11.setText("  category  :");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 120, 40));

        jLabel18.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel18.setText("price per unit:");
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 140, 40));

        price_unit.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        price_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select unit--", "kg", "gm", "ton", " " }));
        kGradientPanel1.add(price_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 120, 30));

        unit.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select unit--", "kg", "gm", "ton", " " }));
        kGradientPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, 30));

        jLabel19.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel19.setText("quantity  :");
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 100, 40));

        pro_name.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        pro_name.setToolTipText("Fertililzer Name");
        pro_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(84, 132, 255)));
        kGradientPanel1.add(pro_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 250, 40));

        quantity.setFont(new java.awt.Font("Thunder", 0, 18)); // NOI18N
        quantity.setToolTipText("Fertililzer Name");
        quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(84, 132, 255)));
        kGradientPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 250, 40));

        jScrollPane3.setViewportView(kGradientPanel1);

        jTabbedPane1.addTab("tab6", jScrollPane3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 960, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardbtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_dashboardbtnMouseClicked

    private void recordsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsbtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_recordsbtnMouseClicked

    private void manageuserbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserbtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_manageuserbtnMouseClicked
    
     File f = null;
    String path = null;
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();                   //to add a file chooser in the button 
        FileNameExtensionFilter fnf = new FileNameExtensionFilter("PNG JPG AND JPEG","jpg","png","jpeg");  // to apply filter in filechooser
        chooser.addChoosableFileFilter(fnf); 
        int load;                                  //showOpenDialog() is used to open a dialog box.
        load = chooser.showOpenDialog(null);
        
        if(load == chooser.APPROVE_OPTION){
            f = chooser.getSelectedFile();
            path = f.getAbsolutePath();   //to get the path of the file uploaded
            address.setText(path);        // display the path of file in textfield
            ImageIcon i1 = new ImageIcon(path);
            Image img = i1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            image.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Category,Product_name,Quantity,Unit,Price_per_unit,Price_unit,Product_description;
        String SUrl,SUser,SPass;
        SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
        SUser = "root";
        SPass = "1234567890";
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            PreparedStatement pst = con.prepareStatement("INSERT INTO product(category,pro_name,quatity,unit,price_per_unit,price_unit,pro_descrip,photo)VALUES(?,?,?,?,?,?,?,?)");
           if("--select category--".equals(category.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "Category is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
               
           }else if("".equals(pro_name.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Product Name is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(quantity.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Quantity is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("--select unit--".equals(unit.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "Unit is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(price_per_unit.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Price Per Unit is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("--select unit--".equals(price_unit.getSelectedItem().toString())){
               JOptionPane.showMessageDialog(new JFrame(), "Price Unit is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else if("".equals(pro_description.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Product Description is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
           }else{
               Category = category.getSelectedItem().toString();
               Product_name = pro_name.getText();
               Quantity = quantity.getText();
               Unit = unit.getSelectedItem().toString();
               Price_per_unit = price_per_unit.getText();
               Price_unit = price_unit.getSelectedItem().toString();
               Product_description = pro_description.getText();
               InputStream is = new FileInputStream(f);      //converting image from jpg,png,jpeg to blob format to upload in database
               pst.setString(1, Category);
               pst.setString(2, Product_name);
               pst.setString(3, Quantity);
               pst.setString(4, Unit);
               pst.setString(5, Price_per_unit);
               pst.setString(6, Price_unit);
               pst.setString(7,  Product_description);
               pst.setBlob(8, is);
               
               category.setSelectedItem("--select category--");
               pro_name.setText("");
               quantity.setText("");
               unit.setSelectedItem("--select unit--");
               price_per_unit.setText("");
               price_unit.setSelectedItem("--select unit--");
               pro_description.setText("");
               image.setIcon(new ImageIcon());
               address.setText("");
               int inserted = pst.executeUpdate();
               if(inserted > 0){
                   JOptionPane.showMessageDialog(null, "Product Added Successfully!");
               }
           }
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void manageuserbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserbtn1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_manageuserbtn1MouseClicked

    private void logoutbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtn1MouseClicked
        // TODO add your handling code here:
        Admin_blog ab = new Admin_blog();
        ab.show();
        dispose();
    }//GEN-LAST:event_logoutbtn1MouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        // TODO add your handling code here:
        home_page1 hp = new home_page1();
        hp.show();
        dispose();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        try{

String sql = "INSERT INTO admin (username,pass)VALUES (?,?)";

con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","1234567890");

pst = con.prepareStatement(sql);

        
 if("".equals(adminuser.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
}else if("".equals(adminpass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
}else{
pst.setString(1,adminuser.getText());

pst.setString(2,adminpass.getText());


pst.executeUpdate();

JOptionPane.showMessageDialog(null, "Admin Added Successfully!");

}

}

catch(SQLException | HeadlessException ex){

JOptionPane.showMessageDialog(null, ex);

}
//AutoIncrement();
showTableData();
       
     
    }//GEN-LAST:event_AddActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        adminuser.setText(" ");
        adminpass.setText(" ");
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        try{

String sql = "DELETE FROM admin WHERE username =?";

con = DriverManager.getConnection("jdbc:mysql://localhost/info","root","1234567890");

pst = con.prepareStatement(sql);

pst.setString(1,adminuser.getText());

pst.executeUpdate();

JOptionPane.showMessageDialog(null, "Deleted Admin Successfully");

 

}

catch(SQLException | HeadlessException ex){

JOptionPane.showMessageDialog(null, ex);

}
//AutoIncrement();
showTableData();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void logoutbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtn2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_logoutbtn2MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        try{

String sql = "INSERT INTO gov_policies (policy_name,policy_details,policylink)VALUES (?,?,?)";//sql

con = DriverManager.getConnection("jdbc:mysql://localhost/articles","root","1234567890");

pst = con.prepareStatement(sql);

        

pst.setString(1,policy_name.getText());

pst.setString(2,policy_details.getText());
pst.setString(3,policylink.getText());



pst.executeUpdate();

JOptionPane.showMessageDialog(null, "Policy Added Successfully!");
policy_name.setText("");
policy_details.setText("");
 

}

catch(SQLException | HeadlessException ex){

JOptionPane.showMessageDialog(null, ex);

}
//AutoIncrement();
showTableDataGovernmentPolicy();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Add;
    private javax.swing.JPanel add_prod;
    private javax.swing.JTextField address;
    private javax.swing.JTextField adminpass;
    private javax.swing.JTextField adminuser;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JPanel dashboardTab;
    private javax.swing.JLabel dashboardbtn;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel logoutbtn1;
    private javax.swing.JLabel logoutbtn2;
    private javax.swing.JPanel manage_admin;
    private javax.swing.JLabel manageuserbtn;
    private javax.swing.JLabel manageuserbtn1;
    private javax.swing.JLabel menui2;
    private javax.swing.JTextArea policy_details;
    private javax.swing.JTextField policy_name;
    private javax.swing.JTextField policylink;
    private javax.swing.JLabel por;
    private javax.swing.JTextField price_per_unit;
    private javax.swing.JComboBox<String> price_unit;
    private javax.swing.JTextArea pro_description;
    private javax.swing.JTextField pro_name;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel recordsbtn;
    private javax.swing.JComboBox<String> unit;
    private javax.swing.JPanel update_info;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.ui.RefineryUtilities;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class MainPageadmin extends javax.swing.JFrame {

    /**
     * Creates new form MainPageadmin
     */
    Integer imgIndex = 0;
    public MainPageadmin() {
        initComponents();
        groupRadio();
        groupRadio1();
        groupRadio2();
        groupRadio3();
        groupRadio4();
    }
     String Howwastheevent,Ans3r,Ans4r,Ans5r;
String Timeworth;
String Q2;
 Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void datafetch(){
        try {
            String Username,query, SUrl, SUser, SPass,sql;
            SUrl = "jdbc:MySQL://localhost:3306/database_login_admin"; // Database URL
            SUser = "root"; // Database username
            SPass = "Parthavi@1204"; // Database password
            // Load the MySQL database driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            query = "SELECT username FROM datbasetable ORDER BY id DESC";
            pst = con.prepareStatement(query);
            // Execute the query and obtain the result set
            rs = pst.executeQuery();
            rs.next();
            Username =rs.getString("username");
            username1.setText(Username);
            
            sql= "SELECT * FROM databasetable_loginad WHERE username = '" +Username+"'";
                  pst = con.prepareStatement(sql);
            // Execute the query and obtain the result set
            rs = pst.executeQuery();
            rs.next();
            password1.setText(rs.getString("password"));
            fullname1.setText(rs.getString("full_name"));
            
            
            
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void groupRadio(){
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(excellentradio);
        buttonGroup1.add(goodradio);
        buttonGroup1.add(fairradio);
        buttonGroup1.add(badradio);
       
    }
    public void groupRadio1(){
        buttonGroup2.add(excellentt);
        buttonGroup2.add(verygoodd);
         buttonGroup2.add(goodd);
          buttonGroup2.add(fairr);
            buttonGroup2.add(badd);
        
    }
    public void groupRadio2(){
        buttonGroup3.add(e1);
        buttonGroup3.add(vg1);
        buttonGroup3.add(g1);
        buttonGroup3.add(f1);
        buttonGroup3.add(b1);
    }
    public void groupRadio3(){
        buttonGroup4.add(e2);
        buttonGroup4.add(vg2);
        buttonGroup4.add(g2);
        buttonGroup4.add(f2);
        buttonGroup4.add(b2);
    }
    public void groupRadio4(){
        buttonGroup5.add(e3);
        buttonGroup5.add(vg3);
        buttonGroup5.add(g3);
        buttonGroup5.add(f3);
        buttonGroup5.add(b3);
    }
    
    Displayevent de =new Displayevent();

    
 public Connection createConnection(){
        
          try {
              Connection myConnection = null;
              
              MysqlDataSource datasource = new MysqlDataSource();
              
              datasource.setServerName("localhost");
              datasource.setPortNumber(3306);
              datasource.setUser("root");
              datasource.setPassword("Parthavi@1204");
              datasource.setDatabaseName("databaseforimageslider");
              
              
              myConnection = datasource.getConnection();
              
              
              return myConnection;
          } catch (SQLException ex) {
              Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
   
    }

 public ArrayList<byte[]> getImagesList() {
    // Create an ArrayList to store image data
    ArrayList<byte[]> imgList = new ArrayList<>();
    
    // Establish a database connection
    Connection con = createConnection();
    
    Statement st;
    ResultSet rs;
    
    try {
        // Create a statement for executing SQL queries
        st = con.createStatement();
        
        // Execute a query to select image data from the "tableforimageslider" table
        rs = st.executeQuery("SELECT Images FROM tableforimageslider");
        
        while (rs.next()) {
            // Retrieve and add image data (as bytes) to the ArrayList
            imgList.add(rs.getBytes("Images"));
        }
        
    } catch (SQLException ex) {
        // Handle any exceptions that may occur during database access
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    // Return the ArrayList containing image data
    return imgList;
}

      public void showImage(Integer index){
        
        Image img = new ImageIcon(getImagesList().get(index)).getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(img));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        prev1 = new javax.swing.JLabel();
        next1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        searchdata = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        committeeshow = new keeptoo.KGradientPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        pimg = new javax.swing.JLabel();
        vpimg1 = new javax.swing.JLabel();
        vpimg2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        simg2 = new javax.swing.JLabel();
        simg1 = new javax.swing.JLabel();
        plabel = new javax.swing.JLabel();
        vp1label = new javax.swing.JLabel();
        vp2label = new javax.swing.JLabel();
        s1label = new javax.swing.JLabel();
        s2label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        Committeupdate = new keeptoo.KGradientPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        vp1 = new javax.swing.JLabel();
        vp2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        vpname1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        sname1 = new javax.swing.JTextField();
        sname2 = new javax.swing.JTextField();
        vpname2 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        Commitee = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLabel31 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        event = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cb = new javax.swing.JTextField();
        excellentradio = new javax.swing.JRadioButton();
        goodradio = new javax.swing.JRadioButton();
        fairradio = new javax.swing.JRadioButton();
        badradio = new javax.swing.JRadioButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        excellentt = new javax.swing.JRadioButton();
        verygoodd = new javax.swing.JRadioButton();
        goodd = new javax.swing.JRadioButton();
        fairr = new javax.swing.JRadioButton();
        badd = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        q3 = new javax.swing.JTextField();
        e1 = new javax.swing.JRadioButton();
        vg1 = new javax.swing.JRadioButton();
        g1 = new javax.swing.JRadioButton();
        f1 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        q4 = new javax.swing.JTextField();
        e2 = new javax.swing.JRadioButton();
        vg2 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        q5 = new javax.swing.JTextField();
        e3 = new javax.swing.JRadioButton();
        vg3 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        linkff = new javax.swing.JLabel();
        linkfa = new javax.swing.JLabel();
        jTextField12a = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel3.setkGradientFocus(1000);
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp_Image_2023-08-26_at_23.10.39-removebg-preview.png"))); // NOI18N
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 130));

        jLabel6.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-people-50new.png"))); // NOI18N
        jLabel6.setText("COMMITTEE");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 40));

        jLabel7.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-48new.png"))); // NOI18N
        jLabel7.setText("HOME");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 150, 40));

        jLabel2.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-feedback-50new.png"))); // NOI18N
        jLabel2.setText("FEEDBACK");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 200, 50));

        jLabel10.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\dsa\\icons8-male-user-50.png")); // NOI18N
        jLabel10.setText("MY PROFILE");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 60));

        jLabel4.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-event-60new.png"))); // NOI18N
        jLabel4.setText("EVENTS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 160, 60));

        jLabel35.setFont(new java.awt.Font("Prompt Black", 1, 24)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-log-out-50new.png"))); // NOI18N
        jLabel35.setText("LOGOUT");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 170, 40));

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 710));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 640, 90));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(186, 186, 186));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("NEWS");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(427, 497, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 550, -1));

        prev1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-45.png"))); // NOI18N
        prev1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prev1MouseClicked(evt);
            }
        });
        kGradientPanel2.add(prev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 43));

        next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-45 (1).png"))); // NOI18N
        next1.setText("jLabel4");
        next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next1MouseClicked(evt);
            }
        });
        kGradientPanel2.add(next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 50, 43));

        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 470, 130));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButton3.setText("Edit Images");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Add News");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(418, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        kGradientPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        jTabbedPane1.addTab("tab2", kGradientPanel2);

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel5.setkGradientFocus(1000);
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setForeground(new java.awt.Color(255, 153, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title For Event", "Summary", "Details"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        kGradientPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 558, 374));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Showdata");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-35.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Create");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(searchdata, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchdata, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jTabbedPane1.addTab("tab4", kGradientPanel5);

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bar-chart-100.png"))); // NOI18N
        jLabel26.setText("Feedback Analysis");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
        });
        kGradientPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 250, 100));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-form-100.png"))); // NOI18N
        jLabel30.setText("FeedbackForm");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        kGradientPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 240, 100));

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\dsa\\icons8-google-docs-100.png")); // NOI18N
        jLabel42.setText("Feedbackform By Link");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        kGradientPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 240, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\dsa\\icons8-analysis-100.png")); // NOI18N
        jLabel43.setText("Feedback Form Creation");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        kGradientPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 250, 100));

        jTabbedPane1.addTab("tab3", kGradientPanel4);

        kGradientPanel6.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel6.setkGradientFocus(1000);
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setText("Username :");
        kGradientPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel47.setText("Password :");
        kGradientPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel48.setText("Fullname :");
        kGradientPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 176, -1, 10));
        kGradientPanel6.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 370, 20));
        kGradientPanel6.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 350, 20));
        kGradientPanel6.add(fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 380, 20));

        jLabel27.setText("To change the password");
        kGradientPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jButton16.setText("Change Password");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        kGradientPanel6.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jTabbedPane1.addTab("tab5", kGradientPanel6);

        committeeshow.setkEndColor(new java.awt.Color(255, 0, 0));
        committeeshow.setkStartColor(new java.awt.Color(255, 255, 0));

        kGradientPanel7.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel7.setkGradientFocus(1000);
        kGradientPanel7.setkStartColor(new java.awt.Color(255, 255, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Data Science Student Association");

        pimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vpimg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vpimg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("President");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Vice-President");

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("Vice-President");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("Secretary");

        simg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        simg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        plabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vp1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vp2label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s2label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setText("Secretary");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Members And Ambassador");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(vpimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(pimg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(216, 216, 216))))
            .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jLabel13))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(plabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(jLabel15)
                            .addGap(115, 115, 115)
                            .addComponent(vpimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(vp1label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(250, 250, 250)
                            .addComponent(vp2label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel17)
                            .addGap(308, 308, 308)
                            .addComponent(jLabel18))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel7Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(simg1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(s1label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(263, 263, 263)
                            .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel7Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(simg2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(s2label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel14)
                            .addGap(360, 360, 360)
                            .addComponent(jLabel16))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pimg, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vpimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(231, 231, 231))
            .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel7Layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(118, 118, 118)
                    .addComponent(plabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(vpimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vp1label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vp2label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel18))
                    .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(simg1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(s1label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addComponent(simg2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(s2label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(2, 2, 2)
                    .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel14))
                        .addComponent(jLabel16))
                    .addGap(29, 29, 29)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        jScrollPane4.setViewportView(kGradientPanel7);

        javax.swing.GroupLayout committeeshowLayout = new javax.swing.GroupLayout(committeeshow);
        committeeshow.setLayout(committeeshowLayout);
        committeeshowLayout.setHorizontalGroup(
            committeeshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        committeeshowLayout.setVerticalGroup(
            committeeshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", committeeshow);

        Committeupdate.setkEndColor(new java.awt.Color(255, 0, 0));
        Committeupdate.setkGradientFocus(1000);
        Committeupdate.setkStartColor(new java.awt.Color(255, 255, 0));

        kGradientPanel8.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel8.setkGradientFocus(1000);
        kGradientPanel8.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Data Science Student Association");
        kGradientPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel8.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 85, 94));

        vp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel8.add(vp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 78, 94));

        vp2.setBorder(new javax.swing.border.MatteBorder(null));
        kGradientPanel8.add(vp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 85, 94));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setText("President");
        kGradientPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        kGradientPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 122, 62));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setText("Vice-President");
        kGradientPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setText("Vice-President");
        kGradientPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setText("Secretary");
        kGradientPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel8.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 76, 88));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setText("Secretary");
        kGradientPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 90, -1));

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        kGradientPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 39, 33));

        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel8.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 82, 96));

        jButton4.setText("Choose Image");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));
        kGradientPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 148, -1));
        kGradientPanel8.add(vpname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 148, -1));

        jButton8.setText("Choose Image");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        kGradientPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jButton9.setText("Choose Image");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        kGradientPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jButton10.setText("Choose Image");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        kGradientPanel8.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jButton11.setText("Choose Image");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        kGradientPanel8.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));
        kGradientPanel8.add(sname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 140, -1));
        kGradientPanel8.add(sname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 140, -1));
        kGradientPanel8.add(vpname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 368, 150, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        kGradientPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 560, 217));

        jLabel1.setText("Members And Ambassadors");
        kGradientPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 556, 20));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton7)
                    .addComponent(jButton12))
                .addContainerGap())
        );

        kGradientPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        jScrollPane5.setViewportView(kGradientPanel8);

        javax.swing.GroupLayout CommitteupdateLayout = new javax.swing.GroupLayout(Committeupdate);
        Committeupdate.setLayout(CommitteupdateLayout);
        CommitteupdateLayout.setHorizontalGroup(
            CommitteupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        CommitteupdateLayout.setVerticalGroup(
            CommitteupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", Committeupdate);

        Commitee.setkEndColor(new java.awt.Color(255, 0, 0));
        Commitee.setkGradientFocus(1000);
        Commitee.setkStartColor(new java.awt.Color(255, 255, 0));
        Commitee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-registration-100.png"))); // NOI18N
        jLabel11.setLabelFor(Committeupdate);
        jLabel11.setText("Edit Committee");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        Commitee.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-groups-100.png"))); // NOI18N
        jLabel12.setLabelFor(committeeshow);
        jLabel12.setText("Committee");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        Commitee.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 180, 100));

        jTabbedPane1.addTab("tab1", Commitee);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 0));

        kGradientPanel9.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel9.setkGradientFocus(1000);
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Full Name ");
        kGradientPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        kGradientPanel9.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 350, -1));

        jLabel32.setText("Event");
        kGradientPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 225, -1));
        kGradientPanel9.add(event, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 350, -1));

        jLabel33.setText("Class/Branch");
        kGradientPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 92, -1));
        kGradientPanel9.add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 186, -1));

        excellentradio.setText("4");
        excellentradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excellentradioActionPerformed(evt);
            }
        });
        kGradientPanel9.add(excellentradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 98, -1));

        goodradio.setText("3");
        goodradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodradioActionPerformed(evt);
            }
        });
        kGradientPanel9.add(goodradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 98, -1));

        fairradio.setText("2");
        fairradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fairradioActionPerformed(evt);
            }
        });
        kGradientPanel9.add(fairradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 98, -1));

        badradio.setText("1");
        badradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badradioActionPerformed(evt);
            }
        });
        kGradientPanel9.add(badradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 98, -1));

        jButton17.setText("Save");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jButton18.setText("Back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        q1.setEditable(false);
        q1.setBackground(new java.awt.Color(255, 255, 255));
        q1.setText("How was the event? *");
        kGradientPanel9.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 203, -1));

        q2.setText("How would you rate the quality of the speakers and presenters at the event?*");
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 436, -1));

        excellentt.setText("5");
        excellentt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excellenttActionPerformed(evt);
            }
        });
        kGradientPanel9.add(excellentt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        verygoodd.setText("4");
        verygoodd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verygooddActionPerformed(evt);
            }
        });
        kGradientPanel9.add(verygoodd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        goodd.setText("3");
        goodd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gooddActionPerformed(evt);
            }
        });
        kGradientPanel9.add(goodd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        fairr.setText("2");
        fairr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fairrActionPerformed(evt);
            }
        });
        kGradientPanel9.add(fairr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        badd.setText("1");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        kGradientPanel9.add(badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jRadioButton1.setText("5");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        q3.setText("How would you rate the event's organization and logistics (1 being poor, 5 being excellent)?*");
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 510, -1));

        e1.setText("5");
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        vg1.setText("4");
        vg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vg1ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(vg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        g1.setText("3");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        f1.setText("2");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        q4.setText("How likely are you to recommend this event to others?*");
        q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 520, -1));

        e2.setText("5");
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, -1, -1));

        vg2.setText("4");
        vg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vg2ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(vg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        g2.setText("3");
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, -1, -1));

        f2.setText("2");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, -1, -1));

        b2.setText("1");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 740, -1, -1));

        q5.setText("How would you rate the relevance of the topics covered?");
        kGradientPanel9.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 770, 520, -1));

        e3.setText("5");
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 790, -1, -1));

        vg3.setText("4");
        vg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vg3ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(vg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, -1, -1));

        g3.setText("3");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 830, -1, -1));

        f3.setText("2");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 850, -1, -1));

        b3.setText("1");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 870, -1, -1));

        jButton15.setText("update");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        kGradientPanel9.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 30));

        jScrollPane7.setViewportView(kGradientPanel9);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab8", kGradientPanel1);

        kGradientPanel10.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel10.setkGradientFocus(1000);
        kGradientPanel10.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel10.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 280, -1));

        jLabel36.setText("Enter  link for feedback form");
        kGradientPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 70, -1, -1));

        jButton19.setText("Save");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        kGradientPanel10.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        kGradientPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 499, 193, 33));
        kGradientPanel10.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 280, -1));
        kGradientPanel10.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 300, -1));

        jLabel38.setText("Enter link for feedback analyasis");
        kGradientPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, -1));

        jLabel39.setText("Enter the Title of the event");
        kGradientPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTabbedPane1.addTab("tab9", kGradientPanel10);

        kGradientPanel11.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel11.setkGradientFocus(1000);
        kGradientPanel11.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setText("Link For Feedback Form");
        kGradientPanel11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 134, -1, -1));

        jLabel41.setText("Link For Feedback Analysis");
        kGradientPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 177, -1, -1));

        linkff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        linkff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkffMouseClicked(evt);
            }
        });
        kGradientPanel11.add(linkff, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 134, 399, 16));

        linkfa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        linkfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkfaMouseClicked(evt);
            }
        });
        kGradientPanel11.add(linkfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 177, 396, 16));
        kGradientPanel11.add(jTextField12a, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 6, 177, -1));

        jLabel44.setText("Enter the title ");
        kGradientPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 9, 120, -1));

        jLabel45.setText("Search");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        kGradientPanel11.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jTabbedPane1.addTab("tab10", kGradientPanel11);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 640, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
      
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        datafetch();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void prev1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev1MouseClicked
        // TODO add your handling code here:
       imgIndex--; // Decrement the image index variable

if (imgIndex < 0) {
    imgIndex = 0; // Ensure the image index does not go below 0
}

showImage(imgIndex); // Call a function to display the image based on the current index

    }//GEN-LAST:event_prev1MouseClicked

    private void next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseClicked
        // TODO add your handling code here:
        imgIndex++; // Increment the image index variable

if (imgIndex >= getImagesList().size()) {
    imgIndex = getImagesList().size() - 1; // Ensure the image index doesn't exceed the maximum available images
}

showImage(imgIndex); // Call a function to display the image based on the current index

    }//GEN-LAST:event_next1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Imagesliderinput isi = new Imagesliderinput();
        isi.setVisible(true);
        isi.pack();
        isi.setLocationRelativeTo(null);
        isi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          try {
    // Attempt to establish a database connection and retrieve data
    // TODO add your handling code here:
    
    // Define database connection parameters
    String SUrl, SUser, SPass;
    SUrl = "jdbc:MySQL://localhost:3306/connector"; // Database URL
    SUser = "root"; // Database username
    SPass = "Parthavi@1204"; // Database password

    // Load the MySQL database driver class
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    // Establish a connection to the database
    con = DriverManager.getConnection(SUrl, SUser, SPass);

    // Define an SQL query to select all records from the "connector" table
    String sql = "SELECT * FROM connector";

    // Prepare a statement to execute the SQL query
    pst = con.prepareStatement(sql);

    // Execute the query and obtain the result set
    rs = pst.executeQuery();

    // Start processing the result set
    try {
        while (rs.next()) {
            // Retrieve values from the result set for specific columns
            
            // Retrieve the "Title" column value
            String Title = rs.getString("Title");
            
            // Retrieve the "Summary" column value
            String Summary = rs.getString("Summary");
            
            // Retrieve the "Details" column value
            String Details = rs.getString("Details");
            
            // Create an array with the retrieved data
            String tbData[] = {Title, Summary, Details};
            
            // Get the model of the 'jTable1' component and add a new row with the data
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(tbData);
        }
    } catch (SQLException ex) {
        // Handle any exceptions that may occur during result set processing
        Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
    }
    
} catch (SQLException | ClassNotFoundException ex) {
    // Handle any exceptions that may occur during database access or class loading
    Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
          try {                                         
                      // TODO add your handling code here:
                      String SUrl,SUser,SPass;
                      SUrl = "jdbc:MySQL://localhost:3306/connector";
                      SUser = "root";
                      SPass = "Parthavi@1204";
            try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                      con = DriverManager.getConnection(SUrl,SUser,SPass);
                      
                      String sql = "SELECT * FROM connector where Title=?";
                       pst = con.prepareStatement(sql);
                       pst.setString(1, searchdata.getText());
                       rs = pst.executeQuery();
                       if(rs.next()){
                            de.setVisible(true);
       de.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
                           String Title1 = rs.getString("Title");
                           de.jTitle1.setText(Title1);
                           String Summary1 = rs.getString("Summary");
                           de.jTextArea1.setText(Summary1);
                           String date1 = rs.getString("date");
                           de.jdate1.setText(date1);
                           String Status1 = rs.getString("Details");
                           de.jStatus1.setText(Status1);
                            byte[] img = rs.getBytes("Image");
                            ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(de.jimg1.getWidth(), de.jimg1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                de.jimg1.setIcon(newImage);
              
              
                       } 
          } catch (ClassNotFoundException ex) {
                              Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
                          }
                  } catch (SQLException ex) {
                      Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
                 
                  }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         Creationanevent creationanevent = new Creationanevent();
        creationanevent.setVisible(true);
        creationanevent.pack();
        creationanevent.setLocationRelativeTo(null);
        creationanevent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       News n = new News();
        n.setVisible(true);
        n.pack();
        n.setLocationRelativeTo(null);
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
          jTabbedPane1.setSelectedIndex(4);
          try {                                         
                      // TODO add your handling code here:
                      String SUrl,SUser,SPass;
                      SUrl = "jdbc:MySQL://localhost:3306/connector";
                      SUser = "root";
                      SPass = "Parthavi@1204";
            try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                      con = DriverManager.getConnection(SUrl,SUser,SPass);
                      
                      String sql = "SELECT * FROM committee ";
                       pst = con.prepareStatement(sql);
                       
                       rs = pst.executeQuery();
                       if(rs.next()){
                           
                           String Name1 = rs.getString("Name");
                          plabel.setText(Name1);
                           String Name2 = rs.getString("Vpname1");
                          vp1label.setText(Name2);
                           String Name3 = rs.getString("Vpname2");
                         vp2label.setText(Name3);
                           String Name4 = rs.getString("Sname1");
                          s1label.setText(Name4);
                           String Name5 = rs.getString("Sname2");
                          s2label.setText(Name5);
                          String Others1 = rs.getString("Others");
                          jTextArea1.setText(Others1);
                                            byte[] img0 = rs.getBytes("Image");
                            ImageIcon image0 = new ImageIcon(img0);
                Image im0 = image0.getImage();
                Image myimg0 = im0.getScaledInstance(pimg.getWidth(), pimg.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImag0e = new ImageIcon(myimg0);
                pimg.setIcon(newImag0e);
              byte[] img1 = rs.getBytes("VpImage1");
                            ImageIcon image1 = new ImageIcon(img1);
                Image im1 = image1.getImage();
                Image myimg1 = im1.getScaledInstance(vpimg1.getWidth(), vpimg1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImag1e = new ImageIcon(myimg1);
                vpimg1.setIcon(newImag1e);
                  byte[] img2 = rs.getBytes("VpImage2");
                            ImageIcon image2 = new ImageIcon(img2);
                Image im2 = image2.getImage();
                Image myimg2 = im2.getScaledInstance(vpimg2.getWidth(), vpimg2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage2 = new ImageIcon(myimg2);
                vpimg2.setIcon(newImage2);
                 byte[] img3 = rs.getBytes("SImage1");
                            ImageIcon image3 = new ImageIcon(img3);
                Image im3 = image3.getImage();
                Image myimg3 = im3.getScaledInstance(simg1.getWidth(), simg1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage3 = new ImageIcon(myimg3);
                simg1.setIcon(newImage3);
                 byte[] img4 = rs.getBytes("SImage2");
                            ImageIcon image4 = new ImageIcon(img4);
                Image im4 = image4.getImage();
                Image myimg4 = im4.getScaledInstance(simg2.getWidth(), simg2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage4 = new ImageIcon(myimg4);
                simg2.setIcon(newImage4);
                       } 
          } catch (ClassNotFoundException ex) {
                              Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
                          }
                  } catch (SQLException ex) {
                      Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
                 
                  }

    }//GEN-LAST:event_jLabel12MouseClicked
String e;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = filechooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            img.setIcon(ResizeImage(path));
            e= path;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Name = jTextField1.getText();
        String name2 =vpname1.getText();
        String name3 = vpname2.getText();
        String name4 = sname1.getText();
        String name5 = sname2.getText();
        String others = jTextArea1.getText();
        int id = Integer.parseInt(jTextField2.getText());

        try {
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/connector";
            SUser = "root";
            SPass = "Parthavi@1204";

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("INSERT INTO committee(id,Name,Image,Vpname1,Vpname2,Sname1,Sname2,VpImage1,VpImage2,SImage1,SImage2,Others)values(?,?,?,?,?,?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(e));
            InputStream is1 = new FileInputStream(new File(a));
            InputStream is2 = new FileInputStream(new File(b));
            InputStream is3 = new FileInputStream(new File(c));
            InputStream is4 = new FileInputStream(new File(d));
            pst.setInt(1, id);

            pst.setString(2, Name);
            pst.setBlob(3, is);
            pst.setString(4, name2);
            pst.setString(5, name3);
            pst.setString(6, name4);
            pst.setString(7, name5);
            pst.setBlob(8, is1);
            pst.setBlob(9, is2);
            pst.setBlob(10, is3);
            pst.setBlob(11, is4);
            pst.setString(12, others);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        }

        public ImageIcon ResizeImage(String imgpath){
            ImageIcon MyImage = new ImageIcon(imgpath);
            Image imge = MyImage.getImage();
            Image newImage = imge.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image =new ImageIcon(newImage);
            return image;
        
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/connector";
            SUser = "root";
            SPass = "Parthavi@1204";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
            if(p==0){

                try{
                    int value0 =Integer.parseInt(jTextField2.getText());
                    String value1 = jTextField1.getText();
                    String value2 = vpname1.getText();
                    String value3 = vpname2.getText();
                    String value4 = sname1.getText();
                    String value5 = sname2.getText();
                    String value6 = jTextArea1.getText();
                    InputStream is = new FileInputStream(new File(e));
                    InputStream is1 = new FileInputStream(new File(a));
                    InputStream is2 = new FileInputStream(new File(b));
                    InputStream is3 = new FileInputStream(new File(c));
                    InputStream is4 = new FileInputStream(new File(d));

                    String sql = "UPDATE committee SET id=?,Name=?, Image=?, Vpname1=? ,Vpname2=?,Sname1=?,Sname2=?,VpImage1=?,VpImage2=?,SImage1=?,SImage2=?,Others=? ";
                    pst = con.prepareStatement(sql);
                    pst.setInt(1, value0);
                    pst.setString(2, value1);
                    pst.setBlob(3, is); // Use a byte array for image data
                    pst.setString(4, value2);
                    pst.setString(5, value3);
                    pst.setString(6, value4);
                    pst.setString(7, value5);

                    pst.setBlob(8, is1);
                    pst.setBlob(9, is2);
                    pst.setBlob(10, is3);
                    pst.setBlob(11, is4);
                    pst.setString(12, value6);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Record Updated");

                }catch(HeadlessException | FileNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                }

                finally {

                    try{
                        rs.close();
                        pst.close();

                    }
                    catch(SQLException e){

                    }
                }
            }} catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton7ActionPerformed
String a;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = filechooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            vp1.setIcon(ResizeImage(path));
            a = path;
        }
    }//GEN-LAST:event_jButton8ActionPerformed
String b;
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = filechooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            vp2.setIcon(ResizeImage(path));
            b = path;
        }
    }//GEN-LAST:event_jButton9ActionPerformed
String c;
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = filechooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            s2.setIcon(ResizeImage(path));
            c = path;
        }
    }//GEN-LAST:event_jButton10ActionPerformed
String d;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = filechooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            s1.setIcon(ResizeImage(path));
            d = path;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
      try {
    // Establish a database connection
    String SUrl, SUser, SPass;
    SUrl = "jdbc:MySQL://localhost:3306/connector"; // Database URL
    SUser = "root"; // Database username
    SPass = "Parthavi@1204"; // Database password

    // Load the MySQL database driver class
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(SUrl, SUser, SPass);

    try {
        // Prepare an SQL query to retrieve data from the "committee" table based on the ID
        String sql = "select * from committee where id=? ";
        pst = con.prepareStatement(sql);

        // Set the parameter for the prepared statement based on the value in jTextField2
        pst.setString(1, jTextField2.getText());

        // Execute the SQL query
        rs = pst.executeQuery();

        if (rs.next()) {
            // Retrieve data from the result set and populate UI components
            String add1 = rs.getString("id");
            jTextField2.setText(add1);

            String add2 = rs.getString("Name");
            jTextField1.setText(add2);

            String add3 = rs.getString("Vpname1");
            vpname1.setText(add3);

            String add4 = rs.getString("Vpname2");
            vpname2.setText(add4);

            String add5 = rs.getString("Sname1");
            sname1.setText(add5);

            String add6 = rs.getString("Sname2");
            sname2.setText(add6);

            String add7 = rs.getString("Others");
            jTextArea3.setText(add7);

            // Retrieve and display images in JLabels
            byte[] img1 = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img1).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
            img.setIcon(imageIcon);

            byte[] img2 = rs.getBytes("VpImage1");
            ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(img2).getImage().getScaledInstance(vp1.getWidth(), vp1.getHeight(), Image.SCALE_SMOOTH));
            vp1.setIcon(imageIcon1);

            byte[] img3 = rs.getBytes("VpImage2");
            ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(img3).getImage().getScaledInstance(vp2.getWidth(), vp2.getHeight(), Image.SCALE_SMOOTH));
            vp2.setIcon(imageIcon2);

            byte[] img4 = rs.getBytes("SImage1");
            ImageIcon imageIcon3 = new ImageIcon(new ImageIcon(img4).getImage().getScaledInstance(s1.getWidth(), s1.getHeight(), Image.SCALE_SMOOTH));
            s1.setIcon(imageIcon3);

            byte[] img5 = rs.getBytes("SImage2");
            ImageIcon imageIcon4 = new ImageIcon(new ImageIcon(img5).getImage().getScaledInstance(s2.getWidth(), s2.getHeight(), Image.SCALE_SMOOTH));
            s2.setIcon(imageIcon4);
        }
    } finally {
        // Close the result set and prepared statement
        try {
            rs.close();
            pst.close();
        } catch (SQLException e) {
            // Handle any SQL exception that may occur when closing resources
        }
    }
} catch (ClassNotFoundException | SQLException ex) {
    // Handle exceptions related to class loading and SQL/database operations
    Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
        vpname1.setText("");
        vpname2.setText("");
        sname1.setText("");
        sname2.setText("");

        img.setIcon(null);
        vp1.setIcon(null);
        vp2.setIcon(null);
        s1.setIcon(null);
        s2.setIcon(null);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void excellentradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excellentradioActionPerformed
        // TODO add your handling code here:
        Howwastheevent = excellentradio.getText();
    }//GEN-LAST:event_excellentradioActionPerformed

    private void goodradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodradioActionPerformed
        // TODO add your handling code here:
        Howwastheevent = goodradio.getText();
    }//GEN-LAST:event_goodradioActionPerformed

    private void fairradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fairradioActionPerformed
        // TODO add your handling code here:
        Howwastheevent = fairradio.getText();
    }//GEN-LAST:event_fairradioActionPerformed

    private void badradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badradioActionPerformed
        // TODO add your handling code here:
        Howwastheevent = badradio.getText();
    }//GEN-LAST:event_badradioActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
           
           int id =1;
            String Q1a =q1.getText();
            String Q2a =q2.getText();
            String Q3a=q3.getText();
            String Q4a=q4.getText();
            String Q5a=q5.getText();
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/connector";
            SUser = "root";
            SPass = "Parthavi@1204";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("UPDATE  new_table SET id=?,Q1=?,Q2=?,Q3=?,Q4=?,Q5=? ");
            pst.setInt(1, id);
            pst.setString(2, Q1a);
            pst.setString(3, Q2a);
            pst.setString(4, Q3a);
            pst.setString(5, Q4a);
            pst.setString(6, Q5a);
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated successfully");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
      jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void excellenttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excellenttActionPerformed
        // TODO add your handling code here:
        Q2 = excellentt.getText();
    }//GEN-LAST:event_excellenttActionPerformed

    private void verygooddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verygooddActionPerformed
        // TODO add your handling code here:
        Q2 = verygoodd.getText();
    }//GEN-LAST:event_verygooddActionPerformed

    private void gooddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gooddActionPerformed
        // TODO add your handling code here:
        Q2 = goodd.getText();
    }//GEN-LAST:event_gooddActionPerformed

    private void fairrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fairrActionPerformed
        // TODO add your handling code here:
        Q2 = fairr.getText();
    }//GEN-LAST:event_fairrActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
        Q2 = badd.getText();
    }//GEN-LAST:event_baddActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Howwastheevent = jRadioButton1.getText();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
     DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            try (Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/connector", "root", "Parthavi@1204");
                    Statement statement = connection.createStatement()) {
               // ResultSet resultSet = statement.executeQuery("SELECT Questions,  AVG(Howwastheevent) AS AvgHowwastheevet, question2, AVG(Q2) AS AvgQ2 FROM feedback GROUP BY event");
                 ResultSet resultSet = statement.executeQuery("SELECT event, AVG(Howwastheevent) AS AvgHowwastheevent, AVG(Q2) AS AvgQ2,AVG(Ans3) AS AvgAns3,AVG(Ans4) AS AvgAns4,AVG(Ans5) AS AvgAns5 FROM feedback GROUP BY event");
                while (resultSet.next()) {
                    String eventname = resultSet.getString("event");
                    int ans1 = resultSet.getInt("AvgHowwastheevent");
                    int ans2 = resultSet.getInt("AvgQ2");
                          int ans3 = resultSet.getInt("AvgAns3");
                                int ans4= resultSet.getInt("AvgAns4");
                                      int ans5 = resultSet.getInt("AvgAns5");
                    dataset.addValue(ans1, "Questions", eventname);
                    dataset.addValue(ans2, "question2", eventname);
                     dataset.addValue(ans3, "Q3", eventname);
                      dataset.addValue(ans4, "Q4", eventname);
                       dataset.addValue(ans5, "Q5", eventname);
                }
                
                resultSet.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
         JFreeChart chart = ChartFactory.createBarChart(
            "Event Analysis",
            "Event Name",
            "Answers",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );

        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Set the Y-axis to display whole numbers from 0 to 10
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 900));

        JFrame chartFrame = new JFrame("Feedback Bar Chart");
        chartFrame.getContentPane().add(chartPanel, BorderLayout.CENTER);
        chartFrame.pack();
        chartFrame.setLocationRelativeTo(null);
        chartFrame.setVisible(true); 
   
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         String SUrl,SUser,SPass;
                      SUrl = "jdbc:MySQL://localhost:3306/connector";
                      SUser = "root";
                      SPass = "Parthavi@1204";
            try {
                              Class.forName("com.mysql.cj.jdbc.Driver");
                      con = DriverManager.getConnection(SUrl,SUser,SPass);
                      
                      String sql = "SELECT * FROM News ";
                       pst = con.prepareStatement(sql);
                       
                       rs = pst.executeQuery();
                         StringBuilder newsText = new StringBuilder();
                       while(rs.next()){
                           
                      
                           
                           String Name1 = rs.getString("news1");
                      newsText.append(Name1).append("\n"); 
                       }
                       jTextArea2.setText(newsText.toString());
            } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        studentoradminpage soa = new studentoradminpage();
        soa.show();
        dispose();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            // TODO add your handling code here:
            String Title1 =jTextField11.getText();
            String url = jTextField8.getText();
            String urlr =jTextField10.getText();
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/connector";
            SUser = "root";
            SPass = "Parthavi@1204";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(SUrl,SUser,SPass);

            // String sql = "INSERT INTO linkfeedback (Title,url,urlresponse)values(?,?,?)";
            pst = con.prepareStatement("INSERT INTO linkfeedback (Title,url,urlresponse)values(?,?,?)");
            //  pst = conn.prepareStatement("INSERT INTO connector(Title,Summary,date,Status,Image)values(?,?,?,?,?)");
            pst.setString(1, Title1);
            pst.setString(2, url);
            pst.setString(3, urlr);
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new link was inserted successfully!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame123.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame123.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
      
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
          try {
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/connector";
            SUser = "root";
            SPass = "Parthavi@1204";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            String sql = "SELECT * FROM linkfeedback where Title=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextField12a.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String link = rs.getString("url");
                linkff.setText(link);
                String link1 =rs.getString("urlresponse");
                linkfa.setText(link1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame123.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame123.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void linkffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkffMouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            URI uri = new URI(linkff.getText());

            // Use the Desktop class to open the default web browser
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linkffMouseClicked

    private void linkfaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkfaMouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            URI uri = new URI(linkfa.getText());

            // Use the Desktop class to open the default web browser
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linkfaMouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
          jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
         Ans3r = e1.getText();
    }//GEN-LAST:event_e1ActionPerformed

    private void vg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vg1ActionPerformed
        // TODO add your handling code here:
                 Ans3r = vg1.getText();
    }//GEN-LAST:event_vg1ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
                 Ans3r = g1.getText();
    }//GEN-LAST:event_g1ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
                 Ans3r = f1.getText();
    }//GEN-LAST:event_f1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
                 Ans3r = b1.getText();
    }//GEN-LAST:event_b1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
                 Ans4r = e2.getText();
    }//GEN-LAST:event_e2ActionPerformed

    private void vg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vg2ActionPerformed
        // TODO add your handling code here:
          Ans4r = vg2.getText();
    }//GEN-LAST:event_vg2ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
          Ans4r = vg2.getText();
    }//GEN-LAST:event_g2ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
          Ans4r = g2.getText();
    }//GEN-LAST:event_f2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
          Ans4r = b2.getText();
    }//GEN-LAST:event_b2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        // TODO add your handling code here:
          Ans5r = e3.getText();
    }//GEN-LAST:event_e3ActionPerformed

    private void vg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vg3ActionPerformed
        // TODO add your handling code here:
         Ans5r = vg3.getText();
    }//GEN-LAST:event_vg3ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
         Ans5r = g3.getText();
    }//GEN-LAST:event_g3ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
         Ans5r = f3.getText();
    }//GEN-LAST:event_f3ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         Ans5r = b3.getText();
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        MAINPAGE mp = new MAINPAGE();
        String q1a,q2a,q3a,q4a,q5a;
        q1a=q1.getText();
        q2a=q2.getText();
        q3a=q3.getText();
        q4a=q4.getText();
        q5a=q5.getText();
       mp.q1s.setText(q1a);
       mp.q2s.setText(q2a);
         mp.q3s.setText(q3a);
           mp.q4s.setText(q4a);
             mp.q5s.setText(q5a);
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Myprofile mp =new Myprofile();
         mp.setVisible(true);
        mp.pack();
        mp.setLocationRelativeTo(null);
        mp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseEntered

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Commitee;
    private keeptoo.KGradientPanel Committeupdate;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton badd;
    private javax.swing.JRadioButton badradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JTextField cb;
    private keeptoo.KGradientPanel committeeshow;
    private javax.swing.JRadioButton e1;
    private javax.swing.JRadioButton e2;
    private javax.swing.JRadioButton e3;
    private javax.swing.JTextField event;
    private javax.swing.JRadioButton excellentradio;
    private javax.swing.JRadioButton excellentt;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton fairr;
    private javax.swing.JRadioButton fairradio;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel fullname1;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JRadioButton goodd;
    private javax.swing.JRadioButton goodradio;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTable1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12a;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel linkfa;
    private javax.swing.JLabel linkff;
    private javax.swing.JLabel next1;
    private javax.swing.JLabel password1;
    public javax.swing.JLabel pimg;
    public javax.swing.JLabel plabel;
    private javax.swing.JLabel prev1;
    public javax.swing.JTextField q1;
    public javax.swing.JTextField q2;
    public javax.swing.JTextField q3;
    public javax.swing.JTextField q4;
    public javax.swing.JTextField q5;
    private javax.swing.JLabel s1;
    public javax.swing.JLabel s1label;
    private javax.swing.JLabel s2;
    public javax.swing.JLabel s2label;
    private javax.swing.JTextField searchdata;
    public javax.swing.JLabel simg1;
    public javax.swing.JLabel simg2;
    private javax.swing.JTextField sname1;
    private javax.swing.JTextField sname2;
    private javax.swing.JLabel username1;
    private javax.swing.JRadioButton verygoodd;
    private javax.swing.JRadioButton vg1;
    private javax.swing.JRadioButton vg2;
    private javax.swing.JRadioButton vg3;
    private javax.swing.JLabel vp1;
    public javax.swing.JLabel vp1label;
    private javax.swing.JLabel vp2;
    public javax.swing.JLabel vp2label;
    public javax.swing.JLabel vpimg1;
    public javax.swing.JLabel vpimg2;
    private javax.swing.JTextField vpname1;
    private javax.swing.JTextField vpname2;
    // End of variables declaration//GEN-END:variables
}

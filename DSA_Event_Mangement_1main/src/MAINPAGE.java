
import com.mysql.cj.jdbc.MysqlDataSource;
import java.awt.Desktop;
import java.sql.Statement;
import java.util.ArrayList;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MAINPAGE extends javax.swing.JFrame {
 byte[] pimg =null;

    /**
     * Creates new form MAINPAGE
     */
        Integer imgIndex = 0;
    public MAINPAGE() {
        initComponents();
        groupRadio7();
        groupRadio8();
        groupRadio9();
        groupRadio10();
        groupRadio11();
    }
    String Howwastheevent;
String Timeworth;
String Q2;
  public void groupRadio7(){
        rg1.add(ne1);
        rg1.add(nvg1);
        rg1.add(ng1);
        rg1.add(nf1);
        rg1.add(nb1);
       
    }
    public void groupRadio8(){
        rg2.add(ne2);
        rg2.add(nvg2);
         rg2.add(ng2);
          rg2.add(nf2);
            rg2.add(nb2);
        
    }
    public void groupRadio9(){
        rg3.add(ne3);
        rg3.add(nvg3);
         rg3.add(ng3);
          rg3.add(nf3);
            rg3.add(nb3);
        
    }
    public void groupRadio10(){
        rg4.add(ne4);
        rg4.add(nvg4);
         rg4.add(ng4);
          rg4.add(nf4);
            rg4.add(nb4);
        
    }
    public void groupRadio11(){
        rg5.add(ne5);
        rg5.add(nvg5);
         rg5.add(ng5);
          rg5.add(nf5);
            rg5.add(nb5);
        
    }
    
 public void datafetch(){
        try {
            String Username,query, SUrl, SUser, SPass,sql;
            SUrl = "jdbc:MySQL://localhost:3306/database_login_user"; // Database URL
            SUser = "root"; // Database username
            SPass = "Parthavi@1204"; // Database password
            // Load the MySQL database driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            con = DriverManager.getConnection(SUrl, SUser, SPass);
            query = "SELECT username FROM new_table ORDER BY id DESC";
            pst = con.prepareStatement(query);
            // Execute the query and obtain the result set
            rs = pst.executeQuery();
            rs.next();
            Username =rs.getString("username");
            u1.setText(Username);
            
            sql= "SELECT * FROM databasetable_login WHERE username = '" +Username+"'";
                  pst = con.prepareStatement(sql);
            // Execute the query and obtain the result set
            rs = pst.executeQuery();
            rs.next();
           p1.setText(rs.getString("password"));
            f1.setText(rs.getString("full_name"));
            
            
            
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 String Ans1r,Ans2r,Ans3r,Ans4r,Ans5r;
    Displayevent de =new Displayevent();
Connection con;
     PreparedStatement pst = null;
     ResultSet rs;
     
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
public ArrayList<byte[]> getImagesList(){
        
        ArrayList<byte[]> imgList = new ArrayList<>();
        
        Connection con = createConnection();
        
        Statement st;
        ResultSet rs;
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery("SELECT Images FROM tableforimageslider");
            
            while(rs.next()){
                
               imgList.add(rs.getBytes("Images")); 
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DashboardforUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

        jToolBar1 = new javax.swing.JToolBar();
        rg1 = new javax.swing.ButtonGroup();
        rg2 = new javax.swing.ButtonGroup();
        rg3 = new javax.swing.ButtonGroup();
        rg4 = new javax.swing.ButtonGroup();
        rg5 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArean = new javax.swing.JTextArea();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        searchdata = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        vpimg1 = new javax.swing.JLabel();
        vpimg2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        simg2 = new javax.swing.JLabel();
        simg1 = new javax.swing.JLabel();
        plabel = new javax.swing.JLabel();
        vp1label = new javax.swing.JLabel();
        vp2label = new javax.swing.JLabel();
        s1label = new javax.swing.JLabel();
        s2label = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        u1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        jLabel31 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        event1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cb1 = new javax.swing.JTextField();
        nvg1 = new javax.swing.JRadioButton();
        ng1 = new javax.swing.JRadioButton();
        nf1 = new javax.swing.JRadioButton();
        nb1 = new javax.swing.JRadioButton();
        jButton17 = new javax.swing.JButton();
        ne2 = new javax.swing.JRadioButton();
        nvg2 = new javax.swing.JRadioButton();
        ng2 = new javax.swing.JRadioButton();
        nf2 = new javax.swing.JRadioButton();
        nb2 = new javax.swing.JRadioButton();
        ne1 = new javax.swing.JRadioButton();
        ne3 = new javax.swing.JRadioButton();
        nvg3 = new javax.swing.JRadioButton();
        ng3 = new javax.swing.JRadioButton();
        nf3 = new javax.swing.JRadioButton();
        nb3 = new javax.swing.JRadioButton();
        ne4 = new javax.swing.JRadioButton();
        nvg4 = new javax.swing.JRadioButton();
        ng4 = new javax.swing.JRadioButton();
        nf4 = new javax.swing.JRadioButton();
        nb4 = new javax.swing.JRadioButton();
        ne5 = new javax.swing.JRadioButton();
        nvg5 = new javax.swing.JRadioButton();
        ng5 = new javax.swing.JRadioButton();
        nf5 = new javax.swing.JRadioButton();
        nb5 = new javax.swing.JRadioButton();
        q1s = new javax.swing.JLabel();
        q2s = new javax.swing.JLabel();
        q3s = new javax.swing.JLabel();
        q4s = new javax.swing.JLabel();
        q5s = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel40 = new javax.swing.JLabel();
        linkff1 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 0));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel3.setkGradientFocus(1000);
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp_Image_2023-08-26_at_23.10.39-removebg-preview.png"))); // NOI18N
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 140, 100));

        jLabel6.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-people-50new.png"))); // NOI18N
        jLabel6.setText("COMMITEE");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 190, 40));

        jLabel7.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-48new.png"))); // NOI18N
        jLabel7.setText("HOME");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 40));

        jLabel2.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-feedback-50new.png"))); // NOI18N
        jLabel2.setText("FEEDBACK");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 180, 50));

        jLabel10.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\dsa\\icons8-male-user-50.png")); // NOI18N
        jLabel10.setText("MY PROFILE");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, -1));

        jLabel4.setFont(new java.awt.Font("Prompt Black", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-event-60new.png"))); // NOI18N
        jLabel4.setText("EVENTS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 160, 50));

        jLabel35.setFont(new java.awt.Font("Prompt Black", 1, 24)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-log-out-50new.png"))); // NOI18N
        jLabel35.setText("LOGOUT");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 160, 40));

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 710));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 740, 130));

        jTabbedPane3.setPreferredSize(new java.awt.Dimension(810, 650));

        kGradientPanel12.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel12.setkGradientFocus(1000);
        kGradientPanel12.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-45.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 40));

        label1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        kGradientPanel12.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 106, 500, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-45 (1).png"))); // NOI18N
        jLabel8.setText("jLabel5");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        kGradientPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 50, 40));

        jPanel4.setBackground(new java.awt.Color(186, 186, 186));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("NEWS");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jTextArean.setColumns(20);
        jTextArean.setRows(5);
        jScrollPane4.setViewportView(jTextArean);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        kGradientPanel12.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 650, -1));

        jTabbedPane3.addTab("tab5", kGradientPanel12);

        kGradientPanel9.setkEndColor(new java.awt.Color(255, 204, 0));
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 51, 0));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title ", "Summary", "Details"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        kGradientPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 700, 300));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdataActionPerformed(evt);
            }
        });
        jPanel3.add(searchdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 220, 35));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-35.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 44, 41));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Showdata");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 35));

        kGradientPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 50));

        jTabbedPane3.addTab("tab2", kGradientPanel9);

        kGradientPanel10.setkEndColor(new java.awt.Color(255, 153, 0));
        kGradientPanel10.setkGradientFocus(100);
        kGradientPanel10.setkStartColor(new java.awt.Color(255, 51, 0));

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 51, 0));
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Data Science Student Association");
        kGradientPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 85, 94));

        vpimg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(vpimg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, 94));

        vpimg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(vpimg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 85, 94));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("President");
        kGradientPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("Vice-President");
        kGradientPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("Vice-President");
        kGradientPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setText("Secretary");
        kGradientPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        simg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(simg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 76, 88));

        simg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(simg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 76, 88));

        plabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(plabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 110, 19));

        vp1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(vp1label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 150, 20));

        vp2label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(vp2label, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 150, 19));

        s1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(s1label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 150, 18));

        s2label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel4.add(s2label, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 445, 140, 20));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Secretary");
        kGradientPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        kGradientPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 526, 560, 210));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Members And Ambassdor");
        kGradientPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 220, -1));

        jScrollPane1.setViewportView(kGradientPanel4);

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab3", kGradientPanel10);

        kGradientPanel11.setkEndColor(new java.awt.Color(255, 51, 0));
        kGradientPanel11.setkGradientFocus(1000);
        kGradientPanel11.setkStartColor(new java.awt.Color(255, 204, 0));
        kGradientPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Username :");
        kGradientPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 187, 79, -1));

        jLabel20.setText("Password:");
        kGradientPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 215, 70, -1));

        jLabel21.setText("Fullname:");
        kGradientPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 70, -1));
        kGradientPanel11.add(u1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 300, 20));
        kGradientPanel11.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 280, 20));
        kGradientPanel11.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 300, 30));

        jLabel22.setText("To change the password");
        kGradientPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jTabbedPane3.addTab("tab4", kGradientPanel11);

        kGradientPanel6.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel6.setkGradientFocus(1000);
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 255, 0));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-form-100.png"))); // NOI18N
        jLabel30.setText("FeedbackForm");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\dsa\\icons8-google-docs-100.png")); // NOI18N
        jLabel11.setText("Feedback Form ");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab7", kGradientPanel6);

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 204, 0));
        kGradientPanel2.setkGradientFocus(800);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel13.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel13.setkGradientFocus(1000);
        kGradientPanel13.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Full Name ");
        kGradientPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        kGradientPanel13.add(fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 350, -1));

        jLabel32.setText("Event");
        kGradientPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 225, -1));
        kGradientPanel13.add(event1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 350, -1));

        jLabel33.setText("Class/Branch");
        kGradientPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 92, -1));
        kGradientPanel13.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 186, -1));

        nvg1.setText("4");
        nvg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvg1ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nvg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 98, -1));

        ng1.setText("3");
        ng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng1ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ng1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 98, -1));

        nf1.setText("2");
        nf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf1ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 98, -1));

        nb1.setText("1");
        nb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb1ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 98, -1));

        jButton17.setText("Save");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        ne2.setText("5");
        ne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ne2ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        nvg2.setText("4");
        nvg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvg2ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nvg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        ng2.setText("3");
        ng2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng2ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ng2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        nf2.setText("2");
        nf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf2ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        nb2.setText("1");
        nb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb2ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        ne1.setText("5");
        ne1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ne1MouseClicked(evt);
            }
        });
        ne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ne1ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        ne3.setText("5");
        ne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ne3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        nvg3.setText("4");
        nvg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvg3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nvg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        ng3.setText("3");
        ng3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ng3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        nf3.setText("2");
        nf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        nb3.setText("1");
        nb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        ne4.setText("5");
        ne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ne4ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, -1, -1));

        nvg4.setText("4");
        nvg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvg4ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nvg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        ng4.setText("3");
        ng4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng4ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ng4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, -1, -1));

        nf4.setText("2");
        nf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf4ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, -1, -1));

        nb4.setText("1");
        nb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb4ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 740, -1, -1));

        ne5.setText("5");
        ne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ne5ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 790, -1, -1));

        nvg5.setText("4");
        nvg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvg5ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nvg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, -1, -1));

        ng5.setText("3");
        ng5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ng5ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(ng5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 830, -1, -1));

        nf5.setText("2");
        nf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nf5ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 850, -1, -1));

        nb5.setText("1");
        nb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb5ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(nb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 870, -1, -1));

        q1s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel13.add(q1s, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 660, 30));

        q2s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel13.add(q2s, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 650, 30));

        q3s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel13.add(q3s, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 640, 30));

        q4s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel13.add(q4s, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 660, 30));

        q5s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel13.add(q5s, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 760, 660, 30));

        jScrollPane5.setViewportView(kGradientPanel13);

        kGradientPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 570));

        jTabbedPane3.addTab("tab1", kGradientPanel2);

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 0, 0));
        kGradientPanel5.setkGradientFocus(1000);
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setText("Link For Feedback Form");
        kGradientPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 134, -1, -1));

        linkff1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        linkff1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkff1MouseClicked(evt);
            }
        });
        kGradientPanel5.add(linkff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 134, 399, 16));
        kGradientPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 6, 177, -1));

        jLabel44.setText("Enter the title ");
        kGradientPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 9, 120, -1));

        jLabel45.setText("Search");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        kGradientPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jTabbedPane3.addTab("tab6", kGradientPanel5);

        kGradientPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 740, 620));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        imgIndex--;

        if(imgIndex < 0){

            imgIndex = 0;

        }

        showImage(imgIndex);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        imgIndex++;

        if(imgIndex >= getImagesList().size()){

            imgIndex = getImagesList().size() - 1;

        }

        showImage(imgIndex);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(0);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(2);
         try {                                         
                     // Set up the database connection parameters
    String SUrl, SUser, SPass;
    SUrl = "jdbc:MySQL://localhost:3306/connector"; // Database URL
    SUser = "root"; // Database username
    SPass = "Parthavi@1204"; // Database password

            try {
                              // Load the MySQL database driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish a connection to the database using the provided parameters
    con = DriverManager.getConnection(SUrl, SUser, SPass);

    // Define an SQL query to select all records from the "committee" table
    String sql = "SELECT * FROM committee";

    // Prepare a statement to execute the SQL query
    pst = con.prepareStatement(sql);

    // Execute the query and obtain the result set
    rs = pst.executeQuery();

    // Check if there are rows in the result set
    if (rs.next()) {
        // If there's at least one row, retrieve and display the data

        // Retrieve and set the "Name" column value to the "plabel"
        String Name1 = rs.getString("Name");
        plabel.setText(Name1);

        // Retrieve and set the "Vpname1" column value to the "vp1label"
        String Name2 = rs.getString("Vpname1");
        vp1label.setText(Name2);

        // Retrieve and set the "Vpname2" column value to the "vp2label"
        String Name3 = rs.getString("Vpname2");
        vp2label.setText(Name3);

        // Retrieve and set the "Sname1" column value to the "s1label"
        String Name4 = rs.getString("Sname1");
        s1label.setText(Name4);

        // Retrieve and set the "Sname2" column value to the "s2label"
        String Name5 = rs.getString("Sname2");
        s2label.setText(Name5);

        // Retrieve and set the "Others" column value to "jTextArea1"
        String Others1 = rs.getString("Others");
        jTextArea1.setText(Others1);

        // Retrieve an image in binary format ("Image" column), convert it, resize it, and set it as the icon for "img"
        byte[] img0 = rs.getBytes("Image");
        ImageIcon image0 = new ImageIcon(img0);
        Image im0 = image0.getImage();
        Image myimg0 = im0.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage0 = new ImageIcon(myimg0);
        img.setIcon(newImage0);

        // Repeat the above steps for other images in the database columns and corresponding components

        byte[] img1 = rs.getBytes("VpImage1");
        ImageIcon image1 = new ImageIcon(img1);
        Image im1 = image1.getImage();
        Image myimg1 = im1.getScaledInstance(vpimg1.getWidth(), vpimg1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage1 = new ImageIcon(myimg1);
        vpimg1.setIcon(newImage1);

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
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(3);
        datafetch();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void searchdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchdataActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
try {                                         
                      // TODO add your handling code here:
                      String SUrl,SUser,SPass;
                      SUrl = "jdbc:MySQL://localhost:3306/connector";
                      SUser = "root";
                      SPass = "Parthavi@1204";
            try {
                             Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL database driver
con = DriverManager.getConnection(SUrl, SUser, SPass); // Establish a database connection using the provided URL, username, and password

String sql = "SELECT * FROM connector where Title=?"; // Define an SQL query to select records based on the "Title" column
pst = con.prepareStatement(sql); // Prepare a statement for executing the query
pst.setString(1, searchdata.getText()); // Set the value for the parameter in the prepared statement based on user input
rs = pst.executeQuery(); // Execute the query and obtain the result set

if (rs.next()) { // If there is at least one matching record in the result set

    // Create and display a new JFrame called 'de'
    de.setVisible(true);
    de.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Retrieve and set the "Title" column value to the 'jTitle1' component in 'de'
    String Title1 = rs.getString("Title");
    de.jTitle1.setText(Title1);

    // Retrieve and set the "Summary" column value to the 'jTextArea1' component in 'de'
    String Summary1 = rs.getString("Summary");
    de.jTextArea1.setText(Summary1);

    // Retrieve and set the "date" column value to the 'jdate1' component in 'de'
    String date1 = rs.getString("date");
    de.jdate1.setText(date1);

    // Retrieve and set the "Details" column value to the 'jStatus1' component in 'de'
    String Status1 = rs.getString("Details");
    de.jStatus1.setText(Status1);

    // Retrieve an image in binary format ("Image" column), convert it, resize it, and set it as the icon for 'de.jimg1'
    byte[] img = rs.getBytes("Image");
    ImageIcon image = new ImageIcon(img);
    Image im = image.getImage();
    Image myimg = im.getScaledInstance(de.jimg1.getWidth(), de.jimg1.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon newImage = new ImageIcon(myimg);
    de.jimg1.setIcon(newImage);
}

          } catch (ClassNotFoundException ex) {
                              Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
                          }
                  } catch (SQLException ex) {
                      Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
                 
                  }       
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    try {
    // Start a database-related code block
    // TODO add your handling code here:

    // Set up the database connection parameters
    String SUrl, SUser, SPass;
    SUrl = "jdbc:MySQL://localhost:3306/connector"; // Database URL
    SUser = "root"; // Database username
    SPass = "Parthavi@1204"; // Database password

    // Load the MySQL database driver class
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish a connection to the database using the provided parameters
    con = DriverManager.getConnection(SUrl, SUser, SPass);

    // Define an SQL query to select all records from the "connector" table
    String sql = "SELECT * FROM connector";

    // Prepare a statement to execute the SQL query
    pst = con.prepareStatement(sql);

    // Execute the query and obtain the result set
    rs = pst.executeQuery();

    try {
        // Start a loop to process each row of the result set
        while (rs.next()) {
            // Retrieve values from the result set for specific columns

            // Retrieve the "Title" column value
            String Title = rs.getString("Title");

            // Retrieve the "Summary" column value
            String Summary = rs.getString("Summary");

            // Retrieve the "date" column value as a Date object
            Date date = rs.getDate("date");

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
        Logger.getLogger(Eventsforuser.class.getName()).log(Level.SEVERE, null, ex);
    }
} catch (SQLException ex) {
    // Handle any exceptions that may occur during database access
    Logger.getLogger(Eventsforuser.class.getName()).log(Level.SEVERE, null, ex);
} catch (ClassNotFoundException ex) {
    // Handle any exceptions related to loading the database driver class
    Logger.getLogger(Eventsforuser.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
       String SUrl, SUser, SPass;
SUrl = "jdbc:MySQL://localhost:3306/connector"; // Define the database URL
SUser = "root"; // Define the database username
SPass = "Parthavi@1204"; // Define the database password

try {
    // Attempt to load the MySQL database driver class
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish a database connection using the provided URL, username, and password
    con = DriverManager.getConnection(SUrl, SUser, SPass);

    // Define an SQL query to select all records from the "News" table
    String sql = "SELECT * FROM News";

    // Prepare a statement to execute the SQL query
    pst = con.prepareStatement(sql);

    // Execute the query and obtain the result set
    rs = pst.executeQuery();

    // Create a StringBuilder to store news text
    StringBuilder newsText = new StringBuilder();

    // Loop through each row in the result set
    while (rs.next()) {
        // Retrieve the "news1" column value
        String Name1 = rs.getString("news1");

        // Append the news text to the StringBuilder with a line break
        newsText.append(Name1).append("\n");
    }

    // Set the text of a JTextArea (jTextArean) to the accumulated news text
    jTextArean.setText(newsText.toString());
} catch (SQLException | ClassNotFoundException ex) {
    // Handle any exceptions that may occur during database access or class loading
    Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
}


    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        studentoradminpage soa = new studentoradminpage();
        soa.show();
        dispose();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void linkff1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkff1MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            URI uri = new URI(linkff1.getText());

            // Use the Desktop class to open the default web browser
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linkff1MouseClicked

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
            pst.setString(1, jTextField12.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String link = rs.getString("url");
                linkff1.setText(link);
                //String link1 =rs.getString("urlr");
              // linkfa.setText(link1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewJFrame123.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
jTabbedPane3.setSelectedIndex(5);
        try {
         String SUrl, SUser, SPass;
         SUrl = "jdbc:MySQL://localhost:3306/connector"; // Database URL
         SUser = "root"; // Database username
         SPass = "Parthavi@1204"; // Database password
         // Load the MySQL database driver
         Class.forName("com.mysql.cj.jdbc.Driver");
         // Establish a connection to the database using the provided parameters
         con = DriverManager.getConnection(SUrl, SUser, SPass);
         // Define an SQL query to select all records from the "committee" table
         String sql = "SELECT * FROM new_table";
         // Prepare a statement to execute the SQL query
         pst = con.prepareStatement(sql);
         // Execute the query and obtain the result set
         rs = pst.executeQuery();
         // Check if there are rows in the result set
         if (rs.next()) {
             // If there's at least one row, retrieve and display the data
             
             // Retrieve and set the "Name" column value to the "plabel"
             String Name1 = rs.getString("Q1");
             q1s.setText(Name1);
             
             // Retrieve and set the "Vpname1" column value to the "vp1label"
             String Name2 = rs.getString("Q2");
             q2s.setText(Name2);
             
             // Retrieve and set the "Vpname2" column value to the "vp2label"
             String Name3 = rs.getString("Q3");
             q3s.setText(Name3);
             
             // Retrieve and set the "Sname1" column value to the "s1label"
             String Name4 = rs.getString("Q4");
             q4s.setText(Name4);
             
             // Retrieve and set the "Sname2" column value to the "s2label"
             String Name5 = rs.getString("Q5");
             q5s.setText(Name5);
             
         }} catch (ClassNotFoundException ex) {
         Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(MAINPAGE.class.getName()).log(Level.SEVERE, null, ex);
     } 
        
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void nvg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvg1ActionPerformed
        // TODO add your handling code here:
        Ans1r= nvg1.getText();
    }//GEN-LAST:event_nvg1ActionPerformed

    private void ng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng1ActionPerformed
        // TODO add your handling code here:
        Ans1r = ng1.getText();
    }//GEN-LAST:event_ng1ActionPerformed

    private void nf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf1ActionPerformed
        // TODO add your handling code here:
      Ans1r = nf1.getText();
    }//GEN-LAST:event_nf1ActionPerformed

    private void nb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb1ActionPerformed
        // TODO add your handling code here:
       Ans1r = nb1.getText();
    }//GEN-LAST:event_nb1ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            // TODO add your handling code here:
            String fullname = fullname1.getText();
            String event = event1.getText();
            String classbranch =cb1.getText();
            String question =q1s.getText();
            String question2 =q2s.getText();
            String Q3=q3s.getText();
            String Q4=q4s.getText();
            String Q5=q5s.getText();
            String SUrl,SUser,SPass;
            SUrl = "jdbc:MySQL://localhost:3306/connector";
            SUser = "root";
            SPass = "Parthavi@1204";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("INSERT INTO feedback(fullname,event,Classbranch,Howwastheevent,Q2,Questions,question2,Q3,Ans3,Q4,Ans4,Q5,Ans5)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, fullname);
            pst.setString(2, event);
            pst.setString(3, classbranch);
            pst.setString(4, Ans1r);
            pst.setString(5, Ans2r);
            pst.setString(6, question);
            pst.setString(7, question2);
            pst.setString(8, Q3);
            pst.setString(9, Ans3r);
            pst.setString(10, Q4);
            pst.setString(11, Ans4r);
            pst.setString(12,   Q5);
            pst.setString(13, Ans5r);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved successfully");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPageadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void ne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ne2ActionPerformed
        // TODO add your handling code here:
        Ans2r = ne2.getText();
    }//GEN-LAST:event_ne2ActionPerformed

    private void nvg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvg2ActionPerformed
        // TODO add your handling code here:
          Ans2r = nvg2.getText();
    }//GEN-LAST:event_nvg2ActionPerformed

    private void ng2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng2ActionPerformed
        // TODO add your handling code here:
           Ans2r = ng2.getText();
    }//GEN-LAST:event_ng2ActionPerformed

    private void nf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf2ActionPerformed
        // TODO add your handling code here:
           Ans2r= nf2.getText();
    }//GEN-LAST:event_nf2ActionPerformed

    private void nb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb2ActionPerformed
        // TODO add your handling code here:
           Ans2r = nb2.getText();
    }//GEN-LAST:event_nb2ActionPerformed

    private void ne1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ne1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ne1MouseClicked

    private void ne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ne1ActionPerformed
        // TODO add your handling code here:
        Ans1r = ne1.getText();
    }//GEN-LAST:event_ne1ActionPerformed

    private void ne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ne3ActionPerformed
        // TODO add your handling code here:
        Ans3r = ne3.getText();
    }//GEN-LAST:event_ne3ActionPerformed

    private void nvg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvg3ActionPerformed
        // TODO add your handling code here:
        Ans3r = nvg3.getText();
    }//GEN-LAST:event_nvg3ActionPerformed

    private void ng3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng3ActionPerformed
        // TODO add your handling code here:
        Ans3r = ng3.getText();
    }//GEN-LAST:event_ng3ActionPerformed

    private void nf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf3ActionPerformed
        // TODO add your handling code here:
        Ans3r = nf3.getText();
    }//GEN-LAST:event_nf3ActionPerformed

    private void nb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb3ActionPerformed
        // TODO add your handling code here:
        Ans3r = nb3.getText();
    }//GEN-LAST:event_nb3ActionPerformed

    private void ne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ne4ActionPerformed
        // TODO add your handling code here:
        Ans4r = ne4.getText();
    }//GEN-LAST:event_ne4ActionPerformed

    private void nvg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvg4ActionPerformed
        // TODO add your handling code here:
        Ans4r = nvg4.getText();
    }//GEN-LAST:event_nvg4ActionPerformed

    private void ng4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng4ActionPerformed
        // TODO add your handling code here:
        Ans4r = nvg4.getText();
    }//GEN-LAST:event_ng4ActionPerformed

    private void nf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf4ActionPerformed
        // TODO add your handling code here:
        Ans4r = ng4.getText();
    }//GEN-LAST:event_nf4ActionPerformed

    private void nb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb4ActionPerformed
        // TODO add your handling code here:
        Ans4r = nb4.getText();
    }//GEN-LAST:event_nb4ActionPerformed

    private void ne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ne5ActionPerformed
        // TODO add your handling code here:
        Ans5r = ne5.getText();
    }//GEN-LAST:event_ne5ActionPerformed

    private void nvg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvg5ActionPerformed
        // TODO add your handling code here:
        Ans5r = nvg5.getText();
    }//GEN-LAST:event_nvg5ActionPerformed

    private void ng5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ng5ActionPerformed
        // TODO add your handling code here:
        Ans5r = ng5.getText();
    }//GEN-LAST:event_ng5ActionPerformed

    private void nf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nf5ActionPerformed
        // TODO add your handling code here:
        Ans5r = nf5.getText();
    }//GEN-LAST:event_nf5ActionPerformed

    private void nb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb5ActionPerformed
        // TODO add your handling code here:
        Ans5r = nb5.getText();
    }//GEN-LAST:event_nb5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Myprofileforuser mpu =new Myprofileforuser();
        mpu.setVisible(true);
        mpu.pack();
        mpu.setLocationRelativeTo(null);
        mpu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MAINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAINPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cb1;
    private javax.swing.JTextField event1;
    private javax.swing.JLabel f1;
    private javax.swing.JTextField fullname1;
    public javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArean;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JToolBar jToolBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel linkff1;
    private javax.swing.JRadioButton nb1;
    private javax.swing.JRadioButton nb2;
    private javax.swing.JRadioButton nb3;
    private javax.swing.JRadioButton nb4;
    private javax.swing.JRadioButton nb5;
    private javax.swing.JRadioButton ne1;
    private javax.swing.JRadioButton ne2;
    private javax.swing.JRadioButton ne3;
    private javax.swing.JRadioButton ne4;
    private javax.swing.JRadioButton ne5;
    private javax.swing.JRadioButton nf1;
    private javax.swing.JRadioButton nf2;
    private javax.swing.JRadioButton nf3;
    private javax.swing.JRadioButton nf4;
    private javax.swing.JRadioButton nf5;
    private javax.swing.JRadioButton ng1;
    private javax.swing.JRadioButton ng2;
    private javax.swing.JRadioButton ng3;
    private javax.swing.JRadioButton ng4;
    private javax.swing.JRadioButton ng5;
    private javax.swing.JRadioButton nvg1;
    private javax.swing.JRadioButton nvg2;
    private javax.swing.JRadioButton nvg3;
    private javax.swing.JRadioButton nvg4;
    private javax.swing.JRadioButton nvg5;
    private javax.swing.JLabel p1;
    public javax.swing.JLabel plabel;
    public javax.swing.JLabel q1s;
    public javax.swing.JLabel q2s;
    public javax.swing.JLabel q3s;
    public javax.swing.JLabel q4s;
    public javax.swing.JLabel q5s;
    private javax.swing.ButtonGroup rg1;
    private javax.swing.ButtonGroup rg2;
    private javax.swing.ButtonGroup rg3;
    private javax.swing.ButtonGroup rg4;
    private javax.swing.ButtonGroup rg5;
    public javax.swing.JLabel s1label;
    public javax.swing.JLabel s2label;
    private javax.swing.JTextField searchdata;
    public javax.swing.JLabel simg1;
    public javax.swing.JLabel simg2;
    private javax.swing.JLabel u1;
    public javax.swing.JLabel vp1label;
    public javax.swing.JLabel vp2label;
    public javax.swing.JLabel vpimg1;
    public javax.swing.JLabel vpimg2;
    // End of variables declaration//GEN-END:variables
}

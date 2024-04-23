/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;


import article_tabs.N8;
import article_tabs.B6;
import article_tabs.N7;
import article_tabs.B5;
import article_tabs.N6;
import article_tabs.N5;
import article_tabs.B8;
import article_tabs.B7;
import article_tabs.N4;
import article_tabs.N3;
import article_tabs.N2;
import article_tabs.N1;
import article_tabs.B4;
import article_tabs.B3;
import article_tabs.B2;
import article_tabs.B1;
import java.awt.Image;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class Article_page extends javax.swing.JFrame {

    /**
     * Creates new form blogs_Page
     */
    public Article_page() {
        initComponents();
        
        
    Connection sqlConn;
    Statement st;
    ResultSet rs = null;
    
    
    try
    {
         Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/articles","root", "1234567890");
            st = sqlConn.createStatement();
            
            rs = st.executeQuery("select Title,photo from articles where Type = 'news' order by SrNo desc");
           
           
                 rs.next();                                                   
                 LabelN1.setText(rs.getString(1)); 
                 byte[] img = rs.getBytes("photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(i1.getWidth(), i1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                i1.setIcon(newImage);
                 
                 
                 
                 
                 rs.next();
                 LabelN2.setText(rs.getString(1));
                  byte[] img2 = rs.getBytes("photo");
                ImageIcon image2 = new ImageIcon(img2);
                Image im2 = image2.getImage();
                Image myimg2 = im2.getScaledInstance(i2.getWidth(), i2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage2 = new ImageIcon(myimg2);
                i2.setIcon(newImage2);
                 
                 rs.next();
                 LabelN3.setText(rs.getString(1));
                 byte[] img3 = rs.getBytes("photo");
                ImageIcon image3 = new ImageIcon(img3);
                Image im3 = image3.getImage();
                Image myimg3 = im3.getScaledInstance(i3.getWidth(), i3.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage3 = new ImageIcon(myimg3);
                i3.setIcon(newImage3);
                
                
                
                 rs.next();
                 LabelN4.setText(rs.getString(1));
                 byte[] img4 = rs.getBytes("photo");
                ImageIcon image4 = new ImageIcon(img4);
                Image im4 = image4.getImage();
                Image myimg4 = im4.getScaledInstance(i4.getWidth(), i4.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage4 = new ImageIcon(myimg4);
                i4.setIcon(newImage4);
                
                
                
                 rs.next();
                 LabelN5.setText(rs.getString(1));
                 byte[] img5 = rs.getBytes("photo");
                ImageIcon image5 = new ImageIcon(img5);
                Image im5 = image5.getImage();
                Image myimg5 = im5.getScaledInstance(i5.getWidth(), i5.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage5 = new ImageIcon(myimg5);
                i5.setIcon(newImage5);
                
                
                 rs.next();
                 LabelN6.setText(rs.getString(1));
                 byte[] img6 = rs.getBytes("photo");
                ImageIcon image6 = new ImageIcon(img6);
                Image im6 = image6.getImage();
                Image myimg6 = im6.getScaledInstance(i6.getWidth(), i6.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage6 = new ImageIcon(myimg6);
                i6.setIcon(newImage6);
                
                
                
                 rs.next();
                 LabelN7.setText(rs.getString(1));
                 byte[] img7 = rs.getBytes("photo");
                ImageIcon image7 = new ImageIcon(img7);
                Image im7 = image7.getImage();
                Image myimg7 = im7.getScaledInstance(i7.getWidth(), i7.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage7 = new ImageIcon(myimg7);
                i7.setIcon(newImage7);
                
                
                
                 rs.next();
                 LabelN8.setText(rs.getString(1));
                 byte[] img8 = rs.getBytes("photo");
                ImageIcon image8 = new ImageIcon(img8);
                Image im8 = image8.getImage();
                Image myimg8 = im8.getScaledInstance(i8.getWidth(), i8.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage8 = new ImageIcon(myimg8);
                i8.setIcon(newImage8);
                 
                
            
    }
    catch (ClassNotFoundException ex) 
    {
          java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
    }  
    catch (SQLException ex)
      {
          java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
          
      }
    
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/articles","root", "1234567890");
            st = sqlConn.createStatement();
            
            rs = st.executeQuery("select Title,photo from articles where Type = 'blog' order by SrNo desc");
            if(rs.next()){
     
                LabelA1.setText(rs.getString(1));
                 byte[] img9 = rs.getBytes("photo");
                ImageIcon image9 = new ImageIcon(img9);
                Image im9 = image9.getImage();
                Image myimg9 = im9.getScaledInstance(i9.getWidth(), i9.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage9 = new ImageIcon(myimg9);
                i9.setIcon(newImage9);
                rs.next();
                LabelA2.setText(rs.getString(1));
                 byte[] img10 = rs.getBytes("photo");
                ImageIcon image10 = new ImageIcon(img10);
                Image im10 = image10.getImage();
                Image myimg10 = im10.getScaledInstance(i10.getWidth(), i10.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage10 = new ImageIcon(myimg10);
                i10.setIcon(newImage10);
                rs.next();
                LabelA3.setText(rs.getString(1));
                 byte[] img11 = rs.getBytes("photo");
                ImageIcon image11 = new ImageIcon(img11);
                Image im11 = image11.getImage();
                Image myimg11 = im11.getScaledInstance(i11.getWidth(), i11.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage11 = new ImageIcon(myimg11);
                i11.setIcon(newImage11);
                
                
                rs.next();
                LabelA4.setText(rs.getString(1));
                 byte[] img12 = rs.getBytes("photo");
                ImageIcon image12 = new ImageIcon(img12);
                Image im12 = image12.getImage();
                Image myimg12 = im12.getScaledInstance(i12.getWidth(), i12.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage12 = new ImageIcon(myimg12);
                i12.setIcon(newImage12);
                
                
                rs.next();
                LabelA5.setText(rs.getString(1));
                 byte[] img13 = rs.getBytes("photo");
                ImageIcon image13 = new ImageIcon(img13);
                Image im13 = image13.getImage();
                Image myimg13 = im13.getScaledInstance(i13.getWidth(), i13.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage13 = new ImageIcon(myimg13);
                i13.setIcon(newImage13);
                rs.next();
                LabelA6.setText(rs.getString(1));
                 byte[] img14 = rs.getBytes("photo");
                ImageIcon image14 = new ImageIcon(img14);
                Image im14 = image14.getImage();
                Image myimg14 = im14.getScaledInstance(i14.getWidth(), i14.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage14 = new ImageIcon(myimg14);
                i14.setIcon(newImage14);
                rs.next();
                LabelA7.setText(rs.getString(1));
                 byte[] img15 = rs.getBytes("photo");
                ImageIcon image15 = new ImageIcon(img15);
                Image im15 = image15.getImage();
                Image myimg15 = im15.getScaledInstance(i15.getWidth(), i15.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage15 = new ImageIcon(myimg15);
                i15.setIcon(newImage15);
                rs.next();
                LabelA8.setText(rs.getString(1));
                 byte[] img16 = rs.getBytes("photo");
                ImageIcon image16 = new ImageIcon(img16);
                Image im16 = image16.getImage();
                Image myimg16 = im16.getScaledInstance(i16.getWidth(), i16.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage16 = new ImageIcon(myimg16);
                i16.setIcon(newImage16);
            }
    }
    catch (ClassNotFoundException ex) 
    {
          java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
    }  
    catch (SQLException ex)
      {
          java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
          
      }
    
    
   
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new scrollbar.ScrollPaneWin11();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        RMN2 = new javax.swing.JLabel();
        LabelN2 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        RMN3 = new javax.swing.JLabel();
        LabelN3 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        RMN4 = new javax.swing.JLabel();
        LabelN4 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        RMB1 = new javax.swing.JLabel();
        LabelA1 = new javax.swing.JLabel();
        i9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        RMB2 = new javax.swing.JLabel();
        LabelA2 = new javax.swing.JLabel();
        i10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        RMB4 = new javax.swing.JLabel();
        LabelA4 = new javax.swing.JLabel();
        i12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        RMB3 = new javax.swing.JLabel();
        LabelA3 = new javax.swing.JLabel();
        i11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        RMN1 = new javax.swing.JLabel();
        LabelN1 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        RMN5 = new javax.swing.JLabel();
        LabelN5 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        RMN6 = new javax.swing.JLabel();
        LabelN6 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        RMN7 = new javax.swing.JLabel();
        LabelN7 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        RMN8 = new javax.swing.JLabel();
        LabelN8 = new javax.swing.JLabel();
        i8 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        kGradientPanel16 = new keeptoo.KGradientPanel();
        RMB5 = new javax.swing.JLabel();
        LabelA5 = new javax.swing.JLabel();
        i13 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        kGradientPanel17 = new keeptoo.KGradientPanel();
        RMB6 = new javax.swing.JLabel();
        LabelA6 = new javax.swing.JLabel();
        i14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        kGradientPanel18 = new keeptoo.KGradientPanel();
        RMB7 = new javax.swing.JLabel();
        LabelA7 = new javax.swing.JLabel();
        i15 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        kGradientPanel19 = new keeptoo.KGradientPanel();
        RMB8 = new javax.swing.JLabel();
        LabelA8 = new javax.swing.JLabel();
        i16 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        kGradientPanel5.setkEndColor(new java.awt.Color(0, 0, 153));
        kGradientPanel5.setkGradientFocus(1000);
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 153, 255));
        kGradientPanel5.setMinimumSize(new java.awt.Dimension(1450, 1700));
        kGradientPanel5.setPreferredSize(new java.awt.Dimension(1450, 1700));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(217, 328));

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN2.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN2.setForeground(new java.awt.Color(255, 255, 255));
        RMN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN2.setText("READ MORE");
        RMN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RMN2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelN2.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelN2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LabelN2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelN2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 85, 323, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(217, 330));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN3.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN3.setForeground(new java.awt.Color(255, 255, 255));
        RMN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN3.setText("READ MORE");
        RMN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMN3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jPanel5.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 287, -1, -1));

        LabelN3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(LabelN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 221, 283, 60));
        jPanel5.add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 13, 311, 200));

        kGradientPanel5.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 83, 323, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel4.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN4.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN4.setForeground(new java.awt.Color(255, 255, 255));
        RMN4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN4.setText("READ MORE");
        RMN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMN4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelN4.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addComponent(LabelN4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelN4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 83, 323, 330));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel6.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel6.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB1.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB1.setForeground(new java.awt.Color(255, 255, 255));
        RMB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB1.setText("READ MORE");
        RMB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMB1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA1.setBackground(new java.awt.Color(255, 255, 255));
        LabelA1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(LabelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(i9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(i9, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 899, -1, 330));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel7.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel7.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB2.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB2.setForeground(new java.awt.Color(255, 255, 255));
        RMB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB2.setText("READ MORE");
        RMB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMB2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA2.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(LabelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(i10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i10, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 899, -1, 330));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel9.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel9.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB4.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB4.setForeground(new java.awt.Color(255, 255, 255));
        RMB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB4.setText("READ MORE");
        RMB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMB4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA4.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(LabelA4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i12, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 899, 323, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel8.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel8.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB3.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB3.setForeground(new java.awt.Color(255, 255, 255));
        RMB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB3.setText("READ MORE");
        RMB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RMB3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i11, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 899, -1, 330));

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BLOGS");
        kGradientPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 829, 141, 58));

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("News");
        kGradientPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 7, 119, 58));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel10.setAlignmentX(0.0F);
        kGradientPanel10.setAlignmentY(0.0F);
        kGradientPanel10.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel10.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN1.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN1.setForeground(new java.awt.Color(255, 255, 255));
        RMN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN1.setText("READ MORE");
        RMN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelN1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelN1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(i1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelN1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 320));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(217, 330));

        kGradientPanel3.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN5.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN5.setForeground(new java.awt.Color(255, 255, 255));
        RMN5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN5.setText("READ MORE");
        RMN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMN5, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelN5.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(i5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(LabelN5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(i5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelN5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 431, 320, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(217, 330));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel11.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel11.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN6.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN6.setForeground(new java.awt.Color(255, 255, 255));
        RMN6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN6.setText("READ MORE");
        RMN6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMN6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jPanel12.add(kGradientPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        LabelN6.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(LabelN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 283, 60));
        jPanel12.add(i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 180));

        kGradientPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 431, 323, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(217, 330));

        kGradientPanel12.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel12.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN7.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN7.setForeground(new java.awt.Color(255, 255, 255));
        RMN7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN7.setText("READ MORE");
        RMN7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel12Layout = new javax.swing.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMN7, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelN7.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(kGradientPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelN7, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i7, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelN7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 431, 323, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(217, 330));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel13.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel13.setkStartColor(new java.awt.Color(102, 204, 255));

        RMN8.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMN8.setForeground(new java.awt.Color(255, 255, 255));
        RMN8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMN8.setText("READ MORE");
        RMN8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMN8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
        kGradientPanel13.setLayout(kGradientPanel13Layout);
        kGradientPanel13Layout.setHorizontalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RMN8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        kGradientPanel13Layout.setVerticalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMN8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jPanel14.add(kGradientPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        LabelN8.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelN8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(LabelN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 283, 60));
        jPanel14.add(i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 200));

        kGradientPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 431, 323, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel16.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel16.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB5.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB5.setForeground(new java.awt.Color(255, 255, 255));
        RMB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB5.setText("READ MORE");
        RMB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel16Layout = new javax.swing.GroupLayout(kGradientPanel16);
        kGradientPanel16.setLayout(kGradientPanel16Layout);
        kGradientPanel16Layout.setHorizontalGroup(
            kGradientPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RMB5, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel16Layout.setVerticalGroup(
            kGradientPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA5.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(kGradientPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelA5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i13, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 1247, -1, 342));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel17.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel17.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB6.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB6.setForeground(new java.awt.Color(255, 255, 255));
        RMB6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB6.setText("READ MORE");
        RMB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel17Layout = new javax.swing.GroupLayout(kGradientPanel17);
        kGradientPanel17.setLayout(kGradientPanel17Layout);
        kGradientPanel17Layout.setHorizontalGroup(
            kGradientPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RMB6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel17Layout.setVerticalGroup(
            kGradientPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA6.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(kGradientPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(LabelA6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(i14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i14, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 1247, 323, 342));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel18.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel18.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB7.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB7.setForeground(new java.awt.Color(255, 255, 255));
        RMB7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB7.setText("READ MORE");
        RMB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel18Layout = new javax.swing.GroupLayout(kGradientPanel18);
        kGradientPanel18.setLayout(kGradientPanel18Layout);
        kGradientPanel18Layout.setHorizontalGroup(
            kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel18Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RMB7, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel18Layout.setVerticalGroup(
            kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA7.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(kGradientPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelA7, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i15, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 1247, 323, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel19.setkEndColor(new java.awt.Color(153, 255, 255));
        kGradientPanel19.setkStartColor(new java.awt.Color(102, 204, 255));

        RMB8.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        RMB8.setForeground(new java.awt.Color(255, 255, 255));
        RMB8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RMB8.setText("READ MORE");
        RMB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMB8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel19Layout = new javax.swing.GroupLayout(kGradientPanel19);
        kGradientPanel19.setLayout(kGradientPanel19Layout);
        kGradientPanel19Layout.setHorizontalGroup(
            kGradientPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel19Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(RMB8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel19Layout.setVerticalGroup(
            kGradientPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RMB8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        LabelA8.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        LabelA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(kGradientPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(LabelA8, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(i16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i16, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelA8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1039, 1247, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-button-85.png"))); // NOI18N
        back.setText("jLabel4");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        kGradientPanel5.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 80));

        jScrollPane1.setViewportView(kGradientPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1647, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RMN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN1MouseClicked
        N1 n1 = new N1();
        n1.show();
    }//GEN-LAST:event_RMN1MouseClicked

    private void RMN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN2MouseClicked
         N2 n2 = new N2();
         n2.show();
    }//GEN-LAST:event_RMN2MouseClicked

    private void RMN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN3MouseClicked
        N3 n3 = new N3();
        n3.show();     
    }//GEN-LAST:event_RMN3MouseClicked

    private void RMN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN4MouseClicked
        N4 n4 = new N4();
        n4.show();
    }//GEN-LAST:event_RMN4MouseClicked

    private void RMB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB1MouseClicked
        B1 b1 = new B1();
        b1.show();
    }//GEN-LAST:event_RMB1MouseClicked

    private void RMB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB2MouseClicked
        // TODO add your handling code here:
        B2 b2 = new B2();
        b2.show();
    }//GEN-LAST:event_RMB2MouseClicked

    private void RMB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB3MouseClicked
        // TODO add your handling code here:
        B3 b3 = new B3();
        b3.show();
    }//GEN-LAST:event_RMB3MouseClicked

    private void RMB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB4MouseClicked
        // TODO add your handling code here:
        B4 b4 = new B4();
        b4.show();
    }//GEN-LAST:event_RMB4MouseClicked

    private void RMN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN5MouseClicked

        N5 n5 = new N5();
        n5.show();  
    }//GEN-LAST:event_RMN5MouseClicked

    private void RMN6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN6MouseClicked
        // TODO add your handling code here:
        N6 n6 = new N6();
        n6.show();        
    }//GEN-LAST:event_RMN6MouseClicked

    private void RMN7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN7MouseClicked
        // TODO add your handling code here:
        N7 n7 = new N7();
        n7.show(); 
    }//GEN-LAST:event_RMN7MouseClicked

    private void RMN8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMN8MouseClicked
        // TODO add your handling code here:
        N8 n8 = new N8();
        n8.show(); 
    }//GEN-LAST:event_RMN8MouseClicked

    private void RMB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB5MouseClicked
        // TODO add your handling code here:
        B5 b5 = new B5();
        b5.show(); 
        
    }//GEN-LAST:event_RMB5MouseClicked

    private void RMB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB6MouseClicked
        // TODO add your handling code here:
        B6 b6 = new B6();
        b6.show();
        
    }//GEN-LAST:event_RMB6MouseClicked

    private void RMB7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB7MouseClicked
        // TODO add your handling code here:
        B7 b7 = new B7();
        b7.show();
    }//GEN-LAST:event_RMB7MouseClicked

    private void RMB8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMB8MouseClicked
        // TODO add your handling code here:
        
        B8 b8 = new B8();
        b8.show();
    }//GEN-LAST:event_RMB8MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        DashboardFarmer ds = new DashboardFarmer();
        ds.show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Article_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Article_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelA1;
    private javax.swing.JLabel LabelA2;
    private javax.swing.JLabel LabelA3;
    private javax.swing.JLabel LabelA4;
    private javax.swing.JLabel LabelA5;
    private javax.swing.JLabel LabelA6;
    private javax.swing.JLabel LabelA7;
    private javax.swing.JLabel LabelA8;
    private javax.swing.JLabel LabelN1;
    private javax.swing.JLabel LabelN2;
    private javax.swing.JLabel LabelN3;
    private javax.swing.JLabel LabelN4;
    private javax.swing.JLabel LabelN5;
    private javax.swing.JLabel LabelN6;
    private javax.swing.JLabel LabelN7;
    private javax.swing.JLabel LabelN8;
    private javax.swing.JLabel RMB1;
    private javax.swing.JLabel RMB2;
    private javax.swing.JLabel RMB3;
    private javax.swing.JLabel RMB4;
    private javax.swing.JLabel RMB5;
    private javax.swing.JLabel RMB6;
    private javax.swing.JLabel RMB7;
    private javax.swing.JLabel RMB8;
    private javax.swing.JLabel RMN1;
    private javax.swing.JLabel RMN2;
    private javax.swing.JLabel RMN3;
    private javax.swing.JLabel RMN4;
    private javax.swing.JLabel RMN5;
    private javax.swing.JLabel RMN6;
    private javax.swing.JLabel RMN7;
    private javax.swing.JLabel RMN8;
    private javax.swing.JLabel back;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i10;
    private javax.swing.JLabel i11;
    private javax.swing.JLabel i12;
    private javax.swing.JLabel i13;
    private javax.swing.JLabel i14;
    private javax.swing.JLabel i15;
    private javax.swing.JLabel i16;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i4;
    private javax.swing.JLabel i5;
    private javax.swing.JLabel i6;
    private javax.swing.JLabel i7;
    private javax.swing.JLabel i8;
    private javax.swing.JLabel i9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel16;
    private keeptoo.KGradientPanel kGradientPanel17;
    private keeptoo.KGradientPanel kGradientPanel18;
    private keeptoo.KGradientPanel kGradientPanel19;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    // End of variables declaration//GEN-END:variables
}

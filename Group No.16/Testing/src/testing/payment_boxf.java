/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author sdewr
 */
public class payment_boxf extends javax.swing.JFrame {

    /**
     * Creates new form payment_boxf
     */
    public payment_boxf() {
        initComponents();
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane4.setOpaque(false);
        jScrollPane4.getViewport().setOpaque(false);
        jScrollPane4.setBorder(null);
        jScrollPane4.setViewportBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setBorder(null);
        jScrollPane3.setViewportBorder(null);
        jScrollPane5.setOpaque(false);
        jScrollPane5.getViewport().setOpaque(false);
        jScrollPane5.setBorder(null);
        jScrollPane5.setViewportBorder(null);
        jScrollPane6.setOpaque(false);
        jScrollPane6.getViewport().setOpaque(false);
        jScrollPane6.setBorder(null);
        jScrollPane6.setViewportBorder(null);
        Display();
        
    }

    public void Display(){
        rs.setText("Rs.");
        delivery.setText("30 th Sept");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        payment_unit = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        delivery = new javax.swing.JLabel();
        productname = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        rs = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new scrollbar.ScrollPaneWin11();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cardnumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        expiry = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane3 = new scrollbar.ScrollPaneWin11();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        debit_username = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        debit_cardnumber = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        debit_expiry = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        debit_cvv = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        debit_address = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane4 = new scrollbar.ScrollPaneWin11();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        username2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        address2 = new javax.swing.JTextArea();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDER SUMMARY");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, 40));

        jLabel14.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TOTAL :");
        kGradientPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 40));

        jLabel17.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DELIVERY DATE:");
        kGradientPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 40));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bill-75.png"))); // NOI18N
        kGradientPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 70));

        payment_unit.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        payment_unit.setForeground(new java.awt.Color(255, 255, 255));
        payment_unit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kGradientPanel2.add(payment_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 40, 40));

        price.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kGradientPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 60, 40));

        delivery.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        delivery.setForeground(new java.awt.Color(255, 255, 255));
        delivery.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kGradientPanel2.add(delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 40));

        productname.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        productname.setForeground(new java.awt.Color(255, 255, 255));
        productname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kGradientPanel2.add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 400, 40));

        jLabel28.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Quantity :");
        kGradientPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 40));

        quantity.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kGradientPanel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 40, 40));

        rs.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        rs.setForeground(new java.awt.Color(255, 255, 255));
        rs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kGradientPanel2.add(rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 30, 40));

        jPanel2.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 560));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        kGradientPanel3.setkStartColor(new java.awt.Color(0, 204, 255));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment details");
        kGradientPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 220, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("cash on delivery (cod)");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("payment type  :");
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("credit card");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("debit card");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 100, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bank-cards-50.png"))); // NOI18N
        kGradientPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-money-transfer-50.png"))); // NOI18N
        kGradientPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 50));

        jLabel16.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("/");
        kGradientPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 10, -1));

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 610, 160));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(624, 800));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("username  :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, 40));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 180, 40));

        jLabel8.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("credit card");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 220, 60));

        jLabel9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("credit card number  :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 200, 40));

        cardnumber.setBackground(new java.awt.Color(255, 255, 255));
        cardnumber.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        cardnumber.setForeground(new java.awt.Color(0, 0, 0));
        cardnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel4.add(cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 220, 40));

        jLabel10.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("expiry month  :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, 40));

        expiry.setBackground(new java.awt.Color(255, 255, 255));
        expiry.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        expiry.setForeground(new java.awt.Color(0, 0, 0));
        expiry.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel4.add(expiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 70, 40));

        jLabel11.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("cvv  :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 50, 40));

        cvv.setBackground(new java.awt.Color(255, 255, 255));
        cvv.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        cvv.setForeground(new java.awt.Color(0, 0, 0));
        cvv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel4.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 50, 40));

        jLabel12.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("address  :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 100, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setLineWrap(true);
        address.setRows(5);
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jScrollPane1.setViewportView(address);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 260, 200));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(51, 153, 255));
        jToggleButton1.setText("make payment");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 170, 50));

        jScrollPane2.setViewportView(jPanel4);

        jTabbedPane2.addTab("tab1", jScrollPane2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(624, 800));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("username  :");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 40));

        debit_username.setBackground(new java.awt.Color(255, 255, 255));
        debit_username.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        debit_username.setForeground(new java.awt.Color(0, 0, 0));
        debit_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel5.add(debit_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 180, 40));

        jLabel15.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("debit card");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 230, 60));

        jLabel18.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 255));
        jLabel18.setText("debit card number  :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 40));

        debit_cardnumber.setBackground(new java.awt.Color(255, 255, 255));
        debit_cardnumber.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        debit_cardnumber.setForeground(new java.awt.Color(0, 0, 0));
        debit_cardnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel5.add(debit_cardnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 220, 40));

        jLabel19.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 255));
        jLabel19.setText("expiry month  :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, 40));

        debit_expiry.setBackground(new java.awt.Color(255, 255, 255));
        debit_expiry.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        debit_expiry.setForeground(new java.awt.Color(0, 0, 0));
        debit_expiry.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel5.add(debit_expiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, 40));

        jLabel20.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 255));
        jLabel20.setText("cvv  :");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 50, 40));

        debit_cvv.setBackground(new java.awt.Color(255, 255, 255));
        debit_cvv.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        debit_cvv.setForeground(new java.awt.Color(0, 0, 0));
        debit_cvv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel5.add(debit_cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 50, 40));

        jLabel21.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 153, 255));
        jLabel21.setText("address  :");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 40));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        debit_address.setBackground(new java.awt.Color(255, 255, 255));
        debit_address.setColumns(20);
        debit_address.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        debit_address.setForeground(new java.awt.Color(0, 0, 0));
        debit_address.setLineWrap(true);
        debit_address.setRows(5);
        debit_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jScrollPane5.setViewportView(debit_address);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 260, 200));

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(51, 153, 255));
        jToggleButton2.setText("make payment");
        jToggleButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 170, 50));

        jScrollPane3.setViewportView(jPanel5);

        jTabbedPane2.addTab("tab2", jScrollPane3);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(624, 800));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 153, 255));
        jLabel22.setText("username  :");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 40));

        username2.setBackground(new java.awt.Color(255, 255, 255));
        username2.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        username2.setForeground(new java.awt.Color(0, 0, 0));
        username2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jPanel6.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 250, 40));

        jLabel23.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 153, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("cash on delivery");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 350, 60));

        jLabel27.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 153, 255));
        jLabel27.setText("address  :");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 40));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        address2.setBackground(new java.awt.Color(255, 255, 255));
        address2.setColumns(20);
        address2.setFont(new java.awt.Font("Thunder", 0, 21)); // NOI18N
        address2.setForeground(new java.awt.Color(0, 0, 0));
        address2.setLineWrap(true);
        address2.setRows(5);
        address2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 255)));
        jScrollPane6.setViewportView(address2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 260, 200));

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(51, 153, 255));
        jToggleButton3.setText("make payment");
        jToggleButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 170, 50));

        jScrollPane4.setViewportView(jPanel6);

        jTabbedPane2.addTab("tab3", jScrollPane4);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 620, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        String CardNumber,Expiry,CVV, query,Expirydb,CVVdb;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/info";
        SUser = "root";
        SPass = "1234567890";
        Expirydb = null;
        CVVdb = null;
        int notFound = 0;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(username.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(cardnumber.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Card Number is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(expiry.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Expiry is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(cvv.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "CVV is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else{
              
            CardNumber = cardnumber.getText();
            Expiry = expiry.getText();
            CVV = cvv.getText();
            query = "SELECT * FROM cards WHERE cardnum= '"+CardNumber+"'";
       
            ResultSet rs = st.executeQuery(query);
           
            
            while(rs.next()){
                Expirydb = rs.getString("expiry");
                CVVdb = rs.getString("cvv");
                notFound = 1;
            }
            if(notFound == 1 && Expiry.equals(Expirydb)&&CVV.equals(CVVdb)){
                showMessageDialog(null, "Payment Successful!");
                home_page1 hp = new home_page1();
                hp.show();
                dispose();
                
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Card Not Found", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            cardnumber.setText("");
            username.setText("");
            expiry.setText("");
            cvv.setText("");
            address.setText("");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        String CardNumber,Expiry,CVV, query,Expirydb,CVVdb;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/info";
        SUser = "root";
        SPass = "1234567890";
        Expirydb = null;
        CVVdb = null;
        int notFound = 0;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(debit_username.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(debit_cardnumber.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Card Number is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(debit_expiry.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Expiry is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(debit_cvv.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "CVV is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else{
              
            CardNumber = debit_cardnumber.getText();
            Expiry = debit_expiry.getText();
            CVV = debit_cvv.getText();
            query = "SELECT * FROM cards WHERE cardnum= '"+CardNumber+"'";
       
            ResultSet rs = st.executeQuery(query);
           
            
            while(rs.next()){
                Expirydb = rs.getString("expiry");
                CVVdb = rs.getString("cvv");
                notFound = 1;
            }
            if(notFound == 1 && Expiry.equals(Expirydb)&&CVV.equals(CVVdb)){
                showMessageDialog(null, "Payment Successful!");
                home_page1 hp = new home_page1();
                hp.show();
                dispose();
                
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Card Not Found", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            debit_cardnumber.setText("");
            debit_username.setText("");
            debit_expiry.setText("");
            debit_cvv.setText("");
            debit_address.setText("");
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        if("".equals(username2.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(address2.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Address is require", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else{
        showMessageDialog(null, "Payment Successful!");
                home_page1 hp = new home_page1();
                hp.show();
                dispose();
            }    
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(payment_boxf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment_boxf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment_boxf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment_boxf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_boxf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextArea address2;
    private javax.swing.JTextField cardnumber;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextArea debit_address;
    private javax.swing.JTextField debit_cardnumber;
    private javax.swing.JTextField debit_cvv;
    private javax.swing.JTextField debit_expiry;
    private javax.swing.JTextField debit_username;
    private javax.swing.JLabel delivery;
    private javax.swing.JTextField expiry;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    public javax.swing.JLabel payment_unit;
    public javax.swing.JLabel price;
    public javax.swing.JLabel productname;
    public javax.swing.JLabel quantity;
    private javax.swing.JLabel rs;
    private javax.swing.JTextField username;
    private javax.swing.JTextField username2;
    // End of variables declaration//GEN-END:variables
}

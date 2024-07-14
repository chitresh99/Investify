/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e_canteen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author Avadhoot
 */
public class Canteen1 extends javax.swing.JFrame {

    
public class InsertDataFromTable {

    // Establish the database connection
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ecanteen?useSSL=false";
        String username = "root";
        String password = "@zgardi@n#1234";
        return DriverManager.getConnection(url, username, password);
    }

    // Insert data from JTable to the database
        public void insertDataFromTable(JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    String query = "INSERT INTO canteen1 (username, item, quantity, price) VALUES (?, ?, ?, ?)";
    try (Connection connection = getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        for (int row = 0; row < model.getRowCount(); row++) {
            String username = jLabel7.getText(); // Assuming jLabel19 is a valid JLabel component that contains the username
            String item = (String) model.getValueAt(row, 0);
            String quantity = (String) model.getValueAt(row, 1);
            String price = (String) model.getValueAt(row, 2);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, item);
            preparedStatement.setString(3, quantity);
            preparedStatement.setString(4, price);
            preparedStatement.executeUpdate();
        }
        System.out.println("Data inserted successfully!");
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
    }
}

    /**
     * Creates new form Canteen1
     */
    public Canteen1() {
        initComponents();   
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
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        noodlep = new javax.swing.JLabel();
        chaip = new javax.swing.JLabel();
        sandp = new javax.swing.JLabel();
        pohap = new javax.swing.JLabel();
        vadap = new javax.swing.JLabel();
        pavp = new javax.swing.JLabel();
        medup = new javax.swing.JLabel();
        friedp = new javax.swing.JLabel();
        upmap = new javax.swing.JLabel();
        biryanip = new javax.swing.JLabel();
        thalip = new javax.swing.JLabel();
        idlip = new javax.swing.JLabel();
        lsandwitch = new javax.swing.JLabel();
        lchai = new javax.swing.JLabel();
        lpoha = new javax.swing.JLabel();
        lmendu = new javax.swing.JLabel();
        lfried = new javax.swing.JLabel();
        lnoodle = new javax.swing.JLabel();
        lvada = new javax.swing.JLabel();
        lpav = new javax.swing.JLabel();
        lupma = new javax.swing.JLabel();
        lbiryani = new javax.swing.JLabel();
        lthali = new javax.swing.JLabel();
        lidli = new javax.swing.JLabel();
        upma = new javax.swing.JComboBox<>();
        chai = new javax.swing.JComboBox<>();
        sandwitches = new javax.swing.JComboBox<>();
        poha = new javax.swing.JComboBox<>();
        vadapav = new javax.swing.JComboBox<>();
        pavbhaji = new javax.swing.JComboBox<>();
        meduvada = new javax.swing.JComboBox<>();
        friedrice = new javax.swing.JComboBox<>();
        noodles = new javax.swing.JComboBox<>();
        idli = new javax.swing.JComboBox<>();
        vegthali = new javax.swing.JComboBox<>();
        vegbiryani = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        upmat = new javax.swing.JLabel();
        chait = new javax.swing.JLabel();
        sandt = new javax.swing.JLabel();
        pohat = new javax.swing.JLabel();
        vadat = new javax.swing.JLabel();
        pavt = new javax.swing.JLabel();
        medut = new javax.swing.JLabel();
        friedt = new javax.swing.JLabel();
        noodlet = new javax.swing.JLabel();
        idlit = new javax.swing.JLabel();
        thalit = new javax.swing.JLabel();
        biryanit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totaltimerequired = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 10, 90, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 90));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANTEEN 1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(260, 40, 180, 30);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("E-Canteen ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(740, 10, 180, 40);

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(800, 70, 120, 16);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 920, 90));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 38)); // NOI18N
        jLabel5.setText("MENU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 110, 50));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view edit delete product.png"))); // NOI18N
        jButton10.setText("ORDER");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 120, 30));

        noodlep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noodlep.setText("70/-");
        getContentPane().add(noodlep, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 30, 40));

        chaip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chaip.setText("10/-");
        getContentPane().add(chaip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 30, 40));

        sandp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sandp.setText("50/-");
        getContentPane().add(sandp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 30, 40));

        pohap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pohap.setText("25/-");
        getContentPane().add(pohap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 30, 40));

        vadap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vadap.setText("15/-");
        getContentPane().add(vadap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 30, 40));

        pavp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pavp.setText("60/-");
        getContentPane().add(pavp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 30, 40));

        medup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medup.setText("30/-");
        getContentPane().add(medup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 30, 40));

        friedp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        friedp.setText("70/-");
        getContentPane().add(friedp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 30, 40));

        upmap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        upmap.setText("20/-");
        getContentPane().add(upmap, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 30, 40));

        biryanip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        biryanip.setText("110/-");
        getContentPane().add(biryanip, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 40, 40));

        thalip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thalip.setText("80/-");
        getContentPane().add(thalip, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 30, 40));

        idlip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idlip.setText("10/-");
        getContentPane().add(idlip, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 30, 40));

        lsandwitch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lsandwitch.setText("SANDWITCHES");
        getContentPane().add(lsandwitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 20));

        lchai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lchai.setText("CHAI");
        getContentPane().add(lchai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 20));

        lpoha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lpoha.setText("POHA");
        getContentPane().add(lpoha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 20));

        lmendu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lmendu.setText("MEDU VADA");
        getContentPane().add(lmendu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 110, 20));

        lfried.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lfried.setText("FRIED RICE");
        getContentPane().add(lfried, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, 20));

        lnoodle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lnoodle.setText("NOODLES");
        getContentPane().add(lnoodle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 120, 20));

        lvada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lvada.setText("VADA PAV");
        getContentPane().add(lvada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 20));

        lpav.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lpav.setText("PAV BHAJI");
        getContentPane().add(lpav, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 20));

        lupma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lupma.setText("UPMA");
        getContentPane().add(lupma, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 90, 20));

        lbiryani.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbiryani.setText("VEG BIRYANI");
        getContentPane().add(lbiryani, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 120, 20));

        lthali.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lthali.setText("VEG THALI");
        getContentPane().add(lthali, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 100, 20));

        lidli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lidli.setText("IDLI ");
        getContentPane().add(lidli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 110, 20));

        upma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        upma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upmaActionPerformed(evt);
            }
        });
        getContentPane().add(upma, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 50, -1));

        chai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        chai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaiActionPerformed(evt);
            }
        });
        getContentPane().add(chai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 50, -1));

        sandwitches.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        sandwitches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwitchesActionPerformed(evt);
            }
        });
        getContentPane().add(sandwitches, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, -1));

        poha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        poha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pohaActionPerformed(evt);
            }
        });
        getContentPane().add(poha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 50, -1));

        vadapav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        vadapav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vadapavActionPerformed(evt);
            }
        });
        getContentPane().add(vadapav, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, -1));

        pavbhaji.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        pavbhaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pavbhajiActionPerformed(evt);
            }
        });
        getContentPane().add(pavbhaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 50, -1));

        meduvada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        meduvada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meduvadaActionPerformed(evt);
            }
        });
        getContentPane().add(meduvada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 50, -1));

        friedrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        friedrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friedriceActionPerformed(evt);
            }
        });
        getContentPane().add(friedrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 50, -1));

        noodles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        noodles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noodlesActionPerformed(evt);
            }
        });
        getContentPane().add(noodles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 50, -1));

        idli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        idli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idliActionPerformed(evt);
            }
        });
        getContentPane().add(idli, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 50, -1));

        vegthali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        vegthali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegthaliActionPerformed(evt);
            }
        });
        getContentPane().add(vegthali, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 50, -1));

        vegbiryani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9" }));
        vegbiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegbiryaniActionPerformed(evt);
            }
        });
        getContentPane().add(vegbiryani, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 50, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QUANTITY", "PRICE", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, 340));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/place order.png"))); // NOI18N
        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("TOTAL :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        total.setText("TOTAL");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        jLabel4.setText("/- ONLY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, -1, -1));

        upmat.setText("10");
        getContentPane().add(upmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 10, 10));

        chait.setText(" 5");
        getContentPane().add(chait, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 10));

        sandt.setText("10");
        getContentPane().add(sandt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 10, 10));

        pohat.setText("10");
        getContentPane().add(pohat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 10, 10));

        vadat.setText("5");
        getContentPane().add(vadat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 10));

        pavt.setText("15");
        getContentPane().add(pavt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 10, 10));

        medut.setText("15");
        getContentPane().add(medut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 10, 10));

        friedt.setText("20");
        getContentPane().add(friedt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 10, 10));

        noodlet.setText("15");
        getContentPane().add(noodlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 10, 10));

        idlit.setText("5");
        getContentPane().add(idlit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, 10));

        thalit.setText("17");
        getContentPane().add(thalit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 10, 10));

        biryanit.setText("25");
        getContentPane().add(biryanit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 10, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TIME REQUIRED :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 110, 20));

        totaltimerequired.setText("TIME");
        getContentPane().add(totaltimerequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 50, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("mins");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Dashboard DashboardFrame = new Dashboard();
        String txtUsername = jLabel7.getText();
        DashboardFrame.setVisible(true);
        DashboardFrame.pack();
        DashboardFrame.jLabel6.setText(txtUsername);
        DashboardFrame.setLocationRelativeTo(DashboardFrame);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
        
    
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
//    String[] itemNames = {"Chai", "Sandwiches", "Poha", "Vada Pav", "Pav Bhaji", "Medu Vada", "Fried Rice", "Noodles", "Veg Biryani", "Veg Thali", "Idli"};
//    JComboBox[] comboBoxes = {chai, sandwitches, poha, vadapav, pavbhaji, meduvada, friedrice, noodles, vegbiryani, vegthali, idli};
    

   
    // Getting the prices from JLabels
//JLabel[] labels = {lchai, lsandwitch, lpoha, lvada, lpav, lmendu, lfried, lnoodle, lbiryani, lthali, lidli};
//String[] prices = new String[10];
//for (int i = 0; i < 10; i++) {
//    prices[i] = labels[i].getText();
//}
//
//// Adding the data to the JTable
//DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//model.addRow(new Object[]{prices[0]});
//for (int i = 1; i < 10; i++) {
//    model.addRow(new Object[]{prices[i]});
//
//    
//}
// Getting the prices from JLabels
// Getting the prices from JLabels
//String[] itemNames = {"Chai", "Sandwiches", "Poha", "Vada Pav", "Pav Bhaji", "Medu Vada", "Fried Rice", "Noodles", "Veg Biryani", "Veg Thali", "Idli"};
//JComboBox[] comboBoxes = {chai, sandwitches, poha, vadapav, pavbhaji, meduvada, friedrice, noodles, vegbiryani, vegthali, idli};
//JLabel[] labels = {lchai, lsandwitch, lpoha, lvada, lpav, lmendu, lfried, lnoodle, lbiryani, lthali, lidli};
//
//DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//// Clearing the table before adding new rows
//model.setRowCount(0);
//
//for (int i = 0; i < 11; i++) {
//    String itemName = itemNames[i];
//    String quantity = (String) comboBoxes[i].getSelectedItem();
//    String price = labels[i].getText();
//
//    if (!quantity.equals(" 0")) {
//        model.addRow(new Object[]{itemName, quantity, price, "Pending"});
//    }
//}

String[] itemNames = {"Chai", "Sandwiches", "Poha", "Vada Pav", "Pav Bhaji", "Medu Vada", "Fried Rice", "Noodles", "Veg Biryani", "Veg Thali", "Idli"};
    JComboBox[] comboBoxes = {chai, sandwitches, poha, vadapav, pavbhaji, meduvada, friedrice, noodles, vegbiryani, vegthali, idli};
    JLabel[] labels = {chaip, sandp, pohap, vadap, pavp, medup, friedp, noodlep, biryanip, thalip, idlip};
    JLabel[] timelabels = {chait, sandt, pohat, vadat, pavt, medut, friedt, noodlet, biryanit, thalit, idlit};
    

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Clearing the table before adding new rows
    model.setRowCount(0);
    int totalSum = 0;
    int totalTime = 0;
    for (int i = 0; i < 11; i++) {
        String itemName = itemNames[i]; 
        String quantity = (String) comboBoxes[i].getSelectedItem();
        String price = labels[i].getText();
        String time = timelabels[i].getText();
        int quantityValue = Integer.parseInt(quantity.trim());
        int priceValue = Integer.parseInt(price.replace("/-", "").trim());
        int total = quantityValue * priceValue;
        int timeValue = Integer.parseInt(time.trim());

        if (quantityValue != 0) {
            model.addRow(new Object[]{itemName, quantity, price, total,timeValue});
            totalSum += total;
            totalTime += timeValue;
        }
    }
    String totalPrice = String.valueOf(totalSum);
    total.setText(totalPrice);
    String totalTimer = String.valueOf(totalTime);
    totaltimerequired.setText(totalTimer);
    
    // Open the OrderSummary window
//    new OrderSummary().setVisible(true);
//    dispose();

    }//GEN-LAST:event_jButton10ActionPerformed

    private void upmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upmaActionPerformed

    private void vegbiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegbiryaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegbiryaniActionPerformed

    private void vegthaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegthaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegthaliActionPerformed

    private void idliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idliActionPerformed

    private void noodlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noodlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noodlesActionPerformed

    private void friedriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friedriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friedriceActionPerformed

    private void meduvadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meduvadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meduvadaActionPerformed

    private void pavbhajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pavbhajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pavbhajiActionPerformed

    private void vadapavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vadapavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vadapavActionPerformed

    private void pohaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pohaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pohaActionPerformed

    private void sandwitchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwitchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sandwitchesActionPerformed

    private void chaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String txtUsername = jLabel7.getText();
        
        ConfirmOrder ConfirmOrderFrame = new ConfirmOrder(total.getText());
        ConfirmOrderFrame.setSource("Canteen1"); // or "Canteen2"
        ConfirmOrderFrame.setVisible(true);
        ConfirmOrderFrame.pack();
        ConfirmOrderFrame.jLabel3.setText(txtUsername);
        ConfirmOrderFrame.setLocationRelativeTo(ConfirmOrderFrame);
        this.dispose();
        
        InsertDataFromTable dataInserter = new InsertDataFromTable();
        dataInserter.insertDataFromTable(jTable1);
        dispose();
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
            java.util.logging.Logger.getLogger(Canteen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Canteen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Canteen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Canteen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Canteen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel biryanip;
    private javax.swing.JLabel biryanit;
    private javax.swing.JComboBox<String> chai;
    private javax.swing.JLabel chaip;
    private javax.swing.JLabel chait;
    private javax.swing.JLabel friedp;
    private javax.swing.JComboBox<String> friedrice;
    private javax.swing.JLabel friedt;
    private javax.swing.JComboBox<String> idli;
    private javax.swing.JLabel idlip;
    private javax.swing.JLabel idlit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lbiryani;
    private javax.swing.JLabel lchai;
    private javax.swing.JLabel lfried;
    private javax.swing.JLabel lidli;
    private javax.swing.JLabel lmendu;
    private javax.swing.JLabel lnoodle;
    private javax.swing.JLabel lpav;
    private javax.swing.JLabel lpoha;
    private javax.swing.JLabel lsandwitch;
    private javax.swing.JLabel lthali;
    private javax.swing.JLabel lupma;
    private javax.swing.JLabel lvada;
    private javax.swing.JLabel medup;
    private javax.swing.JLabel medut;
    private javax.swing.JComboBox<String> meduvada;
    private javax.swing.JLabel noodlep;
    private javax.swing.JComboBox<String> noodles;
    private javax.swing.JLabel noodlet;
    private javax.swing.JComboBox<String> pavbhaji;
    private javax.swing.JLabel pavp;
    private javax.swing.JLabel pavt;
    private javax.swing.JComboBox<String> poha;
    private javax.swing.JLabel pohap;
    private javax.swing.JLabel pohat;
    private javax.swing.JLabel sandp;
    private javax.swing.JLabel sandt;
    private javax.swing.JComboBox<String> sandwitches;
    private javax.swing.JLabel thalip;
    private javax.swing.JLabel thalit;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totaltimerequired;
    private javax.swing.JComboBox<String> upma;
    private javax.swing.JLabel upmap;
    private javax.swing.JLabel upmat;
    private javax.swing.JLabel vadap;
    private javax.swing.JComboBox<String> vadapav;
    private javax.swing.JLabel vadat;
    private javax.swing.JComboBox<String> vegbiryani;
    private javax.swing.JComboBox<String> vegthali;
    // End of variables declaration//GEN-END:variables

}
package testing;

import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author DELL
 */
public class search_product_user extends javax.swing.JFrame {
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public search_product_user() {
        initComponents();
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
        jScrollPane11.setOpaque(false);
        jScrollPane11.getViewport().setOpaque(false);
        jScrollPane11.setBorder(null);
        jScrollPane11.setViewportBorder(null);
        jScrollPane10.setOpaque(false);
        jScrollPane10.getViewport().setOpaque(false);
        jScrollPane10.setBorder(null);
        jScrollPane10.setViewportBorder(null);
        jScrollPane12.setOpaque(false);
        jScrollPane12.getViewport().setOpaque(false);
        jScrollPane12.setBorder(null);
        jScrollPane12.setViewportBorder(null);
        jScrollPane13.setOpaque(false);
        jScrollPane13.getViewport().setOpaque(false);
        jScrollPane13.setBorder(null);
        jScrollPane13.setViewportBorder(null);
        jScrollPane14.setOpaque(false);
        jScrollPane14.getViewport().setOpaque(false);
        jScrollPane14.setBorder(null);
        jScrollPane14.setViewportBorder(null);
        jScrollPane15.setOpaque(false);
        jScrollPane15.getViewport().setOpaque(false);
        jScrollPane15.setBorder(null);
        jScrollPane15.setViewportBorder(null);
        jScrollPane16.setOpaque(false);
        jScrollPane16.getViewport().setOpaque(false);
        jScrollPane16.setBorder(null);
        jScrollPane16.setViewportBorder(null);
        jScrollPane17.setOpaque(false);
        jScrollPane17.getViewport().setOpaque(false);
        jScrollPane17.setBorder(null);
        jScrollPane17.setViewportBorder(null);
        
        try {
            Vegetable();
            Fruits();
            SeedPowder();
            //Pesticide();
            //Fertilizer();
        } catch (SQLException ex) {
            Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    int TotalPricei1,TotalPricei2,TotalPricei3,TotalPricei4,TotalPricei5,TotalPricei6,TotalPricei7;
     String TotalPrices1,TotalPrices2,TotalPrices3,TotalPrices4,TotalPrices5,TotalPrices6,TotalPrices7;
    public class func{                                       // class for function
        public ResultSet find(String s) throws SQLException{                         // function of resultset to match information in database
            try {
                 String SUrl,SUser,SPass;
                SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
                SUser = "root";
                SPass = "1234567890";
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(SUrl,SUser,SPass);
                pst = con.prepareStatement("select * from product where pro_name = ?");
                pst.setString(1, s);
                rs = pst.executeQuery();
            } catch (ClassNotFoundException ex) { 
                Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
            }
            return rs;
            
        }
    }

    /**
     *
     * @throws SQLException
     */
    public void Vegetable() throws SQLException{          // function to display latest added vegetables
        try {
            String SUrl,SUser,SPass,Quantity,Price_per_unit,Product_description,Product_name,Price1,Price2,Quantity2,Quantity1;
            Product_name = "Product Name :";
            Quantity = "Quantity :";
            Price_per_unit = "Price Per Unit :";
            Product_description = "Product Description :";
            SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("select * from product where category = 'vegetable' order by id desc");
            rs = pst.executeQuery();
            rs.next();
            byte[] img = rs.getBytes("photo");    // retriving the image in bytes format 
                ImageIcon image = new ImageIcon(img);    // converting it into jpg format 
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);   // setting size for the image
                ImageIcon newImage = new ImageIcon(myimg);     // setting the converted image to label
                display_product1.setIcon(newImage);
            product1.setText(rs.getString("pro_name"));
            Quantity1 = rs.getString("quatity");
            number1.setText(Quantity1);
            unit1.setText(rs.getString("unit"));
            Price1 = rs.getString("price_per_unit");
            price1.setText(Price1);
            price_unit1.setText(rs.getString("price_unit"));
            description1.setText(rs.getString( "pro_descrip"));
            qunatity1.setText(Quantity);
            priceunit1.setText(Price_per_unit);
            prodescrip1.setText(Product_description);
            buy1.setText("BUY");
            productname1.setText(Product_name);
            int q1 = Integer.parseInt(Quantity1);
            int p1 = Integer.parseInt(Price1);
            TotalPricei1 = q1*p1;
            TotalPrices1 = String.valueOf(TotalPricei1);
            
            rs.next();
            byte[] img1 = rs.getBytes("photo");
                ImageIcon image1 = new ImageIcon(img1);
                Image im1 = image1.getImage();
                Image myimg1 = im1.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage1 = new ImageIcon(myimg1);
                display_product2.setIcon(newImage1);
            product7.setText(rs.getString("pro_name"));
            Quantity2 = rs.getString("quatity");
            number2.setText(Quantity2);
            unit2.setText(rs.getString("unit"));
            Price2 = rs.getString("price_per_unit");
            price2.setText(Price2);
            price_unit2.setText(rs.getString("price_unit"));
            description2.setText(rs.getString( "pro_descrip"));
            qunatity2.setText(Quantity);
            priceunit2.setText(Price_per_unit);
            prodescrip2.setText(Product_description);
            buy2.setText("BUY");
            productname2.setText(Product_name);
            int q2 = Integer.parseInt(Quantity2);
            int p2 = Integer.parseInt(Price2);
            TotalPricei2 = q2*p2;
            TotalPrices2 = String.valueOf(TotalPricei2);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void Fruits() throws SQLException{  // functions to display latest added fruits
        try {
            String SUrl,SUser,SPass,Quantity,Price_per_unit,Product_description,Product_name,Price1,Price2,Quantity2,Quantity1;
            Product_name = "Product Name :";
            Quantity = "Quantity :";
            Price_per_unit = "Price Per Unit :";
            Product_description = "Product Description :";
            SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("select * from product where category = 'fruit' order by id desc");
            rs = pst.executeQuery();
            rs.next();
            byte[] img = rs.getBytes("photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                display_product3.setIcon(newImage);
            product2.setText(rs.getString("pro_name"));
            Quantity1 = rs.getString("quatity");
            number3.setText( Quantity1);
            unit3.setText(rs.getString("unit"));
             Price1 = rs.getString("price_per_unit");
            price3.setText(Price1 );
            price_unit3.setText(rs.getString("price_unit"));
            description3.setText(rs.getString( "pro_descrip"));
            qunatity3.setText(Quantity);
            priceunit3.setText(Price_per_unit);
            prodescrip3.setText(Product_description);
            buy3.setText("BUY");
            productname3.setText(Product_name);
            int q1 = Integer.parseInt(Quantity1);
            int p1 = Integer.parseInt(Price1);
            TotalPricei3 = q1*p1;
            TotalPrices3 = String.valueOf(TotalPricei3);
            
            rs.next();
            byte[] img1 = rs.getBytes("photo");
                ImageIcon image1 = new ImageIcon(img1);
                Image im1 = image1.getImage();
                Image myimg1 = im1.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage1 = new ImageIcon(myimg1);
                display_product4.setIcon(newImage1);
            product6.setText(rs.getString("pro_name"));
            Quantity2 = rs.getString("quatity");
            number4.setText( Quantity2);
            Price2 = rs.getString("price_per_unit");
            unit4.setText( Price2);
            price4.setText(rs.getString( "price_per_unit"));
            price_unit4.setText(rs.getString("price_unit"));
            description4.setText(rs.getString( "pro_descrip"));
            qunatity4.setText(Quantity);
            priceunit4.setText(Price_per_unit);
            prodescrip4.setText(Product_description);
            buy4.setText("BUY");
            productname4.setText(Product_name);
            int q2 = Integer.parseInt(Quantity2);
            int p2 = Integer.parseInt(Price2);
            TotalPricei4 = q2*p2;
            TotalPrices4 = String.valueOf(TotalPricei4);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void SeedPowder() throws SQLException{                        //function to display latest added seedpowder
        try {
            String SUrl,SUser,SPass,Quantity,Price_per_unit,Product_description,Product_name,Price1,Price2,Quantity2,Quantity1;
            Product_name = "Product Name :";
            Quantity = "Quantity :";
            Price_per_unit = "Price Per Unit :";
            Product_description = "Product Description :";
            SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
            SUser = "root";
            SPass = "1234567890";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(SUrl,SUser,SPass);
            pst = con.prepareStatement("select * from product where category = 'seed powder' order by id desc");
            rs = pst.executeQuery();
            rs.next();
            byte[] img = rs.getBytes("photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                display_product5.setIcon(newImage);
            product8.setText(rs.getString("pro_name"));
            Quantity1 = rs.getString("quatity");
            number5.setText( Quantity1);
            unit5.setText(rs.getString("unit"));
            Price1 = rs.getString("price_per_unit");
            price5.setText( Price1 );
            price_unit5.setText(rs.getString("price_unit"));
            description5.setText(rs.getString( "pro_descrip"));
            qunatity5.setText(Quantity);
            priceunit5.setText(Price_per_unit);
            prodescrip5.setText(Product_description);
            buy5.setText("BUY");
            productname5.setText(Product_name);
            int q1 = Integer.parseInt(Quantity1);
            int p1 = Integer.parseInt(Price1);
            TotalPricei5 = q1*p1;
            TotalPrices5 = String.valueOf(TotalPricei5);
            
            rs.next();
            byte[] img1 = rs.getBytes("photo");
                ImageIcon image1 = new ImageIcon(img1);
                Image im1 = image1.getImage();
                Image myimg1 = im1.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage1 = new ImageIcon(myimg1);
                display_product6.setIcon(newImage1);
            product9.setText(rs.getString("pro_name"));
            Quantity2 = rs.getString("quatity");
            number6.setText( Quantity2);
            unit6.setText(rs.getString("unit"));
            Price2 = rs.getString("price_per_unit");
            price6.setText(Price2);
            price_unit6.setText(rs.getString("price_unit"));
            description6.setText(rs.getString( "pro_descrip"));
            qunatity6.setText(Quantity);
            priceunit6.setText(Price_per_unit);
            prodescrip6.setText(Product_description);
            buy6.setText("BUY");
            productname6.setText(Product_name);
            int q2 = Integer.parseInt(Quantity2);
            int p2 = Integer.parseInt(Price2);
            TotalPricei6 = q2*p2;
            TotalPrices6 = String.valueOf(TotalPricei6);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
//    public void Pesticide() throws SQLException{
//        try {
//            String SUrl,SUser,SPass,Quantity,Price_per_unit,Product_description,Product_name;
//            Product_name = "Product Name :";
//            Quantity = "Quantity :";
//            Price_per_unit = "Price Per Unit :";
//            Product_description = "Product Description :";
//            SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
//            SUser = "root";
//            SPass = "1234567890";
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(SUrl,SUser,SPass);
//            pst = con.prepareStatement("select * from product where category = 'pesticide' order by id desc");
//            rs = pst.executeQuery();
//            rs.next();
//            byte[] img = rs.getBytes("photo");
//                ImageIcon image = new ImageIcon(img);
//                Image im = image.getImage();
//                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon newImage = new ImageIcon(myimg);
//                display_product7.setIcon(newImage);
//            product10.setText(rs.getString("pro_name"));
//            number7.setText(rs.getString(  "quatity"));
//            unit7.setText(rs.getString("unit"));
//            price7.setText(rs.getString( "price_per_unit"));
//            price_unit7.setText(rs.getString("price_unit"));
//            description7.setText(rs.getString( "pro_descrip"));
//            qunatity7.setText(Quantity);
//            priceunit7.setText(Price_per_unit);
//            prodescrip7.setText(Product_description);
//            buy7.setText("BUY");
//            productname7.setText(Product_name);
//            
//            rs.next();
//            byte[] img1 = rs.getBytes("photo");
//                ImageIcon image1 = new ImageIcon(img1);
//                Image im1 = image1.getImage();
//                Image myimg1 = im1.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon newImage1 = new ImageIcon(myimg1);
//                display_product8.setIcon(newImage1);
//            product11.setText(rs.getString("pro_name"));
//            number8.setText(rs.getString(  "quatity"));
//            unit8.setText(rs.getString("unit"));
//            price8.setText(rs.getString( "price_per_unit"));
//            price_unit8.setText(rs.getString("price_unit"));
//            description8.setText(rs.getString( "pro_descrip"));
//            qunatity8.setText(Quantity);
//            priceunit8.setText(Price_per_unit);
//            prodescrip8.setText(Product_description);
//            buy8.setText("BUY");
//            productname8.setText(Product_name);
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
    
//    public void Fertilizer() throws SQLException{
//        try {
//            String SUrl,SUser,SPass,Quantity,Price_per_unit,Product_description,Product_name;
//            Product_name = "Product Name :";
//            Quantity = "Quantity :";
//            Price_per_unit = "Price Per Unit :";
//            Product_description = "Product Description :";
//            SUrl = "jdbc:MySQL://localhost:3306/sell_pro";
//            SUser = "root";
//            SPass = "1234567890";
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(SUrl,SUser,SPass);
//            pst = con.prepareStatement("select * from product where category = 'fertilizer' order by id desc");
//            rs = pst.executeQuery();
//            rs.next();
//            byte[] img = rs.getBytes("photo");
//                ImageIcon image = new ImageIcon(img);
//                Image im = image.getImage();
//                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon newImage = new ImageIcon(myimg);
//                display_product9.setIcon(newImage);
//            product12.setText(rs.getString("pro_name"));
//            number9.setText(rs.getString(  "quatity"));
//            unit9.setText(rs.getString("unit"));
//            price9.setText(rs.getString( "price_per_unit"));
//            price_unit9.setText(rs.getString("price_unit"));
//            description9.setText(rs.getString( "pro_descrip"));
//            qunatity9.setText(Quantity);
//            priceunit9.setText(Price_per_unit);
//            prodescrip9.setText(Product_description);
//            buy9.setText("BUY");
//            productname9.setText(Product_name);
//            
//            rs.next();
//            byte[] img1 = rs.getBytes("photo");
//                ImageIcon image1 = new ImageIcon(img1);
//                Image im1 = image1.getImage();
//                Image myimg1 = im1.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon newImage1 = new ImageIcon(myimg1);
//                display_product10.setIcon(newImage1);
//            product13.setText(rs.getString("pro_name"));
//            number10.setText(rs.getString(  "quatity"));
//            unit10.setText(rs.getString("unit"));
//            price10.setText(rs.getString( "price_per_unit"));
//            price_unit10.setText(rs.getString("price_unit"));
//            description10.setText(rs.getString( "pro_descrip"));
//            qunatity10.setText(Quantity);
//            priceunit10.setText(Price_per_unit);
//            prodescrip10.setText(Product_description);
//            buy10.setText("BUY");
//            productname10.setText(Product_name);
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        search_pro = new javax.swing.JButton();
        pestbtn = new javax.swing.JLabel();
        seedsbtn = new javax.swing.JLabel();
        fruitsbtn = new javax.swing.JLabel();
        vegetablebtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        display_product = new javax.swing.JLabel();
        product = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        price_unit = new javax.swing.JTextField();
        unit = new javax.swing.JTextField();
        prodescrip = new javax.swing.JTextField();
        qunatity = new javax.swing.JTextField();
        priceunit = new javax.swing.JTextField();
        jScrollPane2 = new scrollbar.ScrollPaneWin11()
        ;
        description = new javax.swing.JTextArea();
        buy = new javax.swing.JLabel();
        tab2 = new scrollbar.ScrollPaneWin11();
        jPanel3 = new javax.swing.JPanel();
        display_product1 = new javax.swing.JLabel();
        product1 = new javax.swing.JTextField();
        number1 = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        price_unit1 = new javax.swing.JTextField();
        unit1 = new javax.swing.JTextField();
        prodescrip1 = new javax.swing.JTextField();
        qunatity1 = new javax.swing.JTextField();
        priceunit1 = new javax.swing.JTextField();
        jScrollPane4 = new scrollbar.ScrollPaneWin11();
        description1 = new javax.swing.JTextArea();
        display_product2 = new javax.swing.JLabel();
        number2 = new javax.swing.JTextField();
        price2 = new javax.swing.JTextField();
        price_unit2 = new javax.swing.JTextField();
        unit2 = new javax.swing.JTextField();
        prodescrip2 = new javax.swing.JTextField();
        qunatity2 = new javax.swing.JTextField();
        priceunit2 = new javax.swing.JTextField();
        jScrollPane5 = new scrollbar.ScrollPaneWin11();
        description2 = new javax.swing.JTextArea();
        productname1 = new javax.swing.JTextField();
        product7 = new javax.swing.JTextField();
        productname2 = new javax.swing.JTextField();
        buy2 = new javax.swing.JLabel();
        buy1 = new javax.swing.JLabel();
        tab3 = new scrollbar.ScrollPaneWin11();
        jPanel5 = new javax.swing.JPanel();
        display_product3 = new javax.swing.JLabel();
        number3 = new javax.swing.JTextField();
        price3 = new javax.swing.JTextField();
        price_unit3 = new javax.swing.JTextField();
        unit3 = new javax.swing.JTextField();
        prodescrip3 = new javax.swing.JTextField();
        qunatity3 = new javax.swing.JTextField();
        priceunit3 = new javax.swing.JTextField();
        jScrollPane10 = new scrollbar.ScrollPaneWin11();
        description3 = new javax.swing.JTextArea();
        display_product4 = new javax.swing.JLabel();
        number4 = new javax.swing.JTextField();
        price4 = new javax.swing.JTextField();
        price_unit4 = new javax.swing.JTextField();
        unit4 = new javax.swing.JTextField();
        prodescrip4 = new javax.swing.JTextField();
        qunatity4 = new javax.swing.JTextField();
        priceunit4 = new javax.swing.JTextField();
        jScrollPane11 = new scrollbar.ScrollPaneWin11();
        description4 = new javax.swing.JTextArea();
        product2 = new javax.swing.JTextField();
        productname3 = new javax.swing.JTextField();
        product6 = new javax.swing.JTextField();
        productname4 = new javax.swing.JTextField();
        buy3 = new javax.swing.JLabel();
        buy4 = new javax.swing.JLabel();
        tab4 = new scrollbar.ScrollPaneWin11();
        jPanel7 = new javax.swing.JPanel();
        display_product5 = new javax.swing.JLabel();
        number5 = new javax.swing.JTextField();
        price5 = new javax.swing.JTextField();
        price_unit5 = new javax.swing.JTextField();
        unit5 = new javax.swing.JTextField();
        prodescrip5 = new javax.swing.JTextField();
        qunatity5 = new javax.swing.JTextField();
        priceunit5 = new javax.swing.JTextField();
        jScrollPane12 = new scrollbar.ScrollPaneWin11();
        description5 = new javax.swing.JTextArea();
        display_product6 = new javax.swing.JLabel();
        number6 = new javax.swing.JTextField();
        price6 = new javax.swing.JTextField();
        price_unit6 = new javax.swing.JTextField();
        unit6 = new javax.swing.JTextField();
        prodescrip6 = new javax.swing.JTextField();
        qunatity6 = new javax.swing.JTextField();
        priceunit6 = new javax.swing.JTextField();
        jScrollPane13 = new scrollbar.ScrollPaneWin11();
        description6 = new javax.swing.JTextArea();
        product8 = new javax.swing.JTextField();
        productname5 = new javax.swing.JTextField();
        product9 = new javax.swing.JTextField();
        productname6 = new javax.swing.JTextField();
        buy5 = new javax.swing.JLabel();
        buy6 = new javax.swing.JLabel();
        tab5 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        display_product7 = new javax.swing.JLabel();
        number7 = new javax.swing.JTextField();
        price7 = new javax.swing.JTextField();
        price_unit7 = new javax.swing.JTextField();
        unit7 = new javax.swing.JTextField();
        prodescrip7 = new javax.swing.JTextField();
        qunatity7 = new javax.swing.JTextField();
        priceunit7 = new javax.swing.JTextField();
        buy7 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        description7 = new javax.swing.JTextArea();
        display_product8 = new javax.swing.JLabel();
        number8 = new javax.swing.JTextField();
        price8 = new javax.swing.JTextField();
        price_unit8 = new javax.swing.JTextField();
        unit8 = new javax.swing.JTextField();
        prodescrip8 = new javax.swing.JTextField();
        qunatity8 = new javax.swing.JTextField();
        priceunit8 = new javax.swing.JTextField();
        buy8 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        description8 = new javax.swing.JTextArea();
        product10 = new javax.swing.JTextField();
        productname7 = new javax.swing.JTextField();
        product11 = new javax.swing.JTextField();
        productname8 = new javax.swing.JTextField();
        tab6 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        display_product9 = new javax.swing.JLabel();
        number9 = new javax.swing.JTextField();
        price9 = new javax.swing.JTextField();
        price_unit9 = new javax.swing.JTextField();
        unit9 = new javax.swing.JTextField();
        prodescrip9 = new javax.swing.JTextField();
        qunatity9 = new javax.swing.JTextField();
        priceunit9 = new javax.swing.JTextField();
        buy9 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        description9 = new javax.swing.JTextArea();
        display_product10 = new javax.swing.JLabel();
        number10 = new javax.swing.JTextField();
        price10 = new javax.swing.JTextField();
        price_unit10 = new javax.swing.JTextField();
        unit10 = new javax.swing.JTextField();
        prodescrip10 = new javax.swing.JTextField();
        qunatity10 = new javax.swing.JTextField();
        priceunit10 = new javax.swing.JTextField();
        buy10 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        description10 = new javax.swing.JTextArea();
        product12 = new javax.swing.JTextField();
        productname9 = new javax.swing.JTextField();
        product13 = new javax.swing.JTextField();
        productname10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1142, 950));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Thunder", 0, 24)); // NOI18N
        search.setForeground(new java.awt.Color(153, 153, 153));
        search.setText("Search For Products");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFocusLost(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        kGradientPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 687, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-48.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 60));

        search_pro.setBackground(new java.awt.Color(255, 255, 255));
        search_pro.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        search_pro.setForeground(new java.awt.Color(0, 204, 255));
        search_pro.setText("Search");
        search_pro.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 255)));
        search_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_proActionPerformed(evt);
            }
        });
        search_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_proKeyPressed(evt);
            }
        });
        kGradientPanel1.add(search_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 130, 40));

        pestbtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        pestbtn.setForeground(new java.awt.Color(0, 204, 255));
        pestbtn.setText("SEED  powder |");
        pestbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pestbtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(pestbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, 40));

        seedsbtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        seedsbtn.setForeground(new java.awt.Color(0, 204, 255));
        seedsbtn.setText("FRUITS  |");
        seedsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seedsbtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(seedsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, 40));

        fruitsbtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        fruitsbtn.setForeground(new java.awt.Color(0, 204, 255));
        fruitsbtn.setText("VEGETABLES  |");
        fruitsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fruitsbtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(fruitsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 40));

        vegetablebtn.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        vegetablebtn.setForeground(new java.awt.Color(0, 204, 255));
        vegetablebtn.setText("SEARCH  |");
        vegetablebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vegetablebtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(vegetablebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 40));

        jLabel6.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("HOME  |");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 40));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1130, 110));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1150, 400));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product.setBackground(new java.awt.Color(0, 153, 255));
        display_product.setOpaque(true);
        jPanel4.add(display_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 250));

        product.setEditable(false);
        product.setBackground(new java.awt.Color(0, 153, 255));
        product.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product.setForeground(new java.awt.Color(0, 0, 0));
        product.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product.setBorder(null);
        product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 240, 40));

        number.setEditable(false);
        number.setBackground(new java.awt.Color(0, 153, 255));
        number.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number.setForeground(new java.awt.Color(0, 0, 0));
        number.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number.setBorder(null);
        number.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 50, 40));

        price.setEditable(false);
        price.setBackground(new java.awt.Color(0, 153, 255));
        price.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price.setBorder(null);
        price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel4.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 40, 40));

        price_unit.setEditable(false);
        price_unit.setBackground(new java.awt.Color(0, 153, 255));
        price_unit.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit.setForeground(new java.awt.Color(0, 0, 0));
        price_unit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit.setBorder(null);
        price_unit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unitActionPerformed(evt);
            }
        });
        jPanel4.add(price_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 40, 40));

        unit.setEditable(false);
        unit.setBackground(new java.awt.Color(0, 153, 255));
        unit.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit.setForeground(new java.awt.Color(0, 0, 0));
        unit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit.setBorder(null);
        unit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });
        jPanel4.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 50, 40));

        prodescrip.setEditable(false);
        prodescrip.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip.setBorder(null);
        prodescrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(prodescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 220, 40));

        qunatity.setEditable(false);
        qunatity.setBackground(new java.awt.Color(0, 153, 255));
        qunatity.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity.setForeground(new java.awt.Color(0, 0, 0));
        qunatity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity.setBorder(null);
        qunatity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(qunatity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 120, 40));

        priceunit.setEditable(false);
        priceunit.setBackground(new java.awt.Color(0, 153, 255));
        priceunit.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit.setForeground(new java.awt.Color(0, 0, 0));
        priceunit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit.setBorder(null);
        priceunit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(priceunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 160, 40));

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 255));

        description.setEditable(false);
        description.setBackground(new java.awt.Color(0, 153, 255));
        description.setColumns(20);
        description.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description.setForeground(new java.awt.Color(0, 0, 0));
        description.setLineWrap(true);
        description.setRows(5);
        description.setTabSize(5);
        description.setWrapStyleWord(true);
        description.setBorder(null);
        description.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(description);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 490, 190));

        buy.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy.setForeground(new java.awt.Color(0, 0, 0));
        buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyMouseClicked(evt);
            }
        });
        jPanel4.add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 90, 50));

        jTabbedPane1.addTab("tab1", jPanel4);

        tab2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1130, 1051));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product1.setBackground(new java.awt.Color(0, 153, 255));
        display_product1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display_product1.setOpaque(true);
        jPanel3.add(display_product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 250));

        product1.setEditable(false);
        product1.setBackground(new java.awt.Color(0, 153, 255));
        product1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product1.setForeground(new java.awt.Color(0, 0, 0));
        product1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product1.setBorder(null);
        product1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product1ActionPerformed(evt);
            }
        });
        jPanel3.add(product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 180, 40));

        number1.setEditable(false);
        number1.setBackground(new java.awt.Color(0, 153, 255));
        number1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number1.setForeground(new java.awt.Color(0, 0, 0));
        number1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number1.setBorder(null);
        number1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 50, 40));

        price1.setEditable(false);
        price1.setBackground(new java.awt.Color(0, 153, 255));
        price1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price1.setForeground(new java.awt.Color(0, 0, 0));
        price1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price1.setBorder(null);
        price1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price1ActionPerformed(evt);
            }
        });
        jPanel3.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 40, 40));

        price_unit1.setEditable(false);
        price_unit1.setBackground(new java.awt.Color(0, 153, 255));
        price_unit1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit1.setForeground(new java.awt.Color(0, 0, 0));
        price_unit1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit1.setBorder(null);
        price_unit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit1ActionPerformed(evt);
            }
        });
        jPanel3.add(price_unit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 40, 40));

        unit1.setEditable(false);
        unit1.setBackground(new java.awt.Color(0, 153, 255));
        unit1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit1.setForeground(new java.awt.Color(0, 0, 0));
        unit1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit1.setBorder(null);
        unit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit1ActionPerformed(evt);
            }
        });
        jPanel3.add(unit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 50, 40));

        prodescrip1.setEditable(false);
        prodescrip1.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip1.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip1.setBorder(null);
        prodescrip1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(prodescrip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 40));

        qunatity1.setEditable(false);
        qunatity1.setBackground(new java.awt.Color(0, 153, 255));
        qunatity1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity1.setForeground(new java.awt.Color(0, 0, 0));
        qunatity1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity1.setBorder(null);
        qunatity1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(qunatity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 120, 40));

        priceunit1.setEditable(false);
        priceunit1.setBackground(new java.awt.Color(0, 153, 255));
        priceunit1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit1.setForeground(new java.awt.Color(0, 0, 0));
        priceunit1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit1.setBorder(null);
        priceunit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(priceunit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 40));

        jScrollPane4.setBackground(new java.awt.Color(0, 153, 255));
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        description1.setEditable(false);
        description1.setBackground(new java.awt.Color(0, 153, 255));
        description1.setColumns(20);
        description1.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description1.setForeground(new java.awt.Color(0, 0, 0));
        description1.setLineWrap(true);
        description1.setRows(5);
        description1.setTabSize(5);
        description1.setWrapStyleWord(true);
        description1.setBorder(null);
        description1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(description1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 440, 160));

        display_product2.setBackground(new java.awt.Color(0, 153, 255));
        display_product2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display_product2.setOpaque(true);
        jPanel3.add(display_product2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 250, 250));

        number2.setEditable(false);
        number2.setBackground(new java.awt.Color(0, 153, 255));
        number2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number2.setForeground(new java.awt.Color(0, 0, 0));
        number2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number2.setBorder(null);
        number2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 50, 40));

        price2.setEditable(false);
        price2.setBackground(new java.awt.Color(0, 153, 255));
        price2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price2.setForeground(new java.awt.Color(0, 0, 0));
        price2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price2.setBorder(null);
        price2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price2ActionPerformed(evt);
            }
        });
        jPanel3.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 40, 40));

        price_unit2.setEditable(false);
        price_unit2.setBackground(new java.awt.Color(0, 153, 255));
        price_unit2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit2.setForeground(new java.awt.Color(0, 0, 0));
        price_unit2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit2.setBorder(null);
        price_unit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit2ActionPerformed(evt);
            }
        });
        jPanel3.add(price_unit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, 40, 40));

        unit2.setEditable(false);
        unit2.setBackground(new java.awt.Color(0, 153, 255));
        unit2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit2.setForeground(new java.awt.Color(0, 0, 0));
        unit2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit2.setBorder(null);
        unit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit2ActionPerformed(evt);
            }
        });
        jPanel3.add(unit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 50, 40));

        prodescrip2.setEditable(false);
        prodescrip2.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip2.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip2.setBorder(null);
        prodescrip2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(prodescrip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 750, 220, 40));

        qunatity2.setEditable(false);
        qunatity2.setBackground(new java.awt.Color(0, 153, 255));
        qunatity2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity2.setForeground(new java.awt.Color(0, 0, 0));
        qunatity2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity2.setBorder(null);
        qunatity2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(qunatity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 120, 40));

        priceunit2.setEditable(false);
        priceunit2.setBackground(new java.awt.Color(0, 153, 255));
        priceunit2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit2.setForeground(new java.awt.Color(0, 0, 0));
        priceunit2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit2.setBorder(null);
        priceunit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(priceunit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 700, 160, 40));

        jScrollPane5.setBackground(new java.awt.Color(0, 153, 255));
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        description2.setEditable(false);
        description2.setBackground(new java.awt.Color(0, 153, 255));
        description2.setColumns(20);
        description2.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description2.setForeground(new java.awt.Color(0, 0, 0));
        description2.setLineWrap(true);
        description2.setRows(5);
        description2.setTabSize(5);
        description2.setWrapStyleWord(true);
        description2.setBorder(null);
        description2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane5.setViewportView(description2);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 800, 390, 160));

        productname1.setEditable(false);
        productname1.setBackground(new java.awt.Color(0, 153, 255));
        productname1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname1.setForeground(new java.awt.Color(0, 0, 0));
        productname1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname1.setBorder(null);
        productname1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(productname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, 40));

        product7.setEditable(false);
        product7.setBackground(new java.awt.Color(0, 153, 255));
        product7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product7.setForeground(new java.awt.Color(0, 0, 0));
        product7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product7.setBorder(null);
        product7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product7ActionPerformed(evt);
            }
        });
        jPanel3.add(product7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 240, 40));

        productname2.setEditable(false);
        productname2.setBackground(new java.awt.Color(0, 153, 255));
        productname2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname2.setForeground(new java.awt.Color(0, 0, 0));
        productname2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname2.setBorder(null);
        productname2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(productname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 130, 40));

        buy2.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy2.setForeground(new java.awt.Color(0, 0, 0));
        buy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy2MouseClicked(evt);
            }
        });
        jPanel3.add(buy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 690, 100, 50));

        buy1.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy1.setForeground(new java.awt.Color(0, 0, 0));
        buy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy1MouseClicked(evt);
            }
        });
        jPanel3.add(buy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 100, 50));

        tab2.setViewportView(jPanel3);

        jTabbedPane1.addTab("tab2", tab2);

        tab3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1130, 1051));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product3.setBackground(new java.awt.Color(0, 153, 255));
        display_product3.setOpaque(true);
        jPanel5.add(display_product3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, 250));

        number3.setEditable(false);
        number3.setBackground(new java.awt.Color(0, 153, 255));
        number3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number3.setForeground(new java.awt.Color(0, 0, 0));
        number3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number3.setBorder(null);
        number3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 50, 40));

        price3.setEditable(false);
        price3.setBackground(new java.awt.Color(0, 153, 255));
        price3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price3.setForeground(new java.awt.Color(0, 0, 0));
        price3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price3.setBorder(null);
        price3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price3ActionPerformed(evt);
            }
        });
        jPanel5.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 40, 40));

        price_unit3.setEditable(false);
        price_unit3.setBackground(new java.awt.Color(0, 153, 255));
        price_unit3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit3.setForeground(new java.awt.Color(0, 0, 0));
        price_unit3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit3.setBorder(null);
        price_unit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit3ActionPerformed(evt);
            }
        });
        jPanel5.add(price_unit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 40, 40));

        unit3.setEditable(false);
        unit3.setBackground(new java.awt.Color(0, 153, 255));
        unit3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit3.setForeground(new java.awt.Color(0, 0, 0));
        unit3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit3.setBorder(null);
        unit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit3ActionPerformed(evt);
            }
        });
        jPanel5.add(unit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 50, 40));

        prodescrip3.setEditable(false);
        prodescrip3.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip3.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip3.setBorder(null);
        prodescrip3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(prodescrip3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 220, 40));

        qunatity3.setEditable(false);
        qunatity3.setBackground(new java.awt.Color(0, 153, 255));
        qunatity3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity3.setForeground(new java.awt.Color(0, 0, 0));
        qunatity3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity3.setBorder(null);
        qunatity3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(qunatity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, 40));

        priceunit3.setEditable(false);
        priceunit3.setBackground(new java.awt.Color(0, 153, 255));
        priceunit3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit3.setForeground(new java.awt.Color(0, 0, 0));
        priceunit3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit3.setBorder(null);
        priceunit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(priceunit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 160, 40));

        jScrollPane10.setBackground(new java.awt.Color(0, 153, 255));

        description3.setEditable(false);
        description3.setBackground(new java.awt.Color(0, 153, 255));
        description3.setColumns(20);
        description3.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description3.setForeground(new java.awt.Color(0, 0, 0));
        description3.setLineWrap(true);
        description3.setRows(5);
        description3.setTabSize(5);
        description3.setWrapStyleWord(true);
        description3.setBorder(null);
        description3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane10.setViewportView(description3);

        jPanel5.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 440, 200));

        display_product4.setBackground(new java.awt.Color(0, 153, 255));
        display_product4.setOpaque(true);
        jPanel5.add(display_product4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 250, 250));

        number4.setEditable(false);
        number4.setBackground(new java.awt.Color(0, 153, 255));
        number4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number4.setForeground(new java.awt.Color(0, 0, 0));
        number4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number4.setBorder(null);
        number4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 50, 40));

        price4.setEditable(false);
        price4.setBackground(new java.awt.Color(0, 153, 255));
        price4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price4.setForeground(new java.awt.Color(0, 0, 0));
        price4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price4.setBorder(null);
        price4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price4ActionPerformed(evt);
            }
        });
        jPanel5.add(price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, 40, 40));

        price_unit4.setEditable(false);
        price_unit4.setBackground(new java.awt.Color(0, 153, 255));
        price_unit4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit4.setForeground(new java.awt.Color(0, 0, 0));
        price_unit4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit4.setBorder(null);
        price_unit4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit4ActionPerformed(evt);
            }
        });
        jPanel5.add(price_unit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 680, 40, 40));

        unit4.setEditable(false);
        unit4.setBackground(new java.awt.Color(0, 153, 255));
        unit4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit4.setForeground(new java.awt.Color(0, 0, 0));
        unit4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit4.setBorder(null);
        unit4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit4ActionPerformed(evt);
            }
        });
        jPanel5.add(unit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 50, 40));

        prodescrip4.setEditable(false);
        prodescrip4.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip4.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip4.setBorder(null);
        prodescrip4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(prodescrip4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 220, 40));

        qunatity4.setEditable(false);
        qunatity4.setBackground(new java.awt.Color(0, 153, 255));
        qunatity4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity4.setForeground(new java.awt.Color(0, 0, 0));
        qunatity4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity4.setBorder(null);
        qunatity4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(qunatity4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 120, 40));

        priceunit4.setEditable(false);
        priceunit4.setBackground(new java.awt.Color(0, 153, 255));
        priceunit4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit4.setForeground(new java.awt.Color(0, 0, 0));
        priceunit4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit4.setBorder(null);
        priceunit4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(priceunit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 160, 40));

        jScrollPane11.setBackground(new java.awt.Color(0, 153, 255));

        description4.setEditable(false);
        description4.setBackground(new java.awt.Color(0, 153, 255));
        description4.setColumns(20);
        description4.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description4.setForeground(new java.awt.Color(0, 0, 0));
        description4.setLineWrap(true);
        description4.setRows(5);
        description4.setTabSize(5);
        description4.setWrapStyleWord(true);
        description4.setBorder(null);
        description4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane11.setViewportView(description4);

        jPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 780, 430, 180));

        product2.setEditable(false);
        product2.setBackground(new java.awt.Color(0, 153, 255));
        product2.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product2.setForeground(new java.awt.Color(0, 0, 0));
        product2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product2.setBorder(null);
        product2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product2ActionPerformed(evt);
            }
        });
        jPanel5.add(product2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 240, 40));

        productname3.setEditable(false);
        productname3.setBackground(new java.awt.Color(0, 153, 255));
        productname3.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname3.setForeground(new java.awt.Color(0, 0, 0));
        productname3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname3.setBorder(null);
        productname3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(productname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 160, 40));

        product6.setEditable(false);
        product6.setBackground(new java.awt.Color(0, 153, 255));
        product6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product6.setForeground(new java.awt.Color(0, 0, 0));
        product6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product6.setBorder(null);
        product6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product6ActionPerformed(evt);
            }
        });
        jPanel5.add(product6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 240, 40));

        productname4.setEditable(false);
        productname4.setBackground(new java.awt.Color(0, 153, 255));
        productname4.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname4.setForeground(new java.awt.Color(0, 0, 0));
        productname4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname4.setBorder(null);
        productname4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(productname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 170, 40));

        buy3.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy3.setForeground(new java.awt.Color(0, 0, 0));
        buy3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy3MouseClicked(evt);
            }
        });
        jPanel5.add(buy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 90, 50));

        buy4.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy4.setForeground(new java.awt.Color(0, 0, 0));
        buy4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy4MouseClicked(evt);
            }
        });
        jPanel5.add(buy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, 90, 50));

        tab3.setViewportView(jPanel5);

        jTabbedPane1.addTab("tab3", tab3);

        tab4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(1130, 1051));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product5.setBackground(new java.awt.Color(0, 153, 255));
        display_product5.setOpaque(true);
        jPanel7.add(display_product5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 250));

        number5.setEditable(false);
        number5.setBackground(new java.awt.Color(0, 153, 255));
        number5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number5.setForeground(new java.awt.Color(0, 0, 0));
        number5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number5.setBorder(null);
        number5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(number5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 40, 40));

        price5.setEditable(false);
        price5.setBackground(new java.awt.Color(0, 153, 255));
        price5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price5.setForeground(new java.awt.Color(0, 0, 0));
        price5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price5.setBorder(null);
        price5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price5ActionPerformed(evt);
            }
        });
        jPanel7.add(price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 50, 40));

        price_unit5.setEditable(false);
        price_unit5.setBackground(new java.awt.Color(0, 153, 255));
        price_unit5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit5.setForeground(new java.awt.Color(0, 0, 0));
        price_unit5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit5.setBorder(null);
        price_unit5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit5ActionPerformed(evt);
            }
        });
        jPanel7.add(price_unit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 40, 40));

        unit5.setEditable(false);
        unit5.setBackground(new java.awt.Color(0, 153, 255));
        unit5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit5.setForeground(new java.awt.Color(0, 0, 0));
        unit5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit5.setBorder(null);
        unit5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit5ActionPerformed(evt);
            }
        });
        jPanel7.add(unit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 50, 40));

        prodescrip5.setEditable(false);
        prodescrip5.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip5.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip5.setBorder(null);
        prodescrip5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(prodescrip5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 40));

        qunatity5.setEditable(false);
        qunatity5.setBackground(new java.awt.Color(0, 153, 255));
        qunatity5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity5.setForeground(new java.awt.Color(0, 0, 0));
        qunatity5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity5.setBorder(null);
        qunatity5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(qunatity5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 120, 40));

        priceunit5.setEditable(false);
        priceunit5.setBackground(new java.awt.Color(0, 153, 255));
        priceunit5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit5.setForeground(new java.awt.Color(0, 0, 0));
        priceunit5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit5.setBorder(null);
        priceunit5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(priceunit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 40));

        jScrollPane12.setBackground(new java.awt.Color(0, 153, 255));

        description5.setEditable(false);
        description5.setBackground(new java.awt.Color(0, 153, 255));
        description5.setColumns(20);
        description5.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description5.setForeground(new java.awt.Color(0, 0, 0));
        description5.setLineWrap(true);
        description5.setRows(5);
        description5.setTabSize(5);
        description5.setWrapStyleWord(true);
        description5.setBorder(null);
        description5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane12.setViewportView(description5);

        jPanel7.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 420, 160));

        display_product6.setBackground(new java.awt.Color(0, 153, 255));
        display_product6.setOpaque(true);
        jPanel7.add(display_product6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 250, 250));

        number6.setEditable(false);
        number6.setBackground(new java.awt.Color(0, 153, 255));
        number6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number6.setForeground(new java.awt.Color(0, 0, 0));
        number6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number6.setBorder(null);
        number6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(number6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 40, 40));

        price6.setEditable(false);
        price6.setBackground(new java.awt.Color(0, 153, 255));
        price6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price6.setForeground(new java.awt.Color(0, 0, 0));
        price6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price6.setBorder(null);
        price6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price6ActionPerformed(evt);
            }
        });
        jPanel7.add(price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 50, 40));

        price_unit6.setEditable(false);
        price_unit6.setBackground(new java.awt.Color(0, 153, 255));
        price_unit6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit6.setForeground(new java.awt.Color(0, 0, 0));
        price_unit6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit6.setBorder(null);
        price_unit6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit6ActionPerformed(evt);
            }
        });
        jPanel7.add(price_unit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 40, 40));

        unit6.setEditable(false);
        unit6.setBackground(new java.awt.Color(0, 153, 255));
        unit6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit6.setForeground(new java.awt.Color(0, 0, 0));
        unit6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit6.setBorder(null);
        unit6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit6ActionPerformed(evt);
            }
        });
        jPanel7.add(unit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 50, 40));

        prodescrip6.setEditable(false);
        prodescrip6.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip6.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip6.setBorder(null);
        prodescrip6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(prodescrip6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 220, 40));

        qunatity6.setEditable(false);
        qunatity6.setBackground(new java.awt.Color(0, 153, 255));
        qunatity6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity6.setForeground(new java.awt.Color(0, 0, 0));
        qunatity6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity6.setBorder(null);
        qunatity6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(qunatity6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 120, 40));

        priceunit6.setEditable(false);
        priceunit6.setBackground(new java.awt.Color(0, 153, 255));
        priceunit6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit6.setForeground(new java.awt.Color(0, 0, 0));
        priceunit6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit6.setBorder(null);
        priceunit6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(priceunit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 160, 40));

        jScrollPane13.setBackground(new java.awt.Color(0, 153, 255));
        jScrollPane13.setForeground(new java.awt.Color(0, 0, 0));

        description6.setEditable(false);
        description6.setBackground(new java.awt.Color(0, 153, 255));
        description6.setColumns(20);
        description6.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description6.setForeground(new java.awt.Color(0, 0, 0));
        description6.setLineWrap(true);
        description6.setRows(5);
        description6.setTabSize(5);
        description6.setWrapStyleWord(true);
        description6.setBorder(null);
        description6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane13.setViewportView(description6);

        jPanel7.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 740, 390, 170));

        product8.setEditable(false);
        product8.setBackground(new java.awt.Color(0, 153, 255));
        product8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product8.setForeground(new java.awt.Color(0, 0, 0));
        product8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product8.setBorder(null);
        product8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product8ActionPerformed(evt);
            }
        });
        jPanel7.add(product8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 40));

        productname5.setEditable(false);
        productname5.setBackground(new java.awt.Color(0, 153, 255));
        productname5.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname5.setForeground(new java.awt.Color(0, 0, 0));
        productname5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname5.setBorder(null);
        productname5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(productname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, 40));

        product9.setEditable(false);
        product9.setBackground(new java.awt.Color(0, 153, 255));
        product9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product9.setForeground(new java.awt.Color(0, 0, 0));
        product9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product9.setBorder(null);
        product9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product9ActionPerformed(evt);
            }
        });
        jPanel7.add(product9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 210, 40));

        productname6.setEditable(false);
        productname6.setBackground(new java.awt.Color(0, 153, 255));
        productname6.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname6.setForeground(new java.awt.Color(0, 0, 0));
        productname6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname6.setBorder(null);
        productname6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(productname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 160, 40));

        buy5.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy5.setForeground(new java.awt.Color(0, 0, 0));
        buy5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buy5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy5MouseClicked(evt);
            }
        });
        jPanel7.add(buy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 110, 60));

        buy6.setFont(new java.awt.Font("The Bold Font", 0, 48)); // NOI18N
        buy6.setForeground(new java.awt.Color(0, 0, 0));
        buy6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buy6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy6MouseClicked(evt);
            }
        });
        jPanel7.add(buy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 110, 60));

        tab4.setViewportView(jPanel7);

        jTabbedPane1.addTab("tab4", tab4);

        tab5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel8.setBackground(new java.awt.Color(0, 153, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(1130, 1051));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product7.setBackground(new java.awt.Color(0, 153, 255));
        display_product7.setForeground(new java.awt.Color(0, 0, 0));
        display_product7.setOpaque(true);
        jPanel8.add(display_product7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 250));

        number7.setEditable(false);
        number7.setBackground(new java.awt.Color(0, 153, 255));
        number7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number7.setForeground(new java.awt.Color(0, 0, 0));
        number7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number7.setBorder(null);
        number7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(number7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 40, 40));

        price7.setEditable(false);
        price7.setBackground(new java.awt.Color(0, 153, 255));
        price7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price7.setForeground(new java.awt.Color(0, 0, 0));
        price7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price7.setBorder(null);
        price7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price7ActionPerformed(evt);
            }
        });
        jPanel8.add(price7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 50, 40));

        price_unit7.setEditable(false);
        price_unit7.setBackground(new java.awt.Color(0, 153, 255));
        price_unit7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit7.setForeground(new java.awt.Color(0, 0, 0));
        price_unit7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit7.setBorder(null);
        price_unit7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit7ActionPerformed(evt);
            }
        });
        jPanel8.add(price_unit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 40, 40));

        unit7.setEditable(false);
        unit7.setBackground(new java.awt.Color(0, 153, 255));
        unit7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit7.setForeground(new java.awt.Color(0, 0, 0));
        unit7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit7.setBorder(null);
        unit7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit7ActionPerformed(evt);
            }
        });
        jPanel8.add(unit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 50, 40));

        prodescrip7.setEditable(false);
        prodescrip7.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip7.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip7.setBorder(null);
        prodescrip7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(prodescrip7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 40));

        qunatity7.setEditable(false);
        qunatity7.setBackground(new java.awt.Color(0, 153, 255));
        qunatity7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity7.setForeground(new java.awt.Color(0, 0, 0));
        qunatity7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity7.setBorder(null);
        qunatity7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(qunatity7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 120, 40));

        priceunit7.setEditable(false);
        priceunit7.setBackground(new java.awt.Color(0, 153, 255));
        priceunit7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit7.setForeground(new java.awt.Color(0, 0, 0));
        priceunit7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit7.setBorder(null);
        priceunit7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(priceunit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 40));

        buy7.setEditable(false);
        buy7.setBackground(new java.awt.Color(0, 153, 255));
        buy7.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        buy7.setForeground(new java.awt.Color(0, 0, 0));
        buy7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buy7.setBorder(null);
        buy7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy7ActionPerformed(evt);
            }
        });
        jPanel8.add(buy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 90, 50));

        jScrollPane14.setBackground(new java.awt.Color(0, 153, 255));
        jScrollPane14.setForeground(new java.awt.Color(0, 0, 0));

        description7.setEditable(false);
        description7.setBackground(new java.awt.Color(0, 153, 255));
        description7.setColumns(20);
        description7.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description7.setForeground(new java.awt.Color(0, 0, 0));
        description7.setLineWrap(true);
        description7.setRows(5);
        description7.setTabSize(5);
        description7.setBorder(null);
        description7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane14.setViewportView(description7);

        jPanel8.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 270, 190));

        display_product8.setBackground(new java.awt.Color(0, 153, 255));
        display_product8.setForeground(new java.awt.Color(0, 0, 0));
        display_product8.setOpaque(true);
        jPanel8.add(display_product8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 250, 250));

        number8.setEditable(false);
        number8.setBackground(new java.awt.Color(0, 153, 255));
        number8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number8.setForeground(new java.awt.Color(0, 0, 0));
        number8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number8.setBorder(null);
        number8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(number8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 40, 40));

        price8.setEditable(false);
        price8.setBackground(new java.awt.Color(0, 153, 255));
        price8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price8.setForeground(new java.awt.Color(0, 0, 0));
        price8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price8.setBorder(null);
        price8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price8ActionPerformed(evt);
            }
        });
        jPanel8.add(price8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 50, 40));

        price_unit8.setEditable(false);
        price_unit8.setBackground(new java.awt.Color(0, 153, 255));
        price_unit8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit8.setForeground(new java.awt.Color(0, 0, 0));
        price_unit8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit8.setBorder(null);
        price_unit8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit8ActionPerformed(evt);
            }
        });
        jPanel8.add(price_unit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 40, 40));

        unit8.setEditable(false);
        unit8.setBackground(new java.awt.Color(0, 153, 255));
        unit8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit8.setForeground(new java.awt.Color(0, 0, 0));
        unit8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit8.setBorder(null);
        unit8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit8ActionPerformed(evt);
            }
        });
        jPanel8.add(unit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 50, 40));

        prodescrip8.setEditable(false);
        prodescrip8.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip8.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip8.setBorder(null);
        prodescrip8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(prodescrip8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 220, 40));

        qunatity8.setEditable(false);
        qunatity8.setBackground(new java.awt.Color(0, 153, 255));
        qunatity8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity8.setForeground(new java.awt.Color(0, 0, 0));
        qunatity8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity8.setBorder(null);
        qunatity8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(qunatity8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 120, 40));

        priceunit8.setEditable(false);
        priceunit8.setBackground(new java.awt.Color(0, 153, 255));
        priceunit8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit8.setForeground(new java.awt.Color(0, 0, 0));
        priceunit8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit8.setBorder(null);
        priceunit8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(priceunit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 160, 40));

        buy8.setEditable(false);
        buy8.setBackground(new java.awt.Color(0, 153, 255));
        buy8.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        buy8.setForeground(new java.awt.Color(0, 0, 0));
        buy8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buy8.setBorder(null);
        buy8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy8ActionPerformed(evt);
            }
        });
        jPanel8.add(buy8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 90, 50));

        jScrollPane15.setBackground(new java.awt.Color(0, 153, 255));
        jScrollPane15.setForeground(new java.awt.Color(0, 0, 0));

        description8.setEditable(false);
        description8.setBackground(new java.awt.Color(0, 153, 255));
        description8.setColumns(20);
        description8.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description8.setLineWrap(true);
        description8.setRows(5);
        description8.setTabSize(5);
        description8.setBorder(null);
        description8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane15.setViewportView(description8);

        jPanel8.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 740, 260, 240));

        product10.setEditable(false);
        product10.setBackground(new java.awt.Color(0, 153, 255));
        product10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product10.setForeground(new java.awt.Color(0, 0, 0));
        product10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product10.setBorder(null);
        product10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product10ActionPerformed(evt);
            }
        });
        jPanel8.add(product10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 40));

        productname7.setEditable(false);
        productname7.setBackground(new java.awt.Color(0, 153, 255));
        productname7.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname7.setForeground(new java.awt.Color(0, 0, 0));
        productname7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname7.setBorder(null);
        productname7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(productname7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, 40));

        product11.setEditable(false);
        product11.setBackground(new java.awt.Color(0, 153, 255));
        product11.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product11.setForeground(new java.awt.Color(0, 0, 0));
        product11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product11.setBorder(null);
        product11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product11ActionPerformed(evt);
            }
        });
        jPanel8.add(product11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 210, 40));

        productname8.setEditable(false);
        productname8.setBackground(new java.awt.Color(0, 153, 255));
        productname8.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname8.setForeground(new java.awt.Color(0, 0, 0));
        productname8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname8.setBorder(null);
        productname8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(productname8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 160, 40));

        tab5.setViewportView(jPanel8);

        jTabbedPane1.addTab("tab5", tab5);

        tab6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel9.setBackground(new java.awt.Color(0, 153, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(1130, 1051));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_product9.setBackground(new java.awt.Color(0, 153, 255));
        display_product9.setOpaque(true);
        jPanel9.add(display_product9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 250));

        number9.setEditable(false);
        number9.setBackground(new java.awt.Color(0, 153, 255));
        number9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number9.setForeground(new java.awt.Color(0, 0, 0));
        number9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number9.setBorder(null);
        number9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(number9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 40, 40));

        price9.setEditable(false);
        price9.setBackground(new java.awt.Color(0, 153, 255));
        price9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price9.setForeground(new java.awt.Color(0, 0, 0));
        price9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price9.setBorder(null);
        price9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price9ActionPerformed(evt);
            }
        });
        jPanel9.add(price9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 50, 40));

        price_unit9.setEditable(false);
        price_unit9.setBackground(new java.awt.Color(0, 153, 255));
        price_unit9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit9.setForeground(new java.awt.Color(0, 0, 0));
        price_unit9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit9.setBorder(null);
        price_unit9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit9ActionPerformed(evt);
            }
        });
        jPanel9.add(price_unit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 40, 40));

        unit9.setEditable(false);
        unit9.setBackground(new java.awt.Color(0, 153, 255));
        unit9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit9.setForeground(new java.awt.Color(0, 0, 0));
        unit9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit9.setBorder(null);
        unit9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit9ActionPerformed(evt);
            }
        });
        jPanel9.add(unit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 60, 40));

        prodescrip9.setEditable(false);
        prodescrip9.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip9.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip9.setBorder(null);
        prodescrip9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(prodescrip9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 40));

        qunatity9.setEditable(false);
        qunatity9.setBackground(new java.awt.Color(0, 153, 255));
        qunatity9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity9.setForeground(new java.awt.Color(0, 0, 0));
        qunatity9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity9.setBorder(null);
        qunatity9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(qunatity9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 120, 40));

        priceunit9.setEditable(false);
        priceunit9.setBackground(new java.awt.Color(0, 153, 255));
        priceunit9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit9.setForeground(new java.awt.Color(0, 0, 0));
        priceunit9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit9.setBorder(null);
        priceunit9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(priceunit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 40));

        buy9.setEditable(false);
        buy9.setBackground(new java.awt.Color(0, 153, 255));
        buy9.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        buy9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buy9.setBorder(null);
        buy9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy9ActionPerformed(evt);
            }
        });
        jPanel9.add(buy9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 90, 50));

        jScrollPane16.setBackground(new java.awt.Color(0, 153, 255));

        description9.setEditable(false);
        description9.setBackground(new java.awt.Color(0, 153, 255));
        description9.setColumns(20);
        description9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description9.setForeground(new java.awt.Color(0, 0, 0));
        description9.setLineWrap(true);
        description9.setRows(5);
        description9.setTabSize(5);
        description9.setBorder(null);
        description9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane16.setViewportView(description9);

        jPanel9.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 340, 190));

        display_product10.setBackground(new java.awt.Color(0, 153, 255));
        display_product10.setOpaque(true);
        jPanel9.add(display_product10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 250, 250));

        number10.setEditable(false);
        number10.setBackground(new java.awt.Color(0, 153, 255));
        number10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        number10.setForeground(new java.awt.Color(0, 0, 0));
        number10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number10.setBorder(null);
        number10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(number10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 40, 40));

        price10.setEditable(false);
        price10.setBackground(new java.awt.Color(0, 153, 255));
        price10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price10.setForeground(new java.awt.Color(0, 0, 0));
        price10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price10.setBorder(null);
        price10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price10ActionPerformed(evt);
            }
        });
        jPanel9.add(price10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 50, 40));

        price_unit10.setEditable(false);
        price_unit10.setBackground(new java.awt.Color(0, 153, 255));
        price_unit10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        price_unit10.setForeground(new java.awt.Color(0, 0, 0));
        price_unit10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        price_unit10.setBorder(null);
        price_unit10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price_unit10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_unit10ActionPerformed(evt);
            }
        });
        jPanel9.add(price_unit10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 40, 40));

        unit10.setEditable(false);
        unit10.setBackground(new java.awt.Color(0, 153, 255));
        unit10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        unit10.setForeground(new java.awt.Color(0, 0, 0));
        unit10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        unit10.setBorder(null);
        unit10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unit10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit10ActionPerformed(evt);
            }
        });
        jPanel9.add(unit10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 60, 40));

        prodescrip10.setEditable(false);
        prodescrip10.setBackground(new java.awt.Color(0, 153, 255));
        prodescrip10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        prodescrip10.setForeground(new java.awt.Color(0, 0, 0));
        prodescrip10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prodescrip10.setBorder(null);
        prodescrip10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(prodescrip10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 220, 40));

        qunatity10.setEditable(false);
        qunatity10.setBackground(new java.awt.Color(0, 153, 255));
        qunatity10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        qunatity10.setForeground(new java.awt.Color(0, 0, 0));
        qunatity10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        qunatity10.setBorder(null);
        qunatity10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(qunatity10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 120, 40));

        priceunit10.setEditable(false);
        priceunit10.setBackground(new java.awt.Color(0, 153, 255));
        priceunit10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        priceunit10.setForeground(new java.awt.Color(0, 0, 0));
        priceunit10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceunit10.setBorder(null);
        priceunit10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(priceunit10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 160, 40));

        buy10.setEditable(false);
        buy10.setBackground(new java.awt.Color(0, 153, 255));
        buy10.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        buy10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buy10.setBorder(null);
        buy10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy10ActionPerformed(evt);
            }
        });
        jPanel9.add(buy10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 90, 50));

        jScrollPane17.setBackground(new java.awt.Color(0, 153, 255));

        description10.setEditable(false);
        description10.setBackground(new java.awt.Color(0, 153, 255));
        description10.setColumns(20);
        description10.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        description10.setForeground(new java.awt.Color(0, 0, 0));
        description10.setLineWrap(true);
        description10.setRows(5);
        description10.setTabSize(5);
        description10.setBorder(null);
        description10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane17.setViewportView(description10);

        jPanel9.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 740, 340, 190));

        product12.setEditable(false);
        product12.setBackground(new java.awt.Color(0, 153, 255));
        product12.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product12.setForeground(new java.awt.Color(0, 0, 0));
        product12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product12.setBorder(null);
        product12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product12ActionPerformed(evt);
            }
        });
        jPanel9.add(product12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 40));

        productname9.setEditable(false);
        productname9.setBackground(new java.awt.Color(0, 153, 255));
        productname9.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname9.setForeground(new java.awt.Color(0, 0, 0));
        productname9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname9.setBorder(null);
        productname9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(productname9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, 40));

        product13.setEditable(false);
        product13.setBackground(new java.awt.Color(0, 153, 255));
        product13.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        product13.setForeground(new java.awt.Color(0, 0, 0));
        product13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product13.setBorder(null);
        product13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product13ActionPerformed(evt);
            }
        });
        jPanel9.add(product13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 210, 40));

        productname10.setEditable(false);
        productname10.setBackground(new java.awt.Color(0, 153, 255));
        productname10.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        productname10.setForeground(new java.awt.Color(0, 0, 0));
        productname10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        productname10.setBorder(null);
        productname10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(productname10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 160, 40));

        tab6.setViewportView(jPanel9);

        jTabbedPane1.addTab("tab6", tab6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1120, 570));

        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 1170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Dasboard DB = new Dasboard();
        DB.show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pestbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestbtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_pestbtnMouseClicked

    private void seedsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seedsbtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);           
    }//GEN-LAST:event_seedsbtnMouseClicked

    private void fruitsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsbtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_fruitsbtnMouseClicked

    private void vegetablebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablebtnMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        
    }//GEN-LAST:event_vegetablebtnMouseClicked

    private void search_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_proActionPerformed
        // TODO add your handling code here:
        
        try {
            String Quantity,Price_per_unit,Product_description,Price1,Quantity1;
            Quantity = "Quantity :";
            Price_per_unit = "Price Per Unit :";
            Product_description = "Product Description :";
            
            search_product_user.func f = new search_product_user.func();             // object creation of function
            rs = f.find(search.getText());                                         //passing the value to search
            if(rs.next()){                                                           //searching and displaying the data from database
                byte[] img = rs.getBytes("photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(display_product.getWidth(), display_product.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                display_product.setIcon(newImage);
                product.setText("Product Name :" + search.getText());
                Quantity1 = rs.getString("quatity");
                number.setText(Quantity1);
                unit.setText(rs.getString("unit"));
                Price1 = rs.getString("price_per_unit");
                price.setText(Price1);
                price_unit.setText(rs.getString("price_unit"));
               description.setText(rs.getString( "pro_descrip"));
               qunatity.setText(Quantity);
               priceunit.setText(Price_per_unit);
               prodescrip.setText(Product_description);
               buy.setText("BUY");
               int q1 = Integer.parseInt(Quantity1);
            int p1 = Integer.parseInt(Price1);
            TotalPricei7 = q1*p1;
            TotalPrices7 = String.valueOf(TotalPricei7);
            }else{
                JOptionPane.showMessageDialog(null, "Product Not Found!");
            }
        }catch (SQLException ex) { 
                Logger.getLogger(search_product_user.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }//GEN-LAST:event_search_proActionPerformed

    private void search_proKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_proKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_proKeyPressed

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        // TODO add your handling code here:
        if(search.getText().equals("Search For Products")){                    // for place placeholder in the text field
            search.setText("");                                                
            search.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_searchFocusGained

    private void searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusLost
        // TODO add your handling code here:
         if(search.getText().equals("")){
            search.setText("Search For Products");
            search.setForeground(new Color(153,153,153));
    }
    }//GEN-LAST:event_searchFocusLost

    private void unit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit2ActionPerformed

    private void price_unit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit2ActionPerformed

    private void price2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price2ActionPerformed

    private void unit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit1ActionPerformed

    private void price_unit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit1ActionPerformed

    private void price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price1ActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void price_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unitActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void price3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price3ActionPerformed

    private void price_unit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit3ActionPerformed

    private void unit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit3ActionPerformed

    private void price4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price4ActionPerformed

    private void price_unit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit4ActionPerformed

    private void unit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit4ActionPerformed

    private void price5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price5ActionPerformed

    private void price_unit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit5ActionPerformed

    private void unit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit5ActionPerformed

    private void price6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price6ActionPerformed

    private void price_unit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit6ActionPerformed

    private void unit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit6ActionPerformed

    private void price7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price7ActionPerformed

    private void price_unit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit7ActionPerformed

    private void unit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit7ActionPerformed

    private void price8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price8ActionPerformed

    private void price_unit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit8ActionPerformed

    private void unit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit8ActionPerformed

    private void price9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price9ActionPerformed

    private void price_unit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit9ActionPerformed

    private void unit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit9ActionPerformed

    private void price10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price10ActionPerformed

    private void price_unit10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_unit10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_unit10ActionPerformed

    private void unit10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unit10ActionPerformed

    private void product1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product1ActionPerformed

    private void product7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product7ActionPerformed

    private void product2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product2ActionPerformed

    private void product6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product6ActionPerformed

    private void product8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product8ActionPerformed

    private void product9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product9ActionPerformed

    private void product10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product10ActionPerformed

    private void product11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product11ActionPerformed

    private void product12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product12ActionPerformed

    private void product13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product13ActionPerformed

    private void buy8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buy8ActionPerformed

    private void buy7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buy7ActionPerformed

    private void buy10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buy10ActionPerformed

    private void buy9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buy9ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void buyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyMouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText(product.getText());
        pb.quantity.setText(number.getText());
        pb.payment_unit.setText(unit.getText());
        pb.price.setText(TotalPrices7);
       
        pb.show();
        dispose();
    }//GEN-LAST:event_buyMouseClicked

    private void buy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy1MouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText("Product Name :" + product1.getText());
        pb.quantity.setText(number1.getText());
        pb.payment_unit.setText(unit1.getText());
        pb.price.setText(TotalPrices1);
       
        pb.show();
        dispose();
    }//GEN-LAST:event_buy1MouseClicked

    private void buy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy2MouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText("Product Name :" + product7.getText());
        pb.quantity.setText(number2.getText());
        pb.payment_unit.setText(unit2.getText());
        pb.price.setText(TotalPrices2);
       
        pb.show();
        dispose();
    }//GEN-LAST:event_buy2MouseClicked

    private void buy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy3MouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText("Product Name :" + product2.getText());
        pb.quantity.setText(number3.getText());
        pb.payment_unit.setText(unit3.getText());
        pb.price.setText(TotalPrices3);
        
        pb.show();
        dispose();
    }//GEN-LAST:event_buy3MouseClicked

    private void buy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy4MouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText("Product Name :" + product6.getText());
        pb.quantity.setText(number4.getText());
        pb.payment_unit.setText(unit4.getText());
        pb.price.setText(TotalPrices4);
       
        pb.show();
        dispose();
    }//GEN-LAST:event_buy4MouseClicked

    private void buy5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy5MouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText("Product Name :" + product8.getText());
        pb.quantity.setText(number5.getText());
        pb.payment_unit.setText(unit5.getText());
        pb.price.setText(TotalPrices5);
       
        pb.show();
        dispose();
    }//GEN-LAST:event_buy5MouseClicked

    private void buy6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy6MouseClicked
        // TODO add your handling code here:
        payment_boxf pb = new payment_boxf();
        pb.productname.setText("Product Name :" + product9.getText());
        pb.quantity.setText(number6.getText());
        pb.payment_unit.setText(unit6.getText());
        pb.price.setText(TotalPrices6);
      
        pb.show();
        dispose();
    }//GEN-LAST:event_buy6MouseClicked

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
            java.util.logging.Logger.getLogger(search_product_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_product_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_product_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_product_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_product_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buy;
    private javax.swing.JLabel buy1;
    private javax.swing.JTextField buy10;
    private javax.swing.JLabel buy2;
    private javax.swing.JLabel buy3;
    private javax.swing.JLabel buy4;
    private javax.swing.JLabel buy5;
    private javax.swing.JLabel buy6;
    private javax.swing.JTextField buy7;
    private javax.swing.JTextField buy8;
    private javax.swing.JTextField buy9;
    private javax.swing.JTextArea description;
    private javax.swing.JTextArea description1;
    private javax.swing.JTextArea description10;
    private javax.swing.JTextArea description2;
    private javax.swing.JTextArea description3;
    private javax.swing.JTextArea description4;
    private javax.swing.JTextArea description5;
    private javax.swing.JTextArea description6;
    private javax.swing.JTextArea description7;
    private javax.swing.JTextArea description8;
    private javax.swing.JTextArea description9;
    private javax.swing.JLabel display_product;
    private javax.swing.JLabel display_product1;
    private javax.swing.JLabel display_product10;
    private javax.swing.JLabel display_product2;
    private javax.swing.JLabel display_product3;
    private javax.swing.JLabel display_product4;
    private javax.swing.JLabel display_product5;
    private javax.swing.JLabel display_product6;
    private javax.swing.JLabel display_product7;
    private javax.swing.JLabel display_product8;
    private javax.swing.JLabel display_product9;
    private javax.swing.JLabel fruitsbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField number;
    private javax.swing.JTextField number1;
    private javax.swing.JTextField number10;
    private javax.swing.JTextField number2;
    private javax.swing.JTextField number3;
    private javax.swing.JTextField number4;
    private javax.swing.JTextField number5;
    private javax.swing.JTextField number6;
    private javax.swing.JTextField number7;
    private javax.swing.JTextField number8;
    private javax.swing.JTextField number9;
    private javax.swing.JLabel pestbtn;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField price10;
    private javax.swing.JTextField price2;
    private javax.swing.JTextField price3;
    private javax.swing.JTextField price4;
    private javax.swing.JTextField price5;
    private javax.swing.JTextField price6;
    private javax.swing.JTextField price7;
    private javax.swing.JTextField price8;
    private javax.swing.JTextField price9;
    private javax.swing.JTextField price_unit;
    private javax.swing.JTextField price_unit1;
    private javax.swing.JTextField price_unit10;
    private javax.swing.JTextField price_unit2;
    private javax.swing.JTextField price_unit3;
    private javax.swing.JTextField price_unit4;
    private javax.swing.JTextField price_unit5;
    private javax.swing.JTextField price_unit6;
    private javax.swing.JTextField price_unit7;
    private javax.swing.JTextField price_unit8;
    private javax.swing.JTextField price_unit9;
    private javax.swing.JTextField priceunit;
    private javax.swing.JTextField priceunit1;
    private javax.swing.JTextField priceunit10;
    private javax.swing.JTextField priceunit2;
    private javax.swing.JTextField priceunit3;
    private javax.swing.JTextField priceunit4;
    private javax.swing.JTextField priceunit5;
    private javax.swing.JTextField priceunit6;
    private javax.swing.JTextField priceunit7;
    private javax.swing.JTextField priceunit8;
    private javax.swing.JTextField priceunit9;
    private javax.swing.JTextField prodescrip;
    private javax.swing.JTextField prodescrip1;
    private javax.swing.JTextField prodescrip10;
    private javax.swing.JTextField prodescrip2;
    private javax.swing.JTextField prodescrip3;
    private javax.swing.JTextField prodescrip4;
    private javax.swing.JTextField prodescrip5;
    private javax.swing.JTextField prodescrip6;
    private javax.swing.JTextField prodescrip7;
    private javax.swing.JTextField prodescrip8;
    private javax.swing.JTextField prodescrip9;
    private javax.swing.JTextField product;
    private javax.swing.JTextField product1;
    private javax.swing.JTextField product10;
    private javax.swing.JTextField product11;
    private javax.swing.JTextField product12;
    private javax.swing.JTextField product13;
    private javax.swing.JTextField product2;
    private javax.swing.JTextField product6;
    private javax.swing.JTextField product7;
    private javax.swing.JTextField product8;
    private javax.swing.JTextField product9;
    private javax.swing.JTextField productname1;
    private javax.swing.JTextField productname10;
    private javax.swing.JTextField productname2;
    private javax.swing.JTextField productname3;
    private javax.swing.JTextField productname4;
    private javax.swing.JTextField productname5;
    private javax.swing.JTextField productname6;
    private javax.swing.JTextField productname7;
    private javax.swing.JTextField productname8;
    private javax.swing.JTextField productname9;
    private javax.swing.JTextField qunatity;
    private javax.swing.JTextField qunatity1;
    private javax.swing.JTextField qunatity10;
    private javax.swing.JTextField qunatity2;
    private javax.swing.JTextField qunatity3;
    private javax.swing.JTextField qunatity4;
    private javax.swing.JTextField qunatity5;
    private javax.swing.JTextField qunatity6;
    private javax.swing.JTextField qunatity7;
    private javax.swing.JTextField qunatity8;
    private javax.swing.JTextField qunatity9;
    private javax.swing.JTextField search;
    private javax.swing.JButton search_pro;
    private javax.swing.JLabel seedsbtn;
    private javax.swing.JScrollPane tab2;
    private javax.swing.JScrollPane tab3;
    private javax.swing.JScrollPane tab4;
    private javax.swing.JScrollPane tab5;
    private javax.swing.JScrollPane tab6;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField unit1;
    private javax.swing.JTextField unit10;
    private javax.swing.JTextField unit2;
    private javax.swing.JTextField unit3;
    private javax.swing.JTextField unit4;
    private javax.swing.JTextField unit5;
    private javax.swing.JTextField unit6;
    private javax.swing.JTextField unit7;
    private javax.swing.JTextField unit8;
    private javax.swing.JTextField unit9;
    private javax.swing.JLabel vegetablebtn;
    // End of variables declaration//GEN-END:variables
}

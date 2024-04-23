package alumni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;

public class UserThree implements ActionListener, Runnable {

    JTextField text;
    JPanel a1;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream dout;

    BufferedReader reader;
    BufferedWriter writer;
    String name = "Student";

    UserThree() {

        f.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 102, 102));
        p1.setBounds(0, 0, 450, 70); //sets the size of green box
        p1.setLayout(null);
        f.add(p1); //makes the green part above  lines

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatpics/3.png")); //usetoload back logo
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25); //sets the size
        p1.add(back); //adds ap logo

        back.addMouseListener(new MouseAdapter() { //used to exit the gui by clicking back button 
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("chatpics/ap2.png")); //usetoload apshah logo
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50); //sets the size
        p1.add(profile); //adds ap logo

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("chatpics/video.png")); //usetoload video logo
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30); //sets the size
        p1.add(video); //adds videp logo

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("chatpics/phone.png")); //usetoload call logo
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(360, 20, 30, 30); //sets the size
        p1.add(phone); //adds call logo

        JLabel status = new JLabel("STUDENT"); //text of apshah
        status.setBounds(110, 25, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(status);

        a1 = new JPanel(); //makes chat section input bar
        a1.setBounds(5, 75, 440, 570);
                a1.setBackground(Color.WHITE);
        f.add(a1);

        text = new JTextField(); //adds txt fields
        text.setBounds(5, 655, 310, 40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(text);

        JButton send = new JButton("SEND"); //send button
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(0, 102, 102));
        send.setForeground(Color.WHITE);
        send.addActionListener(this); //action perfromed when send button is clicked
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(send);

        f.setSize(450, 700); //setsframesize
        f.setLocation(950, 50);
        f.setUndecorated(true); //removes the upper part of frame 
        f.getContentPane().setBackground(Color.WHITE); //sets background color of chat

        f.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 2003);
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String out = "<html><p>"+ name + "</p><p>" +text.getText() +"</p></html>";

            JPanel p2 = formatLabel(out);
            a1.setLayout(new BorderLayout()); //borrderlayout sets elemets top bottom left right centre 

            JPanel right = new JPanel(new BorderLayout());
                        right.setBackground(Color.WHITE);

            right.add(p2, BorderLayout.LINE_END); //above 2 lined aligns the msg in vertical side at end 
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15)); //creates space bw 2 msg

            a1.add(vertical, BorderLayout.PAGE_START);

            try {
                writer.write(out);
                writer.write("\r\n");
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }

            text.setText(""); //used to empty the i/p bar after clicking send button

            f.repaint();
            f.invalidate();
            f.validate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JPanel formatLabel(String out) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel output = new JLabel(out); //output text 
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(37, 211, 102));
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(0, 15, 0, 50));

        panel.add(output);

        Calendar cal = Calendar.getInstance(); //used to show time 
        SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");

        JLabel time = new JLabel("");
        time.setText(sdf.format(cal.getTime()));

        panel.add(time);

        return panel;
    }

    public void run() {

        try {
            String msg = "";
            while (true) {
                msg = reader.readLine();
                 if(msg.contains(name)){
                    continue;
                }
                
                JPanel panel = formatLabel(msg);

                JPanel left = new JPanel(new BorderLayout());
                left.setBackground(Color.WHITE);
                left.add(panel, BorderLayout.LINE_START);
                vertical.add(left);

                a1.add(vertical, BorderLayout.PAGE_START);

                f.repaint();
                f.invalidate();
                f.validate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserThree three = new UserThree();
        Thread t1 = new Thread(three);
        t1.start();

    }

    void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setLocationRelativeTo(UserOne SERVERFrame) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void someMethod() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

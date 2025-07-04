package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Pinchange extends JFrame implements ActionListener{

    JButton change, back;
    JTextField pin, repin;
    String pinnumber;

    Pinchange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        image.add(text);

        JLabel pintext = new JLabel("New Pin:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Raleway", Font.BOLD, 16));
        pintext.setBounds(165, 320, 180, 35);
        image.add(pintext);

        pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 100, 25);
        image.add(pin);

        JLabel repintext = new JLabel("Re Enter New Pin:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Raleway", Font.BOLD, 16));
        repintext.setBounds(165, 360, 180, 35);
        image.add(repintext);

        repin = new JTextField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(330, 360, 100, 25);
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String npin = pin.getText();
            String rpin = repin.getText();

            if (!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "Entered PIN Does not Match");
                return;
            }

            if (npin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter New PIN");
                return;
            }

            if (rpin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Re-Enter New PIN");
                return;
            }

            Conn conn = new Conn();
            String query1 = "update bank set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
            String query2 = "update login set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
            String query3 = "update signupthree set pin = '" + rpin + "' where pin = '" + pinnumber + "'";

            conn.s.execute(query1);
            conn.s.execute(query2);
            conn.s.execute(query3);

            JOptionPane.showMessageDialog(null, "PIN Changed Successfully");

            setVisible(false);  
             new Transactions(rpin).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }

       
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
    }
    
    public static void main(String args[]) {
      new Pinchange("").setVisible(true);
    }
}
                    


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class Signuptwo extends JFrame implements ActionListener {
    
    long random;
    JTextField religionTextField,incomeTextField,eduTextField,qualTextField,occupationTextField,panTextField,aadharTextField;
    JButton next;
    JRadioButton OC,BC,SC_ST,YES,NO,YESS,NOO;
    JDateChooser dateChooser;
    String formno;
    
    Signuptwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("PAGE 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("RELIGION:");
        religion.setFont(new Font("Raleway",Font.BOLD,22));
        religion.setBounds(100,140,200,30);
        add(religion);
        
        religionTextField = new JTextField();
        religionTextField.setFont(new Font("Raleway",Font.BOLD,14));
        religionTextField.setBounds(310,140,400,30);
        add(religionTextField);
        
        JLabel cateogry = new JLabel("CATEOGRY:");
        cateogry.setFont(new Font("Raleway",Font.BOLD,22));
        cateogry.setBounds(100,190,200,30);
        add(cateogry);
        
        OC = new JRadioButton("OC");
        OC.setBounds(310,190,60,30);
        OC.setBackground(Color.WHITE);
        add(OC);
        
        BC = new JRadioButton("BC");
        BC.setBounds(380,190,60,30);
        BC.setBackground(Color.WHITE);
        add(BC);
        
        SC_ST = new JRadioButton("SC/ST");
        SC_ST.setBounds(450,190,100,30);
        SC_ST.setBackground(Color.WHITE);
        add(SC_ST);
        
        ButtonGroup cateorgygroup = new ButtonGroup();
        cateorgygroup.add(OC);
        cateorgygroup.add(BC);
        cateorgygroup.add(SC_ST);
        
        
        
        JLabel income = new JLabel("INCOME:");
        income.setFont(new Font("Raleway",Font.BOLD,22));
        income.setBounds(100,240,200,30);
        add(income);
        
        incomeTextField = new JTextField();
        incomeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        incomeTextField.setBounds(310,240,400,30);
        add(incomeTextField);
        
        JLabel edu = new JLabel("EDUCATIONAL:");
        edu.setFont(new Font("Raleway",Font.BOLD,22));
        edu.setBounds(100,290,200,30);
        add(edu);
        
        eduTextField = new JTextField();
        eduTextField.setFont(new Font("Raleway",Font.BOLD,14));
        eduTextField.setBounds(310,290,400,30);
        add(eduTextField);
        
        
        
        JLabel qual = new JLabel("QUALIFICATION:");
        qual.setFont(new Font("Raleway",Font.BOLD,22));
        qual.setBounds(100,340,200,30);
        add(qual);
        
        qualTextField = new JTextField();
        qualTextField.setFont(new Font("Raleway",Font.BOLD,14));
        qualTextField.setBounds(310,340,400,30);
        add(qualTextField);
        
        JLabel occupation = new JLabel("OCCUPATION:");
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        occupation.setBounds(100,390,300,30);
        add(occupation);
        
        occupationTextField = new JTextField();
        occupationTextField.setFont(new Font("Raleway",Font.BOLD,14));
        occupationTextField.setBounds(310,390,400,30);
        add(occupationTextField);
        
        
        
        JLabel pan = new JLabel("PAN NUMBER:");
        pan.setFont(new Font("Raleway",Font.BOLD,22));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(310,440,400,30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("AADHAR NUMBER:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,22));
        aadhar.setBounds(100,490,400,30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(310,490,400,30);
        add(aadharTextField);
        
        JLabel citizen = new JLabel("SENIOR CITIZEN:");
        citizen.setFont(new Font("Raleway",Font.BOLD,22));
        citizen.setBounds(100,540,200,30);
        add(citizen);
        
        YES = new JRadioButton("Yes");
        YES.setBounds(360,540,100,30);
        YES.setBackground(Color.WHITE);
        add(YES);
        
        NO = new JRadioButton("No");
        NO.setBounds(460,540,100,30);
        NO.setBackground(Color.WHITE);
        add(NO);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(YES);
        seniorgroup.add(NO);
        
        
        
        JLabel existAc = new JLabel("EXISISTING ACCOUNT:");
        existAc.setFont(new Font("Raleway",Font.BOLD,22));
        existAc.setBounds(100,590,400,30);
        add(existAc);
        
        YESS = new JRadioButton("Yes");
        YESS.setBounds(360,590,100,30);
        YESS.setBackground(Color.WHITE);
        add(YESS);
        
        NOO = new JRadioButton("No");
        NOO.setBounds(460,590,100,30);
        NOO.setBackground(Color.WHITE);
        add(NOO);
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(YES);
        existinggroup.add(NO);
      
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String religion = religionTextField.getText();
        String cateogry = null;
        if(OC.isSelected()){
            cateogry = "OC";
        }else if (BC.isSelected()){
            cateogry = "BC";
        }else if (SC_ST.isSelected()){
            cateogry = "SC/ST";
        }
        
       
        
         String income = incomeTextField.getText();
        
        String edu = eduTextField.getText();
        String qual = qualTextField.getText();
        String occupation = occupationTextField.getText();
         String occup = null;
        if (YES.isSelected()){
            occup = "Yes";
        } else if(NO.isSelected()){
            occup = "No";
        }
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        
        String senior_citizen = null;
        if (YES.isSelected()){
            senior_citizen = "Yes";
        } else if(NO.isSelected()){
            senior_citizen = "No";
        }
        String existing = null;
        if (YESS.isSelected()){
            existing = "Yes";
        } else if(NOO.isSelected()){
            existing = "No";
        }
        
        
        
        
        try {
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null, "Religion is Required");
            }
            else {
                Conn c = new Conn();
               String query = "INSERT INTO signuptwo VALUES('" + formno + "', '" + religion + "', '" + cateogry + "', '" + income + "', '" + edu + "', '" + qual + "', '" + occupation + "', '" + pan + "', '" + aadhar + "', '" + senior_citizen + "', '" + existing + "')";

                c.s.executeUpdate(query);
                
               setVisible(false);
               new signupthree(formno).setVisible(true);
                
            } 
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    
    public static void main(String[] args){
    new Signuptwo("");
    }
}



package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signupone extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,others,single,married;
    JDateChooser dateChooser;
    Signupone(){
        
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO: " + random );
        formno.setFont(new Font("Raleway",Font.BOLD,36));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel PersonalDetails = new JLabel("PAGE 1: Personal Details");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);
        
        JLabel name = new JLabel("NAME:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(310,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("FATHER'S NAME:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(310,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("DATE OF BIRTH:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(310,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("GENDER:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        others = new JRadioButton("Others");
        others.setBounds(600,290,100,30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);
        
        
        JLabel email = new JLabel("EMAIL:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(310,340,400,30);
        add(emailTextField);
        
        JLabel martial = new JLabel("MARITAL STATUS:");
        martial.setFont(new Font("Raleway",Font.BOLD,22));
        martial.setBounds(100,390,300,30);
        add(martial);
        
        single = new JRadioButton("Single");
        single.setBounds(310,390,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        
        married = new JRadioButton("Married");
        married.setBounds(460,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        ButtonGroup statusgroup = new ButtonGroup();
        statusgroup.add(single);
        statusgroup.add(married);
        
        JLabel address = new JLabel("ADDRESS:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(310,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("CITY:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(310,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("STATE:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(310,540,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("PINCODE:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(310,590,400,30);
        add(pincodeTextField);
        
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
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if (female.isSelected()){
            gender = "Female";
        }else if (others.isSelected()){
            gender = "Others";
        }
        
        String email = emailTextField.getText();
        String martial = null;
        if (single.isSelected()){
            martial = "Single";
        } else if(married.isSelected()){
            martial = "Married";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
        
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else {
                Conn c = new Conn();
               String query = "INSERT INTO signup VALUES('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + martial + "', '" + address + "', '" + city + "', '" + state + "', '" + pin + "')";

                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            } 
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    
    public static void main(String[] args){
    new Signupone();
    }
}

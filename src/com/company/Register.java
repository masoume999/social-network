package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Register extends JFrame {
    private String usernamestr="" , passwordstr="";
    private JLabel         usernameTxt   = new JLabel("Username : ");
    private JLabel         passwordTxt   = new JLabel("Password : ");
    private JTextField     username      = new JTextField();
    private JPasswordField password      = new JPasswordField();
    private JButton        continueBtn   = new JButton("Continue");
    private JPanel         register      = new JPanel();
    private JButton        showPassword  = new JButton("Show Password");
    private JButton Loginbtn = new JButton("Login");
    public Register() {

        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo! (register)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(register);
        register.setLayout(null);
        {
            register.add(usernameTxt);
            register.add(passwordTxt);
            register.add(Loginbtn);
            Loginbtn.setBounds(120,450,85,30);
            usernameTxt.setBounds(5, 100, 99, 35);
            passwordTxt.setBounds(5, 150, 99, 35);

            register.add(username);
            register.add(password);
            username.setBounds(100, 100, 130, 35);
            password.setBounds(100, 150, 130, 35);

            register.add(continueBtn);
            continueBtn.setBounds(120, 200, 100, 30);

            register.add(showPassword);
            showPassword.setBounds(250, 155, 130, 30);
        }

        showPassword.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,new String(password.getPassword()));
        });
        continueBtn.addActionListener((ActionEvent e) -> {
            usernamestr=username.getText();
            passwordstr=new String(password.getPassword());
            if (!usernamestr.equalsIgnoreCase("") || !passwordstr.equalsIgnoreCase("")) {
                usernamestr=username.getText();
                passwordstr=new String(password.getPassword());
                try {
                    if (!new methods().isUser(usernamestr)) {
                        this.setVisible(false);
                        CreateProfile createProfile = new CreateProfile(usernamestr , passwordstr);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"This username has already used!","Oops!",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Username and Password text field can not be empty");
            }
        });
        Loginbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            LogIn logIn = new LogIn();
        });
    }
}

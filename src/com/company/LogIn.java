package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class LogIn extends JFrame {
    private String usernamestr , passwordstr;
    private JTextField username = new JTextField();
    private JPasswordField password = new JPasswordField();
    private JButton showPassword = new JButton("Show Password");
    private JButton LoginKey = new JButton("Login");
    private JButton RegisterKey = new JButton("Register");
    private JLabel usernameTxt = new JLabel("Username : ");
    private JLabel passwordTxt = new JLabel("Password : ");
    private JPanel login = new JPanel();

    public LogIn(){
        this.setSize(500,600);//size of JFrame
        this.setTitle("Bo! (login)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);


        this.add(login);
        login.setLayout(null);


        login.add(usernameTxt);
        login.add(passwordTxt);
        usernameTxt.setBounds(5 , 100 , 99,35 );
        passwordTxt.setBounds(5,150 , 99 , 35);

        login.add(username);
        login.add(password);
        username.setBounds(100 , 100 , 130 , 35);
        password.setBounds(100 , 150 , 130 , 35);

        login.add(showPassword);
        showPassword.setBounds(240 , 154 , 130 , 30);

        login.add(LoginKey);
        LoginKey.setBounds(120 , 200 , 85 , 40);
        login.add(RegisterKey);
        RegisterKey.setBounds(120 , 450 , 85 , 40);



        showPassword.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,new String(password.getPassword()));
        });

        LoginKey.addActionListener((ActionEvent e) -> {
            usernamestr=username.getText();
            passwordstr=new String(password.getPassword());
            if (!usernamestr.equalsIgnoreCase("") || !passwordstr.equalsIgnoreCase("")) {
                if (!usernamestr.equalsIgnoreCase("admin")&&!passwordstr.equalsIgnoreCase("qazxsw")) {
                    this.setVisible(false);
                    try {
                        if (new methods().isUser(usernamestr)) {
                            if (new methods().checkUser(usernamestr, passwordstr)) {
                                JOptionPane.showMessageDialog(null, "Welcome back!");
                                mainPage mainpage = new mainPage(usernamestr);
                            }else{
                                JOptionPane.showMessageDialog(null , "Username and password did not match!" , "Oops!" , JOptionPane.ERROR_MESSAGE);
                                LogIn login = new LogIn();
                            }
                        }else{
                            JOptionPane.showMessageDialog(null , "This user does not exist!","Oops!",JOptionPane.WARNING_MESSAGE);
                            Form form = new Form();
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }else {
                    try {this.setVisible(false);
                        Admin admin = new Admin();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }else
                JOptionPane.showMessageDialog(null , "Username and Password text field can not be empty");
        });
        RegisterKey.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Register register = new Register();
        });

    }

}

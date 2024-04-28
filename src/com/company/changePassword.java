package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class changePassword extends JFrame {
    private JLabel newpasswordlbl = new JLabel("New password :");
    private JButton changebtn = new JButton("Change");
    private JButton backButton = new JButton("Back");
    private JPasswordField newpasswordtxt = new JPasswordField();
    private JButton showPasswordbtn = new JButton("Show password");
    private JPanel changePassword = new JPanel();
    private String data;

    public changePassword(String username) throws IOException {
        this.setSize(500, 600);
        this.setTitle("Bo!(change password)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.add(changePassword);
        changePassword.setLayout(null);
        changePassword.add(backButton);
        changePassword.add(changebtn);
        changePassword.add(showPasswordbtn);
        changePassword.add(newpasswordlbl);
        changePassword.add(newpasswordtxt);
        backButton.setBounds(20,450,90,50);
        changebtn.setBounds(380,450,90,50);
        newpasswordlbl.setBounds(30,200,200,35);
        newpasswordtxt.setBounds(130,200,120,35);
        showPasswordbtn.setBounds(250,200,150,30);

        backButton.addActionListener((ActionEvent e) -> {
            changePassword.setVisible(false);
            try {
                mainPage mainpage = new mainPage(username);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        showPasswordbtn.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,new String(newpasswordtxt.getPassword()));
        });
        changebtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            String password = new String(newpasswordtxt.getPassword());
            methods methods = new methods();
            try {
                methods.changePassword(username,password);
                JOptionPane.showMessageDialog(null , "Password changed!");
                mainPage mainpage = new mainPage(username);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

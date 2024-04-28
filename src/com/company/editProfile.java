package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class editProfile extends JFrame {
    private JButton changePasswordbtn = new JButton("Change password");
    private JButton editProfilebtn = new JButton("Edit profile");
    private JButton backButton = new JButton("Back");
    private JPanel Edit = new JPanel();

    public editProfile(String username) {
        this.setSize(500,600);
        this.setTitle("Bo!(Edit)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        this.add(Edit);
        Edit.setLayout(null);
        Edit.add(changePasswordbtn);
        Edit.add(editProfilebtn);
        Edit.add(backButton);
        changePasswordbtn.setBounds(75,150,350,50);
        editProfilebtn.setBounds(75,250,350,50);
        backButton.setBounds(20,450,90,50);


        editProfilebtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            methods methods = new methods();
            String password = "";
            try {
                password = methods.deleteUserAndgetpassword(username);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            editUser editUser = new editUser(username,password);
        });
        changePasswordbtn.addActionListener((ActionEvent e) -> {
            try {
                changePassword changePassword = new changePassword(username);
                this.setVisible(false);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        backButton.addActionListener((ActionEvent e) -> {
            try {
                mainPage mainPage = new mainPage(username);
                this.setVisible(false);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Form extends JFrame {

    private JButton       LogIn     = new JButton("Login");
    private JButton       Register  = new JButton("Register");
    private JPanel        one       = new JPanel();
    private BufferedImage bckgrnd   = ImageIO.read(new File("D:\\MainIcon-1.png"));
    private JLabel label            = new JLabel(new ImageIcon(bckgrnd));
    private JLabel welcomeText      = new JLabel("                                                ~~Welcome to \" The Bo! \"~~" );

    public Form() throws IOException {
        this.setSize(500,600);
        this.setTitle("Bo!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);
        this.add(welcomeText, BorderLayout.BEFORE_FIRST_LINE);


        one.add(label);
        label.setBounds(40,0,400 , 400);


        this.add(one);
        one.setLayout(null);
        one.add(LogIn);
        one.add(Register);
        LogIn.setBounds(150,400,90,50);
        Register.setBounds(250,400,90,50);
//        LogIn.setBackground(Color.pink);
//        Register.setBackground(Color.pink);



        LogIn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            LogIn login = new LogIn();
        });
        Register.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Register register = new Register();
        });

    }

}

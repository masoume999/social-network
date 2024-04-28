package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class searchbyUsername extends JFrame {
    private String usernamestr = "";
    private JLabel usernamelbl = new JLabel("Username  : ");
    private JTextField usernametxt = new JTextField();
    private JButton searchbtn = new JButton("Search");
    private JButton backbtn = new JButton("Back");

    private JPanel searchbyUsername = new JPanel();
    public searchbyUsername(String myUsername) throws IOException {
        this.setSize(500,600);
        this.setTitle("Bo!(search by username)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(searchbyUsername);
        searchbyUsername.setLayout(null);

        searchbyUsername.add(usernamelbl);
        usernamelbl.setBounds(80,200,200,35);
        searchbyUsername.add(usernametxt);
        usernametxt.setBounds(180,200,250,35);
        searchbyUsername.add(searchbtn);
        searchbtn.setBounds(375,450,90,50);
        searchbyUsername.add(backbtn);
        backbtn.setBounds(30,450,90,50);


        searchbtn.addActionListener((ActionEvent e)->{
            usernamestr = usernametxt.getText();
            if (!usernamestr.equalsIgnoreCase("")){
                try {
                    if (new methods().isUser(usernamestr)){
                        try {
                            this.setVisible(false);
                            if (!myUsername.equals("admin")) {
                                showSearchedUser showsearcheduser = new showSearchedUser(usernamestr, myUsername);
                            }else{
                                showSearchedUsertoAdmin ssua = new showSearchedUsertoAdmin(usernamestr);
                            }
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }else {
                        JOptionPane.showMessageDialog(null , "Not found!","Oops!",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else {
                JOptionPane.showMessageDialog(null,"Username text field can not be empty!" , "Oops!" , JOptionPane.WARNING_MESSAGE);
            }
        });
        backbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            Search search = new Search(myUsername);
        });

    }
}

package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class showSearchedUsertoAdmin extends JFrame {
    private BufferedImage profilepicture = ImageIO.read(new File("D:\\MainIcon.jpg"));
    private JLabel profilePicture = new JLabel(new ImageIcon(profilepicture));

    private JButton deletebtn = new JButton("Delete user");
    private JButton backtomainpagebtn = new JButton("Back to main page");
    private JLabel usernamelbl = new JLabel("Username  :");
    private JLabel Usrnamelbl  ;
    private JLabel fullnamelbl = new JLabel("Full name  :");
    private JLabel Fullnamelbl ;
    private JLabel agelbl = new JLabel("Age            :");
    private JLabel Agelbl ;
    private JLabel sexuality = new JLabel("Sexuality   :");
    private JLabel Sexuality ;
    private JLabel country = new JLabel("Country     :");
    private JLabel Country ;
    private JLabel food = new JLabel("Favorite Food  :");
    private JLabel Food ;
    private JLabel sport = new JLabel("Favorite Sport  :");
    private JLabel Sport ;
    private JLabel art = new JLabel("Favorite Art      :");
    private JLabel Art ;
    private JLabel morale = new JLabel("Morale               :");
    private JLabel Morale ;
    private JLabel nature = new JLabel("Nature               :");
    private JLabel Nature ;

    JPanel showSearchedusertoAdmin = new JPanel();

    public showSearchedUsertoAdmin(String username) throws IOException {
        this.setSize(500, 600);
        this.setTitle("Bo!" +" ("+username+")");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(showSearchedusertoAdmin);
        showSearchedusertoAdmin.setLayout(null);


        showSearchedusertoAdmin.add(profilePicture);
        profilePicture.setBounds(20 , 20 , 100 , 100 );
        showSearchedusertoAdmin.add(deletebtn);
        deletebtn.setBounds(124 , 55 , 200 , 30);

        showSearchedusertoAdmin.add(usernamelbl);
        usernamelbl.setBounds(20, 135 , 100 , 30);
        showSearchedusertoAdmin.add(fullnamelbl);
        fullnamelbl.setBounds(20 , 170 , 100 , 30);
        showSearchedusertoAdmin.add(agelbl);
        agelbl.setBounds(20 , 205 , 100 , 30);
        showSearchedusertoAdmin.add(sexuality);
        sexuality.setBounds(20 , 240 , 100 , 30);
        showSearchedusertoAdmin.add(country);
        country.setBounds(20 , 280 , 100 ,30);
        showSearchedusertoAdmin.add(food);
        food.setBounds(250 , 135 , 100 ,30);
        showSearchedusertoAdmin.add(sport);
        sport.setBounds(250 , 170 , 100 , 30);
        showSearchedusertoAdmin.add(art);
        art.setBounds(250 , 205 , 100 ,30);
        showSearchedusertoAdmin.add(morale);
        morale.setBounds(250 , 240 , 100 ,30);
        showSearchedusertoAdmin.add(nature);
        nature.setBounds(250 , 280 , 100 ,30);


        methods m = new methods();
        String[] infoArray = m.getInformation(username);
        Fullnamelbl = new JLabel(infoArray[0]);
        Agelbl      = new JLabel(infoArray[1]);
        Sexuality   = new JLabel(infoArray[2]);
        Country     = new JLabel(infoArray[3]);
        Food        = new JLabel(infoArray[4]);
        Sport       = new JLabel(infoArray[5]);
        Art         = new JLabel(infoArray[6]);
        Morale      = new JLabel(infoArray[7]);
        Nature      = new JLabel(infoArray[8]);
        Usrnamelbl  = new JLabel(username);

        showSearchedusertoAdmin.add(Usrnamelbl);
        Usrnamelbl.setBounds(120 , 135 , 100 , 30);
        showSearchedusertoAdmin.add(Fullnamelbl);
        Fullnamelbl.setBounds(120 , 170 , 100 , 30);
        showSearchedusertoAdmin.add(Agelbl);
        Agelbl.setBounds(120 , 205 , 100 ,30);
        showSearchedusertoAdmin.add(Sexuality);
        Sexuality.setBounds(120 , 240 , 100 ,30);
        showSearchedusertoAdmin.add(Country);
        Country.setBounds(120 , 280  , 100 ,30);
        showSearchedusertoAdmin.add(Food);
        Food.setBounds(350 , 135 , 100 ,30);
        showSearchedusertoAdmin.add(Sport);
        Sport.setBounds(350 , 170 , 100 ,30);
        showSearchedusertoAdmin.add(Art);
        Art.setBounds(350 , 205 , 100 , 30);
        showSearchedusertoAdmin.add(Morale);
        Morale.setBounds(350 , 240 , 100 , 30);
        showSearchedusertoAdmin.add(Nature);
        Nature.setBounds(350 , 280 , 100 , 30);

        showSearchedusertoAdmin.add(backtomainpagebtn);
        backtomainpagebtn.setBounds(30 , 400 , 150 , 40);
        backtomainpagebtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            try {
                Admin admin = new Admin();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        deletebtn.addActionListener((ActionEvent e)->{
            try {
                m.deleteUser(username);
                JOptionPane.showMessageDialog(null,"User deleted!");
                this.setVisible(false);
                Admin admin = new Admin();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}
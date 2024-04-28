package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mainPage extends JFrame {
    //    JScrollBar scrollBar = new JScrollBar();
    private BufferedImage profilepicture = ImageIO.read(new File("D:\\MainIcon.jpg"));
    private JLabel profilePicture = new JLabel(new ImageIcon(profilepicture));
    private JButton editProfilebtn = new JButton("Edit Profile");
    private JButton searchbtn = new JButton("Search");
    private JButton logoutbtn = new JButton("Log out");
    private JButton requestsbtn = new JButton("Requests");
    private JButton addtofriends = new JButton("Add to friends");
    private JButton b1;

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
    private JLabel friends = new JLabel("~~~~~~~~~~~~~~~~~~~~~~~~~Friends~~~~~~~~~~~~~~~~~~~~~~~~~");

    JPanel mainPage = new JPanel();

    public mainPage(String username) throws IOException {

        this.setSize(500, 600);
        this.setTitle("Bo!" +" ("+username+")");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(mainPage);
        mainPage.setLayout(null);

        mainPage.add(profilePicture);
        profilePicture.setBounds(20 , 20 , 100 , 100 );
        mainPage.add(editProfilebtn);
        editProfilebtn.setBounds(150 , 55 , 100 , 30);
        mainPage.add(searchbtn);
        searchbtn.setBounds(250 , 55 , 100 , 30);
        mainPage.add(logoutbtn);
        logoutbtn.setBounds(350 , 55 , 100 , 30);

        mainPage.add(usernamelbl);
        usernamelbl.setBounds(20, 135 , 100 , 30);
        mainPage.add(fullnamelbl);
        fullnamelbl.setBounds(20 , 170 , 100 , 30);
        mainPage.add(agelbl);
        agelbl.setBounds(20 , 205 , 100 , 30);
        mainPage.add(sexuality);
        sexuality.setBounds(20 , 240 , 100 , 30);
        mainPage.add(country);
        country.setBounds(20 , 280 , 100 ,30);
        mainPage.add(food);
        food.setBounds(250 , 135 , 100 ,30);
        mainPage.add(sport);
        sport.setBounds(250 , 170 , 100 , 30);
        mainPage.add(art);
        art.setBounds(250 , 205 , 100 ,30);
        mainPage.add(morale);
        morale.setBounds(250 , 240 , 100 ,30);
        mainPage.add(nature);
        nature.setBounds(250 , 280 , 100 ,30);

        mainPage.add(friends);
        friends.setBounds(50, 310 , 400 , 30);

        mainPage.add(requestsbtn);
        requestsbtn.setBounds(330,350,120,30);

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

        methods methods = new methods();
        String friends = methods.Getfriends(username);
        String[] array = friends.split("\\*");
        int length = array.length;
        if (!array[0].equalsIgnoreCase("")) {
            for (int i = 0; i < length; i++) {
                b1 = new JButton(array[i]);
                mainPage.add(b1);
                String str = array[i];
                b1.setBounds(40, 350+(i*25), 90, 25);
                b1.addActionListener((ActionEvent e) -> {
                    this.setVisible(false);
                    try {
                        showSearchedUser showSearchedUser = new showSearchedUser(str, username);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                });
            }
        }
        mainPage.add(Usrnamelbl);
        Usrnamelbl.setBounds(120 , 135 , 100 , 30);
        mainPage.add(Fullnamelbl);
        Fullnamelbl.setBounds(120 , 170 , 100 , 30);
        mainPage.add(Agelbl);
        Agelbl.setBounds(120 , 205 , 100 ,30);
        mainPage.add(Sexuality);
        Sexuality.setBounds(120 , 240 , 100 ,30);
        mainPage.add(Country);
        Country.setBounds(120 , 280  , 100 ,30);
        mainPage.add(Food);
        Food.setBounds(350 , 135 , 100 ,30);
        mainPage.add(Sport);
        Sport.setBounds(350 , 170 , 100 ,30);
        mainPage.add(Art);
        Art.setBounds(350 , 205 , 100 , 30);
        mainPage.add(Morale);
        Morale.setBounds(350 , 240 , 100 , 30);
        mainPage.add(Nature);
        Nature.setBounds(350 , 280 , 100 , 30);

        editProfilebtn.addActionListener((ActionEvent e)->{
            editProfile editProfile = new editProfile(username);
            this.setVisible(false);
        });
        searchbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            Search search = new Search(username);
        });
        logoutbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            try {
                Form form = new Form();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        requestsbtn.addActionListener((ActionEvent e) ->{
            this.setVisible(false);
            try {
                Requests requests = new Requests(username);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

}

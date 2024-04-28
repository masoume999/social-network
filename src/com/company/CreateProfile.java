package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class CreateProfile extends JFrame {
    private String fullName = "-", age = "-", sexuality = "-", Country = "-", favSport = "-", favArt = "-", favFood = "-", morale = "-", nature = "-";

    //    JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL,10, 5, 0, 50);
//    JScrollBar horizentalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,10, 5, 0, 50);
    private JLabel line = new JLabel("~~~~~~~~~~~~~~~~~");

    private JTextField   fullnametxt    = new JTextField("-");
    private JLabel       fullnamelbl    = new JLabel("Full name      : ");
    private JTextField   agetxt         = new JTextField("-");
    private JLabel       agelbl         = new JLabel("Age                : ");
    private JRadioButton man            = new JRadioButton("Man");
    private JRadioButton woman          = new JRadioButton("Woman");
    private ButtonGroup  sexualitybtn   = new ButtonGroup();
    private JLabel       sexualitylbl   = new JLabel("Sexuality      : ");
    private JTextField   countrytxt     = new JTextField("-");
    private JLabel       countrylbl     = new JLabel("Country        : ");

    private JLabel fav = new JLabel("Choose your... ");

    private JLabel sport = new JLabel("Favourite Sport : ");
    private JRadioButton footballrb     = new JRadioButton("Football");
    private JRadioButton baseballrb     = new JRadioButton("Baseball");
    private JRadioButton volleyballrb   = new JRadioButton("Volleyball");
    private JRadioButton pingpongrb     = new JRadioButton("Ping-pong");
    private JRadioButton othersport     = new JRadioButton("Others");
    private ButtonGroup sportgroup = new ButtonGroup();

    private JLabel art = new JLabel("Favourite Art     : ");
    private JRadioButton paintingrb     = new JRadioButton("Painting");
    private JRadioButton potteryrb      = new JRadioButton("Pottery");
    private JRadioButton actingrb       = new JRadioButton("Acting");
    private JRadioButton singingrb      = new JRadioButton("Singing");
    private JRadioButton sculpturerb    = new JRadioButton("Sculpture");
    private JRadioButton otherart       = new JRadioButton("Others");
    private ButtonGroup artgroup = new ButtonGroup();


    private JLabel food = new JLabel("Favourite Food : ");
    private JRadioButton iranianrb      = new JRadioButton("Iranian");
    private JRadioButton italianrb      = new JRadioButton("Italian");
    private JRadioButton mexicanrb      = new JRadioButton("Mexican");
    private JRadioButton koreanrb       = new JRadioButton("Korean");
    private JRadioButton chineserb      = new JRadioButton("Chinese");
    private JRadioButton otherfood      = new JRadioButton("Others");
    private ButtonGroup foodgroup = new ButtonGroup();


    private JLabel mora = new JLabel("Morale               : ");
    private JRadioButton introvertedrb  = new JRadioButton("Introverted");
    private JRadioButton extrovertrb    = new JRadioButton("Extrovert");
    private JRadioButton moderaterb     = new JRadioButton("Moderate");
    private JRadioButton othermorale    = new JRadioButton("Others");
    private ButtonGroup moralegroup = new ButtonGroup();

    private JLabel natur = new JLabel("Nature               : ");
    private JRadioButton sanguinerb    = new JRadioButton("Sanguine");
    private JRadioButton phlegmaticrb  = new JRadioButton("Phlegmatic");
    private JRadioButton cholericrb    = new JRadioButton("Choleric");
    private JRadioButton melancholicrb = new JRadioButton("Melancholic");
    private JRadioButton othernature = new JRadioButton("Others");
    private ButtonGroup naturegroup = new ButtonGroup();

    private JPanel createprofile = new JPanel();


    private JButton savebtn = new JButton("Save");


    public CreateProfile(String usernamestr , String passwordstr) {
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo! (create profile)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(createprofile);
        createprofile.setLayout(null);
//        createprofile.add(verticalScrollBar);
//        verticalScrollBar.setBounds(490 , 0 , 10 , 600);
//        createprofile.add(horizentalScrollBar);
//        horizentalScrollBar.setBounds(0 , 550 , 500 , 10);

        {
            createprofile.add(fullnametxt);
            fullnametxt.setBounds(100, 10, 200, 30);
            createprofile.add(fullnamelbl);
            fullnamelbl.setBounds(1, 10, 100, 30);
            createprofile.add(agetxt);
            agetxt.setBounds(100, 50, 200, 30);
            createprofile.add(agelbl);
            agelbl.setBounds(1, 50, 100, 30);
            sexualitybtn.add(man);
            sexualitybtn.add(woman);
            createprofile.add(man);
            createprofile.add(woman);
            createprofile.add(sexualitylbl);
            sexualitylbl.setBounds(1, 90, 100, 30);
            man.setBounds(100, 90, 100, 30);
            woman.setBounds(200, 90, 100, 30);
            createprofile.add(countrytxt);
            countrytxt.setBounds(100, 130, 200, 30);
            createprofile.add(countrylbl);
            countrylbl.setBounds(1, 130, 100, 30);
        }
        createprofile.add(line);
        line.setBounds(10, 160, 200, 30);
        {
            createprofile.add(fav);
            fav.setBounds(0, 190, 150, 20);
            createprofile.add(sport);
            sport.setBounds(1, 220, 100, 30);
            createprofile.add(art);
            art.setBounds(1, 260, 100, 30);
            createprofile.add(food);
            food.setBounds(1, 300, 100, 30);
            createprofile.add(mora);
            mora.setBounds(1, 340, 100, 30);
            createprofile.add(natur);
            natur.setBounds(1, 380, 100, 30);
        }

        {
            sportgroup.add(footballrb);
            sportgroup.add(baseballrb);
            sportgroup.add(volleyballrb);
            sportgroup.add(pingpongrb);
            sportgroup.add(othersport);
            createprofile.add(footballrb);
            footballrb.setBounds(100, 220, 100, 30);
            createprofile.add(baseballrb);
            baseballrb.setBounds(200, 220, 100, 30);
            createprofile.add(volleyballrb);
            volleyballrb.setBounds(300, 220, 100, 30);
            createprofile.add(pingpongrb);
            pingpongrb.setBounds(400, 220, 100, 30);
            createprofile.add(othersport);
            othersport.setBounds(500, 220, 100, 30);


            artgroup.add(paintingrb);
            artgroup.add(potteryrb);
            artgroup.add(actingrb);
            artgroup.add(singingrb);
            artgroup.add(sculpturerb);
            artgroup.add(otherart);
            createprofile.add(paintingrb);
            paintingrb.setBounds(100, 260, 100, 30);
            createprofile.add(potteryrb);
            potteryrb.setBounds(200, 260, 100, 30);
            createprofile.add(actingrb);
            actingrb.setBounds(300, 260, 100, 30);
            createprofile.add(singingrb);
            singingrb.setBounds(400, 260, 100, 30);
            createprofile.add(sculpturerb);
            sculpturerb.setBounds(500, 260, 100, 30);
            createprofile.add(otherart);
            otherart.setBounds(600, 260, 100, 30);


            foodgroup.add(iranianrb);
            foodgroup.add(italianrb);
            foodgroup.add(mexicanrb);
            foodgroup.add(koreanrb);
            foodgroup.add(chineserb);
            foodgroup.add(otherfood);
            createprofile.add(iranianrb);
            iranianrb.setBounds(100, 300, 100, 30);
            createprofile.add(italianrb);
            italianrb.setBounds(200, 300, 100, 30);
            createprofile.add(mexicanrb);
            mexicanrb.setBounds(300, 300, 100, 30);
            createprofile.add(koreanrb);
            koreanrb.setBounds(400, 300, 100, 30);
            createprofile.add(chineserb);
            chineserb.setBounds(500, 300, 100, 30);
            createprofile.add(otherfood);
            otherfood.setBounds(600, 300, 100, 30);


            moralegroup.add(introvertedrb);
            moralegroup.add(extrovertrb);
            moralegroup.add(moderaterb);
            moralegroup.add(othermorale);
            createprofile.add(introvertedrb);
            introvertedrb.setBounds(100, 340, 100, 30);
            createprofile.add(extrovertrb);
            extrovertrb.setBounds(200, 340, 100, 30);
            createprofile.add(moderaterb);
            moderaterb.setBounds(300, 340, 100, 30);
            createprofile.add(othermorale);
            othermorale.setBounds(400, 340, 100, 30);

            naturegroup.add(sanguinerb);
            naturegroup.add(phlegmaticrb);
            naturegroup.add(cholericrb);
            naturegroup.add(melancholicrb);
            naturegroup.add(othernature);
            createprofile.add(sanguinerb);
            sanguinerb.setBounds(100 , 380 , 100 , 30);
            createprofile.add(phlegmaticrb);
            phlegmaticrb.setBounds(200 , 380 , 100 , 30);
            createprofile.add(cholericrb);
            cholericrb.setBounds(300 , 380 , 100 , 30);
            createprofile.add(melancholicrb);
            melancholicrb.setBounds(400 , 380 , 100 , 30);
            createprofile.add(othernature);
            othernature.setBounds(500 , 380 ,100 ,30);
        }


        createprofile.add(savebtn);
        savebtn.setBounds(150, 450, 100, 45);
        {
            man.addActionListener((ActionEvent e) -> {
                sexuality = "Man";
            });
            woman.addActionListener((ActionEvent e) -> {
                sexuality = "Woman";
            });

            footballrb.addActionListener((ActionEvent e) -> {
                favSport = "Football";
            });
            baseballrb.addActionListener((ActionEvent e) -> {
                favSport = "Baseball";
            });
            volleyballrb.addActionListener((ActionEvent e) -> {
                favSport = "Volleyball";
            });
            pingpongrb.addActionListener((ActionEvent e) -> {
                favSport = "Ping-pong";
            });
            othersport.addActionListener((ActionEvent e) -> {
                favSport = "Others";
            });

            paintingrb.addActionListener((ActionEvent e) -> {
                favArt = "Painting";
            });
            potteryrb.addActionListener((ActionEvent e) -> {
                favArt = "Pottery";
            });
            actingrb.addActionListener((ActionEvent e) -> {
                favArt = "Acting";
            });
            singingrb.addActionListener((ActionEvent e) -> {
                favArt = "Singing";
            });
            sculpturerb.addActionListener((ActionEvent e) -> {
                favArt = "Sculpture";
            });
            otherart.addActionListener((ActionEvent e) -> {
                favArt = "Others";
            });
            iranianrb.addActionListener((ActionEvent e) -> {
                favFood = "Iranian";
            });
            italianrb.addActionListener((ActionEvent e) -> {
                favFood = "Italian";
            });
            mexicanrb.addActionListener((ActionEvent e) -> {
                favFood = "Mexican";
            });
            koreanrb.addActionListener((ActionEvent e) -> {
                favFood = "Korean";
            });
            chineserb.addActionListener((ActionEvent e) -> {
                favFood = "Chinese";
            });
            otherfood.addActionListener((ActionEvent e) -> {
                favFood = "Others";
            });
            introvertedrb.addActionListener((ActionEvent e) -> {
                morale = "Introverted";
            });
            extrovertrb.addActionListener((ActionEvent e) -> {
                morale = "Extrovert";
            });
            moderaterb.addActionListener((ActionEvent e) -> {
                morale = "Moderate";
            });
            othermorale.addActionListener((ActionEvent e) -> {
                morale = "Others";
            });
            sanguinerb.addActionListener((ActionEvent e)->{
                nature = "Sanguine";
            });
            phlegmaticrb.addActionListener((ActionEvent e)->{
                nature = "Phlegmatic";
            });
            cholericrb.addActionListener((ActionEvent e)->{
                nature = "Choleric";
            });
            melancholicrb.addActionListener((ActionEvent e)->{
                nature = "Melancholic";
            });
            othernature.addActionListener((ActionEvent e)->{
                nature = "Others";
            });

            savebtn.addActionListener((ActionEvent e) -> {
                fullName = fullnametxt.getText();
                age = agetxt.getText();
                Country = countrytxt.getText();
                this.setVisible(false);
                try {
                    new methods().saveUser(usernamestr, passwordstr, fullName, age, sexuality, Country, favSport, favArt, favFood, morale, nature);
                    JOptionPane.showMessageDialog(null, "~Welcome~\nYou are one of us now." , "hey!" , JOptionPane.YES_OPTION);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    mainPage mainpage = new mainPage(usernamestr);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });

        }
    }
}

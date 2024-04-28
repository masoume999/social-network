package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

public class editAdminProfile extends JFrame{
    private String  sexuality = "-", favSport = "-", favArt = "-", favFood = "-", morale = "-", nature = "-";

    private JTextField fullnametxt    = new JTextField("-");
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
    private JRadioButton othernature   = new JRadioButton("Others");
    private ButtonGroup naturegroup = new ButtonGroup();

    private JPanel editAdminProfile = new JPanel();


    private JButton changebtn = new JButton("Change");

    public editAdminProfile(){
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo! (create profile)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(editAdminProfile);
        editAdminProfile.setLayout(null);

        {
            editAdminProfile.add(fullnametxt);
            fullnametxt.setBounds(100, 10, 200, 30);
            editAdminProfile.add(fullnamelbl);
            fullnamelbl.setBounds(1, 10, 100, 30);
            editAdminProfile.add(agetxt);
            agetxt.setBounds(100, 50, 200, 30);
            editAdminProfile.add(agelbl);
            agelbl.setBounds(1, 50, 100, 30);
            sexualitybtn.add(man);
            sexualitybtn.add(woman);
            editAdminProfile.add(man);
            editAdminProfile.add(woman);
            editAdminProfile.add(sexualitylbl);
            sexualitylbl.setBounds(1, 90, 100, 30);
            man.setBounds(100, 90, 100, 30);
            woman.setBounds(200, 90, 100, 30);
            editAdminProfile.add(countrytxt);
            countrytxt.setBounds(100, 130, 200, 30);
            editAdminProfile.add(countrylbl);
            countrylbl.setBounds(1, 130, 100, 30);

            editAdminProfile.add(fav);
            fav.setBounds(0, 190, 150, 20);
            editAdminProfile.add(sport);
            sport.setBounds(1, 220, 100, 30);
            editAdminProfile.add(art);
            art.setBounds(1, 260, 100, 30);
            editAdminProfile.add(food);
            food.setBounds(1, 300, 100, 30);
            editAdminProfile.add(mora);
            mora.setBounds(1, 340, 100, 30);
            editAdminProfile.add(natur);
            natur.setBounds(1, 380, 100, 30);
        }

        {
            sportgroup.add(footballrb);
            sportgroup.add(baseballrb);
            sportgroup.add(volleyballrb);
            sportgroup.add(pingpongrb);
            sportgroup.add(othersport);
            editAdminProfile.add(footballrb);
            footballrb.setBounds(100, 220, 100, 30);
            editAdminProfile.add(baseballrb);
            baseballrb.setBounds(200, 220, 100, 30);
            editAdminProfile.add(volleyballrb);
            volleyballrb.setBounds(300, 220, 100, 30);
            editAdminProfile.add(pingpongrb);
            pingpongrb.setBounds(400, 220, 100, 30);
            editAdminProfile.add(othersport);
            othersport.setBounds(500, 220, 100, 30);


            artgroup.add(paintingrb);
            artgroup.add(potteryrb);
            artgroup.add(actingrb);
            artgroup.add(singingrb);
            artgroup.add(sculpturerb);
            artgroup.add(otherart);
            editAdminProfile.add(paintingrb);
            paintingrb.setBounds(100, 260, 100, 30);
            editAdminProfile.add(potteryrb);
            potteryrb.setBounds(200, 260, 100, 30);
            editAdminProfile.add(actingrb);
            actingrb.setBounds(300, 260, 100, 30);
            editAdminProfile.add(singingrb);
            singingrb.setBounds(400, 260, 100, 30);
            editAdminProfile.add(sculpturerb);
            sculpturerb.setBounds(500, 260, 100, 30);
            editAdminProfile.add(otherart);
            otherart.setBounds(600, 260, 100, 30);


            foodgroup.add(iranianrb);
            foodgroup.add(italianrb);
            foodgroup.add(mexicanrb);
            foodgroup.add(koreanrb);
            foodgroup.add(chineserb);
            foodgroup.add(otherfood);
            editAdminProfile.add(iranianrb);
            iranianrb.setBounds(100, 300, 100, 30);
            editAdminProfile.add(italianrb);
            italianrb.setBounds(200, 300, 100, 30);
            editAdminProfile.add(mexicanrb);
            mexicanrb.setBounds(300, 300, 100, 30);
            editAdminProfile.add(koreanrb);
            koreanrb.setBounds(400, 300, 100, 30);
            editAdminProfile.add(chineserb);
            chineserb.setBounds(500, 300, 100, 30);
            editAdminProfile.add(otherfood);
            otherfood.setBounds(600, 300, 100, 30);


            moralegroup.add(introvertedrb);
            moralegroup.add(extrovertrb);
            moralegroup.add(moderaterb);
            moralegroup.add(othermorale);
            editAdminProfile.add(introvertedrb);
            introvertedrb.setBounds(100, 340, 100, 30);
            editAdminProfile.add(extrovertrb);
            extrovertrb.setBounds(200, 340, 100, 30);
            editAdminProfile.add(moderaterb);
            moderaterb.setBounds(300, 340, 100, 30);
            editAdminProfile.add(othermorale);
            othermorale.setBounds(400, 340, 100, 30);

            naturegroup.add(sanguinerb);
            naturegroup.add(phlegmaticrb);
            naturegroup.add(cholericrb);
            naturegroup.add(melancholicrb);
            naturegroup.add(othernature);
            editAdminProfile.add(sanguinerb);
            sanguinerb.setBounds(100 , 380 , 100 , 30);
            editAdminProfile.add(phlegmaticrb);
            phlegmaticrb.setBounds(200 , 380 , 100 , 30);
            editAdminProfile.add(cholericrb);
            cholericrb.setBounds(300 , 380 , 100 , 30);
            editAdminProfile.add(melancholicrb);
            melancholicrb.setBounds(400 , 380 , 100 , 30);
            editAdminProfile.add(othernature);
            othernature.setBounds(500 , 380 ,100 ,30);
        }


        editAdminProfile.add(changebtn);
        changebtn.setBounds(150, 450, 100, 45);
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

            changebtn.addActionListener((ActionEvent e) -> {
                this.setVisible(false);
                String data="";
                data=data.concat(fullnametxt.getText()+"\n"+agetxt.getText()+"\n"+sexuality+"\n"+countrytxt.getText()+"\n"+favFood+"\n"+favSport+"\n"+favArt+"\n"+morale+"\n"+nature);
                try {
                    FileWriter writer = new FileWriter("D:\\Admin.txt");
                    writer.write(data);
                    writer.close();
                    JOptionPane.showMessageDialog(null,"Information changed!");
                    Admin admin = new Admin();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });

        }
    }
}

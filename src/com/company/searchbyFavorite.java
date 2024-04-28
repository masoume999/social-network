package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class searchbyFavorite extends JFrame {
    private JButton backbtn = new JButton("Back");
    private String favSport = "-", favArt = "-", favFood = "-", morale = "-", nature = "-";
    private JLabel sport = new JLabel("Sport : ");
    private JRadioButton footballrb    = new JRadioButton("Football");
    private JRadioButton baseballrb    = new JRadioButton("Baseball");
    private JRadioButton volleyballrb  = new JRadioButton("Volleyball");
    private JRadioButton pingpongrb    = new JRadioButton("Ping-pong");
    private JRadioButton othersport    = new JRadioButton("Others");
    private ButtonGroup sportgroup = new ButtonGroup();

    private JLabel art = new JLabel("Art : ");
    private JRadioButton paintingrb    = new JRadioButton("Painting");
    private JRadioButton potteryrb     = new JRadioButton("Pottery");
    private JRadioButton actingrb      = new JRadioButton("Acting");
    private JRadioButton singingrb     = new JRadioButton("Singing");
    private JRadioButton sculpturerb   = new JRadioButton("Sculpture");
    private JRadioButton otherart      = new JRadioButton("Others");
    private ButtonGroup artgroup = new ButtonGroup();


    private JLabel food = new JLabel("Food : ");
    private JRadioButton iranianrb     = new JRadioButton("Iranian");
    private JRadioButton italianrb     = new JRadioButton("Italian");
    private JRadioButton mexicanrb     = new JRadioButton("Mexican");
    private JRadioButton koreanrb      = new JRadioButton("Korean");
    private JRadioButton chineserb     = new JRadioButton("Chinese");
    private JRadioButton otherfood     = new JRadioButton("Others");
    private ButtonGroup foodgroup = new ButtonGroup();


    private JLabel mora = new JLabel("Morale : ");
    private JRadioButton introvertedrb = new JRadioButton("Introverted");
    private JRadioButton extrovertrb   = new JRadioButton("Extrovert");
    private JRadioButton moderaterb    = new JRadioButton("Moderate");
    private JRadioButton othermorale   = new JRadioButton("Others");
    private ButtonGroup moralegroup = new ButtonGroup();

    private JLabel natur = new JLabel("Nature: ");
    private JRadioButton sanguinerb    = new JRadioButton("Sanguine");
    private JRadioButton phlegmaticrb  = new JRadioButton("Phlegmatic");
    private JRadioButton cholericrb    = new JRadioButton("Choleric");
    private JRadioButton melancholicrb = new JRadioButton("Melancholic");
    private JRadioButton othernature = new JRadioButton("Others");
    private ButtonGroup naturegroup = new ButtonGroup();

    private JButton search = new JButton("Search");

    private JPanel searchbyfavorite = new JPanel();
    public searchbyFavorite(String myUsername){
        this.setSize(500,600);
        this.setTitle("Bo!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(searchbyfavorite);
        searchbyfavorite.setLayout(null);

        {
            sportgroup.add(footballrb);
            sportgroup.add(baseballrb);
            sportgroup.add(volleyballrb);
            sportgroup.add(pingpongrb);
            sportgroup.add(othersport);
            searchbyfavorite.add(footballrb);
            footballrb.setBounds(10, 40, 90, 30);
            searchbyfavorite.add(baseballrb);
            baseballrb.setBounds(10, 70, 90, 30);
            searchbyfavorite.add(volleyballrb);
            volleyballrb.setBounds(10, 100, 90, 30);
            searchbyfavorite.add(pingpongrb);
            pingpongrb.setBounds(10, 130, 90, 30);
            searchbyfavorite.add(othersport);
            othersport.setBounds(10, 160, 90, 30);


            artgroup.add(paintingrb);
            artgroup.add(potteryrb);
            artgroup.add(actingrb);
            artgroup.add(singingrb);
            artgroup.add(sculpturerb);
            artgroup.add(otherart);
            searchbyfavorite.add(paintingrb);
            paintingrb.setBounds(110, 40, 90, 30);
            searchbyfavorite.add(potteryrb);
            potteryrb.setBounds(110, 70, 90, 30);
            searchbyfavorite.add(actingrb);
            actingrb.setBounds(110, 100, 90, 30);
            searchbyfavorite.add(singingrb);
            singingrb.setBounds(110, 130, 90, 30);
            searchbyfavorite.add(sculpturerb);
            sculpturerb.setBounds(110, 160, 90, 30);
            searchbyfavorite.add(otherart);
            otherart.setBounds(110, 190, 90, 30);


            foodgroup.add(iranianrb);
            foodgroup.add(italianrb);
            foodgroup.add(mexicanrb);
            foodgroup.add(koreanrb);
            foodgroup.add(chineserb);
            foodgroup.add(otherfood);
            searchbyfavorite.add(iranianrb);
            iranianrb.setBounds(210, 40, 90, 30);
            searchbyfavorite.add(italianrb);
            italianrb.setBounds(210, 70, 90, 30);
            searchbyfavorite.add(mexicanrb);
            mexicanrb.setBounds(210, 100, 90, 30);
            searchbyfavorite.add(koreanrb);
            koreanrb.setBounds(210, 130, 90, 30);
            searchbyfavorite.add(chineserb);
            chineserb.setBounds(210, 160, 90, 30);
            searchbyfavorite.add(otherfood);
            otherfood.setBounds(210, 190, 90, 30);


            moralegroup.add(introvertedrb);
            moralegroup.add(extrovertrb);
            moralegroup.add(moderaterb);
            moralegroup.add(othermorale);
            searchbyfavorite.add(introvertedrb);
            introvertedrb.setBounds(310, 40, 90, 30);
            searchbyfavorite.add(extrovertrb);
            extrovertrb.setBounds(310, 70, 90, 30);
            searchbyfavorite.add(moderaterb);
            moderaterb.setBounds(310, 100, 90, 30);
            searchbyfavorite.add(othermorale);
            othermorale.setBounds(310, 130, 90, 30);

            naturegroup.add(sanguinerb);
            naturegroup.add(phlegmaticrb);
            naturegroup.add(melancholicrb);
            naturegroup.add(cholericrb);
            naturegroup.add(othernature);
            searchbyfavorite.add(sanguinerb);
            sanguinerb.setBounds(410, 40, 90, 30);
            searchbyfavorite.add(melancholicrb);
            melancholicrb.setBounds(410, 70, 100, 30);
            searchbyfavorite.add(cholericrb);
            cholericrb.setBounds(410, 100, 90, 30);
            searchbyfavorite.add(phlegmaticrb);
            phlegmaticrb.setBounds(410, 130, 90, 30);
            searchbyfavorite.add(othernature);
            othernature.setBounds(410, 160, 90, 30);
        }
        {
            searchbyfavorite.add(sport);
            sport.setBounds(12, 15, 100, 30);
            searchbyfavorite.add(art);
            art.setBounds(112, 15, 100, 30);
            searchbyfavorite.add(food);
            food.setBounds(212, 15, 100, 30);
            searchbyfavorite.add(mora);
            mora.setBounds(312, 15, 100, 30);
            searchbyfavorite.add(natur);
            natur.setBounds(412, 15, 100, 30);
        }

        searchbyfavorite.add(search);
        search.setBounds(180 , 300 , 100 , 30);
        searchbyfavorite.add(backbtn);
        backbtn.setBounds(20 , this.getHeight()-100 , 90 , 40);

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
        sanguinerb.addActionListener((ActionEvent e) -> {
            nature = "Sanguine";
        });
        melancholicrb.addActionListener((ActionEvent e) -> {
            nature = "Melancholic";
        });
        phlegmaticrb.addActionListener((ActionEvent e)->{
            nature="Phlegmatic";
        });
        cholericrb.addActionListener((ActionEvent e) -> {
            nature = "Choleric";
        });
        othernature.addActionListener((ActionEvent e) -> {
            nature = "Others";
        });



        search.addActionListener((ActionEvent e)-> {
            this.setVisible(false);
            methods methods = new methods();
            String str = "";
            try {
                str = methods.searchfavorites(favFood,favSport,favArt,morale,nature);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            if (str.equals("")){
                JOptionPane.showMessageDialog(null,"Not found!");
                if (!myUsername.equals("admin")){
                    try {
                        mainPage mainpage = new mainPage(myUsername);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }else {
                    try {
                        Admin admin = new Admin();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            else{
                String[] array = str.split("\\*");
                SearchedUsers searchedUsers = new SearchedUsers(array , myUsername);
            }
        });
        backbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            if (!myUsername.equals("admin")) {
                Search search = new Search(myUsername);
            }else{
                try {
                    Admin admin = new Admin();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}

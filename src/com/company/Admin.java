package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Admin extends JFrame {

    private BufferedImage profilepicture = ImageIO.read(new File("D:\\AdminIcon.jpg"));
    private JLabel profilePicture = new JLabel(new ImageIcon(profilepicture));
    private JButton deletebtn = new JButton("Delete");
    private JButton updatebtn = new JButton("Update");
    private JButton searchbtn = new JButton("Search");
    private JButton logoutbtn = new JButton("Log out");

    private JLabel firstname = new JLabel("Username   : Admin");
    private JLabel lastname = new JLabel("Full name  : ");
    private JLabel Fullnamelbl ;
    private JLabel age = new JLabel("Age            : ");
    private JLabel Agelbl ;
    private JLabel sexuality = new JLabel("Sexuality   : ");
    private JLabel Sexuality ;
    private JLabel country = new JLabel("Country     : ");
    private JLabel Country ;
    private JLabel food = new JLabel("Favorite Food  : ");
    private JLabel Food ;
    private JLabel sport = new JLabel("Favorite Sport  : ");
    private JLabel Sport ;
    private JLabel art = new JLabel("Favorite Art      : ");
    private JLabel Art ;
    private JLabel morale = new JLabel("Morale               : ");
    private JLabel Morale ;
    private JLabel nature = new JLabel("Nature               : ");
    private JLabel Nature ;

    private JButton Reports = new JButton("Reports");

    JPanel Admin = new JPanel();

    public Admin() throws IOException {

        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo! (Admin)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 7 - getHeight() / 7);

        this.add(Admin);
        Admin.setLayout(null);

        Admin.add(profilePicture);
        profilePicture.setBounds(20, 20, 100, 100);
        Admin.add(deletebtn);
        deletebtn.setBounds(125, 55, 90, 30);
        Admin.add(updatebtn);
        updatebtn.setBounds(214, 55, 90, 30);
        Admin.add(searchbtn);
        searchbtn.setBounds(303, 55, 90, 30);
        Admin.add(logoutbtn);
        logoutbtn.setBounds(392, 55, 90, 30);

        Admin.add(firstname);
        firstname.setBounds(20, 135, 200, 30);
        Admin.add(lastname);
        lastname.setBounds(20, 170, 100, 30);
        Admin.add(age);
        age.setBounds(20, 205, 100, 30);
        Admin.add(sexuality);
        sexuality.setBounds(20, 240, 100, 30);
        Admin.add(country);
        country.setBounds(20, 280, 100, 30);
        Admin.add(food);
        food.setBounds(250, 135, 100, 30);
        Admin.add(sport);
        sport.setBounds(250, 170, 100, 30);
        Admin.add(art);
        art.setBounds(250, 205, 100, 30);
        Admin.add(morale);
        morale.setBounds(250, 240, 100, 30);
        Admin.add(nature);
        nature.setBounds(250, 280, 100, 30);
        Admin.add(Reports);
        Reports.setBounds(20, 330, 100, 35);

        String[] adminInfo = new String[9];
        FileReader data = new FileReader("D:\\Admin.txt");
        Scanner scan = new Scanner(data);
        int i=0;
        while (scan.hasNextLine() && i<9){
            adminInfo[i]=scan.nextLine();
            i++;
        }

        Fullnamelbl = new JLabel(adminInfo[0]);
        Agelbl      = new JLabel(adminInfo[1]);
        Sexuality   = new JLabel(adminInfo[2]);
        Country     = new JLabel(adminInfo[3]);
        Food        = new JLabel(adminInfo[4]);
        Sport       = new JLabel(adminInfo[5]);
        Art         = new JLabel(adminInfo[6]);
        Morale      = new JLabel(adminInfo[7]);
        Nature      = new JLabel(adminInfo[8]);

        Admin.add(Fullnamelbl);
        Fullnamelbl.setBounds(120 , 170 , 100 , 30);
        Admin.add(Agelbl);
        Agelbl.setBounds(120 , 205 , 100 ,30);
        Admin.add(Sexuality);
        Sexuality.setBounds(120 , 240 , 100 ,30);
        Admin.add(Country);
        Country.setBounds(120 , 280  , 100 ,30);
        Admin.add(Food);
        Food.setBounds(350 , 135 , 100 ,30);
        Admin.add(Sport);
        Sport.setBounds(350 , 170 , 100 ,30);
        Admin.add(Art);
        Art.setBounds(350 , 205 , 100 , 30);
        Admin.add(Morale);
        Morale.setBounds(350 , 240 , 100 , 30);
        Admin.add(Nature);
        Nature.setBounds(350 , 280 , 100 , 30);


        updatebtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            editAdminProfile editadminprofile = new editAdminProfile();
        });
        searchbtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Search search = new Search("admin");
        });
        logoutbtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                Form form = new Form();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        deletebtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            Deleteuser deleteuser = new Deleteuser();
        });
        Reports.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                Reports reports = new Reports();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

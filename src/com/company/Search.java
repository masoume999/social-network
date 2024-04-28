package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Search extends JFrame {
    private JPanel search = new JPanel();

    private JButton searchByUserNamebtn = new JButton("Search by Username");
    private JButton searchByFavoritesbtn = new JButton("Search by Favorite");
    private JButton backbtn = new JButton("Back");

    public Search(String myUsername){
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo!(search)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(search);
        search.setLayout(null);

        search.add(searchByUserNamebtn);
        searchByUserNamebtn.setBounds(this.getWidth()/2-100, this.getHeight()/2-100, 200 , 40);
        search.add(searchByFavoritesbtn);
        searchByFavoritesbtn.setBounds(this.getWidth()/2-100, this.getHeight()/2-50, 200 , 40);

        search.add(backbtn);
        backbtn.setBounds(20 , this.getHeight()-100 , 90 , 40);

        searchByUserNamebtn.addActionListener((ActionEvent e )->{
            this.setVisible(false);
            try {
                searchbyUsername searchbyusername = new searchbyUsername(myUsername);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        searchByFavoritesbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            searchbyFavorite searchbyfavorite = new searchbyFavorite(myUsername);
        });
        backbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            if (myUsername.equals("admin")){
                try {
                    Admin admin = new Admin();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else {
                try {
                    mainPage mainpage = new mainPage(myUsername);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}

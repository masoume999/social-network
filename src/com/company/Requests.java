package com.company;

import com.company.methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Requests extends JFrame {
    private JPanel Requests = new JPanel();
    private JButton backbtn = new JButton("Back");
    private JButton b1;
    private JButton b2;
    com.company.methods methods = new methods();

    public Requests(String username) throws IOException {

        methods methods = new methods();
        String str = methods.Getrequests(username);
        String[] array = str.split("\\*");

        this.setSize(500, 600);
        this.setTitle("Bo!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 7 - getHeight() / 7);

        this.add(Requests);
        Requests.setLayout(null);

        Requests.add(backbtn);
        backbtn.setBounds(20,450,90,50);

        int length = array.length;
        if (!array[0].equalsIgnoreCase("")) {
            for (int i = 0; i < length; i++) {
                b1 = new JButton(array[i]);
                b2 = new JButton("Accept");
                Requests.add(b1);
                Requests.add(b2);
                b1.setBounds(120, (i + 1) * 10 + i * 35, 200, 35);
                b2.setBounds(340, (i + 1) * 10 + i * 35, 90, 35);
                String string = array[i];
                b1.addActionListener((ActionEvent e) -> {
                    try {
                        this.setVisible(false);
                        showSearchedUser showSearchedUser = new showSearchedUser(string, username);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                });
                b2.addActionListener((ActionEvent e) -> {
                    this.setVisible(false);
                    try {
                        methods.Addtofriends(username, string);
                        mainPage mainpage = new mainPage(username);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                });
            }
        }
        backbtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                mainPage mainPage = new mainPage(username);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

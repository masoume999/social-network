package com.company;

import com.company.methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Reports extends JFrame {
    private JPanel Reports = new JPanel();
    private JButton backbtn = new JButton("Back");
    private JButton b1;
    com.company.methods methods = new methods();

    public Reports() throws IOException {

        methods methods = new methods();
        String str = methods.Getreports();
        String[] array = str.split("\\*");

        this.setSize(500, 600);
        this.setTitle("Bo! (reports)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 7 - getHeight() / 7);

        this.add(Reports);
        Reports.setLayout(null);

        Reports.add(backbtn);
        backbtn.setBounds(20,450,90,50);

        int length = array.length;
        if (!array[0].equalsIgnoreCase("x")) {
            for (int i = 0; i < length; i++) {
                b1 = new JButton(array[i]);
                Reports.add(b1);
                b1.setBounds(120, (i + 1) * 10 + i * 35, 200, 35);
                String string = array[i];
                b1.addActionListener((ActionEvent e) -> {
                    this.setVisible(false);
                    try {
                        showSearchedUsertoAdmin showSearchedUsertoAdmin = new showSearchedUsertoAdmin(string);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                });
            }
        }
        backbtn.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            try {
                Admin admin = new Admin();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

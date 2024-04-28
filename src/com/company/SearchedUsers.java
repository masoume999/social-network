package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.channels.GatheringByteChannel;

public class SearchedUsers extends JFrame {
    private JPanel SearchedUser = new JPanel();
    private JButton backbtn = new JButton("Back");
    private JButton b1;

    public SearchedUsers(String[] array , String myUsername){
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo!(search result)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(SearchedUser);
        SearchedUser.setLayout(null);

        int length = array.length;
        for (int i=0 ; i<length ; i++){
            b1 = new JButton(array[i]);
            SearchedUser.add(b1);
            b1.setBounds(150,(i+1)*10+i*35,200,35);
            int finalI = i;
            b1.addActionListener((ActionEvent e)->{
                this.setVisible(false);
                try {
                    if (!myUsername.equals("admin")){
                        showSearchedUser s = new showSearchedUser(array[finalI] , myUsername);
                    }else {
                        showSearchedUsertoAdmin ssua =  new showSearchedUsertoAdmin(array[finalI]);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
        }

        SearchedUser.add(backbtn);
        backbtn.setBounds(5,5,90,30);
        backbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            Search search = new Search(myUsername);
        });
    }
}

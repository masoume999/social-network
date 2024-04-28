package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Deleteuser extends JFrame {
    String usernamestr;
    private JLabel usernamelbl = new JLabel("Username :");
    private JTextField usernametxt = new JTextField();
    private JButton deletebtn = new JButton("Delete");
    private JButton backbtn = new JButton("Back");
    private JPanel Deleteuser = new JPanel();

    public Deleteuser (){
        this.setSize(500, 600);//size of JFrame
        this.setTitle("Bo!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width/2 - getWidth()/2 , size.height/7 - getHeight()/7);

        this.add(Deleteuser);
        Deleteuser.setLayout(null);
        Deleteuser.add(usernamelbl);
        Deleteuser.add(usernametxt);
        Deleteuser.add(backbtn);
        Deleteuser.add(deletebtn);

        usernamelbl.setBounds(80,200,200,35);
        usernametxt.setBounds(180,200,250,35);
        deletebtn.setBounds(375,450,90,50);
        backbtn.setBounds(30,450,90,50);

        deletebtn.addActionListener((ActionEvent e)->{
            usernamestr = usernametxt.getText();
            if (!usernamestr.equalsIgnoreCase("")){
                try {
                    if (new methods().isUser(usernamestr)){
                        methods methods = new methods();
                        methods.deleteUser(usernamestr);
                        JOptionPane.showMessageDialog(null, "User deleted!","Massage",JOptionPane.WARNING_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(null , "User not found!","Oops!",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else {
                JOptionPane.showMessageDialog(null,"Username text field can not be empty!" , "Oops!" , JOptionPane.WARNING_MESSAGE);
            }
            try {
                Admin admin = new Admin();
                this.setVisible(false);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        backbtn.addActionListener((ActionEvent e)->{
            this.setVisible(false);
            try {
                Admin admin = new Admin();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

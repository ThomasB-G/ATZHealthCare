/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author russell
 */
public class LoginView extends JFrame {
    private JPanel panel;
    private final ControllerUsers cntl;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toRegister;
    private JLabel userNameLabel;
    private final JTextField userName = new JTextField(15);
    private JLabel passWordLabel;
    private final JTextField passWord = new JTextField(15);
    private JPanel cntrButtons;
    private JPanel loginButton;

    public LoginView(ControllerUsers cntl){
        
        this.cntl = cntl;
        init_components();
    }
    
    private void init_components(){
        this.setTitle("Login");
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        cntrButtons = new JPanel(new GridLayout(5, 1));
        loginButton = new JPanel();
        
        userNameLabel = new JLabel("Username:");
        passWordLabel = new JLabel("Password:");
        
        toRegister = new JButton("Login to Application");
        toRegister.addActionListener(event -> checkCredentials(userName.getText(),passWord.getText()));
        nrth.setBackground(Color.BLUE);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.BLUE);
        east.setBackground(Color.BLUE);
        cntr.setBackground(Color.WHITE);
        cntrButtons.setBackground(Color.WHITE);
        loginButton.setBackground(Color.WHITE);
        cntrButtons.add(userNameLabel);
        cntrButtons.add(userName);
        cntrButtons.add(passWordLabel);
        cntrButtons.add(passWord);
        loginButton.add(toRegister);
        cntr.add(cntrButtons);
        cntr.add(loginButton);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    private void checkCredentials(String userName, String passWord){
        cntl.checkCredentials(userName,passWord);
    }
    
    
    
}

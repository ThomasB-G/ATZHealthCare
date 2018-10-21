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
    private ControllerUsers cntl;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toRegister;
    private JLabel userNameLabel;
    private JTextField userName = new JTextField(15);
    private JLabel passWordLabel;
    private JTextField passWord = new JTextField(15);

    public LoginView(ControllerUsers cntl){
        this.cntl = cntl;
        this.setTitle("Login");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel(new GridLayout(5, 1));
        
        userNameLabel = new JLabel("Username:");
        passWordLabel = new JLabel("Password:");
        
        toRegister = new JButton("Login");
        toRegister.addActionListener(event -> cntl.toDocumentButtonPushed());
        nrth.setBackground(Color.BLUE);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.BLUE);
        east.setBackground(Color.BLUE);
        cntr.setBackground(Color.WHITE);
        cntr.add(userNameLabel);
        cntr.add(userName);
        cntr.add(passWordLabel);
        cntr.add(passWord);
        cntr.add(toRegister);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    
}

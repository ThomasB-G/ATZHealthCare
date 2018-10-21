/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author evanadipietro
 */
public class HomePage extends JFrame{
    public Font fntNormal = new Font("Georgia", Font.PLAIN, 24);
    public Font fntHeading = new Font("Georgia", Font.PLAIN, 24);
    public Color transparent = new Color(0,0,0,0);
    public JPanel nrth = new JPanel();
    public JPanel sth = new JPanel();
    public JPanel west = new JPanel();
    public JPanel east = new JPanel();
    public JPanel cntr = new JPanel();
    public JLabel welcome = new JLabel("Welcome! Please login or register for a new account.");
    public JButton login;
    public JButton register;
    private ControllerUsers cntl;
    
    
    public HomePage(ControllerUsers cntl){
        login = new JButton("Login");
        register = new JButton("Register");
        login.addActionListener(event -> cntl.toLogin());
        register.addActionListener(event -> cntl.toRegisterButtonPushed());
        nrth.setBackground(Color.BLUE);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.BLUE);
        east.setBackground(Color.BLUE);
        cntr.setBackground(Color.WHITE);
        cntr.add(welcome);
        cntr.add(login);
        cntr.add(register);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
}

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
public class RegisterView extends JFrame {
    private JPanel panel;
    private ControllerUsers cntl;
    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel userNameLabel;
    private JLabel passWordLabel;
    private JTextField firstNameText = new JTextField(15);
    private JTextField lastNameText = new JTextField(15);
    private JTextField userNameText = new JTextField(15);
    private JTextField passWordText = new JTextField(15);
    private JPanel registerButton;
    private JPanel cntrButtons;
    
    private JButton nextController;

    public RegisterView(ControllerUsers cntl){
        this.cntl = cntl;
        this.setSize(400,300);
        
        this.setTitle("RegisterView");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        registerButton = new JPanel();
        cntr = new JPanel();
        cntrButtons = new JPanel(new GridLayout(5, 1));
        lastNameLabel = new JLabel("Last Name:");
        firstNameLabel = new JLabel("First Name:");
        userNameLabel = new JLabel("Username:");
        passWordLabel = new JLabel("Password:");
        
        
        
        nextController = new JButton("Register Account");
        nextController.addActionListener(event -> toHome());
        nrth.setBackground(Color.BLUE);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.BLUE);
        east.setBackground(Color.BLUE);
        cntr.setBackground(Color.WHITE);
        cntrButtons.setBackground(Color.WHITE);
        registerButton.setBackground(Color.WHITE);
        cntrButtons.add(firstNameLabel);
        cntrButtons.add(firstNameText);
        cntrButtons.add(lastNameLabel);
        cntrButtons.add(lastNameText);
        cntrButtons.add(userNameLabel);
        cntrButtons.add(userNameText);
        cntrButtons.add(passWordLabel);
        cntrButtons.add(passWordText);
        cntr.add(cntrButtons);
        registerButton.add(nextController);
        cntr.add(registerButton);
        
        
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    private void toHome(){
        cntl.toHome();
    }

    
    
    
}

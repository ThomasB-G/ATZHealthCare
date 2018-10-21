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
    
    private JButton nextController;

    public RegisterView(ControllerUsers cntl){
        this.cntl = cntl;
        this.setSize(400,300);
        
        this.setTitle("RegisterView");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel(new GridLayout(5, 1));
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
        cntr.add(firstNameLabel);
        cntr.add(firstNameText);
        cntr.add(lastNameLabel);
        cntr.add(lastNameText);
        cntr.add(userNameLabel);
        cntr.add(userNameText);
        cntr.add(passWordLabel);
        cntr.add(passWordText);
        cntr.add(nextController);
        
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

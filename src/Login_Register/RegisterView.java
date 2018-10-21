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
    private final ControllerUsers cntl;
    private final JPanel nrth;
    private final JPanel sth;
    private final JPanel west;
    private final JPanel east;
    private final JPanel cntr;
    private final JLabel firstNameLabel;
    private final JLabel lastNameLabel;
    private final JLabel userNameLabel;
    private final JLabel passWordLabel;
    private final JLabel addressLabel;
    private final JLabel genderLabel;
    private final JLabel phoneNumberLabel;
    private final JLabel ageLabel;
    private final JTextField firstNameText = new JTextField(15);
    private final JTextField lastNameText = new JTextField(15);
    private final JTextField userNameText = new JTextField(15);
    private final JTextField passWordText = new JTextField(15);
    private final JTextField addressText = new JTextField(15);
    private final JTextField genderText = new JTextField(15);
    private final JTextField phoneNumberText = new JTextField(15);
    private final JTextField ageText = new JTextField(15);
    private final JPanel registerButton;
    private final JPanel cntrButtons;
    private final JLabel accountType;
    private final JComboBox accountTypeSelect;
    
    private final JButton nextController;

    public RegisterView(ControllerUsers cntl){
        this.cntl = cntl;
        this.setSize(400,400);
        
        this.setTitle("Register for an Account");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        registerButton = new JPanel();
        cntr = new JPanel();
        cntrButtons = new JPanel(new GridLayout(9, 1));
        lastNameLabel = new JLabel(" Last Name:");
        firstNameLabel = new JLabel(" First Name:");
        addressLabel = new JLabel(" Address: ");
        
        userNameLabel = new JLabel(" Username:");
        passWordLabel = new JLabel(" Password:");
        accountType = new JLabel(" Account Type:");
        genderLabel = new JLabel(" Gender:");
        phoneNumberLabel = new JLabel(" Phone Number:");
        ageLabel = new JLabel(" Age:");
        
        String[] types = new String[]{"Patient","Doctor","Pharmacist","Hospital Admin"};
        accountTypeSelect = new JComboBox<>(types);
        
        
        
        
        nextController = new JButton("Register Account");
        nextController.addActionListener(event -> registerAccount());
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
        cntrButtons.add(ageLabel);
        cntrButtons.add(ageText);
        cntrButtons.add(genderLabel);
        cntrButtons.add(genderText);
        cntrButtons.add(addressLabel);
        cntrButtons.add(addressText);
        cntrButtons.add(phoneNumberLabel);
        cntrButtons.add(phoneNumberText);
        cntrButtons.add(userNameLabel);
        cntrButtons.add(userNameText);
        cntrButtons.add(passWordLabel);
        cntrButtons.add(passWordText);
        cntrButtons.add(accountType);
        cntrButtons.add(accountTypeSelect);
        cntr.add(cntrButtons);
        registerButton.add(nextController);
        cntr.add(registerButton);
        
        
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
    }
    
    private void registerAccount(){
        try{
            cntl.addUser(firstNameText.getText(), lastNameText.getText(), addressText.getText(), genderText.getText(), userNameText.getText(), passWordText.getText(), phoneNumberText.getText(), Integer.parseInt(ageText.getText()),phoneNumberText.getText());
           cntl.toHome();
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "invalid/missing age. Please enter age and try again. ");
        }
        //System.out.println(cntl.getUsers());
        
    }
    
    

    
    
    
}

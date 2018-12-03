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
    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel userNameLabel;
    private JLabel passWordLabel;
    private JLabel addressLabel;
    private JLabel genderLabel;
    private JLabel phoneNumberLabel;
    private JLabel ageLabel;
    private final JTextField firstNameText = new JTextField(20);
    private final JTextField lastNameText = new JTextField(20);
    private final JTextField userNameText = new JTextField(20);
    private final JTextField passWordText = new JTextField(20);
    private final JTextField addressText = new JTextField(20);
    private final JTextField genderText = new JTextField(20);
    private final JTextField phoneNumberText = new JTextField(20);
    private final JTextField ageText = new JTextField(20);
    private JPanel registerButton;
    private JPanel cntrButtons;
    private JLabel accountType;
    private JComboBox accountTypeSelect;
    private JPanel topPanel;
    private JLabel instructions;
    
    private JButton nextController;

    public RegisterView(ControllerUsers cntl){
        this.cntl = cntl;
        initComponents();
        
        
    }
    
    private void initComponents(){
        this.setSize(600,400);
        
        this.setTitle("Register for an Account");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        registerButton = new JPanel();
        cntr = new JPanel();
        topPanel = new JPanel();
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
        
        String[] types = new String[]{"Doctor"};
        accountTypeSelect = new JComboBox<>(types);
        
        userNameText.setText("username");
        passWordText.setText("Passw0rd!");
        phoneNumberText.setText("(000)-000-0000");
        genderText.setText("Female");
        ageText.setText("0");
        addressText.setText("100 Sunnyvale Blvd, Howard, MD 21029");
        firstNameText.setText("First Name");
        lastNameText.setText("Last Name");
        instructions = new JLabel("Please enter your information in the format shown below.");
        
        
        
        nextController = new JButton("Register Account");
        nextController.addActionListener(event -> registerAccount());
        nrth.setBackground(Color.LIGHT_GRAY);
        sth.setBackground(Color.LIGHT_GRAY);
        west.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.LIGHT_GRAY);
        cntr.setBackground(Color.LIGHT_GRAY);
        cntrButtons.setBackground(Color.LIGHT_GRAY);
        registerButton.setBackground(Color.LIGHT_GRAY);
        topPanel.setBackground(Color.LIGHT_GRAY);
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
        topPanel.add(instructions);
        cntr.add(topPanel);
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
            cntl.addUser(firstNameText.getText(), lastNameText.getText(), addressText.getText(), genderText.getText(), userNameText.getText(), passWordText.getText(), phoneNumberText.getText(), Integer.parseInt(ageText.getText()),accountTypeSelect.getSelectedItem().toString());
           JOptionPane.showMessageDialog(null, "User successfully added. Please login to the application.");
            cntl.toHome();
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "invalid/missing age. Please enter age and try again. ");
        }
        
    }
    
    

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
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

    public LoginView(ControllerUsers cntl){
        this.cntl = cntl;
        this.setTitle("LoginView");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        toRegister = new JButton("To Register");
        toRegister.addActionListener(event -> cntl.toRegisterButtonPushed());
        nrth.setBackground(Color.RED);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.GREEN);
        east.setBackground(Color.CYAN);
        cntr.setBackground(Color.YELLOW);
        cntr.add(toRegister);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    
}

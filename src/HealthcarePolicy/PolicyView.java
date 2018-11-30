/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class PolicyView extends JFrame {
     private JPanel panel;

    private ControllerPolicy cntl;
    private Policy newPolicy;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toExit;
    
    public PolicyView(ControllerPolicy cntl){
    this.cntl = cntl;
        this.setTitle("Policy View");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        nrth.setBackground(Color.LIGHT_GRAY);
        sth.setBackground(Color.LIGHT_GRAY);
        west.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.LIGHT_GRAY);
        cntr.setBackground(Color.LIGHT_GRAY);
        
        toExit = new JButton("Return Home");
        toExit.addActionListener(event -> cntl.toHome());
        cntr.setLayout(new BoxLayout(cntr, BoxLayout.Y_AXIS));
        JLabel policy = new JLabel("Legal information and details regarding healthcare policies will be displayed below");
        JButton policyInfo = new JButton("Click to View Policy");
        newPolicy = new Policy("hipaa","This is the Health Insurance Portability and Accountability Act of 1996. This policy discusses data privacy and security provisions for safeguarding medical information.",new File("hippa.txt"));
        cntr.add(policy);
        cntr.add(toExit);
        cntr.add(policyInfo);
        
        
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    
}

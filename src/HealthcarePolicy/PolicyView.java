/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.awt.BorderLayout;
import java.awt.Color;
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
        JPanel instructions = new JPanel();
        JPanel buttons = new JPanel();
        JPanel goHome = new JPanel();
        cntr.add(instructions,BorderLayout.NORTH);
        cntr.add(buttons,BorderLayout.CENTER);
        cntr.add(goHome,BorderLayout.SOUTH);
        
        
        //cntr.setLayout(new GridLayout(5,1));
        JLabel policy = new JLabel("Legal information and details regarding healthcare policies:");
        instructions.add(policy);
        instructions.setBackground(Color.LIGHT_GRAY);
        
        JButton policyInfo = new JButton("Click to View Policy");
        
        goHome.add(toExit);
        goHome.setBackground(Color.LIGHT_GRAY);
        buttons.setBackground(Color.LIGHT_GRAY);
        newPolicy = new Policy("hipaa security policy","This is the Health Insurance Portability and Accountability Act of 1996. This policy discusses data privacy and security provisions for safeguarding medical information.","hippa.txt");
        
        JLabel hipaaInfo = new JLabel(newPolicy.getPolicy());
        buttons.add(hipaaInfo);
        buttons.add(policyInfo);
        policyInfo.addActionListener(event -> cntl.viewHipaa());
        //cntr.add(policy);
        //cntr.add(hipaaInfo);
        //cntr.add(policyInfo);
       // cntr.add(toExit);
        
        
        
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    
}

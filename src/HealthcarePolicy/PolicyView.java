/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import UpdateCenterStatus.ControllerCenter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class PolicyView extends JFrame {
     private JPanel panel;

    private ControllerPolicy cntl;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toStatus;
    
    public PolicyView(ControllerPolicy cntl){
    this.cntl = cntl;
        this.setTitle("Policy View");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        toStatus = new JButton("Log Out");
        toStatus.addActionListener(event -> cntl.toPolicyButtonPushed());
        nrth.setBackground(Color.RED);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.GREEN);
        east.setBackground(Color.CYAN);
        cntr.setBackground(Color.YELLOW);
        cntr.add(toStatus);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    
    
}

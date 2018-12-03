/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class DocumentsView extends JFrame {
    private JPanel panel;
    
    private ControllerDocs cntl;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toCommunication;
    private JButton toPolicy;
    private JButton toStatus;
    private JButton toRefill;
    private JButton toExit;
 
    public DocumentsView(ControllerDocs cntl){
        this.cntl = cntl;
        
        this.setTitle("DocumentsView");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        toCommunication = new JButton("Communication");
        toCommunication.addActionListener(event -> cntl.toCommunicationButtonPressed());
        toPolicy = new JButton("Policies");
        toPolicy.addActionListener(event -> cntl.moveToPolicy());
        toStatus = new JButton("Center Status");
        toStatus.addActionListener(event -> cntl.moveToStatus());
        toRefill = new JButton("Prescriptions");
        toRefill.addActionListener(event -> cntl.moveToRefill());
        toExit = new JButton("Exit Application");
        toExit.addActionListener(event -> cntl.toExit());
        
        nrth.setBackground(Color.LIGHT_GRAY);
        sth.setBackground(Color.LIGHT_GRAY);
        west.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.LIGHT_GRAY);
        cntr.setBackground(Color.LIGHT_GRAY);
        cntr.add(toCommunication);
        cntr.add(toPolicy);
        cntr.add(toStatus);
        cntr.add(toRefill);
        cntr.add(toExit);
       
        
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }


    
    
}

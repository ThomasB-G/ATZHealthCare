/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
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
    
    private JButton nextController;

    public RegisterView(ControllerUsers cntl){
        this.cntl = cntl;
        this.setSize(400,300);
        
        this.setTitle("RegisterView");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        nextController = new JButton("To Documents");
        nextController.addActionListener(event -> cntl.toDocumentButtonPushed());
        nrth.setBackground(Color.RED);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.GREEN);
        east.setBackground(Color.CYAN);
        cntr.setBackground(Color.YELLOW);
        cntr.add(nextController);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }

    
    
    
}

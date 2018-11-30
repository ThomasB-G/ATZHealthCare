/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class MessageView extends JFrame {
    private JPanel panel;
    private ControllerCom cntl;
    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toRefill;
    private JTextArea textMessage;
    public MessageView(ControllerCom cntl){
        this.cntl = cntl;
        this.setTitle("MessageView");
        textMessage = new JTextArea("Message - Description ");
        textMessage.setCaretColor(Color.black);
        textMessage.setBackground(Color.white);
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        toRefill = new JButton("To Refill");
        toRefill.addActionListener(event -> cntl.toRefillButtonPushed());
        nrth.setBackground(Color.blue);
        sth.setBackground(Color.blue);
        west.setBackground(Color.blue);
        east.setBackground(Color.blue);
        cntr.setBackground(Color.WHITE);
        sth.add(toRefill);
        cntr.add(textMessage);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }

    
    
}

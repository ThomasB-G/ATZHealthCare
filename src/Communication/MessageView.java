/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
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
    private JButton sendMessage;
    JTextArea textMessage;
    private JTextField subjectValue;
    JTextField recipientValue;
    private JComboBox importance;
    public MessageView(ControllerCom cntl){
        this.cntl = cntl;
        this.setTitle("MessageView");
        textMessage = new JTextArea("");
        textMessage.setCaretColor(Color.black);
        textMessage.setBackground(Color.white);
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        sendMessage = new JButton("Send Message");
        sendMessage.addActionListener(event -> cntl.sendMessage());
        nrth.setBackground(Color.LIGHT_GRAY);
        sth.setBackground(Color.LIGHT_GRAY);
        west.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.LIGHT_GRAY);
        cntr.setBackground(Color.LIGHT_GRAY);
        cntr.setLayout(new GridLayout(10,2));
        String[] importanceValues={"low","medium","high"};
        JLabel recipientLabel = new JLabel("To: ");
        recipientValue = new JTextField(20);
        JLabel subjectLabel = new JLabel("Subject: ");
        subjectValue = new JTextField(20);
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(event -> cntl.toInbox());
        sth.add(goBack);
        sth.add(sendMessage);
        
        cntr.add(recipientLabel);
        cntr.add(recipientValue);
        cntr.add(subjectLabel);
        cntr.add(subjectValue);
        JLabel importanceLabel = new JLabel("Priority: ");
        importance= new JComboBox<>(importanceValues);
        cntr.add(importanceLabel);
        cntr.add(importance);
        JLabel descriptionLabel = new JLabel("Message Contents:");
        cntr.add(descriptionLabel);
        cntr.add(textMessage);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }

    
    
}

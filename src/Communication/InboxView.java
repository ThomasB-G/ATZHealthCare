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
public class InboxView extends JFrame{

    
    private JPanel panel;
    private ControllerCom cntl;
    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toMessage;

    public InboxView(ControllerCom cntl){
        this.cntl = cntl;
        this.setTitle("Inbox");
        
        String[][] data = {{"Joe Shoe", "12/1 Appointment","Can we reschedule?"}, {"Holly Bo", "Heart Rate","My resting heart rate is 140. Is that okay?"}, {"Billy Bob", "Follow up","I have some questions about our recent appointment"}};
        
        String[] columns = {"Sender", "Subject","Description"};
        
        JTable table = new JTable(data, columns);
        
        table.setColumnSelectionAllowed(true);
        
        table.setColumnSelectionAllowed(true);
        
        JScrollPane jp = new JScrollPane(table);
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        toMessage = new JButton("Send a Message");
        toMessage.addActionListener(event -> cntl.toMessageButtonPushed());
        JButton goBack = new JButton("Go Home");
        goBack.addActionListener(event -> cntl.toHome());
        nrth.setBackground(Color.LIGHT_GRAY);
        sth.setBackground(Color.LIGHT_GRAY);
        west.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.LIGHT_GRAY);
        cntr.setBackground(Color.LIGHT_GRAY);
        cntr.add(goBack);
        cntr.add(toMessage);
        cntr.add(jp);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(600,400);
    }

}








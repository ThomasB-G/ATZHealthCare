/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class StatusView extends JFrame {
    private JPanel panel;
    
    private ControllerCenter cntl;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toPolicy;
    private JLabel currentStatusField;
    private String status;
    private JComboBox<String[]> statusOptions;
    private JButton updateStatus;
    private JButton toExit;
    
    public StatusView(ControllerCenter cntl){
    this.cntl = cntl;
        this.setTitle("Status View");
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
       
         if(cntl.getStatus().equals("")){
            status = "Nominal";
        }else{
             status = cntl.getStatus();
         }
        currentStatusField = new JLabel("Medical Center Outbreak Status: " + status);
        
        toPolicy = new JButton("To Policy");
        toPolicy.addActionListener(event -> cntl.toPolicyButtonPressed());
        
        String[] options = {"Nominal","Warning","Outbreak"};
        updateStatus = new JButton("Update Center Status");
        updateStatus.addActionListener(event -> updateStatus());
        
        toExit = new JButton("Return Home");
        toExit.addActionListener(event -> cntl.toHome());
        statusOptions =  new JComboBox(options);
        nrth.setBackground(Color.BLUE);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.BLUE);
        east.setBackground(Color.BLUE);
        cntr.setBackground(Color.WHITE);
        cntr.add(currentStatusField);
        cntr.add(statusOptions);
        cntr.add(updateStatus);
        cntr.add(toPolicy);
        cntr.add(toExit);
        
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(400,300);
    }
    private void updateStatus(){
        cntl.setStatus((String) statusOptions.getSelectedItem());
        status = cntl.getStatus();
        
        this.dispose();
        currentStatusField.setText("Medical Center Outbreak Status: " + status);
        this.setVisible(true);
          
    }

    
}

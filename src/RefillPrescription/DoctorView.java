/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class DoctorView extends JFrame {
    private JPanel panel;

    private ControllerRefill cntl;

    private JPanel nrth;
    private JPanel sth;
    private JPanel west;
    private JPanel east;
    private JPanel cntr;
    private JButton toHome;
    JTextField nameValue = new JTextField(20);
    JTextField patientNameValue = new JTextField(20);
    JTextField doctorNameValue = new JTextField(20);
    JTextField typeValue = new JTextField(20);
    JTextField prescriptionDaysValue = new JTextField(20);
    JTextField maxRefillValue = new JTextField(20);

    public DoctorView(ControllerRefill cntl){
        this.cntl = cntl;
        this.setTitle("DoctorView");
        String[][] data = {{"subject one", "recipient"}, {"subject two", "recipient two"}, {"subject three", "recipient three"}, {"subject four", "recipient four"}};
        
        String[] columns = {"Subject", "Recipient"};
        
        JTable table = new JTable(data, columns);
        
        table.setColumnSelectionAllowed(true);
        
        table.setColumnSelectionAllowed(true);
        
        JScrollPane jp = new JScrollPane(table);
        
        nrth = new JPanel();
        sth = new JPanel();
        west = new JPanel();
        east = new JPanel();
        cntr = new JPanel();
        
        toHome = new JButton("Go Home");
        toHome.addActionListener(event -> cntl.toHome());
        nrth.setBackground(Color.LIGHT_GRAY);
        sth.setBackground(Color.LIGHT_GRAY);
        west.setBackground(Color.LIGHT_GRAY);
        east.setBackground(Color.LIGHT_GRAY);
        cntr.setBackground(Color.LIGHT_GRAY);
        JPanel instructions = new JPanel();
        cntr.add(instructions);
        JPanel information = new JPanel();
        cntr.add(information);
        information.setLayout(new GridLayout(10,2));
        information.setBackground(Color.LIGHT_GRAY);
        instructions.setBackground(Color.LIGHT_GRAY);
        JLabel newPrescriptionInfo = new JLabel("Send a new prescription");
        instructions.add(newPrescriptionInfo);
        JLabel nameLabel = new JLabel("Name of Prescription: ");
        information.add(nameLabel);
        
        information.add(nameValue);
        JLabel patientNameLabel = new JLabel("Name of Patient: ");
        information.add(patientNameLabel);
        
        information.add(patientNameValue);
        JLabel doctorNameLabel = new JLabel("Name of Doctor: ");
        information.add(doctorNameLabel);
        
        information.add(doctorNameValue);
        JLabel typeLabel = new JLabel("Type of Prescription: ");
        information.add(typeLabel);
        
        information.add(typeValue);
        JLabel prescriptionDaysLabel = new JLabel("Number of Days Valid: ");
        information.add(prescriptionDaysLabel);
        
        information.add(prescriptionDaysValue);
        JLabel maxRefillLabel = new JLabel("Maximum Number of Refills: ");
        information.add(maxRefillLabel);
        
        information.add(maxRefillValue);
        JButton toPharmacy = new JButton("Send Prescription to Pharmacy");
        toPharmacy.addActionListener(event -> cntl.sendPrescription());
        cntr.add(toPharmacy);
        cntr.add(toHome);
        
        this.add(nrth, BorderLayout.NORTH);
        this.add(sth, BorderLayout.SOUTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(cntr, BorderLayout.CENTER);
        this.setSize(520,400);
    }
    
    
}

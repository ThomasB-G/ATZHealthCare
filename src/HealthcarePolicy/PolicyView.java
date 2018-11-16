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
        
        toExit = new JButton("Return Home");
        toExit.addActionListener(event -> cntl.toHome());
        nrth.setBackground(Color.BLUE);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.BLUE);
        east.setBackground(Color.BLUE);
        cntr.setBackground(Color.WHITE);
        cntr.setLayout(new BoxLayout(cntr, BoxLayout.Y_AXIS));
        JLabel policy = new JLabel("Legal information and details regarding healthcare policies will be displayed below");
        JTextArea policyInfo = new JTextArea(5, 20);
        policyInfo.setEditable(false);
        
        String data ="Section 1. Short Title\n" +
"This [Act][regulation] may be known as the Health Policy Rate and Form Filing [Act][Regulation].\n" +
"[Section 2. Purpose\n" +
"The purpose of this Act is to provide a uniform standard for processing of accident and health carrier policy rate and form\n" +
"filings.]\n" +
"Drafting Note: This option should be used if the state is adopting this model as a statute.\n" +
"Drafting Note: If the state requires approval of marketing material, a reference should be added in this section.\n" +
"[Section 2. Authority\n" +
"This regulation is issued pursuant to the authority vested in the commissioner under [cite sections of state law establishing the\n" +
"commissioner’s authority to issue regulations]].\n" +
"Drafting Note: If the state determines it has the authority to adopt the provisions of this model by regulation, this option should be used.\n" +
"Section 3. Definitions\n" +
"A. “Accident and health carrier” means an entity licensed to offer accident and health insurance in this state,\n" +
"or subject to the insurance laws and regulations of this state, or subject to the jurisdiction of the\n" +
"commissioner, that contracts or offers to contract to provide, deliver, arrange for, pay for or reimburse any\n" +
"of the costs of health care services, or any insurer that provides policies of supplemental, disability income,\n" +
"Medicare supplement or long term care insurance.\n" +
"B. “Commissioner” means the insurance commissioner of this state.\n" +
"Drafting Note: Where the word “commissioner” appears in this regulation, the appropriate designation for the chief insurance supervisory official of the\n" +
"state should be substituted.\n" +
"C. “Health care services” means services for the diagnosis, prevention, treatment, cure or relief of a health\n" +
"condition, illness, injury or disease.\n" +
"D. “Policy form” means any policy, contract, certificate, rider, endorsement, evidence of coverage or any ";
        
        policyInfo.append(data);
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

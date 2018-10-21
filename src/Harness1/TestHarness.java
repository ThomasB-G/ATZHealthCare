/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harness1;

import javax.swing.JFrame;
import Login_Register.ControllerUsers;
import java.awt.BorderLayout;
import javax.swing.JLabel;
/**
 *
 * @author lly5031
 */
public class TestHarness extends JFrame {
   
    
    public TestHarness(){
    setLayout(new BorderLayout());
    setSize(400,300);
    setTitle("ATZ Test Harness");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ProjectLayout pl = new ProjectLayout(this);
    JLabel appName = new JLabel("ATZ HealthCare", JLabel.CENTER);
    
            }
    public void startFlow(){
        ControllerUsers firstCntl = new ControllerUsers();
        this.dispose();
    }
    
    public void register(){
        ControllerUsers firstCntl = new ControllerUsers();
        this.dispose();
        firstCntl.toRegisterButtonPushed();
    }
}

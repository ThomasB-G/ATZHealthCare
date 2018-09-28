/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class LoginView extends JFrame {
    private JPanel panel;
    private ControllerUsers cntl;

    public LoginView(ControllerUsers cntl){
        this.cntl = cntl;
    }

    public LoginView(GraphicsConfiguration gc) {
        super(gc);
    }

    public LoginView(String title) throws HeadlessException {
        super(title);
    }

    public LoginView(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
}

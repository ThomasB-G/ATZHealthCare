/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author russell
 */
public class PharmacistView extends JFrame {
    private JPanel panel;

    public PharmacistView(JPanel panel) throws HeadlessException {
        this.panel = panel;
    }

    public PharmacistView(JPanel panel, GraphicsConfiguration gc) {
        super(gc);
        this.panel = panel;
    }

    public PharmacistView(JPanel panel, String title) throws HeadlessException {
        super(title);
        this.panel = panel;
    }

    public PharmacistView(JPanel panel, String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.panel = panel;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
}

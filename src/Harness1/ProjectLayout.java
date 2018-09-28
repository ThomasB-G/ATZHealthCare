/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harness1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lly5031
 */
public class ProjectLayout {
    public Font fntNormal = new Font("Georgia", Font.PLAIN, 24);
    public Font fntHeading = new Font("Georgia", Font.PLAIN, 24);
    public Color transparent = new Color(0,0,0,0);
    public JPanel nrth = new JPanel();
    public JPanel sth = new JPanel();
    public JPanel west = new JPanel();
    public JPanel east = new JPanel();
    public JPanel cntr = new JPanel();
    
    public ProjectLayout(JFrame jf){
        nrth.setBackground(Color.RED);
        sth.setBackground(Color.BLUE);
        west.setBackground(Color.GREEN);
        east.setBackground(Color.CYAN);
        cntr.setBackground(Color.YELLOW);
        
        jf.add(nrth, BorderLayout.NORTH);
        jf.add(sth, BorderLayout.SOUTH);
        jf.add(east, BorderLayout.EAST);
        jf.add(west, BorderLayout.WEST);
        jf.add(cntr, BorderLayout.CENTER);
    }
}

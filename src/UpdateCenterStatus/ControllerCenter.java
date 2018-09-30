/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

/**
 *
 * @author russell
 */
public class ControllerCenter {
    private ModelCenter model;
    private StatusView statusView;

    public ControllerCenter(){
        this.statusView = new StatusView(this);
        
        
        this.statusView.setVisible(true);
    }
    
    public void toPolicyButtonPressed(){
        this.statusView.dispose();
        
        HealthcarePolicy.ControllerPolicy nextCntl = new HealthcarePolicy.ControllerPolicy();
    }
    
    
}

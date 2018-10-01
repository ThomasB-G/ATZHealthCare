/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

import java.util.LinkedList;

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
    public LinkedList<Status> getStatuses(){
        
        return model.getStatuses();
    }
        public void setStatuses(LinkedList<Status> statuses) {
        model.setStatuses(statuses);
    }
      public void addStatus(Status status) {
        model.addStatus(status);
    }
        
    
}

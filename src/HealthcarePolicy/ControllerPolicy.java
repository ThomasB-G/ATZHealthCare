/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

/**
 *
 * @author russell
 */
public class ControllerPolicy {
    private ModelPolicy model;
    private PolicyView policyView;

    public ControllerPolicy() {
        this.policyView = new PolicyView(this);
        
        
        this.policyView.setVisible(true);
    }
    
    public void toExitButtonPushed(){
        this.policyView.dispose();
    }
    
}

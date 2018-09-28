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
    private PolicyView view;

    public ControllerPolicy(ModelPolicy model, PolicyView view) {
        this.model = model;
        this.view = view;
    }

    public ModelPolicy getModel() {
        return model;
    }

    public void setModel(ModelPolicy model) {
        this.model = model;
    }

    public PolicyView getView() {
        return view;
    }

    public void setView(PolicyView view) {
        this.view = view;
    }
    
}

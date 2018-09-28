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
    private StatusView view;

    public ControllerCenter(ModelCenter model, StatusView view) {
        this.model = model;
        this.view = view;
    }

    public ModelCenter getModel() {
        return model;
    }

    public void setModel(ModelCenter model) {
        this.model = model;
    }

    public StatusView getView() {
        return view;
    }

    public void setView(StatusView view) {
        this.view = view;
    }
    
    
}

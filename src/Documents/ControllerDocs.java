/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

/**
 *
 * @author russell
 */
public class ControllerDocs {
    private DocumentsView view;
    private ModelDocs model;

    public ControllerDocs() {
        
    }

    public DocumentsView getView() {
        return view;
    }

    public void setView(DocumentsView view) {
        this.view = view;
    }

    public ModelDocs getModel() {
        return model;
    }

    public void setModel(ModelDocs model) {
        this.model = model;
    }
    
    
}

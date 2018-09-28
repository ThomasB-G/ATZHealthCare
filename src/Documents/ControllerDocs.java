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
        this.view = new DocumentsView(this);
        this.view.setVisible(true);
    }
    
    public void toCommunicationButtonPressed()
    {
        this.view.dispose();
        
        Communication.ControllerCom nextCntl  = new Communication.ControllerCom();
    }
}

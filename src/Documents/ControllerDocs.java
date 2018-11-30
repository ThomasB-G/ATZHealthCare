/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

import java.util.LinkedList;

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
        public void moveToPolicy()
    {
        this.view.dispose();
        HealthcarePolicy.ControllerPolicy nextCntl  = new HealthcarePolicy.ControllerPolicy();
    }
        public void moveToStatus()
    {
        this.view.dispose();
        UpdateCenterStatus.ControllerCenter nextCntl  = new UpdateCenterStatus.ControllerCenter();
    }
    
    public void addDocument(Document document)
    {
        this.model.addDocument(document);
        
    }
    
    public LinkedList<Document> getDocuments()
    {
        return this.model.getDocuments();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

/**
 *
 * @author russell
 */
public class ControllerCom {
    private InboxView inbox;
    private MessageView message;
    private ModelCom model;

    public ControllerCom() {
        this.inbox = new InboxView(this);
        this.message = new MessageView(this);
        
        this.inbox.setVisible(true);
    }

    public void toMessageButtonPushed()
    {
        this.inbox.dispose();
        this.message.setVisible(true);
    }
    
    public void toRefillButtonPushed()
    {
        this.message.dispose();
        
        RefillPrescription.ControllerRefill nextController = new RefillPrescription.ControllerRefill();
    }
    
}

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

    public ControllerCom(InboxView inbox, MessageView message, ModelCom model) {
        this.inbox = inbox;
        this.message = message;
        this.model = model;
    }

    public InboxView getInbox() {
        return inbox;
    }

    public void setInbox(InboxView inbox) {
        this.inbox = inbox;
    }

    public MessageView getMessage() {
        return message;
    }

    public void setMessage(MessageView message) {
        this.message = message;
    }

    public ModelCom getModel() {
        return model;
    }

    public void setModel(ModelCom model) {
        this.model = model;
    }
    
    
}

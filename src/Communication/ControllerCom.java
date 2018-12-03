/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.LinkedList;
import javax.swing.JOptionPane;

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
    
    public void addMessage(Email newMessage)
    {
        this.model.addMessage(newMessage);
    }
    
    public LinkedList<Email> getMessages()
    {
        return this.model.getCommunication();
    }
    
    public void sendMessage(){
        if((this.message.recipientValue.getText().equals(""))||(this.message.textMessage.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Invalid Message. Please fully fill out the form before sending the message.");
        }else{
            this.message.dispose();
            JOptionPane.showMessageDialog(null,"Message Successfully Sent!");
            this.inbox.setVisible(true);
        }
        
    }
    
    public void toInbox(){
        this.message.dispose();
        this.inbox.setVisible(true);
    }
    
    public void toHome(){
        this.inbox.dispose();
        Documents.ControllerDocs newCntl = new Documents.ControllerDocs();
    }
    
}

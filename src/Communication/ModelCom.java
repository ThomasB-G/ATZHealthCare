/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.*;
import java.io.*;


/**
 *
 * @author russell
 */
public class ModelCom {
    private LinkedList<Email> communication;
    private Email newMessage;

    public ModelCom(LinkedList<Email> communication) {
        this.communication = communication;
    }

    public LinkedList<Email> getCommunication() {
        return communication;
    }

    public void setCommunication(LinkedList<Email> communication) {
        this.communication = communication;
    }

    public Email getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(Email newMessage) {
        this.newMessage = newMessage;
    }
    
    
}

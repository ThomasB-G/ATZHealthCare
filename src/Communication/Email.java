/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.*;
/**
 *
 * @author russell
 */
public class Email {
    private String subject;
    private LinkedList<String> recipients;
    private String body;

    public Email(String subject, LinkedList<String> recipients, String body) {
        this.subject = subject;
        this.recipients = recipients;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LinkedList<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(LinkedList<String> recipients) {
        this.recipients = recipients;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    
    
}

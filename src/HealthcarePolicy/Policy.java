/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.io.*;
import java.util.*;
/**
 *
 * @author russell
 */
public class Policy {
    private String policy;
    private LinkedList<String> description;
    private File file;

    public Policy(String title, LinkedList<String> description, File file) {
        this.policy = title;
        this.description = description;
        this.file = file;
    }
    public Policy(String policy){
        this.policy = policy;
    }
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
    public LinkedList<String> getdescription(){
        return description;
    }
    public void setdescription(LinkedList<String> description){
        this.description = description;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    
}

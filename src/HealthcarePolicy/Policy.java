/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.io.*;
/**
 *
 * @author russell
 */
public class Policy {
    private String policy;
    private String description;
    private File file;

    public Policy(String title, String description, File file) {
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
    public String getdescription(){
        return description;
    }
    public void setdescription(String description){
        this.description = description;
    }
    

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    
}

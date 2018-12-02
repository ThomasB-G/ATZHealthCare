/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;
/**
 *
 * @author russell
 */
public class Policy {
    private String policy;
    private String description;
    private String policyText;

    public Policy(String title, String description, String policyText) {
        this.policy = title;
        this.description = description;
        this.policyText = policyText;
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
    

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }
    
    
}

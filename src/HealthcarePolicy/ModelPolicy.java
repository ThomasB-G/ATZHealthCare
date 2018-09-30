/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.util.*;
import java.io.*;

/**
 *
 * @author russell
 */
public class ModelPolicy {
    private LinkedList<Policy> policies;
    private Policy newPolicy;

    public ModelPolicy(LinkedList<Policy> policies) {
        this.policies = policies;
    }

    public LinkedList<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(LinkedList<Policy> policies) {
        this.policies = policies;
    }
    public Policy getNewPolicy() {
        return newPolicy;
    }

    public void setNewPolicy(Policy newPolicy) {
        this.newPolicy = newPolicy;
    }
    public void addPolicy(Policy newPolicy){
        this.newPolicy = newPolicy;
        this.policies.add(this.newPolicy);
    }
    
}

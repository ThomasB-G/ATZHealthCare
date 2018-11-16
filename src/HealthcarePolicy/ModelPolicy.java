/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthcarePolicy;

import java.util.*;

/**
 *
 * @author russell
 */
public class ModelPolicy {
    private LinkedList<Policy> policies;
    private Policy policy;

    public ModelPolicy(LinkedList<Policy> policies) {
        this.policies = policies;
    }

    public LinkedList<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(LinkedList<Policy> policies) {
        this.policies = policies;
    }
    public Policy getPolicy() {
        return policy;
    }

    public void addPolicy(Policy newPolicy){
        this.policies.add(newPolicy);
    }
    
}

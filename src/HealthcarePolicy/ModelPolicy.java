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

    public ModelPolicy(LinkedList<Policy> policies) {
        this.policies = policies;
    }

    public LinkedList<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(LinkedList<Policy> policies) {
        this.policies = policies;
    }
    
    
}

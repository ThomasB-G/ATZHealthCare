/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

import java.util.*;
import java.io.*;

/**
 *
 * @author russell
 */
public class ModelRefill {
    private LinkedList<Prescription> prescriptions;

    public ModelRefill(LinkedList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public LinkedList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(LinkedList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    
}

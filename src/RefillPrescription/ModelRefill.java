/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

import java.util.*;

/**
 *
 * @author russell
 */
public class ModelRefill {
    private LinkedList<Prescription> prescriptionList;
    private Prescription prescription;

    public ModelRefill(LinkedList<Prescription> prescriptions) {
        this.prescriptionList = prescriptionList;
    }

    public LinkedList<Prescription> getPrescriptions() {
        return prescriptionList;
    }

    public void setPrescriptions(LinkedList<Prescription> prescriptions) {
        this.prescriptionList = prescriptionList;
    }
    
    public void addPrescription(Prescription prescription){
        this.prescription=prescription;
        this.prescriptionList.add(this.prescription);
    }
    
}

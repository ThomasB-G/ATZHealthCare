/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

/**
 *
 * @author russell
 */
public class Prescription {
    private String prescriptionName;
    private String patient;
    private String Doctor;
    private String type;
    private int amount;
    private int max;
    
    public Prescription(String prescriptionName, String patient, String Doctor, String type, int amount, int max) {
        this.prescriptionName = prescriptionName;
        this.patient = patient;
        this.Doctor = Doctor;
        this.type = type;
        this.amount = amount;
        this.max = max;
        
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }
    private void refillPrescription(){
        amount = max;
    }
     
    
}

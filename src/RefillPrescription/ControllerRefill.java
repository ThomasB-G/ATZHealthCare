/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author russell
 */
public class ControllerRefill {
    private PatientView patientView;
    private PharmacistView pharmacistView;
    private DoctorView doctorView;
    private ModelRefill model;
    private ArrayList<Prescription> prescriptionList;

    public ControllerRefill() {
        this.patientView = new PatientView(this);
        this.pharmacistView = new PharmacistView(this);
        this.doctorView = new DoctorView(this);
        prescriptionList = new ArrayList<>();
        
        this.doctorView.setVisible(true);
    }
    
    public void toPharmacistButtonPushed()
    {
        this.patientView.dispose();
        this.pharmacistView.setVisible(true);
    }
    
    public void toDoctorButtonPushed()
    {
        this.pharmacistView.dispose();
        this.doctorView.setVisible(true);
    }

    public void toCenterStatusButtonPushed()
    {
        this.doctorView.dispose();
        
        UpdateCenterStatus.ControllerCenter nextCntl = new UpdateCenterStatus.ControllerCenter();
    }

    public void addPrescription(Prescription prescription){
        this.model.addPrescription(prescription);
    }
    
    public LinkedList<Prescription> getPrescriptions(){
        return this.model.getPrescriptions();
    }
    
    public void toHome(){
        this.doctorView.dispose();
        Documents.ControllerDocs nextCntl = new Documents.ControllerDocs();
    }
    
    public void sendPrescription(){
        if(doctorView.nameValue.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Name of prescription not found. Please enter a prescription name.");
        }
        else if(doctorView.patientNameValue.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Name of patient not found. Please enter the patient's name.");
        }
        else if(doctorView.doctorNameValue.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Name of doctor not found. Please enter the doctor's name.");
        }
        else if(doctorView.typeValue.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Type of prescription not found. Please enter the type of the prescription.");
        }
        else if(doctorView.prescriptionDaysValue.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Number of days that the prescription is valid is not found. Please enter the number of days that the prescription is valid.");
        }
        else if(doctorView.maxRefillValue.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Number of times the prescription can be refilled is not found. Please enter the number of times that the prescription can be refilled.");
        }
        else{
            prescriptionList.add(new Prescription(doctorView.nameValue.getText(),doctorView.patientNameValue.getText(),doctorView.doctorNameValue.getText(), doctorView.typeValue.getText(),Integer.parseInt(doctorView.prescriptionDaysValue.getText()), Integer.parseInt(doctorView.maxRefillValue.getText())));
            JOptionPane.showMessageDialog(null,"Prescription successfully sent to CVS Pharmacy.");
        }
        
    }
    
}

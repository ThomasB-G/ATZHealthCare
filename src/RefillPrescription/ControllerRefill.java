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
public class ControllerRefill {
    private PatientView patientView;
    private PharmacistView pharmacistView;
    private DoctorView doctorView;
    private ModelRefill model;

    public ControllerRefill(PatientView patientView, PharmacistView pharmacistView, DoctorView doctorView, ModelRefill model) {
        this.patientView = patientView;
        this.pharmacistView = pharmacistView;
        this.doctorView = doctorView;
        this.model = model;
    }

    public PatientView getPatientView() {
        return patientView;
    }

    public void setPatientView(PatientView patientView) {
        this.patientView = patientView;
    }

    public PharmacistView getPharmacistView() {
        return pharmacistView;
    }

    public void setPharmacistView(PharmacistView pharmacistView) {
        this.pharmacistView = pharmacistView;
    }

    public DoctorView getDoctorView() {
        return doctorView;
    }

    public void setDoctorView(DoctorView doctorView) {
        this.doctorView = doctorView;
    }

    public ModelRefill getModel() {
        return model;
    }

    public void setModel(ModelRefill model) {
        this.model = model;
    }
    
    
}

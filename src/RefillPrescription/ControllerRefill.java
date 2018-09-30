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

    public ControllerRefill() {
        this.patientView = new PatientView(this);
        this.pharmacistView = new PharmacistView(this);
        this.doctorView = new DoctorView(this);
        
        this.patientView.setVisible(true);
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

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefillPrescription;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author evanadipietro
 */
public class ControllerRefillTest {
    
    public ControllerRefillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of addPrescription method, of class ControllerRefill.
     */
    @Test
    public void testAddPrescription() {
        System.out.println("addPrescription");
        Prescription prescription = new Prescription("test prescription","test prescription", "test prescription");
        ControllerRefill instance = new ControllerRefill();
        instance.addPrescription(prescription);
        LinkedList <Prescription> prescriptions = instance.getPrescriptions();
        boolean passed=false;
        for(Prescription p: prescriptions){
            if (p.getDoctor().equalsIgnoreCase("test doctor")){
                if(p.getPatient().equalsIgnoreCase("test patient")){
                    if(p.getPrescriptionName().equalsIgnoreCase("test prescription")){
                        passed=true;
                    }
                }
                        
                        
            }
        }
        if(passed){
            System.out.println("testAddPrescription() has passed");
        }
        else{
            fail("testAddPrescription has failed.");
        }
        
    }

    
    
}

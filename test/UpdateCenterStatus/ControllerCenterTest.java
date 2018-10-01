/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateCenterStatus;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zion Emanuel
 */
public class ControllerCenterTest {
    
    public ControllerCenterTest() {
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
     * Test of addStatus method, of class ControllerCenter.
     */
    @Test
    public void testAddStatus() {
        System.out.println("addStatus");
        Status status = new Status("Test Status");
        ControllerCenter instance = new ControllerCenter();
        instance.addStatus(status);
        
        LinkedList<Status> statuses = instance.getStatuses();
        
        boolean proceed = false;
        
        for (Status s: statuses) {
            if(s.getStatus().equalsIgnoreCase("Test Status")){
              proceed = true;
            }
        }
        if(proceed){
            System.out.println("testAddMessage() has Passed ");
        }
        else{
            fail("testAddMessage() has failed ");
        }
    }
    
}

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
public class ModelCenterTest {
    
    public ModelCenterTest() {
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
     * Test of getStatuses method, of class ModelCenter.
     */
    @Test
    public void testGetStatuses() {
        System.out.println("getStatuses");
        ModelCenter instance = null;
        LinkedList<Status> expResult = null;
        LinkedList<Status> result = instance.getStatuses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatuses method, of class ModelCenter.
     */
    @Test
    public void testSetStatuses() {
        System.out.println("setStatuses");
        LinkedList<Status> statuses = null;
        ModelCenter instance = null;
        instance.setStatuses(statuses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author russell
 */
public class ControllerComTest {
    
    public ControllerComTest() {
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
     * Test of addMessage method, of class ControllerCom.
     */
    @Test
    public void testAddMessage() {
        System.out.println("addMessage");
        Email newMessage = new Email("test subject");
        ControllerCom instance = new ControllerCom(); //make sure this isn't null as well
        instance.addMessage(newMessage); //this is where the method is called now we make sure it worked
        
        LinkedList<Email> emails = instance.getMessages();
        
        boolean passed = false;
        
        for(Email a : emails) //read for email a in emails
        {
            if(a.getSubject().equalsIgnoreCase("test subject"))//testing if the email is the same as the one we just added
            {
                passed = true; //passes if our if statement is found to be true
            }
        }
        
        if(passed)
        {
            System.out.println("testAddMessage() has passed");
        }
        else
        {
            fail("testAddMessage() has failed");
        }
        
    }//this test method not only tests the add and get methods in our controller but also our model since they contain no other coded than calling the methods in our model. We test here because the controller interacts with all parts of the package.

    //we only want to test the information sharing methods in our controller and we will test the get method in the add method test
    
}

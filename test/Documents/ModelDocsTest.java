/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

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
public class ModelDocsTest {
    LinkedList<Document> documents;
    Document newDocument;
    public ModelDocsTest() {
        documents = new LinkedList<>();
        newDocument = new Document("new doc");
        documents.add(newDocument);
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
     * Test of addDocument method, of class ModelDocs.
     */
    @Test
    public void testAddDocument() {
        System.out.println("addDocument");
        Document document = this.newDocument;
        ModelDocs instance = new ModelDocs();
        instance.addDocument(document);
        boolean passed = false;
        
        LinkedList<Document> documents = instance.getDocuments();
        
        for(Document a : documents)
        {
            if(a.getTitle().equalsIgnoreCase("new doc"))
            {
                
                passed = true;
            }
        }
        if(passed)
        {
            System.out.println("passed");
        }
        else
        {
            fail("testAddDocument() did not pass");
        }
        
    }
    
}

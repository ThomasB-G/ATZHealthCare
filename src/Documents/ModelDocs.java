/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

import java.util.*;
import java.io.*;

/**
 *
 * @author russell
 */
public class ModelDocs {
    private LinkedList<Document> documents;

    public ModelDocs() {
        this.documents = new LinkedList<>();
    }

    public LinkedList<Document> getDocuments() {
        return documents;
    }

    public void addDocument(Document document)
    {
        this.documents.add(document);
    }
    
    
}

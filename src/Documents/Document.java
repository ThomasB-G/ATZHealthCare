/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

import java.io.*;
/**
 *
 * @author russell
 */
public class Document {
    private File file;
    private String title;

    public Document(String title, File file) {
        this.title = title;
        this.file = file;
    }
    //For the 
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}

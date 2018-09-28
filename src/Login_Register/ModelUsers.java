/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.io.*;

/**
 *
 * @author russell
 */
public class ModelUsers {
    private String url;
    private String user;
    private String password;
        
    private String query;

    public ModelUsers(String url, String user, String password, String query) {
        this.url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        this.user = "testuser";
        this.password = "test623";
        
        this.query = "SELECT VERSION()";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

import com.lopez.julz.aihr.helpers.Notifiers;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Lopez
 */
public class DatabaseConnection {
    private static final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    Connection databaseConnection= null;
    
    public DatabaseConnection() {
        
    }
    
    public Connection getDbConnectionFromDatabase(String serverName, String database, String username, String password) {
        try {
           String url = "jdbc:sqlserver://" + serverName + ":1433;DatabaseName=" + database+ ";user=" + username + ";password=" + password + ";encrypt=true;trustServerCertificate=true;useBulkCopyForBatchInsert=true;";
           
           Class.forName(jdbcDriver).newInstance();
           
           databaseConnection = (Connection) DriverManager.getConnection(url);
           
           System.out.println("Connected to " + serverName);
           
           return databaseConnection;
        } catch (Exception err) {
           System.out.println("Not Connected");
           err.printStackTrace();
           Notifiers.showMessage("Database Connection Error", err.getMessage(), JOptionPane.ERROR_MESSAGE);
           return null;
        }
    }  

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public void setDatabaseConnection(Connection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    
    
}

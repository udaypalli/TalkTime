/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talktime.standards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gopal
 */
public class DatabaseHandler {
   
    private Connection conn;
    // Constructor to establish database connection
    public DatabaseHandler() throws SQLException {
        conn = DBConnection.getDBConnection();
    }
    // Method to execute SQL query and return result set
    public ResultSet executeQuery(String sql) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }
    public ResultSet executePrepare(String sql,String[] parameters) throws SQLException{
        PreparedStatement statement =conn.prepareStatement(sql);
        int length = parameters.length;
        for(int i=1;i<=length;i++)
        {
        statement.setString(i,parameters[i-1]);
        }
        ResultSet result = statement.executeQuery();
        return result;
    }
    public void executeInsertPrepare(String sql,String[] parameters) throws SQLException{
        PreparedStatement statement =conn.prepareStatement(sql);
        int length = parameters.length;
        for(int i=1;i<=length;i++)
        {
        statement.setString(i,parameters[i-1]);
        }
        statement.executeUpdate();
        
    }
      public ResultSet executeSinglePrepare(String sql,String parameters) throws SQLException{
        PreparedStatement statement =conn.prepareStatement(sql);
        
        statement.setString(1,parameters);
       
        ResultSet result = statement.executeQuery();
        return result;
    }
    // Method to execute SQL update query (e.g. insert, update, delete)
    public void executeUpdate(String sql) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
    }
    public void executeImagePrepare(String sql,byte[] parameters,String email) throws SQLException{
        PreparedStatement statement =conn.prepareStatement(sql);
        statement.setBytes(1,parameters);
        statement.setString(2,email);
        statement.executeUpdate();    
    }
    public void executeProfilePrepare(String sql,String bio,String birthday,String email) throws SQLException{
        PreparedStatement statement =conn.prepareStatement(sql);
        statement.setString(1,bio);
        statement.setString(2,birthday);
        statement.setString(3,email);
        statement.executeUpdate();    
        
    }
     public void executePassPrepare(String sql,String parameters,String email) throws SQLException{
        PreparedStatement statement =conn.prepareStatement(sql);
        statement.setString(1,parameters);
        statement.setString(2,email);
        statement.executeUpdate();    
    }
    // Method to handle any database-related exceptions
    public void handleException(SQLException ex) {
        ex.printStackTrace();
    }

}

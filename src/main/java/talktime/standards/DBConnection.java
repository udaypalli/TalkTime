/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talktime.standards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gopal
 */
public class DBConnection {
   
   private static Connection conn = null;

   public static Connection getDBConnection()  {
      try {
         Class.forName("com.mysql.jdbc.Driver"); 
         String url = "jdbc:mysql://localhost:3306/talktime"; 
         String user = "root"; 
         String password = " "; 
         conn = DriverManager.getConnection(url, user, password);
         //System.out.println("Connected to database successfully");
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
      return conn;
   }

   public static void closeDBConnection()  {
      try {
         if (conn != null) {
            conn.close();
            System.out.println("Disconnected from database successfully");
         }
      } catch (SQLException e) {
         System.out.println("Error disconnecting from database: " + e.getMessage());
      }
   }
   
}

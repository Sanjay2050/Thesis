/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thesis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author acer
 */
class dbconnection {
    public static Statement stmobj() {
        
                 try{
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("driver loaded");
      }catch(Exception e){
          System.out.println("driver loading fail");
      }
       Connection con=null;
       String url = "jdbc:mysql://localhost:3306/XXXXXXXXXXXXXX";
       String users="root";
       String pass=null;
       
        try{
                       
           con=DriverManager.getConnection(url,users,pass);
            System.out.println("Connection created");
            
        }catch(Exception e){
            System.out.println("connection fail");
        }
        
         Statement st = null;
        
        try{
           st= con.createStatement();
                   
                  
        }catch(Exception e){
            System.out.println("no statement created");
        }
            
        return st;
        }
    
}

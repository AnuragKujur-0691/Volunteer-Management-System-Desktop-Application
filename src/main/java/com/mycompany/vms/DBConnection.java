/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vms;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author indrajeet
 */
public class DBConnection {
    static final String DB_URL= "jdbc:mysql://localhost:3306/swe";
    static final String USER="root";
    static final String PASS= "";
    
    public static Connection connectDB(){
        Connection conn=null;
        try
        {
//            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            
        }
        catch(Exception e){
        
            System.out.println("Database Connection Error");
            return null;
        }
        System.out.println("OK");
        return conn;
    }
    
    
}

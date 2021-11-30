/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author maria
 */
public class Conexion {
    
    Connection con; 

    public Connection Conexion()
    {
        
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor?autoReconnect=true&useSSL=false","root","Mikef100");
            System.out.println("Conexion aceptada!!!");
        }catch(Exception e)
            {
                   System.out.println("Conexion NO aceptada!!!");  
                   System.out.println(e.getMessage());  
            }
    
    
        return con;
    }
    
}

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
    String url="jdbc:mysl://localhost:3306/doctor";
    String user="root";
    String pass="";
    public Connection Conexion()
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
              System.out.println("Conezion exitosa");
        }catch(Exception e){
            
            System.out.println("Auida");
            
        }
        return con;
    }
    
}

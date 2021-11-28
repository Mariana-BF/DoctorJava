/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author maria
 */
public class DoctorDAO {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Doctor Validar(String usuario, String contrasena)
    {
         System.out.println("VALIDAR DAO");
        Doctor dc=new Doctor();
        String sql="select * from doctor where cedula=? and contrasena=?; ";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            rs=ps.executeQuery();
            
           while(rs.next())
           {
               dc.setCedula(rs.getString("cedula"));
               dc.setContra(rs.getString("contrasena"));
           }
           System.out.println("SE ENCONTRO");
        }catch(Exception e)
        {
            System.out.println("No se encontro");
        }
        return dc;
    }
    
}

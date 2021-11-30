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
public class DiagnosticoDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    public int Agregar(Diagnostico dg)
    {
        String sql="insert into diagnostico(fecha, enfermedad, observaciones, medicamentos, id_paciente)values(?,?,?,?,1)";
        try
        {
            System.out.println(dg.getFecha());
             System.out.println(dg.getEnfermedad());
              System.out.println( dg.getObservaciones());
                  System.out.println( dg.getMedicamentos());
              
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, dg.getFecha());
            ps.setString(2, dg.getEnfermedad());
            ps.setString(3, dg.getObservaciones());
            ps.setString(4, dg.getMedicamentos());
           
            ps.execute();
            
            
        }catch(Exception e)
        {
            
            System.out.println("No agrego ");
            e.printStackTrace();
        }
        
        return r;
       
    }
    
}

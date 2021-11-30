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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class PacienteDAO {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List<Paciente> listarPacientes(){
        
        List<Paciente> ListaPacientes = new ArrayList<>();
        String sql="SELECT * FROM paciente;";
        
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs = ps.executeQuery();
           
           while(rs.next()){
               
               String id = rs.getString("id_paciente");
               String nombre = rs.getString("nombre");
               String paterno = rs.getString("apellido_p");
               String materno = rs.getString("apellido_m");
               String telefono = rs.getString("telefono");
               String edad = rs.getString("edad");
               String direccion = rs.getString("direccion");
               String fecha = rs.getString("fecha_ingreso");
               String cedula = rs.getString("cedula");
               
               Paciente paciente = new Paciente(id,nombre,paterno,materno,telefono,edad,direccion,fecha,cedula);
               ListaPacientes.add(paciente);
               
           } 
           return ListaPacientes;
       }
       catch(SQLException e){
           
           System.out.println(e.toString());
           
           return null;
           
       }
        
    }
    
    public List<Paciente> BuscarPaciente(String busqueda){
        
        List<Paciente> ListaPacientes = new ArrayList<>();
        String sql="SELECT * FROM paciente Where nombre LIKE '%"+busqueda+"%' OR Apellido_p LIKE '%"+busqueda+"%' OR Apellido_m LIKE '%"+busqueda+"%' OR fecha_ingreso LIKE '%"+busqueda+"%' ; ";
        System.out.print(sql);
        
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           
           
           rs = ps.executeQuery();
           
           while(rs.next()){
               
               String id = rs.getString("id_paciente");
               String nombre = rs.getString("nombre");
               String paterno = rs.getString("apellido_p");
               String materno = rs.getString("apellido_m");
               String telefono = rs.getString("telefono");
               String edad = rs.getString("edad");
               String direccion = rs.getString("direccion");
               String fecha = rs.getString("fecha_ingreso");
               String cedula = rs.getString("cedula");
               
               Paciente paciente = new Paciente(id,nombre,paterno,materno,telefono,edad,direccion,fecha,cedula);
               ListaPacientes.add(paciente);
               
           } 
           
           return ListaPacientes;

       }
       catch(SQLException e){
           
           System.out.println(e.toString());
           
           return null;
           
       }
        
    }
    
    public boolean InsertarPaciente(String nombre, String paterno, String materno, String edad, String direccion, String telefono){
        
        
        String sql="INSERT INTO paciente (nombre, apellido_m, Apellido_p, edad,direccion, fecha_ingreso, telefono, cedula) VALUES ('"+nombre+"', '"+paterno+"', '"+materno+"', "+edad+", '"+direccion+"', current_date(), '"+telefono+"', 'ABC12345678'); ";
        System.out.println(sql);
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
          
           ps.execute();
           
         
           return true;

       }
       catch(SQLException e){
           
           System.out.println(e.toString());
           
           return false;
           
       }
        
    }
    
    
    
    
    
    
}

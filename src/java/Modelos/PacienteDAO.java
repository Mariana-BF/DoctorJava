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
    int r;
    
    
   
    
    public List Listar()
    {
         String query="SELECT id_diagnostico,fecha,enfermedad,observaciones,medicamentos FROM diagnostico WHERE id_paciente=1;";
        List<Diagnostico> lista= new ArrayList<>();
        
        try
        {
           ps=con.prepareStatement(query);
           con=cn.Conexion();
           ps=con.prepareStatement(query);
           rs=ps.executeQuery();
           while(rs.next())
           {
               Diagnostico dg=new Diagnostico();
               System.out.println(rs.getInt(1));
                dg.setIdDiagnostico(rs.getInt(1));
                dg.setFecha(rs.getString(2));
                dg.setEnfermedad(rs.getString(3));
                dg.setObservaciones(rs.getString(4));
                dg.setMedicamentos(rs.getString(5));
               lista.add(dg);
               
           }
        }catch(Exception e)
        {
            
        }
            
        
        return lista;
        
    }
    
    
        public int Updt(Paciente dg)
    {
        String sql="update paciente set nombre=?,apellido_m=?,apellido_p=?,edad=?, direccion=?,telefono=? where id_paciente=1";
        try
        {
           /* System.out.println(dg.getFecha());
             System.out.println(dg.getEnfermedad());
              System.out.println( dg.getObservaciones());
                  System.out.println( dg.getMedicamentos());*/
              
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, dg.getNombre());
            ps.setString(2, dg.getApellidoM());
            ps.setString(3, dg.getApellidoP());
            ps.setInt(4, dg.getEdad());
            ps.setString(5, dg.getDireccion());
            ps.setString(6, dg.getTelefono());
           
            ps.execute();
            
            
        }catch(Exception e)
        {
            
            System.out.println("No actualizo");
            e.printStackTrace();
        }
        
        return r;
       
    }
    
    
    
    
    public Paciente ListarPaciente()
    {
        String query="Select * from paciente WHERE id_paciente=1;";
        Paciente paci =new Paciente();
        
        System.out.println("PACIENTEEEEE");
          try
        {
             System.out.println("PACIENTEEEEE try");
           
           con=cn.Conexion();
           ps=con.prepareStatement(query);
           rs=ps.executeQuery();
           System.out.println("antes next ");
           rs.next();
           
               System.out.println("PACIENTEEEEE while ");
             
               System.out.println("PACIENTEEEEE"+rs.getString("nombre"));
                paci.setNombre(rs.getString(2));
                paci.setApellidoM(rs.getString(3));
                paci.setApellidoP(rs.getString(4));
                paci.setEdad(rs.getInt(5));
                paci.setDireccion(rs.getString(6));
                paci.setFechaI(rs.getString(7)); 
                paci.setTelefono(rs.getString(8));
                
        }catch(Exception e)
        {
            
        }
          
         return paci;
         
     
    }
    
   public List<Paciente> listarPacientes(){
        
        List<Paciente> ListaPacientes = new ArrayList<>();
        String sql="SELECT * FROM paciente;";
        
       try{
           con=cn.Conexion();
           ps=con.prepareStatement(sql);
           rs = ps.executeQuery();
           
           while(rs.next()){
               System.out.println("Principal "+rs.getString(1));
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
           
       }
       catch(SQLException e){
           
           System.out.println(e.toString());
           
           return null;
           
       }
       
       return ListaPacientes;
      
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

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
    
    
    public void LlenarDiagnosticos(Paciente pc) throws SQLException {
        String query = "SELECT id_diagnostico, fecha, enfermedad, observaciones, medicamentos, id_paciente FROM diagnostico WHERE id_paciente = ?;";
        ps = con.prepareStatement(query);
        
        ps.setInt(1, pc.getIdPaciente());
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            if (rs.getInt(6) == pc.getIdPaciente()){
                //Diagnostico nDiag = new Diagnostico(rs.getInt(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getNString(5));
             //   pc.Diagnosticos.add(nDiag);
            }
        }
    }
    
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
    
    public Paciente GetPaciente(int id) throws SQLException
    {
        Paciente pc=new Paciente();
        
        String query="Select * from paciente where id_paciente=?;";
        
            con=cn.Conexion();
            ps=con.prepareStatement(query);
            ps.setInt(1, id);
            rs=ps.executeQuery();
           
            if(rs.next())
            {
                pc.setIdPaciente(rs.getInt(1));
                pc.setNombre(rs.getString(2));
                pc.setApellidoM(rs.getString(3));
                pc.setApellidoP(rs.getString(4));
                pc.setEdad(rs.getInt(5));
                pc.setDireccion(rs.getString(6));
                pc.setFechaI(rs.getString(7));
                pc.setTelefono(rs.getString(8));     
                
            }
         
        
        return pc;
    }

    public Paciente GetPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

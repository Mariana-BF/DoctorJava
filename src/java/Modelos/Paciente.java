/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author maria
 */
public class Paciente {
    
    String id;
    String nombre; 
    String paterno;
    String materno;
    String telefono;
    String edad;
    String direccion;
    String fecha;
    String cedula;
    
    
    public Paciente(String id, String nombre, String paterno, String materno,
            String telefono, String edad, String direccion, String fecha, String cedula){
        
        this.id =id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.edad = edad;
        this.direccion= direccion;
        this.fecha = fecha;
        this.cedula = cedula;
    }
    
    public String getId(){ return this.id; }
    
    public String getNombre(){return this.nombre; }
    
    public String getMaterno(){return this.paterno; }
    
    public String getPaterno(){return this.materno; }
    
    public String getTelefono(){return this.telefono; }
    
    public String getEdad(){ return this.edad;}
    
    public String getDireccion(){ return this.direccion; }
    
    public String getFecha(){ return this.fecha; }
    
    public String getCedula(){ return this.cedula; }
    
    
}

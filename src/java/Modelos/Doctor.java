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
public class Doctor {
    
    String cedula;
    String nombre;
    String apm;
    String app;
    String tel;
    String contra;
    
    public  Doctor() {
        //To change body of generated methods, choose Tools | Templates
    }
    
    public Doctor(String cedula,String nombre,String apm,String app,String tel,String contra)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.apm=apm;
        this.app=app;
        this.tel=tel;
        this.contra=contra;
    }

   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
    
    
}

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
public class Diagnostico {
        int idDiagnostico;
    String fecha, enfermedad, observaciones, medicamentos;
    int id_paciente;

    public Diagnostico(int idDiagnostico, String fecha, String enfermedad, String observaciones, String medicamentos, int id_paciente){
        this.idDiagnostico = idDiagnostico;
        this.fecha = fecha;
        this.enfermedad = enfermedad;
        this.observaciones = observaciones;
        this.medicamentos = medicamentos;
    }

    public Diagnostico() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    
    
    
}

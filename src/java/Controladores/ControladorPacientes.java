/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Modelos.Diagnostico;
import Modelos.DiagnosticoDAO;
import Modelos.Paciente;
import Modelos.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maria
 */
@WebServlet(name = "ControladorPacientes", urlPatterns = {"/ControladorPacientes"})
public class ControladorPacientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Paciente pc=new Paciente();
    PacienteDAO pcdao =new PacienteDAO();
    
    Diagnostico dg=new Diagnostico();
    DiagnosticoDAO dgdao=new DiagnosticoDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String menu=request.getParameter("menu");
        
        String accion= request.getParameter("accion");
        
        if(menu.equals("Diagnosticos"))
        {
                 switch(accion)
        {
            case "Listar":
       
                List lista= pcdao.Listar();
                request.setAttribute("Diagnosticos", lista);
                break;  
            default:
                throw new AssertionError();
        }
           request.getRequestDispatcher("Diagnosticos.jsp").forward(request, response);
        }
         if(menu.equals("AgregarD"))
        {
                  
    
                
               // request.getRequestDispatcher("ContoladorPacientes?menu=AgregarD")*/
       
          request.getRequestDispatcher("AgregarD.jsp").forward(request, response);
        }
         
        if("Editar".equals(menu))
        {
          request.getRequestDispatcher("EditarP.jsp").forward(request, response);
        }
         
         
         

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String accion=request.getParameter("accion");
        
                String Enfermedad =request.getParameter("enfermedad");
                String Fecha =request.getParameter("fecha");
                String Observaciones =request.getParameter("obs");
                String Medicamentos =request.getParameter("med");
                dg.setFecha(Fecha);
                dg.setEnfermedad(Enfermedad);
                dg.setObservaciones(Observaciones);
                dg.setMedicamentos(Medicamentos);
             
                dgdao.Agregar(dg);
                        

    }
   
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

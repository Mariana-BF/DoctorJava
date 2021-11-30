/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Paciente;
import Modelos.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maria
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PacienteDAO pacienteDAO = new PacienteDAO();
        String accion= request.getParameter("accion");
        RequestDispatcher dispatcher = null;
        switch(accion)
        {
            case "Principal":
                dispatcher = request.getRequestDispatcher("Principal.jsp");
                List<Paciente> listaPacientes = pacienteDAO.listarPacientes();
                request.setAttribute("lista",listaPacientes);
                dispatcher.forward(request, response);
                break;
            case "Paciente":
                request.getRequestDispatcher("Paciente.jsp").forward(request, response);
                break;   
            case "BuscarPaciente":
                String busca = request.getParameter("buscaProducto");
                System.out.print("Buscando Paciente");
                System.out.print(busca);
                dispatcher = request.getRequestDispatcher("Principal.jsp");
                listaPacientes = pacienteDAO.BuscarPaciente(busca);
                request.setAttribute("lista",listaPacientes);
                dispatcher.forward(request, response);
                break; 
            case "agregarPaciente":
                String nombre = request.getParameter("txtNombre");
                String paterno = request.getParameter("txtPaterno");
                String materno = request.getParameter("txtMaterno");
                String edad = request.getParameter("txtEdad");
                String direccion = request.getParameter("txtDireccion");
                String telefono = request.getParameter("txtTelefono");
                System.out.print("Agregar Paciente");
                System.out.print(nombre);
                System.out.print(paterno);
                System.out.print(materno);
                System.out.print(edad);
                System.out.print(direccion);
                System.out.print(telefono);
                pacienteDAO.InsertarPaciente(nombre,paterno,materno,edad,direccion,telefono);
                
                dispatcher = request.getRequestDispatcher("Principal.jsp");
                listaPacientes = pacienteDAO.listarPacientes();
                request.setAttribute("lista",listaPacientes);
                dispatcher.forward(request, response);
                break;    
            default:
                throw new AssertionError();
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
        doGet(request, response);
       // processRequest(request, response);
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

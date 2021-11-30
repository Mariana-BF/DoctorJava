<%-- 
    Document   : Principal
    Created on : 27/11/2021, 08:24:31 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </head>
    <body>
            
        <nav class="navbar navbar-light  " style="background-color: #0d99fd ">
            
                    <div class="container-fluid">
                      <a class="navbar-brand text-white" style="margin-left: 47%;">DOCTOR
                          <img src="img/hospital(1).png" alt=""/>
                      
                      </a>
                      
                      <form accion="Validar" method="POST">
                          <button name="accion" value="Salir" class="btn btn-danger">Cerrar sesión</button>
                      </form>
                     
                    </div>
               </nav>
        
        <br>
        
    
        
  <div class="container-fluid"  >
    <form class="d-flex" action="Controlador" method="POST">
      <input class="form-control me-2" type="search" name="buscaProducto" placeholder="Buscar Paciente" aria-label="Search">
      <button name="accion" value="BuscarPaciente" class="btn btn-outline-success" type="submit">Buscar</button>
    </form>
  </div>
        
     <!-- Button trigger modal -->
<button type="button" class="btn btn-outline-primary float-end mt-3 me-2" data-bs-toggle="modal" data-bs-target="#exampleModal">
  Añadir Paciente
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        
        <form action="Controlador" method="POST">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Crear Nuevo Paciente</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
          
        
          
          
        <div class="form-floating mb-3">
            <input  name="txtNombre" type="text" class="form-control" id="floatingInput" placeholder="name@example">
        <label for="floatingInput">Nombre</label>
      </div>
          <div class="form-floating mb-3">
        <input  name="txtPaterno" type="text" class="form-control" id="floatingInput2" placeholder="name@example">
        <label for="floatingInput2">Apellido Paterno</label>
      </div>
          <div class="form-floating mb-3">
        <input  name="txtMaterno" type="text" class="form-control" id="floatingInput3" placeholder="name@example">
        <label for="floatingInput3">Apellido Materno</label>
      </div>
          <div class="form-floating mb-3">
        <input  name="txtDireccion" type="text" class="form-control" id="floatingInput4" placeholder="Privada 2 a sur 11519">
        <label for="floatingInput4">Direccion</label>
      </div>
          <div class="form-floating mb-3">
        <input  name="txtEdad" type="text" class="form-control" id="floatingInput5" placeholder="name@example">
        <label for="floatingInput5">Edad</label>
      </div>
      <div class="form-floating">
        <input  name="txtTelefono" type="text" class="form-control" id="floatingTelefono" placeholder="Password">
        <label for="floatingTelefono">Telefono</label>
      </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
        <button name="accion" value="agregarPaciente" type="submit" class="btn btn-primary">Crear</button>
      </div>
        </form>
    </div>
  </div>
</div>
           
        
        
            
  <div class="container " style="margin-top: 5%">
  <div class="row align-items-start">
       <c:forEach var="paciente" items="${lista}"> 
        <div class="col">
           <div class="card shadow-lg p-3 mb-5 bg-body" style="width: 18rem;">
                    <img src="img/degradado.jpg" class="card-img-top" alt=""/>
                    <div class="card-body">
                        <h5 class="card-title text-center"> <c:out value="${paciente.nombre} ${paciente.paterno} ${paciente.materno}"/> </h5>
                        <p class="card-text">Telefono : <c:out value="${paciente.telefono}" /></p>
                      <a href="Controlador?accion=Paciente" class="btn btn-primary" style="margin-left: 33%">Detalles</a>
                    </div>
                   </div>
        </div>
        </c:forEach>
    </div>
        
        </div>  
            
      
        <br>


              
      
        
        
        </body>
</html>

<%-- 
    Document   : Principal
    Created on : 27/11/2021, 08:24:31 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Iniciar Sesion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        
        <title>Inicio</title>
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
    <form class="d-flex">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
        
        
        <div class="container" style="margin-top: 5%">
  <div class="row align-items-start">
        <div class="col">
           <div class="card" style="width: 18rem;">
                       <img src="img/degradado.jpg" class="card-img-top" alt=""/>

                    <div class="card-body">
                      <h5 class="card-title text-center">Nombre del paciente</h5>
                      <p class="card-text">Telefono.</p>
                      <a href="Controlador?accion=Paciente" class="btn btn-primary" style="margin-left: 33%">Detalles</a>
                    </div>
                   </div>
        </div>
    </div>
        
        </div>  
        <br>

        
              
      
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    </body>
</html>

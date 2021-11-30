<%-- 
    Document   : Paciente
    Created on : 28/11/2021, 02:28:39 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        
        <title>Detalle paciente</title>
    </head>
    
    <body>
        
       <nav class="navbar navbar-light  " style="background-color: #0d99fd ">
            
                    <div class="container-fluid">
                      <a class="navbar-brand text-white" style="margin-left: 46%;">DOCTOR
                          <img src="img/hospital(1).png" alt=""/>
                      
                      </a>
                      
                      <form accion="Validar" method="POST">
                          <button name="accion" value="Salir" class="btn btn-danger">Cerrar sesión</button>
                      </form>
                     
                    </div>
               </nav>
        
        <ul class="nav justify-content-center" >
                <li class="nav-item">
                  <a class="nav-link active"  href="ControladorPacientes?menu=Diagnosticos&accion=Listar" target="myFrame" >Diagnosticos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ControladorPacientes?menu=AgregarD&accion=Agregar" target="myFrame" >Agregar diagnostico</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="ControladorPacientes?menu=Editar" target="myFrame">Editar datos</a>
                </li>
               
        </ul>
        
        <div class="m-4" style="height: 750px  ">
          <iframe name="myFrame"   style=" height: 100%; width: 100%; border:1px; border-color:black; border-style: solid;">
           </iframe>
        </div>
        
        
    </body>
    
    
    
    
    
    
    
   
     
</html>

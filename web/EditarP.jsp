<%-- 
    Document   : EditarP
    Created on : 29/11/2021, 08:10:07 AM
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
        
        
        <div  class="conteiner">
              <ul class="list-group">
                    <li class="list-group-item">An item</li>
                    <li class="list-group-item">A second item</li>
                    <li class="list-group-item">A third item</li>
                    <li class="list-group-item">A fourth item</li>
                    <li class="list-group-item">And a fifth one</li>
              </ul>
            <!-- Button trigger modal -->
            <br>
            <div class="d-grid gap-2 col-6 mx-auto">
                
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
          Launch static backdrop modal
        </button>
            </div>
        
   
        </div>
        

        <!-- Modal -->
    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                    <div class="modal-dialog">
                      <div class="modal-content">
                        <div class="modal-header">
                          <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <form class="row g-3" style="padding: 50px;">
                       <div class="col-md-12">
                         <label for="inputEmail4" class="form-label">Nombre</label>
                         <input type="email" class="form-control" id="enfermedad">
                       </div>
                       <div class="col-md-12">
                           <label for="inputEmail4" class="form-label">Direccion</label>
                         <input type="text" class="form-control" id="fecha">
                       </div>
                       <div class="col-12">
                         <label for="inputEmail4" class="form-label">Telefono</label>
                         <input type="text" class="form-control" id="fecha">
                       </div>
                       <div class="col-12">
                        <label for="inputEmail4" class="form-label">Edad</label>
                         <input type="text" class="form-control" id="fecha">
                       </div>
                                
                                <div class="modal-footer" style="margin-top: 10%">
                              <button class="btn btn-primary me-md-2" type="submit">Agregar</button>
                          <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
                          
                        </div>       
                                
                      
           </form>
                        </div>
                        
                      </div>
                    </div>        
    </div>

    </body>
</html>

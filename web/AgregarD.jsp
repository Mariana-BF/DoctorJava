<%-- 
    Document   : AgregarD
    Created on : 29/11/2021, 08:09:48 AM
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
        
        <h4 style="margin-top:4%">Agregar Diagnostico Nuevo</h4>
        <form action="ControladorPacientes?menu=AgregarD" method="POST" class="row g-3" style="padding: 50px;">
                       <div class="col-md-8">
                         <label for="enfermedad" class="form-label">Enfermedad</label>
                         <input type="text" class="form-control" name="enfermedad">
                       </div>
                       <div class="col-md-4">
                           <label for="enfermedad" class="form-label">Fecha</label>
                           <input type="date" class="form-control" name="fecha">
                       </div>
                       <div class="col-12">
                         <label for="inputAddress2" class="form-label">Observaciones</label>
                         <textarea  class="form-control"  name="obs"> </textarea>
                       </div>
                       <div class="col-12">
                         <label for="inputAddress2" class="form-label">Medicamentos</label>
                         <textarea  class="form-control"  name="med"> </textarea>
                       </div>
                
                       <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                          
                        <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                            <button  class="btn btn-danger" type="button">Cancelar</button>
                        </div>
           </form>
        

    </body>
</html>

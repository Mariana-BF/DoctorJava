<%-- 
    Document   : Diagnosticos
    Created on : 28/11/2021, 07:52:20 PM
    Author     : maria
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        
      
            
        <div class="container my-5 rounded " >
                        
        <div Name="row g-3 mt-5">
            
            
            <h4>Historial de Diagnosticos</h4>
        </div>
            
           
        <div class="row hidden-md-up mt-5">
              
                   <c:forEach var="dia" items="${Diagnosticos}">
          <div class="col-md-4 mb-5">
              
            <div class="card">
                <div class="card-body">

                    <h5 class="text-center" style="margin-bottom: 3%">${dia.getEnfermedad()}</h5>
                    <h6 class="text-center" style="margin-bottom: 5%">${dia.getFecha()}</h6>

                  <div class="accordion" id="accordionExample">
                        <div class="accordion-item">
                          <h2 class="accordion-header" id="headingOne" >
                                <button   style="background-color:  #a4cfff   " class="accordion-button text-white" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                 
                                  <img src="img/black.png" style="padding: 1%" alt=""/>  Observaciones
                               </button>
                          </h2>
                          <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                            <div class="accordion-body">
                                <p>${dia.getObservaciones()}</p>
                            </div>
                          </div>
                        </div>
                        <div class="accordion-item">
                          <h2 class="accordion-header" id="headingTwo">
                            <button style="background-color:  #a4cfff   " class="accordion-button text-white" class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                            <img src="img/med.png" style="padding: 1%" alt=""/>  Medicamentos
                            </button>
                          </h2>
                          <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
                            <div class="accordion-body">
                                <p>${dia.getMedicamentos()}</p>
                            </div>
                       </div>
                          </div>
                   </div>

                       </div>
            </div>
            
             </div> 
               </c:forEach>
  
                
        </div>
                        
                        

       </div>
                          
        
        

        

        

        
    </body>
</html>

<%-- 
    Document   : Diagnosticos
    Created on : 28/11/2021, 07:52:20 PM
    Author     : maria
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Diagnostico</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    
    <body>
        
      
            
        <div class="container my-5 rounded " >
                        
        <div Name="row g-3 mt-5">
            
            
          <p Name="d-block fs-4 text-muted ms-3 my-3">
            Diagnosticos
          </p>
        </div>
            
           
        <div class="row hidden-md-up mt-5">
              
                   <c:forEach var="dia" items="${Diagnosticos}">
          <div class="col-md-4 mb-5">
              
                           <div class="card">
            <div class="card-body">
              
                <p style="margin-bottom: 3%">${dia.getEnfermedad()}</p>
                <p>${dia.getFecha()}</p>
              
              <div class="accordion" id="accordionExample">
                    <div class="accordion-item">
                      <h2 class="accordion-header" id="headingOne">
                        <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                          Observaciones
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
                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                          Medicamentos
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

<%-- 
    Document   : index
    Created on : 27/11/2021, 07:21:42 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Iniciar Sesion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
            <link href="https://fonts.googleapis.com/css2?family=Spartan:wght@300;600&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/ffec4ec2ed.js" crossorigin="anonymous"></script>
    </head>
    <body class="bg-dark">
      <section>
        <div class="row g-0">
            <div class="col-lg-7 d-none d-lg-block">
                <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                      <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div class="carousel-item img-1 min-vh-100 active">
                        <div class="carousel-caption d-none d-md-block">
                          
                        </div>
                      </div>
                      <div class="carousel-item img-2 min-vh-100">
                        <div class="carousel-caption d-none d-md-block">
                          
                        </div>
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Next</span>
                    </a>
                  </div>
            </div>
            <div class="col-lg-5 bg-dark d-flex flex-column align-items-end min-vh-100">
                <div class="px-lg-5 pt-lg-4 pb-lg-3 p-4  w-100">
                    <img src="img/hospital(1).png" class="img-fluid" />
                </div>
                <div class="align-self-center w-100 px-lg-5 py-lg-4 p-4">
                <h1 class="font-weight-bold mb-5">Bienvenido de vuelta</h1>
                <form class="mb-5 form-sign" action="Validar" method="POST">
                    <div class="mb-4">
                      <label for="exampleInputEmail1" class="form-label font-weight-bold">Usuario</label>
                      <input type="text" name="txtuser" class="form-control bg-dark-x border-0 text-white" id="exampleInputEmail1" placeholder="Ingresa tu Usuario">
                    </div>
                    <div class="mb-4">
                      <label for="exampleInputPassword1" class="form-label font-weight-bold">Contraseña</label>
                      <input type="password" name="txtpass" class="form-control bg-dark-x border-0 mb-5 text-white" placeholder="Ingresa tu contraseña" id="exampleInputPassword1">
                       </div>
                    <button type="submit" name="accion" value="Ingresar"  class="btn btn-primary w-100 mt-5">Iniciar sesión</button>
                  </form>

              
                </div>
              
            </div>
        </div>
      </section>
        
        
        <style>
            


:root {
    --dark: #16191C;
    --dark-x: #1E2126; 
    --light: #ffffff;
}

body {
    font-family: 'Spartan', sans-serif;
    font-weight: 300;
    color: var(--light);
}

.text-light { color: var(--light) !important; }
.bg-dark { background-color: var(--dark) !important; }
.bg-dark-x { background-color: var(--dark-x); }

.btn {
    min-height: 3.125rem;
    font-weight: 600;
}

.form-control {
    min-height: 3.125rem;
    line-height: initial;
}
.form-control:focus {
    background-color: var(--dark);
    outline: none;
}

.img-1 {
    background-image: url('img/medico_1.jpg');
    background-size: cover;
    background-position: center;
}

.img-2 {
    background-image: url('img/hospital_2.jpg');
    background-size: cover;
    background-position: center;
}
        </style>
        
    <!-- Optional JavaScript -->
    <!-- Popper.js first, then Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>
  </body>
    
    
    
    
   
</html>

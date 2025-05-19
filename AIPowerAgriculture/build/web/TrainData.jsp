<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>jon</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
   </head>
   <!-- body -->
   <body class="main-layout">
      <!-- loader  -->
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="#" /></div>
      </div>
      <!-- end loader -->
      <!-- header -->
  <%@include file="adminheader.jsp" %>
      <!-- end header inner -->
      <!-- end header -->
 
      <!-- about -->
     
      <!-- end about -->
      </div>
      <!--  footer -->
      <footer id="contact">
         <div class="footer">
            <div class="container">
               <div class="row">
                  <div class="col-md-4">
                     <div class="titlepage">
                        <h2>Train Data</h2>
                     </div>
                  </div>
                  <div class="col-md-12">
                      <form id="request" class="main_form" action="Add_Data" enctype="multipart/form-data" method="POST">
                        <div class="row">
                          
                           <div class="col-md-3">
                              <input class="contactus" placeholder="Enter Disease Name" type="type" name="d_name"> 
                           </div>
                           <div class="col-md-3">
                               <input class="contactus" type="file" name="uimg">                          
                           </div>
                      
                            <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12" style="height: 50px">
                               <input type="submit" value="TRAIN NOW" style="    font-size: 20px;
    transition: ease-in all 0.5s;
    background-color: #f4cb1e;
    color: #000;
    padding: 0px 0px;
    max-width: 100px;
    font-weight: 700;
    width: 100%;
    display: block;
    margin-top: 0px;
    height: 50px;
    
}">
                           </div>
                           
                        </div>
                     </form>
                  </div>
                  
                 
               </div>
            </div>
            
         </div>
      </footer>
      <!-- end footer -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
   </body>
</html>
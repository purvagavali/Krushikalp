<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Fertilizer</title>
      
  <style>
  /* Basic reset for body */
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 20px;
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    flex-direction: column;
  }

  h2 {
    color: #333;
  }

  /* Styling for dropdown container */
  .dropdown {
    background-color: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    margin: 10px 0;
    width: 300px; /* Set a fixed width for the dropdown */
  }

  /* Style for the select element */
  .styled-select select {
    width: 100%;
    padding: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 16px;
    background-color: #fff;
    cursor: pointer;
    outline: none;
  }

  /* Hover effect on select box */
  .styled-select select:hover {
    border-color: #007BFF;
  }

  /* Label styling */
  .dropdown h2 {
    font-size: 18px;
    color: #555;
  }

  /* Add some space between dropdown sections */
  .styled-select {
    margin-bottom: 15px;
  }

  /* Add some margin to each dropdown */
  .dropdown {
    margin-bottom: 20px;
  }
</style>

      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" type="text/css" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <!-- fonts -->
      <link href="https://fonts.googleapis.com/css?family=Great+Vibes|Open+Sans:400,700&display=swap&subset=latin-ext" rel="stylesheet">
      <!-- owl stylesheets --> 
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
   </head>
   <body>
      <!-- header section start -->
   
      <!-- header section end -->
      <!-- product section start -->
      <div class="product_section layout_padding">
         <div class="container">
            <div class="row">
               <div class="col-sm-12">
                  <h1 class="product_taital">Fertilizer Detection</h1>
                
               </div>
            </div>
            <div class="product_section_2 layout_padding">
                
                <?php
include 'datasource.php';

?>
                <form action="fertilizerData.php" method="POST">
               <div class="dropdown">
                   <h2>Select Temperature:</h2>
                   <div class="styled-select">
  <select id="select" name="temp">
    <option value="26">26</option>
    <option value="29">29</option>
    <option value="34">34</option>
    <option value="32">32</option> 
    <option value="28">28</option>
    <option value="25">25</option>
    <option value="33">33</option>
    <option value="30">30</option>
    <option value="27">27</option>
    <option value="31">31</option>
    <option value="35">35</option>
    <option value="37">37</option>
    <option value="38">38</option>
  </select>
                   </div><br>
                   <h2> Select Soil Type:</h2>
                    <div class="styled-select">
                    <select id="select" name="soil">
                    <option value="Sandy">Sandy</option>
    <option value="Loamy">Loamy</option>
    <option value="Black">Black</option>
    <option value="Red">Red</option>
    <option value="Clayey">Clayey</option>
                    </select>
                    </div><br>
                    
                <h2> Select Crop Type:</h2>
                    <div class="styled-select">
                        <select id="select" name="crop">
                             <option value="Maize">Maize</option>
    <option value="Sugarcane">Sugarcane</option>
    <option value="Cotton">Grapes</option>
    <option value="Tobacco">Onion</option>
    <option value="Paddy">Paddy</option>
    <option value="Barley">Barley</option>
    <option value="Wheat">Wheat</option>
    <option value="Millets">Millets</option>
    <option value="Oil seeds">Oil seeds</option>
    <option value="Pulses">Pulses</option>
    <option value="Ground Nuts">Ground Nuts</option>
                        </select>                    
  </div>
                
                
             <input type="submit" value="Submit">    
                
               </div>
                </form>
                
    

      <!-- copyright section end -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <!-- javascript --> 
      <script src="js/owl.carousel.js"></script>
      <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>  
      <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
      <script>
         function openNav() {
           document.getElementById("mySidenav").style.width = "100%";
         }
         
         function closeNav() {
           document.getElementById("mySidenav").style.width = "0";
         }
      </script> 
   </body>
</html><?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
<!--      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
       mobile metas 
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
       site metas -->
      <title>ORDER DETAILS</title>
<!--      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
       bootstrap css 
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
       style css 
      <link rel="stylesheet" type="text/css" href="css/style.css">
       Responsive
      <link rel="stylesheet" href="css/responsive.css">
       fevicon 
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
       Scrollbar Custom CSS 
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
       Tweaks for older IEs
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
       fonts 
      <link href="https://fonts.googleapis.com/css?family=Great+Vibes|Open+Sans:400,700&display=swap&subset=latin-ext" rel="stylesheet">
       owl stylesheets  
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />-->
      <style>
      body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .form-container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        label {
            margin-bottom: 5px;
            display: block;
            color: #555;
        }

        input[type="text"],
        input[type="email"],
        textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .button-container {
            display: flex;
            justify-content: center; /* Center the buttons */
            margin-top: 10px; /* Add some space above the buttons */
        }

        button {
            width: 48%;
            padding: 10px;
            border: none;
            border-radius: 4px;
            color: white;
            cursor: pointer;
            margin: 5px; /* Add margin between buttons */
        }

        button[name="save"] {
            font-size: 25px;  
            background-color: #28a745; /* Green */
        }

        button:hover {
            opacity: 0.9;
        }
    </style>
   </head>
   <body> 
       <div class="form-container">
        <h1>Order Details</h1>
        <form action="orderDetails.php" method="POST">
            
             <input type="hidden" id="fid" value="<?php echo $_GET['fid']; ?>" name="fid" readonly="">
                <input type="hidden" id="fid" value="<?php echo $_GET['uid']; ?>" name="uid" readonly="">
               <label for="name">Product Name:</label>
               <input type="text" id="Name" value="<?php echo $_GET['pname']; ?>" name="pname" readonly="">
               
                <label for="name">Quantity:</label>
                <input type="number" id="Quantity" name="quantity" value="1" required="" >
                
            <label for="name">Name:</label>
            <input type="text" id="Name" name="name" required>

            <label for="email">Email:</label>
            <input type="mail" id="Email" name="mail" required>

            <label for="contact">Contact No:</label>
            <input type="text" id="Contact" name="contact" required>

            <label for="address">Shipping Address:</label>
            <textarea id="Address" name="add" required></textarea>
            
            <form action="userLog.php" method="POST">
    <input type="hidden" name="id" value="<?php echo $id; ?>">

            <button type="submit" name="save">Save</button>
            
        </form>
    </div>
      <!-- header section start -->
   
      <!-- header section end -->
      <!-- product section start -->
     
                
         


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
</html>
<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


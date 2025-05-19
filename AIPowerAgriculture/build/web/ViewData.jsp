<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.db.Dbcon"%>
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
      <!-- banner -->

      <!-- end banner -->
      <!-- three_box -->
      <div class="three_box">
         <div class="container">
             <table class="table table-hover" style="margin-top: 20%">
                <thead><tr>
                        <th>Id</th>
                        <th>Disease Name</th>
                        <th>Disease Image</th>
                     
                          <th>Contrast</th>
                           <th>Homogenity</th>
                            <th>Entropy</th>
                             <th>Energy</th>
<!--                        <th>N</th>
                         <th>CH</th>
                          <th>AH</th>-->
                         <!--<th>Delete</th>-->
                    </tr></thead>
                <tbody>
                    
                    <% 
                    
//                    String did=(String)session.getAttribute("diseaseid");
//                    String N=(String)session.getAttribute("N");
//                    String CH=(String)session.getAttribute("CH");
//                    String AH=(String)session.getAttribute("AH");
//                    System.out.println("N"+N);
                    String sql1 = "SELECT * FROM `train_data`";
                       
System.out.println("sql1"+sql1);
   String msg=null;
             ;

                                                          Statement statement = Dbcon.connect();
                         ResultSet rs = statement.executeQuery(sql1);
                        int i = 0;
                        while (rs.next()) {
//                            String sq="INSERT INTO `detection`(`d_id`, `diseasename`, `diseaseprevention`) VALUES (null,'"+rs.getString("disease_name")+"','"+rs.getString("disease_prevention")+"')";
////                           INSERT INTO `detection`(`d_id`, `diseasename`, `diseaseprevention`) VALUES ([value-1],[value-2],[value-3])
//                           statement.executeUpdate(sq);
                            //String imgname = rs.getString("img");
//                            int Id=rs.getInt("id");
                            //String m = rs.getString("category");
                             //System.out.println(imgname);
                             //System.out.println(Id);
//                            msg="Found Disease:-"+rs.getString("cancer_name")+"and Found Prevention:-"+rs.getString("disease_prevention");
//                           sendsms.connectsms("9404688826",msg);
                            i++;%>
                    <tr>
                        <td><%=i%></td>
                         <td><%=rs.getString("disese_name")%></td>
                           <td><img src="upload/<%=rs.getString("disease_image")%>" width="150"></td>
                           
                            <td><%=rs.getString("Contrast")%></td>
                             <td><%=rs.getString("Homogenity")%></td>
                              <td><%=rs.getString("Entropy")%></td>
                                <td><%=rs.getString("Energy")%></td>
                          
                            
                        </tr>
                        
                        
                <% }
                                         
                %>
                </tbody>
            </table>
         </div>
      </div>
      <!-- three_box -->
      <!-- hottest -->
  
      </div>
      </div>
      <!-- end hottest -->
      <!-- choose  section -->
    
      </div>
      <!-- end choose  section -->
      <!-- product  section -->
   
      <!-- end product  section -->
      <!-- about -->

      <!-- end about -->
      </div>
      <!--  footer -->
<!--      <footer id="contact">
         <div class="footer">
            <div class="container">
               <div class="row">
                  <div class="col-md-4">
                     <div class="titlepage">
                        <h2>Contact Us</h2>
                     </div>
                  </div>
                  <div class="col-md-12">
                     <form id="request" class="main_form">
                        <div class="row">
                           <div class="col-md-3 ">
                              <input class="contactus" placeholder="Full Name" type="type" name="Full Name"> 
                           </div>
                           <div class="col-md-3">
                              <input class="contactus" placeholder="Email" type="type" name="Email"> 
                           </div>
                           <div class="col-md-3">
                              <input class="contactus" placeholder="Phone Number" type="type" name="Phone Number">                          
                           </div>
                           <div class="col-xl-3 col-lg-3 col-md-3 col-sm-12">
                              <ul class="social_icon">
                                 <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                 <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                 <li><a href="#"><i class="fa fa-linkedin-square" aria-hidden="true"></i></a></li>
                                 <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                              </ul>
                           </div>
                           <div class="col-md-8">
                              <textarea class="contactus1" placeholder="Message" type="type" Message="Name">Message </textarea>
                           </div>
                           <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                              <button class="send_btn">Send</button>
                           </div>
                        </div>
                     </form>
                  </div>
                  <div class="col-md-3 border_right">
                     <ul class="location_icon">
                        <li><a href="#"><i class="fa fa-map-marker" aria-hidden="true"></i></a> Locatins</li>
                        <li><a href="#"><i class="fa fa-volume-control-phone" aria-hidden="true"></i></a> +71 9087654321</li>
                        <li><a href="#"><i class="fa fa-envelope" aria-hidden="true"></i></a>demo@gmail.com</li>
                     </ul>
                  </div>
                  <div class="col-md-3 border_right">
                     <h3>Useful Link</h3>
                     <ul class="link">
                        <li><a href="#">humour, or </a></li>
                        <li><a href="#">randomised words </a> </li>
                        <li><a href="#">which don't look </a></li>
                        <li><a href="#">even slightly  </a> </li>
                        <li><a href="#">believable. If   </a></li>
                     </ul>
                  </div>
                  <div class="col-md-3 border_right">
                     <h3>Menus</h3>
                     <ul class="link">
<li><a href="index.html">Home</a></li>                             
<li><a href="about.html">About</a></li>                                                     
<li><a href="products.html">Products</a></li>                             
<li><a href="blog.html">Blog</a></li>
<li><a href="contact.html">Contact</a></li>
                     </ul>
                  </div>
                  <div class="col-md-3">
                     <form class="bottom_form">
                        <h3>Newsletter</h3>
                        <input class="enter" placeholder="Enter your email" type="text" name="Enter your email">
                        <button class="sub_btn">subscribe</button>
                     </form>
                  </div>
               </div>
            </div>
            <div class="copyright">
               <div class="container">
                  <div class="row">
                     <div class="col-md-12">
                        <p>Copyright 2019 All Right Reserved By <a href="https://html.design/"> Free  html Templates</a></p>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </footer>-->
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


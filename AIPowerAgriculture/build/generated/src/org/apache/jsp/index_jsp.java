package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("   <head>\n");
      out.write("      <!-- basic -->\n");
      out.write("      <meta charset=\"utf-8\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("      <!-- mobile metas -->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("      <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("      <!-- site metas -->\n");
      out.write("      <title>jon</title>\n");
      out.write("      <meta name=\"keywords\" content=\"\">\n");
      out.write("      <meta name=\"description\" content=\"\">\n");
      out.write("      <meta name=\"author\" content=\"\">\n");
      out.write("      <!-- bootstrap css -->\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("      <!-- style css -->\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("      <!-- Responsive-->\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("      <!-- fevicon -->\n");
      out.write("      <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("      <!-- Scrollbar Custom CSS -->\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("      <!-- Tweaks for older IEs-->\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n");
      out.write("      <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("   </head>\n");
      out.write("   <!-- body -->\n");
      out.write("   <body class=\"main-layout\">\n");
      out.write("      <!-- loader  -->\n");
      out.write("      <div class=\"loader_bg\">\n");
      out.write("         <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end loader -->\n");
      out.write("      <!-- header -->\n");
      out.write("      ");
      out.write("    <header>\n");
      out.write("         <!-- header inner -->\n");
      out.write("         <div class=\"header\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section\">\n");
      out.write("                     <div class=\"full\">\n");
      out.write("                        <div class=\"center-desk\">\n");
      out.write("                           <div class=\"logo\">\n");
      out.write("                              <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"#\" /></a>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xl-9 col-lg-9 col-md-9 col-sm-9\">\n");
      out.write("                     <nav class=\"navigation navbar navbar-expand-md navbar-dark \">\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarsExample04\">\n");
      out.write("                           <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                              <li class=\"nav-item active\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"index.html\"> Home  </a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"about.html\">About</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"products.html\">Products </a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"blog.html\">Blog</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"contact.html\">Contact</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item d_none\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\" d_none get_btn\">\n");
      out.write("                                 <a  href=\"#\">Get a quote</a>\n");
      out.write("                              </li>\n");
      out.write("                           </ul>\n");
      out.write("                        </div>\n");
      out.write("                     </nav>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </header>");
      out.write("\n");
      out.write("      <!-- end header inner -->\n");
      out.write("      <!-- end header -->\n");
      out.write("      <!-- banner -->\n");
      out.write("      <section class=\"banner_main\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-12 \">\n");
      out.write("                  <div class=\"text-bg\">\n");
      out.write("                     <h1>FARMING COMPANY</h1>\n");
      out.write("                     <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it</p>\n");
      out.write("                     <a href=\"#\">Discover</a>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </section>\n");
      out.write("      <!-- end banner -->\n");
      out.write("      <!-- three_box -->\n");
      out.write("      <div class=\"three_box\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                  <div class=\"box_text\">\n");
      out.write("                     <figure><img src=\"images/img1.jpg\" alt=\"#\"/></figure>\n");
      out.write("                  </div>=\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                  <div class=\"box_text\">\n");
      out.write("                     <figure><img src=\"images/img2.jpg\" alt=\"#\"/></figure>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                  <div class=\"box_text\">\n");
      out.write("                     <figure><img src=\"images/img3.jpg\" alt=\"#\"/></figure>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- three_box -->\n");
      out.write("      <!-- hottest -->\n");
      out.write("      <div  class=\"hottest\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row d_flex\">\n");
      out.write("               <div class=\"col-md-5\">\n");
      out.write("                  <div class=\"titlepage\">\n");
      out.write("                     <h2>World?s Hottest Destinations <br>for Vegans</h2>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-7\">\n");
      out.write("                  <div class=\"hottest_box\">\n");
      out.write("                     <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined </p>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end hottest -->\n");
      out.write("      <!-- choose  section -->\n");
      out.write("      <div class=\"choose \">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-8\">\n");
      out.write("                  <div class=\"titlepage\">\n");
      out.write("                     <h2>Why Choose Us? </h2>\n");
      out.write("                     <p>there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined  </p>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row d_flex\">\n");
      out.write("               <div class=\"col-xl-7 col-lg-7 col-md-12 col-sm-12\">\n");
      out.write("                  <div class=\"padding_with\">\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 padding_bottom\">\n");
      out.write("                           <div class=\"choose_box\">\n");
      out.write("                              <i><img src=\"images/icon1.png\" alt=\"#\"/></i>\n");
      out.write("                              <div class=\"choose_text\">\n");
      out.write("                                 <h3>Excellent Service</h3>\n");
      out.write("                                 <p>It is a long established fact that a reader will be distracted by the readable content of a</p>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 padding_bottom\">\n");
      out.write("                           <div class=\"choose_box\">\n");
      out.write("                              <i><img src=\"images/icon2.png\" alt=\"#\"/></i>\n");
      out.write("                              <div class=\"choose_text\">\n");
      out.write("                                 <h3>Clean Working</h3>\n");
      out.write("                                 <p>It is a long established fact that a reader will be distracted by the readable content of a</p>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 padding_bottom2\">\n");
      out.write("                           <div class=\"choose_box\">\n");
      out.write("                              <i><img src=\"images/icon3.png\" alt=\"#\"/></i>\n");
      out.write("                              <div class=\"choose_text\">\n");
      out.write("                                 <h3>Quality And Reliability</h3>\n");
      out.write("                                 <p>It is a long established fact that a reader will be distracted by the readable content of a</p>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                           <div class=\"choose_box\">\n");
      out.write("                              <i><img src=\"images/icon4.png\" alt=\"#\"/></i>\n");
      out.write("                              <div class=\"choose_text\">\n");
      out.write("                                 <h3>Expert Farmer</h3>\n");
      out.write("                                 <p>It is a long established fact that a reader will be distracted by the readable content of a</p>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-xl-5 col-lg-5 col-md-12 col-sm-12\">\n");
      out.write("                  <div class=\"choose_img\">\n");
      out.write("                     <figure><img src=\"images/food.jpg\" alt=\"#\"/></figure>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-5\">\n");
      out.write("                  <a class=\"read_more\" href=\"#\">Read More</a>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end choose  section -->\n");
      out.write("      <!-- product  section -->\n");
      out.write("      <div class=\"product\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"titlepage\">\n");
      out.write("                     <h2>Our Product</h2>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 padding_left0\">\n");
      out.write("                  <div class=\"product_box\">\n");
      out.write("                     <figure><img src=\"images/product1.jpg\" alt=\"#\"/></figure>\n");
      out.write("                     <h3 class=\"black\">vegetable</h3>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-12\">\n");
      out.write("                  <div class=\"product_box\">\n");
      out.write("                     <figure><img src=\"images/product2.jpg\" alt=\"#\"/></figure>\n");
      out.write("                     <h3 >weat</h3>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-12 padding_right0\">\n");
      out.write("                  <div class=\"product_box\">\n");
      out.write("                     <figure><img src=\"images/product3.jpg\" alt=\"#\"/></figure>\n");
      out.write("                     <h3>fruit</h3>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-xl-7 col-lg-7 col-md-7 col-sm-12 padding_left0\">\n");
      out.write("                  <div class=\"product_box\">\n");
      out.write("                     <figure><img src=\"images/product4.jpg\" alt=\"#\"/></figure>\n");
      out.write("                     <h3>sunflowere</h3>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-xl-5 col-lg-5 col-md-5 col-sm-12 padding_right0\">\n");
      out.write("                  <div class=\"product_box\">\n");
      out.write("                     <figure><img src=\"images/product5.jpg\" alt=\"#\"/></figure>\n");
      out.write("                     <h3>Livestock</h3>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end product  section -->\n");
      out.write("      <!-- about -->\n");
      out.write("      <div class=\"about\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-12\">\n");
      out.write("                  <div class=\"titlepage\">\n");
      out.write("                     <h2>People Says About Farm</h2>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-12\">\n");
      out.write("                  <div id=\"myCarousel\" class=\"carousel slide about_Carousel \" data-ride=\"carousel\">\n");
      out.write("                     <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                     </ol>\n");
      out.write("                     <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                           <div class=\"container\">\n");
      out.write("                              <div class=\"carousel-caption \">\n");
      out.write("                                 <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                       <div class=\"test_box\">\n");
      out.write("                                          <i><img src=\"images/tes1.png\" alt=\"#\"/></i>\n");
      out.write("                                          <h4>jhone Du</h4>\n");
      out.write("                                          <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,</p>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                 </div>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                           <div class=\"container\">\n");
      out.write("                              <div class=\"carousel-caption\">\n");
      out.write("                                 <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                       <div class=\"test_box\">\n");
      out.write("                                          <i><img src=\"images/tes1.png\" alt=\"#\"/></i>\n");
      out.write("                                          <h4>jhone Du</h4>\n");
      out.write("                                          <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,</p>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                 </div>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                           <div class=\"container\">\n");
      out.write("                              <div class=\"carousel-caption\">\n");
      out.write("                                 <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                       <div class=\"test_box\">\n");
      out.write("                                          <i><img src=\"images/tes1.png\" alt=\"#\"/></i>\n");
      out.write("                                          <h4>jhone Du</h4>\n");
      out.write("                                          <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,</p>\n");
      out.write("                                       </div>\n");
      out.write("                                    </div>\n");
      out.write("                                 </div>\n");
      out.write("                              </div>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                     </div>\n");
      out.write("                     <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                     <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                     <span class=\"sr-only\">Previous</span>\n");
      out.write("                     </a>\n");
      out.write("                     <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                     <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                     <span class=\"sr-only\">Next</span>\n");
      out.write("                     </a>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- end about -->\n");
      out.write("      </div>\n");
      out.write("      <!--  footer -->\n");
      out.write("      <footer id=\"contact\">\n");
      out.write("         <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                     <div class=\"titlepage\">\n");
      out.write("                        <h2>Contact Us</h2>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                     <form id=\"request\" class=\"main_form\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                           <div class=\"col-md-3 \">\n");
      out.write("                              <input class=\"contactus\" placeholder=\"Full Name\" type=\"type\" name=\"Full Name\"> \n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-md-3\">\n");
      out.write("                              <input class=\"contactus\" placeholder=\"Email\" type=\"type\" name=\"Email\"> \n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-md-3\">\n");
      out.write("                              <input class=\"contactus\" placeholder=\"Phone Number\" type=\"type\" name=\"Phone Number\">                          \n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-12\">\n");
      out.write("                              <ul class=\"social_icon\">\n");
      out.write("                                 <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                 <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                 <li><a href=\"#\"><i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                 <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                              </ul>\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-md-8\">\n");
      out.write("                              <textarea class=\"contactus1\" placeholder=\"Message\" type=\"type\" Message=\"Name\">Message </textarea>\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                              <button class=\"send_btn\">Send</button>\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-3 border_right\">\n");
      out.write("                     <ul class=\"location_icon\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i></a> Locatins</li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-volume-control-phone\" aria-hidden=\"true\"></i></a> +71 9087654321</li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></a>demo@gmail.com</li>\n");
      out.write("                     </ul>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-3 border_right\">\n");
      out.write("                     <h3>Useful Link</h3>\n");
      out.write("                     <ul class=\"link\">\n");
      out.write("                        <li><a href=\"#\">humour, or </a></li>\n");
      out.write("                        <li><a href=\"#\">randomised words </a> </li>\n");
      out.write("                        <li><a href=\"#\">which don't look </a></li>\n");
      out.write("                        <li><a href=\"#\">even slightly  </a> </li>\n");
      out.write("                        <li><a href=\"#\">believable. If   </a></li>\n");
      out.write("                     </ul>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-3 border_right\">\n");
      out.write("                     <h3>Menus</h3>\n");
      out.write("                     <ul class=\"link\">\n");
      out.write("<li><a href=\"index.html\">Home</a></li>                             \n");
      out.write("<li><a href=\"about.html\">About</a></li>                                                     \n");
      out.write("<li><a href=\"products.html\">Products</a></li>                             \n");
      out.write("<li><a href=\"blog.html\">Blog</a></li>\n");
      out.write("<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                     </ul>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-3\">\n");
      out.write("                     <form class=\"bottom_form\">\n");
      out.write("                        <h3>Newsletter</h3>\n");
      out.write("                        <input class=\"enter\" placeholder=\"Enter your email\" type=\"text\" name=\"Enter your email\">\n");
      out.write("                        <button class=\"sub_btn\">subscribe</button>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("               <div class=\"container\">\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                     <div class=\"col-md-12\">\n");
      out.write("                        <p>Copyright 2019 All Right Reserved By <a href=\"https://html.design/\"> Free  html Templates</a></p>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </footer>\n");
      out.write("      <!-- end footer -->\n");
      out.write("      <!-- Javascript files-->\n");
      out.write("      <script src=\"js/jquery.min.js\"></script>\n");
      out.write("      <script src=\"js/popper.min.js\"></script>\n");
      out.write("      <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("      <script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("      <!-- sidebar -->\n");
      out.write("      <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("      <script src=\"js/custom.js\"></script>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

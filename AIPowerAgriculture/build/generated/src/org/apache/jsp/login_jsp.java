package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                               <!--<span style=\"font-size: 18px;color: white\">AI-Powered Solutions for Farmers</span>-->\n");
      out.write("                              <!--<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"#\" /></a>-->\n");
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
      out.write("                                  <a class=\"nav-link\" href=\"index.jsp\"> Home  </a>\n");
      out.write("                              </li>\n");
      out.write("<!--                              <li class=\"nav-item\">\n");
      out.write("                                 <a class=\"nav-link\" href=\"about.html\">About</a>\n");
      out.write("                              </li>-->\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link\" href=\"login.jsp\">Login </a>\n");
      out.write("                              </li>\n");
      out.write("                            \n");
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
      out.write(" \n");
      out.write("      <!-- about -->\n");
      out.write("     \n");
      out.write("      <!-- end about -->\n");
      out.write("      </div>\n");
      out.write("      <!--  footer -->\n");
      out.write("      <footer id=\"contact\">\n");
      out.write("         <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                     <div class=\"titlepage\">\n");
      out.write("                        <h2>Admin Login</h2>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                      <form id=\"request\" class=\"main_form\" action=\"Admin_Login\"  method=\"POST\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                          \n");
      out.write("                           <div class=\"col-md-3\">\n");
      out.write("                              <input class=\"contactus\" placeholder=\"User Name\" type=\"type\" name=\"username\"> \n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-md-3\">\n");
      out.write("                               <input class=\"contactus\" placeholder=\"Enter  Password\" type=\"password\" name=\"password\">                          \n");
      out.write("                           </div>\n");
      out.write("                      \n");
      out.write("                            <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\" style=\"height: 50px\">\n");
      out.write("                               <input type=\"submit\" value=\"LOGIN\" style=\"    font-size: 20px;\n");
      out.write("    transition: ease-in all 0.5s;\n");
      out.write("    background-color: #f4cb1e;\n");
      out.write("    color: #000;\n");
      out.write("    padding: 0px 0px;\n");
      out.write("    max-width: 100px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    width: 100%;\n");
      out.write("    display: block;\n");
      out.write("    margin-top: 0px;\n");
      out.write("    height: 50px;\n");
      out.write("    \n");
      out.write("}\">\n");
      out.write("                           </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
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
      out.write("</html>");
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

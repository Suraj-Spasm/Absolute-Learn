package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login page</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"contents/style1.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("  <div class=\"cont\">\n");
      out.write("      <div class=\"form sign-in \"><form action=\"validate\" method=\"POST\">\n");
      out.write("      <h2>Log In</h2>\n");
      out.write("            \n");
      out.write("      <label>\n");
      out.write("        <span>Email Address</span>\n");
      out.write("        <input type=\"email\" name=\"eml\"  required>\n");
      out.write("      </label>\n");
      out.write("      <label>\n");
      out.write("        <span>Password</span>\n");
      out.write("        <input type=\"password\" name=\"pwd\" required>\n");
      out.write("      </label>\n");
      out.write("        <label>\n");
      out.write("     <input type=\"radio\" name=\"r1\" value=\"admin\"><span>ADMIN</span><br>       \n");
      out.write("    <input type=\"radio\" name=\"r1\" value=\"staff\"><span>TEACHER</span><br>\n");
      out.write("   <input type=\"radio\" name=\"r1\" value=\"user\"><span>STUDENT</span>\n");
      out.write("        </label>\n");
      out.write("      <input class=\"submit\" type=\"submit\" value=\"Log In\" >\n");
      out.write("      <p class=\"forgot-pass\">Forgot Password ?</p>\n");
      out.write("<div class=\"social-media\">\n");
      out.write("    \n");
      out.write("</div></form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"sub-cont\">\n");
      out.write("      <div class=\"img\">\n");
      out.write("        <div class=\"img-text m-up\">\n");
      out.write("          <h2>New here?</h2>\n");
      out.write("          <p>Register yourself and discover great amount of new E-learning opportunities!</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"img-text m-in\">\n");
      out.write("          <h2>One of us?</h2>\n");
      out.write("          <p>If you already has an account, just log in. We've missed you!</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"img-btn\">\n");
      out.write("          <span class=\"m-up\">Registration </span>\n");
      out.write("          <span class=\"m-in\">Log in</span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form sign-up\"><form action=\"RegValidate\" method=\"POST\" >\n");
      out.write("        <h2> Registration </h2>\n");
      out.write("        <label>\n");
      out.write("          <span>Full Name</span>\n");
      out.write("          <input type=\"text\" name=\"un\" required>\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("          <span>Email</span>\n");
      out.write("          <input type=\"email\" name=\"eml\"   required >\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("          <span>Password</span>\n");
      out.write("          <input type=\"password\"name=\"pwd\" required></label>\n");
      out.write("           <label>\n");
      out.write(" \t   <span>Contact</span>\n");
      out.write("           <input type =\"Text\" name=\"ctc\" required> </label>\n");
      out.write(" \t   <label>\n");
      out.write("\t   <span>Admin</span> <input type=\"radio\" name=\"r1\" value=\"admin\">\n");
      out.write("           <span>Teacher</span><input type=\"radio\" name=\"r1\" value=\"staff\">\n");
      out.write("           <span>Student</span><input type=\"radio\" name=\"r1\" value=\"user\">\n");
      out.write("           </label>\n");
      out.write("        <input type=\"submit\" class=\"submit\" value=\"Register\">\n");
      out.write("  </form>\n");
      out.write("        </div>\n");
      out.write("<script>\n");
      out.write("    function myOnClickfn() {\n");
      out.write("     document.location.href=\"Validate\";\n");
      out.write("}\n");
      out.write("    document.querySelector('.img-btn').addEventListener('click', function()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.querySelector('.cont').classList.toggle('s-signup');\n");
      out.write("\t}\n");
      out.write(");\n");
      out.write("    </script>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

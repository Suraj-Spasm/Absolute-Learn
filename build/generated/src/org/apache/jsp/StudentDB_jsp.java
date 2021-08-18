package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title> Absolute learn Student Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"contents/main%20(1).css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"search-results\" style=\"display: none;\">\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <nav class=\"topnav\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a href=\"#\" class=\"display-sm display-md\" id=\"menu\"><i class=\"fa fa-list-ul\"></i></a>\n");
      out.write("            <a href=\"index.jsp\" class=\"hidden-sm\"><h1>Student Dashboard</h1></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"user-menu\">\n");
      out.write("            <form action=\"#\" method=\"post\" class=\"hidden-sm\">\n");
      out.write("                <input type=\"text\" name=\"search\" id=\"search\" placeholder=\"Search lec\">\n");
      out.write("                <i class=\"fa fa-search\"></i>\n");
      out.write("            </form>\n");
      out.write("            <div><BR>\n");
      out.write("                <a href=\"index.jsp#\">ABSOLUTE LEARN</a>\n");
      out.write("                <a href=\"loginPage.jsp\"><i class=\"fa fa-power-off\"></i></a>\n");
      out.write("                </BR></div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("   \n");
      out.write("   <aside class=\"sidenav hidden-sm hidden-md\" id=\"nav\">\n");
      out.write("       <div class=\"list\">\n");
      out.write("      <a href=\"index.jsp#\"><i class=\"fas fa-desktop\"></i><span>Absolute Learn</span></a>\n");
      out.write("      <a href=\"StudentDB.jsp#Lecture\"><i class=\"fas fa-cogs\"></i><span>Lectures</span></a>\n");
      out.write("      <a href=\"http://itscholar.codegency.co.in/courses/bsc-it.html\"><i class=\"fas fa-table\"></i><span>Books</span></a>\n");
      out.write("      <a href=\"https://classroom.google.com/u/1/c/MzIzMDU2NjE5NDIw\"><i class=\"fas fa-th\"></i><span>Assighnment</span></a>\n");
      out.write("      <a href=\"index.jsp#contact\">\n");
      out.write("          <i class=\"fas fa-info-circle\"></i><span>Contact Us</span></a>\n");
      out.write("      </div>\n");
      out.write("   </aside>\n");
      out.write("\n");
      out.write("   <main class=\"content\">\n");
      out.write("      <div class=\"grid\">\n");
      out.write("          <a href=\"index.jsp#contact\">\n");
      out.write("          <div class=\"mini-reports bg-blue\">\n");
      out.write("                <div class=\"l\">\n");
      out.write("                    <span>BSCIT SEM 1 & 2</span>\n");
      out.write("                    <span>LECTURE</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"r\">\n");
      out.write("                    <i class=\"fa fa-book c-blue\"></i>\n");
      out.write("                </div>\n");
      out.write("          </div></a>\n");
      out.write("          <a href=\"index.jsp#contact\">\n");
      out.write("          <div class=\"mini-reports bg-green\">\n");
      out.write("                <div class=\"l\">\n");
      out.write("                    <span>BSCIT SEM 3 & 4</span>\n");
      out.write("                    <span>LECTURE</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"r\">\n");
      out.write("                    <i class=\"fa fa-book c-green\"></i>\n");
      out.write("                </div>\n");
      out.write("          </div></a>\n");
      out.write("          <a href=\"index.jsp#contact\">\n");
      out.write("          <div class=\"mini-reports bg-orange\">\n");
      out.write("                <div class=\"l\">\n");
      out.write("                    <span>BSCIT SEM 5 & 6</span>\n");
      out.write("                    <span>LECTURE</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"r\">\n");
      out.write("                    <i class=\"fa fa-book c-orange\"></i>\n");
      out.write("                </div>\n");
      out.write("          </div></a>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"grid\">\n");
      out.write("          <div class=\"painel\">\n");
      out.write("              <div class=\"painel-header\">\n");
      out.write("                  <h4 class=\"painel-title\">Table</h4>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-blue\">Scheduling of lec </a>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("                <table class=\"zebra\" id=\"Lecture\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>SUBJECT</th>\n");
      out.write("                        <th>TIME</th>\n");
      out.write("                        <th>DATE</th>\n");
      out.write("                        <th>JOIN</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Business Itelligence</td>\n");
      out.write("                        <td>8.15 to 9.30</td>\n");
      out.write("                        <td>15/04/2021</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"https://us04web.zoom.us/j/76540685636?pwd=bm1lYkFzbkNFcGZWTWpIUVROeEpTUT09\" class=\"btn btn-red\">\n");
      out.write("                                <i>join Lecture</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Cyber law </td>\n");
      out.write("                        <td>9.45 to 11.30</td>\n");
      out.write("                        <td>15/04/2021</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"https://us05web.zoom.us/j/87484485756?pwd=dkFVNnNlZFpqSjRBSSsvK0Q0ODJNdz09\" class=\"btn btn-blue\"><i>Join Lecture</i></a>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                <tr>\n");
      out.write("                        <td>Security in computing</td>\n");
      out.write("                        <td>7.30 to 8.30</td>\n");
      out.write("                        <td>16/04/2021</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"https://us05web.zoom.us/j/81399403939?pwd=MHdBZjVUZlAxZ2JFbis3b05hOTEzQT09\" class=\"btn btn-red\"><i>Join Lecture</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Softwware Quality Assurance</td>\n");
      out.write("                        <td>8.45 to 9.30</td>\n");
      out.write("                        <td>16/04/2021</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"https://us04web.zoom.us/\" class=\"btn btn-red\"><i>Join \n");
      out.write("                                Lecture</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>BI</td>\n");
      out.write("                        <td>10.00 to 11.00</td>\n");
      out.write("                        <td>15/04/2021</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"https://us04web.zoom.us/\" class=\"btn btn-red\"><i>Join Lecture</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"painel\">\n");
      out.write("              <div class=\"painel-header\">\n");
      out.write("                  <h6 class=\"painel-title\">Ask Doubt</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"painel-body\">\n");
      out.write("                <form  class=\"form\" action=\"doubt\" method=\"POST\">\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <label for=\"#\">Name</label>\n");
      out.write("                        <input type=\"text\" name=\"un\" id=\"\" placeholder=\"Name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <label for=\"#\">Email</label>\n");
      out.write("                        <input type=\"email\" id=\"\" name =\"eml\"placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                        <label for=\"#\">Choose Subject</label>\n");
      out.write("                        <select name=\"sub\" id=\"\">\n");
      out.write("                            <option value=\"\">Business itelligence</option>\n");
      out.write("                            <option value=\"\">Software Quality Assurance</option>\n");
      out.write("                            <option value=\"\">Cyber Law</option>\n");
      out.write("                            <option value=\"\">Security in Computing</option>\n");
      out.write("                            <option value=\"\">Principle of GIS</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <textarea class=\"form-control rounded-0\" id=\"exampleFormControlTextarea1\" name=\"Do\" rows=\"10\" cols=\"30\" ></textarea>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-green\" style=\"width: 40%;\" value=\"Ask Your Doubt\">\n");
      out.write("                    </div>\n");
      out.write("                    <script src=\"contents/main%20(1).js\"></script></form></div></div></main>\n");
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

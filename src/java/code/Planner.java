
package code;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anmol
 */
public class Planner extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!doctype html>\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"  <!-- Required meta tags -->\n" +
"  <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"  <title> Lecture  </title>\n" +
"  <!-- Bootstrap CSS -->\n" +
"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
"\n" +
"  <!-- common external css-->\n" +
"  <link rel=\"stylesheet\" href=\"contents/css/common.css\" />\n" +
"  <!-- external css for this file -->\n" +
"  <link rel=\"stylesheet\" href=\"contents/css/planner.css\" />\n" +
"\n" +
"  <!--font awesome-->\n" +
"  <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\" />\n" +
"\n" +
"  <!-- JavaScript-->\n" +
"  <script src=\"dashboard.js\"></script>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"\n" +
"  <!-- nav bar -->\n" +
"  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n" +
"    <abbr title=\"Go to the home page\"><a class=\"navbar-brand logoMiniguru\" href=\"#\">Absolute Learn</a></abbr>\n" +
"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"      <span class=\"navbar-toggler-icon\"></span>\n" +
"    </button>\n" +
"\n" +
"    \n" +
"        <!-- <li class=\"nav-item dropdown userPhoto\">\n" +
"          <a class=\"nav-link \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"            <i class=\"fas fa-user\" style=\"font-size:2rem;color:#fff;\"></i>\n" +
"          </a>\n" +
"        </li>\n" +
"        <li class=\"nav-item bell\">\n" +
"          <a class=\"nav-link \" href=\"#\"><i class=\"fas fa-bell\" style=\"font-size:2rem;color:#fff;\"></i></a>\n" +
"        </li> -->\n" +
"    </nav>\n" +
"\n" +
"\n" +
"  <!-- vertical menu for dshboard planner materials upload and wallet -->\n" +
"\n" +
"  <input type=\"checkbox\" id=\"check\">\n" +
"  <label for=\"check\">\n" +
"    <i class=\"fas fa-bars\" id=\"btn\"></i>\n" +
"    <i class=\"fas fa-times\" id=\"cancel\"></i>\n" +
"  </label>\n" +
"  <section id=\"sideMenu\">\n" +
"    <nav>\n" +
"      <a href=\"Dashboard\"><i class=\"fas fa-tachometer-alt-slowest\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Dashboard</a>\n" +
"      <hr /><a href=\"Planner\" class=\"active\"> <i class=\"fas fa-mind-share\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Lecture </a>\n" +
"      \n" +
"      <hr /><a href=\"Upload\"> <i class=\"fas fa-upload\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Upload videos </a>\n" +
"     \n" +
"      <hr /><a href=\"Progress\"> <i class=\"fas fa-chart-bar\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i> Project </a>\n" +
"     \n" +
"      <hr />\n" +
"    </nav>\n" +
"\n" +
"  </section>\n" +
"\n" +
"  <!-- planner's section start here -->\n" +
"  <div class=\"row planner\">\n" +
"\n" +
"    <div class=\"col-lg-6 col-md-12 col-sm-12\" id=\"list\">\n" +
"      <h4>Schedual your lecture!</h4>\n" +
"      <form action=\'Schedulev\' method=\'POST\'>\n" +
"        <label for=\"pname\">Add lecture:</label><br>\n" +
"        <input type=\"text\" id=\"pname\" name=\"pname\" style=\"border:0.1px solid lightgrey;\"><br>\n" +
"        <label for=\"start\">Date</label><br>\n" +
"          <input type=\"date\" id=\"start\" name=\"Date\"><br>\n" +
"          <label for=\"start\">Start time:</label><br>\n" +
"          \n" +
"        <input type=\"time\" id=\"start\" name=\"start\"><br>\n" +
"        <label for=\"end\">Expected Ending time:</label><br>\n" +
"        <input type=\"time\" id=\"end\" name=\"end\"><br>   \n" +
"    </div>\n" +
"    <div class=\"col-lg-6 col-md-12 col-sm-12\">\n" +
"      <div class=\"area\">\n" +
"        <i class=\"fas fa-lightbulb\"></i>\n" +
"        <label for=\"exampleFormControlTextarea1\">Add Summary of your lec!</label>\n" +
"        <textarea class=\"form-control rounded-0\" id=\"exampleFormControlTextarea1\" rows=\"10\" name=\"des\"></textarea>\n" +
"        <input type=\"submit\" class=\"btn\" style=\"padding:0.2rem 1rem; margin-top:0.3rem; background-color:darkgrey;width:60%\" value=\"Schedual Lecture\">\n" +
"      </div>\n" +
"    </form>\n" +
"\n" +
"    </div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"    </div>\n" +
"  <!-- Optional JavaScript -->\n" +
"  <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n" +
"  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n" +
"</body>\n" +
"\n" +
"</html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Planner</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Planner at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

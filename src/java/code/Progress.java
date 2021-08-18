/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Progress extends HttpServlet {

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
            out.println("<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"  <title>Project and Assighment</title>\n" +
"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
"\n" +
"  <link rel=\"stylesheet\" href=\"contents/css/common.css\" />\n" +
"\n" +
"\n" +
"  <link rel=\"stylesheet\" href=\"contents/css/progress.css\" />\n" +
"\n" +
"  <!--font awesome-->\n" +
"  <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\" />\n" +
"\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"\n" +
"  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n" +
"    <abbr title=\"Go to the home page\"><a class=\"navbar-brand logoMiniguru\" href=\"#\">Absolute Learn</a></abbr>\n" +
"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"      <span class=\"navbar-toggler-icon\"></span>\n" +
"    </button>\n" +
"\n" +
"    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
"      <ul class=\"navbar-nav ml-auto\">\n" +
"        <form class=\"form-inline my-2 my-lg-0 \">\n" +
"          <input class=\"form-control form-control-dark searchBar\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n" +
"          <button class=\"btn btn-primary\" style=\"background-color:#cc5500; border:none;\">Search</button>\n" +
"        </form>\n" +
"\n" +
"        <li class=\"nav-item dropdown userPhoto\">\n" +
"          <a class=\"nav-link \" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"            <i class=\"fas fa-user\" style=\"font-size:2rem;color:#fff;\"></i>\n" +
"          </a>\n" +
"          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
"            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-home\"></i>Home</a>\n" +
"            <div class=\"dropdown-divider\"></div>\n" +
"            <a class=\"dropdown-item\" href=\"Yourvideos.java\"><i class=\"fas fa-video\"></i>Your videos</a>\n" +
"            <div class=\"dropdown-divider\"></div>\n" +
"            <a class=\"dropdown-item\" href=\"settings.html\"><i class=\"fas fa-cog\"></i>Account Settings</a>\n" +
"            <div class=\"dropdown-divider\"></div>\n" +
"            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-question-circle\"></i>Help</a>\n" +
"            <div class=\"dropdown-divider\"></div>\n" +
"            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-sign-out-alt\"></i>SignOut</a>\n" +
"          </div>\n" +
"        </li>\n" +
"        <li class=\"nav-item bell\">\n" +
"          <a class=\"nav-link \" href=\"#\"><i class=\"fas fa-bell\" style=\"font-size:2rem;color:#fff;\"></i></a>\n" +
"        </li>\n" +
"      </ul>\n" +
"\n" +
"    </div>\n" +
"  </nav>\n" +
"  <input type=\"checkbox\" id=\"check\">\n" +
"  <label for=\"check\">\n" +
"    <i class=\"fas fa-bars\" id=\"btn\"></i>\n" +
"    <i class=\"fas fa-times\" id=\"cancel\"></i>\n" +
"  </label>\n" +
"  <section id=\"sideMenu\">\n" +
"    <nav>\n" +
"      <a href=\"Dashboard\"><i class=\"fas fa-tachometer-alt-slowest\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Dashboard</a>\n" +
"      <hr /><a href=\"Planner\"> <i class=\"fas fa-mind-share\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Lecture</a>\n" +
"      <hr /><a href=\"Upload\"> <i class=\"fas fa-upload\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Upload Lecture </a><hr /><a href=\"progress.html\" class=\"active\"><i class=\"fas fa-chart-bar\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Projects</a>\n" +
"    <hr/>\n" +
"    </nav>\n" +
"\n" +
"  </section>\n" +
"\n" +
"  <div class=\"row progress-section\">\n" +
"    <div class=\"col-lg-8 col-md-8 col-sm-8\">\n" +
"      <div class=\"progressdiv\">\n" +
"        <table class=\"table table-bordered\">\n" +
"          <thead>\n" +
"            <tr>\n" +
"              <th scope=\"col\" class=\"colm\">Sr.No</th>\n" +
"              <th scope=\"col\" class=\"colm\">Project Name</th>\n" +
"              <th scope=\"col\" class=\"colm\">Practical No</th>\n" +
"              <th scope=\"col\" class=\"colm\">Assighment</th>\n" +
"            </tr>\n" +
"          </thead>\n" +
"          <tbody>\n" +
"            <tr>\n" +
"              <td>1</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>2</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>3</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>4</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>5</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>6</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>7</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>8</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>9</td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"              <td></td>\n" +
"\n" +
"            </tr>\n" +
"          </tbody>\n" +
"        </table>\n" +
"      </div>\n" +
"    </div>\n" +
" </div>\n" +
"  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n" +
"</body>\n" +
"\n" +
"</html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Progress</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Progress at " + request.getContextPath() + "</h1>");
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

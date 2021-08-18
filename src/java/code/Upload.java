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
public class Upload extends HttpServlet {

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
"  <title> Upload video </title>\n" +
"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
"\n" +
"  <link rel=\"stylesheet\" href=\"contents/css/common.css\" />\n" +
"    \n" +
"  \n" +
"    <link rel=\"stylesheet\" href=\"contents/css/upload.css\" />\n" +
"\n" +
"  \n" +
"    <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\n" +
"\n" +
"  \n" +
"    <script src=\"dashboard.js\"></script>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"\n" +
"  <!-- nav bar -->\n" +
"  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n" +
"    <abbr title=\"Go to the home page\">\n" +
"      <a class=\"navbar-brand logoMiniguru\" href=\"#\">Absolute Learn</a></abbr>\n" +
"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"      <span class=\"navbar-toggler-icon\"></span>\n" +
"    </button>\n" +
"\n" +
"    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
"      <ul class=\"navbar-nav ml-auto\">\n" +
"        <li class=\"nav-item bell\">\n" +
"          <a class=\"nav-link \" href=\"#\"><i class=\"fas fa-bell\" style=\"font-size:2rem;color:#fff;\"></i></a>\n" +
"        </li>\n" +
"      </ul>\n" +
"\n" +
"    </div>\n" +
"  </nav>\n" +
"\n" +
"\n" +
"  <input type=\"checkbox\" id=\"check\">\n" +
"  <label for=\"check\">\n" +
"    <i class=\"fas fa-bars\" id=\"btn\"></i>\n" +
"    <i class=\"fas fa-times\" id=\"cancel\"></i>\n" +
"  </label>\n" +
"  <section id=\"sideMenu\">\n" +
"    <nav>\n" +
"      <a href=\"Dashboard\"><i class=\"fas fa-tachometer-alt-slowest\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Dashboard</a>\n" +
"      <hr /><a href=\"Planner\"> <i class=\"fas fa-mind-share\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i>Lecture</a>\n" +
"      <hr /><a href=\"Upload\" class=\"active\"> <i class=\"fas fa-upload\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\"></i> Upload Videos</a>\n" +
"      <hr /><a href=\"Progress\"><i class=\"fas fa-chart-bar\" style=\"font-size:1.4rem; padding-right: 1rem; color:#cc5500;\" href=\"#progress\"></i>Project</a>\n" +
"      </nav>\n" +
"  </section>\n" +
"\n" +
"\n" +
"    <div class=\"row upload-section\">\n" +
"      <div class=\"col-lg-6 col-md-12 col-sm-12\">\n" +
"        <div class=\"up\">\n" +
"          <div><i class=\"fas fa-upload\" style=\"font-size:5rem; padding-right: 1rem; color:#cc5500;\" aria-hidden=\"true\">\n" +
"              <h3 style=\"margin-top:1rem;\">UPLOAD YOUR VIDEO!</h3>\n" +
"            </i></div><button type=\"button\" id=\"upload\" style=\"margin-top:1rem;margin-left:0;\"> Upload Your Lecture </button>\n" +
"        </div>\n" +
"      </div>\n" +
"        <table class=\"table table-bordered\">\n" +
"          <thead>\n" +
"            <tr>\n" +
"              <th>S.No.</th>\n" +
"              <th> Title</th>\n" +
"            </tr>\n" +
"          </thead>\n" +
"\n" +
"          <tbody>\n" +
"            <tr>\n" +
"              <td> 1. </td>\n" +
"              <td> <input type=\"text\" name=\"project_name\" placeholder=\"video link\"></td>\n" +
"            </tr>\n" +
"\n" +
"            <tr>\n" +
"              <td>\n" +
"                2.\n" +
"              </td>\n" +
"              <td> <input type=\"text\" name=\"project_name\" placeholder=\"video link\"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"              <td>\n" +
"                3.\n" +
"              </td>\n" +
"              <td><input type=\"text\" name=\"project_name\" placeholder=\"video link\"> </td>\n" +
"            </tr>\n" +
"\n" +
"            <tr>\n" +
"              <td>\n" +
"                4.\n" +
"              </td>\n" +
"              <td> <input type=\"text\" name=\"project_name\" placeholder=\"video link\"></td>\n" +
"            </tr>\n" +
"          </tbody>\n" +
"\n" +
"        </table>\n" +
"\n" +
"      \n" +
"      \n" +
"    </div>\n" +
"  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n" +
"</body>\n" +
"\n" +
"</html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Uploads</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Uploads at " + request.getContextPath() + "</h1>");
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

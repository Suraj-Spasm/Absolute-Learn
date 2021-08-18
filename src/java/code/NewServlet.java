package code;

import daoimpl.UserDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Faculty
 */
public class NewServlet extends HttpServlet {

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
            UserDaoImpl udi = new UserDaoImpl();
            String eml = request.getParameter("eml");
            String pwd = request.getParameter("pwd");
            String role = request.getParameter("r1");
            User u = udi.getUSerByEmail(eml);
            System.out.println(u);
            if (eml.equalsIgnoreCase(u.getEmail()) && pwd.equals(u.getPassword())&&role.equalsIgnoreCase(u.getRole())) {
                System.out.println("user valid cre");
                if (u.isActive()) {
                    System.out.println("active user");
                    if (u.getRole().equalsIgnoreCase("admin")) {
                        System.out.println("admin role");
                         RequestDispatcher rd = getServletContext().getRequestDispatcher("/Admins");
                   request.setAttribute("user", u);
                    rd.forward(request, response); 
                    } else if (u.getRole().equalsIgnoreCase("staff")) {
                        System.out.println("staff user");
                         RequestDispatcher rd = getServletContext().getRequestDispatcher("/Dashboard");
                    request.setAttribute("user", u);
                    rd.forward(request, response); 
                    } else {
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/StudentDB.jsp");
                    request.setAttribute("user", u);
                    rd.forward(request, response); 
                    }
                    
                } else {
                    out.println("User cannot log in due to account disabled\nPlease Connect with Admin");
                }
                
                
            } else {
                out.println("Invalid Info");
                out.println("<a href='index.jsp'>Home</a>");
            }
            udi.disconnect();
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

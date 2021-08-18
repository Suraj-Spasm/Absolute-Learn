
package code;

import daoimpl.DoubtDaoimp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Doubt;

/**
 *
 * @author Anmol
 */
public class doubtservlet extends HttpServlet {

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
            DoubtDaoimp Ddi = new DoubtDaoimp();
            String un = request.getParameter("un");
            String eml = request.getParameter("eml");
            String sub = request.getParameter("Sub");
            int id = Ddi.getLastno();
            String Do = request.getParameter("Do");
            Doubt u = new Doubt(id+1,un, eml, sub, Do);
             boolean b = Ddi.addDoubt(u);
            if (b) {
                out.println("Added");
                out.println("<br><br><br><a href='StudentDB.jsp'>Go to Home</a>");
            } else {
                out.println("Failed");
                out.println("<br><br><br><a href='StudentDB.jsp'>Go Back</a>");
            }
             
            Ddi.disconnect();
            
            
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet doubtservlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet doubtservlet at " + request.getContextPath() + "</h1>");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pc
 */
public class ValidationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
          String email=request.getParameter("email");
          //String pass=request.getParameter("pass");
         if(email.equalsIgnoreCase("tomer@abes.ac.in"))
         {
          RequestDispatcher rd=request.getRequestDispatcher("Success");
         rd.forward(request, response);
         request.setAttribute("myemail",email);
         }
         else
         {
         RequestDispatcher rd=request.getRequestDispatcher("Fail");
         rd.forward(request, response);
         }
         
          //HttpSession session=request.getSession(true);
          //session.setAttribute("myemail",email);
          /*
          if(email.equalsIgnoreCase("prashant@abes.ac.in"))
          {
           RequestDispatcher rd= request.getRequestDispatcher("Validation");
           rd.forward(request, response);
          }
*/           
out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Welcome, "+email+ "</h1>");
            //out.println("<h1>Password:"+pass+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
    
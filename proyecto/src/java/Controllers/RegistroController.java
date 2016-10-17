
package Controllers;


import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;
import java.util.*;
import java.sql.*;



public class RegistroController extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out  = response.getWriter();
            try {
            ResultSet res;
            Consulta con = new Consulta();
            
            String mail = "";
            res = con.buscarPorCorreo(request.getParameter("correo"));
            request.getRequestDispatcher("/form.jsp")
                .forward(request, response);
        } catch (Exception e) {
            System.out.println("nope");
        }
        
       
        
        
       
    }

  
    
}

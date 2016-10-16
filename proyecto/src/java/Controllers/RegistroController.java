
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


public class RegistroController extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //se reciben los datos
        String mail = request.getParameter("mail");
        Model.RegistroAlcoholemia reg = new Model.RegistroAlcoholemia();
        
        EntityManager em;
            EntityManagerFactory emf;
            
            emf = Persistence.createEntityManagerFactory("proyectoPU");
            em = emf.createEntityManager();     
            em.getTransaction().begin();
            em.persist(reg);
            em.flush();
            em.getTransaction().commit();
            
            response.sendRedirect("wena.jsp");
     
       
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
        
       
        
        
       
    }

  
    
}

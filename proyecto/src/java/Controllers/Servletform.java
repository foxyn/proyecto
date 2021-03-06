
package Controllers;


import Model.Consulta;
import Model.RegistroAlcoholemia;
import static Model.RegistroAlcoholemia_.fechaCreacion;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Servletform", urlPatterns = {"/Servletform"})
public class Servletform extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/form.jsp")
                .forward(request, response);
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      // Se reciben los datos de form.jsp
      String correo = request.getParameter("correo");
      String  mili = request.getParameter("mili");
      String grados = request.getParameter("grados");
      String peso = request.getParameter("peso");
      String sexo= null;
      String mensaje=null;
      DecimalFormat df = new DecimalFormat("0.00");
      Date fecha_creacion = null;
      
      
      double factor=0;
      if (request.getParameter("sexo") == "1"){
           sexo = "M";
           factor = 0.7;
      }else{
           sexo = "F";
           factor = 0.6;
      }
      
      int mili2 = Integer.parseInt(mili);
      double grados2 = Double.parseDouble(grados);
      int peso2 = Integer.parseInt(peso);
      
      
      double alcohol = (mili2 * grados2 * 0.8) / 100;
      double alcoholemia = alcohol / (peso2 * factor);
      
     
      
    
        
        /*RegistroAlcoholemia reg = new RegistroAlcoholemia();
            reg.setIdRegistro(Long.MIN_VALUE);
            reg.setMail(correo);
            reg.setMililitros(mili2);
            reg.setGraduacion(grados2);
            reg.setPeso(peso2);
            reg.setSexo(Character.MAX_VALUE);
            reg.setAlcoholemia(alcoholemia);
            reg.setEstado("ebrio");
            reg.setFechaCreacion((Date) fechaCreacion);
            
            EntityManager em;
            EntityManagerFactory emf;
            
            emf = Persistence.createEntityManagerFactory("proyectoPU");
            em = emf.createEntityManager();     
            em.getTransaction().begin();
            em.persist(reg);
            em.flush();
            em.getTransaction().commit();*/
            
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String estado="";
             if (alcoholemia < 0.3){
                
               request.getSession().setAttribute("mensaje","Alcohol: "+ df.format(alcohol) + "<br> Alcoholemia: " + df.format(alcoholemia)+ "<br> Sin Sanción al conducir.");
               estado = "Sin Sanción al conducir.";
            }else if (alcoholemia >= 0.3 && alcoholemia <0.8){
                
                request.getSession().setAttribute("mensaje","Alcohol: "+ df.format(alcohol) + "<br> Alcoholemia: " + df.format(alcoholemia) + "<br> Bajo la influencia de alcohol.");
                estado = "Bajo la influencia de alcohol.";
            }else{
               
                request.getSession().setAttribute("mensaje","Alcohol: "+ df.format(alcohol) + "<br> Alcoholemia: " + df.format(alcoholemia) + "<br> Estado de Ebriedad.");
                estado = "Estado de Ebriedad.";
            }
             
            try {
                
            ResultSet res;
            
            Consulta con = new Consulta();
            fecha_creacion = Date.from(Instant.MIN);
            
            res = con.Insertar(correo, mili2, grados2, peso2, sexo, alcoholemia, estado, fecha_creacion);
            request.getRequestDispatcher("/form.jsp")
                .forward(request, response);
        } catch (Exception e) {
             request.getRequestDispatcher("/form.jsp")
                .forward(request, response);
        }
            
            
            
            
            
            
      
        }
       
      
        alcoholemia=0;
    }
    
    
}

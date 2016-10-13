
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
      
     
      
      
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out = response.getWriter()){
            out.println("correo: "+ correo);
            out.println("mililitros: "+ mili);
            out.println("grados: "+ grados);
            out.println("peso: "+ peso);
          
            out.println("sexo: "+ sexo);
             if (alcoholemia < 0.3){
               
               request.getSession().setAttribute("mensaje","Alcoholemia: " + alcoholemia + "<br> Sin Sanción al conducir.");
            }else if (alcoholemia >= 0.3 && alcoholemia <0.8){
                
                request.getSession().setAttribute("mensaje","Alcoholemia: " + alcoholemia + "<br> Bajo la influencia de alcohol.");

            }else{
               
                request.getSession().setAttribute("mensaje","Alcoholemia: " + alcoholemia + "<br> Estado de Ebriedad.");

            }
            
            request.getRequestDispatcher("/form.jsp").forward(request, response); 
        }
    }



}


package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection cnn;  //conectar la base de datos
    Statement state; //ejecuta query
    ResultSet res;   //guardar resultado de un select
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/curso?zeroDateTimeBehavior=convertToNull","root","");//url,user/pass
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int Insertar(Persona p){
        int bandera=0;
        try {
            String sql= "Inter into registro_alcoholemia (correo,mililitros,grados,peso,sexo,alcoholemia,estado,fecha)"
                    + "values('"+p.getCorreo()+"',"+p.getMili()+","+p.getGrados()+","+p.getPeso()+",'"+p.getSexo()+"',"+p.getAlcoholemia()+",'"+p.getEstadito()+"')";
            state = cnn.createStatement();
            bandera = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
        
    }

    
}

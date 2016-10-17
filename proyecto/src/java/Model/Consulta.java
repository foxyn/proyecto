/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author felipe
 */
public class Consulta extends Conexion{
    private ResultSet resultado;
    
    
    
    
    
    public ResultSet buscarPorCorreo(String mail) throws Exception{
        try {
            getStat();
            resultado = stmt.executeQuery("SELECT * FROM Registro_Alcoholemia WHERE mail = '" + mail +"%'");
            return resultado;
        } catch (Exception e) {
            System.err.println("SQLException: " + e.getMessage());
            return null;
        }
        
    }
    public ResultSet Insertar(String mail, int mililitros, double graduacion, int peso, char sexo, double alcoholemia, String estado, Date fecha_creacion) throws Exception{
        try {
            getStat();
            resultado = stmt.executeQuery("INSERT INTO Registro_Alcoholemia  VALUES ('"+ mail +"',"+ mililitros+","+graduacion+","+peso+",'"+sexo+"',"+alcoholemia+",'"+estado+"','"+fecha_creacion+"' )");
            return resultado;
        } catch (Exception e) {
            System.err.println("SQLException: " + e.getMessage());
            return null;
        }
        
    }
    
}

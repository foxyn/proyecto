/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
/**
 *
 * @author felipe
 */
public class Conexion {
    protected Connection con;
    protected Statement stmt;
    private String serverName = "localhost";
    private  String serverPort="3306";
    private String databaseName="curso";
    private String url= "jdbc:mysql://localhost:3306" + databaseName;
    private String userName ="root";
    private String password = "";
    
    private String errString = "";
    
    public Conexion () {
        
    }
    private String getConnectionUrl(){
        return url;
    }
    public Connection Conectar(){
        con=null;
        try {
            Class.forName("org.gjt.mm.mysql.Drive");
            con = (Connection) DriverManager.getConnection(getConnectionUrl(),userName,password);
            stmt = (Statement) con.createStatement();
            System.out.println("conectao");
            
        } catch (Exception e) {
            errString = "Error";
            System.out.println(errString);
            return null;
                   
        }
        return con;
    }
    public void Desconectar(){
        try {
            stmt.close();
            con.close();
            
        } catch (Exception e) {
            errString = "Error al cerrar la bd";
            System.out.println(errString);
            
        }
        
    }
    public Statement getStat(){
            return this.stmt;
        }
     
    
            
}

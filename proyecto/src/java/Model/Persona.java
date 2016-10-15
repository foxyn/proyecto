
        
package Model;



public class Persona {
    public String correo;
    
    //Date fecha =  new Date();
    //DateFormat formato = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");

    public Persona(String correo) {
        this.correo = correo;
        
    }

    
    
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
}
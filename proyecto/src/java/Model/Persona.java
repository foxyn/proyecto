
        
package Model;



public class Persona {
    public String correo;
    public int mili;
    public double grados;
    public int peso;
    public char sexo;
    public double alcoholemia;
    public String estadito;
    //Date fecha =  new Date();
    //DateFormat formato = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");

    public Persona(String correo, int mili, double grados, int peso, char sexo, double alcoholemia, String estadito) {
        this.correo = correo;
        this.mili = mili;
        this.grados = grados;
        this.peso = peso;
        this.sexo = sexo;
        this.alcoholemia = alcoholemia;
        this.estadito = estadito;
    }

    
  
    public Persona(String correo, String mili, String grados, String peso, String sexo, double alcoholemia, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getMili() {
        return mili;
    }

    public void setMili(int mili) {
        this.mili = mili;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAlcoholemia() {
        return alcoholemia;
    }

    public void setAlcoholemia(double alcoholemia) {
        this.alcoholemia = alcoholemia;
    }

    public String getEstadito() {
        return estadito;
    }

    public void setEstadito(String estadito) {
        this.estadito = estadito;
    }

   

   
  
    
            
}

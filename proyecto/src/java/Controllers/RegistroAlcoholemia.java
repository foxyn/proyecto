package Controllers;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity

@Table (name = "REGISTRO_ALCOHOLEMIA")
public class RegistroAlcoholemia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id //PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REGISTRO")
    private Long id;
    
    @Temporal (TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    
    @Column (name = "MAIL")
    private String mail;
    
    @Column (name = "ESTADO")
    private String estado;
    
    @Column (name = "GRADUACION")
    private double grados;
    
    @Column (name = "MILILITROS")
    private int mililitros;
    
    @Column (name = "PESO")
    private int peso;
    
    @Column (name = "SEXO")
    private char sexo;
    
    @Column (name = "ALCOHOLEMIA")
    private double alcoholemia;

    public RegistroAlcoholemia(Long id, Date fechaCreacion, String mail, String estado, double grados, int mililitros, int peso, char sexo, double alcoholemia) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.mail = mail;
        this.estado = estado;
        this.grados = grados;
        this.mililitros = mililitros;
        this.peso = peso;
        this.sexo = sexo;
        this.alcoholemia = alcoholemia;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
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
    
    
    
    
   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroAlcoholemia)) {
            return false;
        }
        RegistroAlcoholemia other = (RegistroAlcoholemia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto.RegistroAlcoholemia[ id=" + id + " ]";
    }
    
}

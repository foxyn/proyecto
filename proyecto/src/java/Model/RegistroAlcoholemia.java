
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "registro_alcoholemia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroAlcoholemia.findAll", query = "SELECT r FROM RegistroAlcoholemia r"),
    @NamedQuery(name = "RegistroAlcoholemia.findByIdRegistro", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.idRegistro = :idRegistro"),
    @NamedQuery(name = "RegistroAlcoholemia.findByMail", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.mail = :mail"),
    @NamedQuery(name = "RegistroAlcoholemia.findByMililitros", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.mililitros = :mililitros"),
    @NamedQuery(name = "RegistroAlcoholemia.findByGraduacion", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.graduacion = :graduacion"),
    @NamedQuery(name = "RegistroAlcoholemia.findByPeso", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.peso = :peso"),
    @NamedQuery(name = "RegistroAlcoholemia.findBySexo", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.sexo = :sexo"),
    @NamedQuery(name = "RegistroAlcoholemia.findByAlcoholemia", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.alcoholemia = :alcoholemia"),
    @NamedQuery(name = "RegistroAlcoholemia.findByEstado", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.estado = :estado"),
    @NamedQuery(name = "RegistroAlcoholemia.findByFechaCreacion", query = "SELECT r FROM RegistroAlcoholemia r WHERE r.fechaCreacion = :fechaCreacion")})
public class RegistroAlcoholemia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_registro")
    private Long idRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mililitros")
    private int mililitros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "graduacion")
    private double graduacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private int peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sexo")
    private Character sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alcoholemia")
    private double alcoholemia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public RegistroAlcoholemia() {
    }

    public RegistroAlcoholemia(Long idRegistro) {
        this.idRegistro = idRegistro;
    }
    //constructor
    
    public RegistroAlcoholemia(Long idRegistro, String mail, int mililitros, double graduacion, int peso, Character sexo, double alcoholemia, String estado, Date fechaCreacion) {
        this.idRegistro = idRegistro;
        this.mail = mail;
        this.mililitros = mililitros;
        this.graduacion = graduacion;
        this.peso = peso;
        this.sexo = sexo;
        this.alcoholemia = alcoholemia;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }
    //getter && setter
    
    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public double getAlcoholemia() {
        return alcoholemia;
    }

    public void setAlcoholemia(double alcoholemia) {
        this.alcoholemia = alcoholemia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroAlcoholemia)) {
            return false;
        }
        RegistroAlcoholemia other = (RegistroAlcoholemia) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.RegistroAlcoholemia[ idRegistro=" + idRegistro + " ]";
    }
    
}

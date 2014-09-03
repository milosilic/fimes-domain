package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import rs.fimes.domain.FimesDomain;

@Entity
@Table(name="xnab_kriterijum")
public class XnabKriterijum extends FimesDomain implements Serializable{
    

    private static final long serialVersionUID = 1L;
    private Integer idKriterijum;
    private String naziv;
    private Boolean fArhivirano;
    
    
    
    public XnabKriterijum() {
        super();
    }
    @Id
    @Column(name = "id_kriterijum", unique = true, nullable = false)
    public Integer getIdKriterijum() {
        return idKriterijum;
    }
    public void setIdKriterijum(Integer idKriterijum) {
        this.idKriterijum = idKriterijum;
    }
    @Column( name="naziv")
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    @Column(name="f_arhivirano")
    public Boolean getfArhivirano() {
        return fArhivirano;
    }
    public void setfArhivirano(Boolean fArhivirano) {
        this.fArhivirano = fArhivirano;
    }
    
    
    

}

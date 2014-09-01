package rs.fimes.domain.nab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xnab_kriterijum")
public class XnabKriterijum {
    
    private Integer idKriterijum;
    private String naziv;
    private Boolean fArhivirano;
    
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

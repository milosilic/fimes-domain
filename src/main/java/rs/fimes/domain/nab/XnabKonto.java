package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

/**
 * The persistent class for the xnab_konto database table.
 * 
 */
@Entity
@Table(name="xnab_konto")
public class XnabKonto extends FimesDomain implements Serializable {

    private static final long serialVersionUID = -6895074308297764443L;

    private Integer idKonto;
    
    private String konto;
    
    private String naziv;

    @Id
    @Column(name="id_konto")
    public Integer getIdKonto() {
        return idKonto;
    }

    public void setIdKonto(Integer idKonto) {
        this.idKonto = idKonto;
    }

    @Column( name="konto")
    public String getKonto() {
        return konto;
    }

    public void setKonto(String konto) {
        this.konto = konto;
    }

    @Column(name="naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "XnabKonto [idKonto=" + idKonto + ", konto=" + konto
                + ", naziv=" + naziv + "]";
    }


    
    

}

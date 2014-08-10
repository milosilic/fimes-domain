package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_izvor_finansiranja database table.
 * 
 */
@Entity
@Table(name="xnab_izvor_finansiranja")
public class XnabIzvorFinansiranja extends FimesDomain  implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer idIzvorFinansiranja;

    @Column(name="f_arhivirano")
    private Boolean fArhivirano;

    private String naziv;

    public XnabIzvorFinansiranja() {
    }

    @Id
    @Column(name="id_izvor_finansiranja")
    public Integer getIdIzvorFinansiranja() {
        return this.idIzvorFinansiranja;
    }

    public void setIdIzvorFinansiranja(Integer idIzvorFinansiranja) {
        this.idIzvorFinansiranja = idIzvorFinansiranja;
    }

    @Column(name="f_arhivirano")
    public Boolean getFArhivirano() {
        return this.fArhivirano;
    }

    public void setFArhivirano(Boolean fArhivirano) {
        this.fArhivirano = fArhivirano;
    }

    @Column( name="naziv")
    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


}
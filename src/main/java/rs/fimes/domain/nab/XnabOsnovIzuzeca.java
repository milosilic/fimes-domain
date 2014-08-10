package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_vrsta_predmeta_nabavke database table.
 * 
 */
@Entity
@Table(name="xnab_osnov_izuzeca")
public class XnabOsnovIzuzeca extends FimesDomain  implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer idOsnovIzuzeca;

    @Column(name="f_arhivirano")
    private Boolean fArhivirano;

    private String naziv;

    public XnabOsnovIzuzeca() {
    }

    @Id
    @Column(name="id_osnov_izuzeca")
    public Integer getIdOsnovIzuzeca() {
        return this.idOsnovIzuzeca;
    }

    public void setIdOsnovIzuzeca(Integer idOsnovIzuzeca) {
        this.idOsnovIzuzeca = idOsnovIzuzeca;
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
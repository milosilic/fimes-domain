package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;
import rs.fimes.domain.core.PpPoslovniPartner;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the nab_ugovor database table.
 * 
 */
@Entity
@Table(name="nab_ugovor")
public class NabUgovor extends FimesDomain  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idUgovor;

    private NabJavnaNabavka nabJavnaNabavka;
    private String interniBroj;
    private Date datumZakljucenja;
    private PpPoslovniPartner ppPoslovniPartner;

    public NabUgovor() {
    }

    @Id
    @Column(name="id_ugovor", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_ugovor")
    @SequenceGenerator(name = "seq_nab_ugovor", sequenceName = "seq_nab_ugovor", initialValue = 1, allocationSize = 1)
    public Integer getIdUgovor() {
        return this.idUgovor;
    }

    public void setIdUgovor(Integer idUgovor) {
        this.idUgovor = idUgovor;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_javna_nabavka", nullable = false)
    public NabJavnaNabavka getNabJavnaNabavka() {
        return this.nabJavnaNabavka;
    }

    public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
        this.nabJavnaNabavka = nabJavnaNabavka;
    }

    @Column(name="interni_broj", length=128)
    public String getInterniBroj() {
        return interniBroj;
    }

    public void setInterniBroj(String interniBroj) {
        this.interniBroj = interniBroj;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datum_zakljucenja", nullable=false)
    public Date getDatumZakljucenja() {
        return datumZakljucenja;
    }

    public void setDatumZakljucenja(Date datumZakljucenja) {
        this.datumZakljucenja = datumZakljucenja;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_poslovni_partner", nullable = true)
    public PpPoslovniPartner getPpPoslovniPartner() {
        return ppPoslovniPartner;
    }

    public void setPpPoslovniPartner(PpPoslovniPartner ppPoslovniPartner) {
        this.ppPoslovniPartner = ppPoslovniPartner;
    }

    @Override
    public String toString() {
        return "NabUgovor [idUgovor=" + idUgovor + ", nabJavnaNabavka="
                + nabJavnaNabavka + ", interniBroj=" + interniBroj
                + ", datumZakljucenja=" + datumZakljucenja
                + ", ppPoslovniPartner=" + ppPoslovniPartner + "]";
    }



    
    
    

}
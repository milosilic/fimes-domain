package rs.fimes.domain.nab;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import rs.fimes.domain.FimesDomain;

@Entity
@Table(name="nab_nabavka_konto_partija")
public class NabNabavkaKontoPartija extends FimesDomain  implements Serializable {

    private static final long serialVersionUID = 7372222795321288398L;
    
    private Integer idNabavkaKontoPartija;
    private NabJavnaNabavka nabJavnaNabavka;
    private XnabKonto nabKonto;
    private NabPartijaNabavke partijaNabavke;
    private XnabIzvorFinansiranja izvorFinansiranja;
    private BigDecimal vrednostBezPdv;
    private BigDecimal vrednostSaPdv;
    
    @Id
    @Column(name="id_nabavka_konto_partija", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_nabavka_konto_partija")
    @SequenceGenerator(name = "seq_nab_nabavka_konto_partija", sequenceName = "seq_nab_nabavka_konto_partija", initialValue = 1, allocationSize = 1)
    public Integer getIdNabavkaKontoPartija() {
        return idNabavkaKontoPartija;
    }
    public void setIdNabavkaKontoPartija(Integer idNabavkaKontoPartija) {
        this.idNabavkaKontoPartija = idNabavkaKontoPartija;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_javna_nabavka", nullable = false)    
    public NabJavnaNabavka getNabJavnaNabavka() {
        return nabJavnaNabavka;
    }
    public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
        this.nabJavnaNabavka = nabJavnaNabavka;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_konto", nullable = false)       
    public XnabKonto getNabKonto() {
        return nabKonto;
    }
    public void setNabKonto(XnabKonto nabKonto) {
        this.nabKonto = nabKonto;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_partija_nabavke", nullable = false)    
    public NabPartijaNabavke getPartijaNabavke() {
        return partijaNabavke;
    }
    public void setPartijaNabavke(NabPartijaNabavke partijaNabavke) {
        this.partijaNabavke = partijaNabavke;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_izvor_finansiranja", nullable = false)    
     public XnabIzvorFinansiranja getIzvorFinansiranja() {
        return izvorFinansiranja;
    }
    public void setIzvorFinansiranja(XnabIzvorFinansiranja izvorFinansiranja) {
        this.izvorFinansiranja = izvorFinansiranja;
    }
    @Column(name="vrednost_sa_pdv", precision=15, nullable=false)
    public BigDecimal getVrednostBezPdv() {
        return vrednostBezPdv;
    }
    public void setVrednostBezPdv(BigDecimal vrednostBezPdv) {
        this.vrednostBezPdv = vrednostBezPdv;
    }
    @Column(name="vrednost_sa_pdv", precision=15, nullable=false)
    public BigDecimal getVrednostSaPdv() {
        return vrednostSaPdv;
    }
    public void setVrednostSaPdv(BigDecimal vrednostSaPdv) {
        this.vrednostSaPdv = vrednostSaPdv;
    }
    
    
    
    

}

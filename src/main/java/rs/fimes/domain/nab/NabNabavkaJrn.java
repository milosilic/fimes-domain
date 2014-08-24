package rs.fimes.domain.nab;

import java.io.Serializable;

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
@Table(name="nab_nabavka_jrn")
public class NabNabavkaJrn extends FimesDomain  implements Serializable {

    private static final long serialVersionUID = 7372222795321288398L;
    
    private Integer idNabavkaJrn;
    private NabJavnaNabavka nabJavnaNabavka;
    private XnabJrn nabJrn;
    
    @Id
    @Column(name="id_nabavka_jrn", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_nabavka_jrn")
    @SequenceGenerator(name = "seq_nab_nabavka_jrn", sequenceName = "seq_nab_nabavka_jrn", initialValue = 1, allocationSize = 1)
    public Integer getIdNabavkaJrn() {
        return idNabavkaJrn;
    }
    public void setIdNabavkaJrn(Integer idNabavkaJrn) {
        this.idNabavkaJrn = idNabavkaJrn;
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
    @JoinColumn(name = "id_jrn", nullable = false)       
    public XnabJrn getNabJrn() {
        return nabJrn;
    }
    public void setNabJrn(XnabJrn nabJrn) {
        this.nabJrn = nabJrn;
    }


}

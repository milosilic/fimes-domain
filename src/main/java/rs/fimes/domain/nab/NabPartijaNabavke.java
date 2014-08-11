package rs.fimes.domain.nab;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the nab_partija_nabavke database table.
 * 
 */
@Entity
@Table(name="nab_partija_nabavke")
public class NabPartijaNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idPartijaNabavke;

	private String opisPredmetaNabavke;

	private NabJavnaNabavka nabJavnaNabavka;

	private XnabJrn xnabJrn;

	private XnabPredmetNabavke xnabPredmetNabavke;
	
	private BigDecimal procenjenaVrednostBezPdv;
	private BigDecimal procenjenaVrednostSaPdv;
	private String napomena;

	public NabPartijaNabavke() {
	}

    @Id
    @Column(name="id_partija_nabavke", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_partija_nabavke")
    @SequenceGenerator(name = "seq_nab_partija_nabavke", sequenceName = "seq_nab_partija_nabavke", initialValue = 1, allocationSize = 1)
	public Integer getIdPartijaNabavke() {
		return this.idPartijaNabavke;
	}

	public void setIdPartijaNabavke(Integer idPartijaNabavke) {
		this.idPartijaNabavke = idPartijaNabavke;
	}

    @Column(name="opis_predmeta_nabavke", nullable=false, length=1024)
	public String getOpisPredmetaNabavke() {
		return this.opisPredmetaNabavke;
	}

	public void setOpisPredmetaNabavke(String opisPredmetaNabavke) {
		this.opisPredmetaNabavke = opisPredmetaNabavke;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_javna_nabavka", nullable = false)
	public NabJavnaNabavka getNabJavnaNabavka() {
		return this.nabJavnaNabavka;
	}

	public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
		this.nabJavnaNabavka = nabJavnaNabavka;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jrn", nullable = false)
	public XnabJrn getXnabJrn() {
	    if (null == this.xnabJrn) {
	        this.xnabJrn = new XnabJrn();
	    }
        this.xnabJrn.setIdJrn(5);
		return this.xnabJrn;
	}

	public void setXnabJrn(XnabJrn xnabJrn) {
		this.xnabJrn = xnabJrn;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_predmet_nabavke", nullable = false)
	public XnabPredmetNabavke getXnabPredmetNabavke() {
        if ( null == this.xnabPredmetNabavke){
            this.xnabPredmetNabavke = new XnabPredmetNabavke();
        }
        this.xnabPredmetNabavke.setIdPredmetNabavke(4);
		return this.xnabPredmetNabavke;
	}

	public void setXnabPredmetNabavke(XnabPredmetNabavke xnabPredmetNabavke) {
		this.xnabPredmetNabavke = xnabPredmetNabavke;
	}
	
    @Column(name="procenjena_vrednost_bez_pdv", precision=15, nullable=false)
    public BigDecimal getProcenjenaVrednostBezPdv() {
        return procenjenaVrednostBezPdv;
    }

    public void setProcenjenaVrednostBezPdv(BigDecimal procenjenaVrednostBezPdv) {
        this.procenjenaVrednostBezPdv = procenjenaVrednostBezPdv;
    }

    @Column(name="procenjena_vrednost_sa_pdv", precision=15, nullable=false)
    public BigDecimal getProcenjenaVrednostSaPdv() {
        return procenjenaVrednostSaPdv;
    }

    public void setProcenjenaVrednostSaPdv(BigDecimal procenjenaVrednostSaPdv) {
        this.procenjenaVrednostSaPdv = procenjenaVrednostSaPdv;
    }

    @Column(name="napomena", nullable=true, length=1024)
    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

	
}
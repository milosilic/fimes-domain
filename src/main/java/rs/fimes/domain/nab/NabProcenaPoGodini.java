package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.math.BigDecimal;


/**
 * The persistent class for the nab_procena_po_godini database table.
 * 
 */
@Entity
@Table(name="nab_procena_po_godini")
public class NabProcenaPoGodini extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idProcenaPoGodini;

	private Integer godina;

	private String napomena;

	private BigDecimal procenaBezPdv;

	private BigDecimal procenaSaPdv;

	private String vezaSaFinPlanom;

	private NabJavnaNabavka nabJavnaNabavka;

	public NabProcenaPoGodini() {
	}

	@Id
    @Column(name="id_procena_po_godini", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_procena_po_godini")
    @SequenceGenerator(name = "seq_nab_procena_po_godini", sequenceName = "seq_nab_procena_po_godini", initialValue = 1, allocationSize = 1)
	public Integer getIdProcenaPoGodini() {
		return this.idProcenaPoGodini;
	}

	public void setIdProcenaPoGodini(Integer idProcenaPoGodini) {
		this.idProcenaPoGodini = idProcenaPoGodini;
	}

	public Integer getGodina() {
		return this.godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

    @Column(name="napomena", nullable = false, length=512)
	public String getNapomena() {
		return this.napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
    @Column(name="procena_bez_pdv", precision=15)
	public BigDecimal getProcenaBezPdv() {
		return this.procenaBezPdv;
	}

	public void setProcenaBezPdv(BigDecimal procenaBezPdv) {
		this.procenaBezPdv = procenaBezPdv;
	}
    @Column(name="procena_sa_pdv", precision=15)
	public BigDecimal getProcenaSaPdv() {
		return this.procenaSaPdv;
	}

	public void setProcenaSaPdv(BigDecimal procenaSaPdv) {
		this.procenaSaPdv = procenaSaPdv;
	}
	
    @Column(name="veza_sa_fin_planom")
	public String getVezaSaFinPlanom() {
		return this.vezaSaFinPlanom;
	}

	public void setVezaSaFinPlanom(String vezaSaFinPlanom) {
		this.vezaSaFinPlanom = vezaSaFinPlanom;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_javna_nabavka", nullable = false)
	public NabJavnaNabavka getNabJavnaNabavka() {
		return this.nabJavnaNabavka;
	}

	public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
		this.nabJavnaNabavka = nabJavnaNabavka;
	}

    @Override
    public String toString() {
        return "NabProcenaPoGodini [idProcenaPoGodini=" + idProcenaPoGodini
                + ", godina=" + godina + ", napomena=" + napomena
                + ", procenaBezPdv=" + procenaBezPdv + ", procenaSaPdv="
                + procenaSaPdv + ", vezaSaFinPlanom=" + vezaSaFinPlanom
                + ", nabJavnaNabavka=" + nabJavnaNabavka + "]";
    }
	
	
	

}
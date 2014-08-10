package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.Date;


/**
 * The persistent class for the nab_ponuda_dokument database table.
 * 
 */
@Entity
@Table(name="nab_ponuda_dokument")
@NamedQuery(name="NabPonudaDokument.findAll", query="SELECT n FROM NabPonudaDokument n")
public class NabPonudaDokument extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ponuda_dokument")
	private Integer idPonudaDokument;

	@Temporal(TemporalType.DATE)
	private Date datum;

	private String naslov;

	private String referenca;

	//bi-directional many-to-one association to NabPonuda
	@ManyToOne
	@JoinColumn(name="id_ponuda")
	private NabPonuda nabPonuda;

	//bi-directional many-to-one association to XnabVrstaDokumenta
	@ManyToOne
	@JoinColumn(name="id_vrsta_dokumenta")
	private XnabVrstaDokumenta xnabVrstaDokumenta;

	public NabPonudaDokument() {
	}

	public Integer getIdPonudaDokument() {
		return this.idPonudaDokument;
	}

	public void setIdPonudaDokument(Integer idPonudaDokument) {
		this.idPonudaDokument = idPonudaDokument;
	}

	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getReferenca() {
		return this.referenca;
	}

	public void setReferenca(String referenca) {
		this.referenca = referenca;
	}

	public NabPonuda getNabPonuda() {
		return this.nabPonuda;
	}

	public void setNabPonuda(NabPonuda nabPonuda) {
		this.nabPonuda = nabPonuda;
	}

	public XnabVrstaDokumenta getXnabVrstaDokumenta() {
		return this.xnabVrstaDokumenta;
	}

	public void setXnabVrstaDokumenta(XnabVrstaDokumenta xnabVrstaDokumenta) {
		this.xnabVrstaDokumenta = xnabVrstaDokumenta;
	}

}
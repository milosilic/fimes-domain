package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_vrsta_dokumenta database table.
 * 
 */
@Entity
@Table(name="xnab_vrsta_dokumenta")
@NamedQuery(name="XnabVrstaDokumenta.findAll", query="SELECT x FROM XnabVrstaDokumenta x")
public class XnabVrstaDokumenta extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_vrsta_dokumenta")
	private Integer idVrstaDokumenta;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	@Column(name="f_konkurs")
	private Boolean fKonkurs;

	@Column(name="f_ponuda")
	private Boolean fPonuda;

	private String naziv;

	//bi-directional many-to-one association to NabNabavkaDokument
	@OneToMany(mappedBy="xnabVrstaDokumenta")
	private List<NabNabavkaDokument> nabNabavkaDokuments;

	//bi-directional many-to-one association to NabPonudaDokument
	@OneToMany(mappedBy="xnabVrstaDokumenta")
	private List<NabPonudaDokument> nabPonudaDokuments;

	public XnabVrstaDokumenta() {
	}

	public Integer getIdVrstaDokumenta() {
		return this.idVrstaDokumenta;
	}

	public void setIdVrstaDokumenta(Integer idVrstaDokumenta) {
		this.idVrstaDokumenta = idVrstaDokumenta;
	}

	public Boolean getFArhivirano() {
		return this.fArhivirano;
	}

	public void setFArhivirano(Boolean fArhivirano) {
		this.fArhivirano = fArhivirano;
	}

	public Boolean getFKonkurs() {
		return this.fKonkurs;
	}

	public void setFKonkurs(Boolean fKonkurs) {
		this.fKonkurs = fKonkurs;
	}

	public Boolean getFPonuda() {
		return this.fPonuda;
	}

	public void setFPonuda(Boolean fPonuda) {
		this.fPonuda = fPonuda;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<NabNabavkaDokument> getNabNabavkaDokuments() {
		return this.nabNabavkaDokuments;
	}

	public void setNabNabavkaDokuments(List<NabNabavkaDokument> nabNabavkaDokuments) {
		this.nabNabavkaDokuments = nabNabavkaDokuments;
	}

	public NabNabavkaDokument addNabNabavkaDokument(NabNabavkaDokument nabNabavkaDokument) {
		getNabNabavkaDokuments().add(nabNabavkaDokument);
		nabNabavkaDokument.setXnabVrstaDokumenta(this);

		return nabNabavkaDokument;
	}

	public NabNabavkaDokument removeNabNabavkaDokument(NabNabavkaDokument nabNabavkaDokument) {
		getNabNabavkaDokuments().remove(nabNabavkaDokument);
		nabNabavkaDokument.setXnabVrstaDokumenta(null);

		return nabNabavkaDokument;
	}

	public List<NabPonudaDokument> getNabPonudaDokuments() {
		return this.nabPonudaDokuments;
	}

	public void setNabPonudaDokuments(List<NabPonudaDokument> nabPonudaDokuments) {
		this.nabPonudaDokuments = nabPonudaDokuments;
	}

	public NabPonudaDokument addNabPonudaDokument(NabPonudaDokument nabPonudaDokument) {
		getNabPonudaDokuments().add(nabPonudaDokument);
		nabPonudaDokument.setXnabVrstaDokumenta(this);

		return nabPonudaDokument;
	}

	public NabPonudaDokument removeNabPonudaDokument(NabPonudaDokument nabPonudaDokument) {
		getNabPonudaDokuments().remove(nabPonudaDokument);
		nabPonudaDokument.setXnabVrstaDokumenta(null);

		return nabPonudaDokument;
	}

}
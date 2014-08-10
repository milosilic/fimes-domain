package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the nab_ponudjac database table.
 * 
 */
@Entity
@Table(name="nab_ponudjac")
@NamedQuery(name="NabPonudjac.findAll", query="SELECT n FROM NabPonudjac n")
public class NabPonudjac extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ponudjac")
	private Integer idPonudjac;

	private String jmbg;

	private String mesto;

	private String naziv;

	private String opstina;

	private String pib;

	public NabPonudjac() {
	}

	public Integer getIdPonudjac() {
		return this.idPonudjac;
	}

	public void setIdPonudjac(Integer idPonudjac) {
		this.idPonudjac = idPonudjac;
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getMesto() {
		return this.mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpstina() {
		return this.opstina;
	}

	public void setOpstina(String opstina) {
		this.opstina = opstina;
	}

	public String getPib() {
		return this.pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

}
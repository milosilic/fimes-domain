package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_tip_oglasa database table.
 * 
 */
@Entity
@Table(name="xnab_tip_oglasa")
@NamedQuery(name="XnabTipOglasa.findAll", query="SELECT x FROM XnabTipOglasa x")
public class XnabTipOglasa extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tip_oglasa")
	private Integer idTipOglasa;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	private String naziv;

	//bi-directional many-to-one association to NabOgla
	@OneToMany(mappedBy="xnabTipOglasa")
	private List<NabOgla> nabOglas;

	public XnabTipOglasa() {
	}

	public Integer getIdTipOglasa() {
		return this.idTipOglasa;
	}

	public void setIdTipOglasa(Integer idTipOglasa) {
		this.idTipOglasa = idTipOglasa;
	}

	public Boolean getFArhivirano() {
		return this.fArhivirano;
	}

	public void setFArhivirano(Boolean fArhivirano) {
		this.fArhivirano = fArhivirano;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<NabOgla> getNabOglas() {
		return this.nabOglas;
	}

	public void setNabOglas(List<NabOgla> nabOglas) {
		this.nabOglas = nabOglas;
	}

	public NabOgla addNabOgla(NabOgla nabOgla) {
		getNabOglas().add(nabOgla);
		nabOgla.setXnabTipOglasa(this);

		return nabOgla;
	}

	public NabOgla removeNabOgla(NabOgla nabOgla) {
		getNabOglas().remove(nabOgla);
		nabOgla.setXnabTipOglasa(null);

		return nabOgla;
	}

}
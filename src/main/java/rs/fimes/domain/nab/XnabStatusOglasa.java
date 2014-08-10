package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_status_oglasa database table.
 * 
 */
@Entity
@Table(name="xnab_status_oglasa")
@NamedQuery(name="XnabStatusOglasa.findAll", query="SELECT x FROM XnabStatusOglasa x")
public class XnabStatusOglasa extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_status_oglasa")
	private Integer idStatusOglasa;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	private String naziv;

	//bi-directional many-to-one association to NabOgla
	@OneToMany(mappedBy="xnabStatusOglasa")
	private List<NabOgla> nabOglas;

	public XnabStatusOglasa() {
	}

	public Integer getIdStatusOglasa() {
		return this.idStatusOglasa;
	}

	public void setIdStatusOglasa(Integer idStatusOglasa) {
		this.idStatusOglasa = idStatusOglasa;
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
		nabOgla.setXnabStatusOglasa(this);

		return nabOgla;
	}

	public NabOgla removeNabOgla(NabOgla nabOgla) {
		getNabOglas().remove(nabOgla);
		nabOgla.setXnabStatusOglasa(null);

		return nabOgla;
	}

}
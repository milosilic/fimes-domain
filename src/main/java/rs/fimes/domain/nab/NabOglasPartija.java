package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the nab_oglas_partija database table.
 * 
 */
@Entity
@Table(name="nab_oglas_partija")
@NamedQuery(name="NabOglasPartija.findAll", query="SELECT n FROM NabOglasPartija n")
public class NabOglasPartija extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_oglas_partija")
	private Integer idOglasPartija;

	//bi-directional many-to-one association to NabOgla
	@ManyToOne
	@JoinColumn(name="id_oglas")
	private NabOgla nabOgla;

	//bi-directional many-to-one association to NabPartijaNabavke
	@ManyToOne
	@JoinColumn(name="id_partija_nabavke")
	private NabPartijaNabavke nabPartijaNabavke;

	public NabOglasPartija() {
	}

	public Integer getIdOglasPartija() {
		return this.idOglasPartija;
	}

	public void setIdOglasPartija(Integer idOglasPartija) {
		this.idOglasPartija = idOglasPartija;
	}

	public NabOgla getNabOgla() {
		return this.nabOgla;
	}

	public void setNabOgla(NabOgla nabOgla) {
		this.nabOgla = nabOgla;
	}

	public NabPartijaNabavke getNabPartijaNabavke() {
		return this.nabPartijaNabavke;
	}

	public void setNabPartijaNabavke(NabPartijaNabavke nabPartijaNabavke) {
		this.nabPartijaNabavke = nabPartijaNabavke;
	}

}
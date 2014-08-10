package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the nab_oglas_ponuda database table.
 * 
 */
@Entity
@Table(name="nab_oglas_ponuda")
@NamedQuery(name="NabOglasPonuda.findAll", query="SELECT n FROM NabOglasPonuda n")
public class NabOglasPonuda extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_oglas_ponuda")
	private Integer idOglasPonuda;

	//bi-directional many-to-one association to NabOgla
	@ManyToOne
	@JoinColumn(name="id_oglas")
	private NabOgla nabOgla;

	//bi-directional many-to-one association to NabPonuda
	@ManyToOne
	@JoinColumn(name="id_ponuda")
	private NabPonuda nabPonuda;

	public NabOglasPonuda() {
	}

	public Integer getIdOglasPonuda() {
		return this.idOglasPonuda;
	}

	public void setIdOglasPonuda(Integer idOglasPonuda) {
		this.idOglasPonuda = idOglasPonuda;
	}

	public NabOgla getNabOgla() {
		return this.nabOgla;
	}

	public void setNabOgla(NabOgla nabOgla) {
		this.nabOgla = nabOgla;
	}

	public NabPonuda getNabPonuda() {
		return this.nabPonuda;
	}

	public void setNabPonuda(NabPonuda nabPonuda) {
		this.nabPonuda = nabPonuda;
	}

}
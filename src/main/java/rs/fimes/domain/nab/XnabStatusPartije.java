package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_status_partije database table.
 * 
 */
@Entity
@Table(name="xnab_status_partije")
@NamedQuery(name="XnabStatusPartije.findAll", query="SELECT x FROM XnabStatusPartije x")
public class XnabStatusPartije extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_status_partije")
	private Integer idStatusPartije;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	private String naziv;

	//bi-directional many-to-one association to NabPartija
	@OneToMany(mappedBy="xnabStatusPartije")
	private List<NabPartija> nabPartijas;

	public XnabStatusPartije() {
	}

	public Integer getIdStatusPartije() {
		return this.idStatusPartije;
	}

	public void setIdStatusPartije(Integer idStatusPartije) {
		this.idStatusPartije = idStatusPartije;
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

	public List<NabPartija> getNabPartijas() {
		return this.nabPartijas;
	}

	public void setNabPartijas(List<NabPartija> nabPartijas) {
		this.nabPartijas = nabPartijas;
	}

	public NabPartija addNabPartija(NabPartija nabPartija) {
		getNabPartijas().add(nabPartija);
		nabPartija.setXnabStatusPartije(this);

		return nabPartija;
	}

	public NabPartija removeNabPartija(NabPartija nabPartija) {
		getNabPartijas().remove(nabPartija);
		nabPartija.setXnabStatusPartije(null);

		return nabPartija;
	}

}
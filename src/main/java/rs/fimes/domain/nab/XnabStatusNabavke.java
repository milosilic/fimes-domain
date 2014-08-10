package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_status_nabavke database table.
 * 
 */
@Entity
@Table(name="xnab_status_nabavke")
@NamedQuery(name="XnabStatusNabavke.findAll", query="SELECT x FROM XnabStatusNabavke x")
public class XnabStatusNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer idStatusNabavke;

	private Boolean fArhivirano;

	private String naziv;

	public XnabStatusNabavke() {
	}
    @Id
    @Column(name="id_status_nabavke")
	public Integer getIdStatusNabavke() {
		return this.idStatusNabavke;
	}

	public void setIdStatusNabavke(Integer idStatusNabavke) {
		this.idStatusNabavke = idStatusNabavke;
	}

	@Column(name="f_arhivirano")
	public Boolean getFArhivirano() {
		return this.fArhivirano;
	}

	public void setFArhivirano(Boolean fArhivirano) {
		this.fArhivirano = fArhivirano;
	}

	@Column( name="naziv")
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
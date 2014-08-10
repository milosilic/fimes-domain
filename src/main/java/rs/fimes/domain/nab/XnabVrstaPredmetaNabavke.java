package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_vrsta_predmeta_nabavke database table.
 * 
 */
@Entity
@Table(name="xnab_vrsta_predmeta_nabavke")
public class XnabVrstaPredmetaNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer idVrstaPredmetaNabavke;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	private String naziv;

	public XnabVrstaPredmetaNabavke() {
	}

	@Id
    @Column(name="id_vrsta_predmeta_nabavke")
	public Integer getIdVrstaPredmetaNabavke() {
		return this.idVrstaPredmetaNabavke;
	}

	public void setIdVrstaPredmetaNabavke(Integer idVrstaPredmetaNabavke) {
		this.idVrstaPredmetaNabavke = idVrstaPredmetaNabavke;
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
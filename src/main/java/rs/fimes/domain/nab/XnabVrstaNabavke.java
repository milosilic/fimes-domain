package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the xnab_vrsta_nabavke database table.
 * 
 */
@Entity
@Table(name="xnab_vrsta_nabavke")
@NamedQuery(name="XnabVrstaNabavke.findAll", query="SELECT x FROM XnabVrstaNabavke x")
public class XnabVrstaNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_vrsta_nabavke")
	private Integer idVrstaNabavke;

	private String naziv;

	@Column(name="tip_proizvoda_usluge")
	private String tipProizvodaUsluge;

	public XnabVrstaNabavke() {
	}

	public Integer getIdVrstaNabavke() {
		return this.idVrstaNabavke;
	}

	public void setIdVrstaNabavke(Integer idVrstaNabavke) {
		this.idVrstaNabavke = idVrstaNabavke;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTipProizvodaUsluge() {
		return this.tipProizvodaUsluge;
	}

	public void setTipProizvodaUsluge(String tipProizvodaUsluge) {
		this.tipProizvodaUsluge = tipProizvodaUsluge;
	}

}
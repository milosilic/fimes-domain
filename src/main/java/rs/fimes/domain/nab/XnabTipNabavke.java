package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_tip_nabavke database table.
 * 
 */
@Entity
@Table(name="xnab_tip_nabavke")
public class XnabTipNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idTipNabavke;

	private String naziv;

	public XnabTipNabavke() {
	}
    @Id
    @Column(name="id_tip_nabavke")
	public Integer getIdTipNabavke() {
		return this.idTipNabavke;
	}

	public void setIdTipNabavke(Integer idTipNabavke) {
		this.idTipNabavke = idTipNabavke;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
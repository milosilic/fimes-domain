package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the xnab_status database table.
 * 
 */
@Entity
@Table(name="xnab_status")
@NamedQuery(name="XnabStatus.findAll", query="SELECT x FROM XnabStatus x")
public class XnabStatus extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_status")
	private Integer idStatus;

	private String naziv;

	public XnabStatus() {
	}

	public Integer getIdStatus() {
		return this.idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
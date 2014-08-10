package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_vrsta_predmeta_ugovora database table.
 * 
 */
@Entity
@Table(name="xnab_vrsta_predmeta_ugovora")
@NamedQuery(name="XnabVrstaPredmetaUgovora.findAll", query="SELECT x FROM XnabVrstaPredmetaUgovora x")
public class XnabVrstaPredmetaUgovora extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_predmet_ugovora")
	private Integer idPredmetUgovora;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	private String naziv;

	//bi-directional many-to-one association to NabPartijaPredmetUgovora
	@OneToMany(mappedBy="xnabVrstaPredmetaUgovora")
	private List<NabPartijaPredmetUgovora> nabPartijaPredmetUgovoras;

	public XnabVrstaPredmetaUgovora() {
	}

	public Integer getIdPredmetUgovora() {
		return this.idPredmetUgovora;
	}

	public void setIdPredmetUgovora(Integer idPredmetUgovora) {
		this.idPredmetUgovora = idPredmetUgovora;
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

	public List<NabPartijaPredmetUgovora> getNabPartijaPredmetUgovoras() {
		return this.nabPartijaPredmetUgovoras;
	}

	public void setNabPartijaPredmetUgovoras(List<NabPartijaPredmetUgovora> nabPartijaPredmetUgovoras) {
		this.nabPartijaPredmetUgovoras = nabPartijaPredmetUgovoras;
	}

	public NabPartijaPredmetUgovora addNabPartijaPredmetUgovora(NabPartijaPredmetUgovora nabPartijaPredmetUgovora) {
		getNabPartijaPredmetUgovoras().add(nabPartijaPredmetUgovora);
		nabPartijaPredmetUgovora.setXnabVrstaPredmetaUgovora(this);

		return nabPartijaPredmetUgovora;
	}

	public NabPartijaPredmetUgovora removeNabPartijaPredmetUgovora(NabPartijaPredmetUgovora nabPartijaPredmetUgovora) {
		getNabPartijaPredmetUgovoras().remove(nabPartijaPredmetUgovora);
		nabPartijaPredmetUgovora.setXnabVrstaPredmetaUgovora(null);

		return nabPartijaPredmetUgovora;
	}

}
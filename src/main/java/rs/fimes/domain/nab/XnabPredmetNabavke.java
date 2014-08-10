package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_predmet_nabavke database table.
 * 
 */
@Entity
@Table(name="xnab_predmet_nabavke")
@NamedQuery(name="XnabPredmetNabavke.findAll", query="SELECT x FROM XnabPredmetNabavke x")
public class XnabPredmetNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_predmet_nabavke")
	private Integer idPredmetNabavke;

	@Column(name="f_arhivirano")
	private Boolean fArhivirano;

	private String naziv;

	//bi-directional many-to-one association to NabPartijaNabavke
	@OneToMany(mappedBy="xnabPredmetNabavke")
	private List<NabPartijaNabavke> nabPartijaNabavkes;

	//bi-directional many-to-one association to XnabVrstaPredmetaNabavke
	@ManyToOne
	@JoinColumn(name="id_vrsta_predmeta_nabavke")
	private XnabVrstaPredmetaNabavke xnabVrstaPredmetaNabavke;

	public XnabPredmetNabavke() {
	}

	public Integer getIdPredmetNabavke() {
		return this.idPredmetNabavke;
	}

	public void setIdPredmetNabavke(Integer idPredmetNabavke) {
		this.idPredmetNabavke = idPredmetNabavke;
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

	public List<NabPartijaNabavke> getNabPartijaNabavkes() {
		return this.nabPartijaNabavkes;
	}

	public void setNabPartijaNabavkes(List<NabPartijaNabavke> nabPartijaNabavkes) {
		this.nabPartijaNabavkes = nabPartijaNabavkes;
	}

	public NabPartijaNabavke addNabPartijaNabavke(NabPartijaNabavke nabPartijaNabavke) {
		getNabPartijaNabavkes().add(nabPartijaNabavke);
		nabPartijaNabavke.setXnabPredmetNabavke(this);

		return nabPartijaNabavke;
	}

	public NabPartijaNabavke removeNabPartijaNabavke(NabPartijaNabavke nabPartijaNabavke) {
		getNabPartijaNabavkes().remove(nabPartijaNabavke);
		nabPartijaNabavke.setXnabPredmetNabavke(null);

		return nabPartijaNabavke;
	}

	public XnabVrstaPredmetaNabavke getXnabVrstaPredmetaNabavke() {
		return this.xnabVrstaPredmetaNabavke;
	}

	public void setXnabVrstaPredmetaNabavke(XnabVrstaPredmetaNabavke xnabVrstaPredmetaNabavke) {
		this.xnabVrstaPredmetaNabavke = xnabVrstaPredmetaNabavke;
	}

}
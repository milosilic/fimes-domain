package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the nab_partija_nabavke database table.
 * 
 */
@Entity
@Table(name="nab_partija_nabavke")
@NamedQuery(name="NabPartijaNabavke.findAll", query="SELECT n FROM NabPartijaNabavke n")
public class NabPartijaNabavke extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_partija_nabavke")
	private Integer idPartijaNabavke;

	@Column(name="opis_predmeta_nabavke")
	private String opisPredmetaNabavke;

	//bi-directional many-to-one association to NabOglasPartija
	@OneToMany(mappedBy="nabPartijaNabavke")
	private List<NabOglasPartija> nabOglasPartijas;

	//bi-directional many-to-one association to NabJavnaNabavka
	@ManyToOne
	@JoinColumn(name="id_javna_nabavka")
	private NabJavnaNabavka nabJavnaNabavka;

	//bi-directional many-to-one association to XnabJrn
	@ManyToOne
	@JoinColumn(name="id_jrn")
	private XnabJrn xnabJrn;

	//bi-directional many-to-one association to XnabPredmetNabavke
	@ManyToOne
	@JoinColumn(name="id_predmet_nabavke")
	private XnabPredmetNabavke xnabPredmetNabavke;

	public NabPartijaNabavke() {
	}

	public Integer getIdPartijaNabavke() {
		return this.idPartijaNabavke;
	}

	public void setIdPartijaNabavke(Integer idPartijaNabavke) {
		this.idPartijaNabavke = idPartijaNabavke;
	}

	public String getOpisPredmetaNabavke() {
		return this.opisPredmetaNabavke;
	}

	public void setOpisPredmetaNabavke(String opisPredmetaNabavke) {
		this.opisPredmetaNabavke = opisPredmetaNabavke;
	}

	public List<NabOglasPartija> getNabOglasPartijas() {
		return this.nabOglasPartijas;
	}

	public void setNabOglasPartijas(List<NabOglasPartija> nabOglasPartijas) {
		this.nabOglasPartijas = nabOglasPartijas;
	}

	public NabOglasPartija addNabOglasPartija(NabOglasPartija nabOglasPartija) {
		getNabOglasPartijas().add(nabOglasPartija);
		nabOglasPartija.setNabPartijaNabavke(this);

		return nabOglasPartija;
	}

	public NabOglasPartija removeNabOglasPartija(NabOglasPartija nabOglasPartija) {
		getNabOglasPartijas().remove(nabOglasPartija);
		nabOglasPartija.setNabPartijaNabavke(null);

		return nabOglasPartija;
	}

	public NabJavnaNabavka getNabJavnaNabavka() {
		return this.nabJavnaNabavka;
	}

	public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
		this.nabJavnaNabavka = nabJavnaNabavka;
	}

	public XnabJrn getXnabJrn() {
		return this.xnabJrn;
	}

	public void setXnabJrn(XnabJrn xnabJrn) {
		this.xnabJrn = xnabJrn;
	}

	public XnabPredmetNabavke getXnabPredmetNabavke() {
		return this.xnabPredmetNabavke;
	}

	public void setXnabPredmetNabavke(XnabPredmetNabavke xnabPredmetNabavke) {
		this.xnabPredmetNabavke = xnabPredmetNabavke;
	}

}
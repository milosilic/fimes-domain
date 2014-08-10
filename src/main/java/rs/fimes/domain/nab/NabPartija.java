package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the nab_partija database table.
 * 
 */
@Entity
@Table(name="nab_partija")
@NamedQuery(name="NabPartija.findAll", query="SELECT n FROM NabPartija n")
public class NabPartija extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_partija")
	private Integer idPartija;

	private String naslov;

	//bi-directional many-to-one association to XnabStatusPartije
	@ManyToOne
	@JoinColumn(name="id_status_partije")
	private XnabStatusPartije xnabStatusPartije;

	//bi-directional many-to-one association to NabPartijaPredmetUgovora
	@OneToMany(mappedBy="nabPartija")
	private List<NabPartijaPredmetUgovora> nabPartijaPredmetUgovoras;

	public NabPartija() {
	}

	public Integer getIdPartija() {
		return this.idPartija;
	}

	public void setIdPartija(Integer idPartija) {
		this.idPartija = idPartija;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public XnabStatusPartije getXnabStatusPartije() {
		return this.xnabStatusPartije;
	}

	public void setXnabStatusPartije(XnabStatusPartije xnabStatusPartije) {
		this.xnabStatusPartije = xnabStatusPartije;
	}

	public List<NabPartijaPredmetUgovora> getNabPartijaPredmetUgovoras() {
		return this.nabPartijaPredmetUgovoras;
	}

	public void setNabPartijaPredmetUgovoras(List<NabPartijaPredmetUgovora> nabPartijaPredmetUgovoras) {
		this.nabPartijaPredmetUgovoras = nabPartijaPredmetUgovoras;
	}

	public NabPartijaPredmetUgovora addNabPartijaPredmetUgovora(NabPartijaPredmetUgovora nabPartijaPredmetUgovora) {
		getNabPartijaPredmetUgovoras().add(nabPartijaPredmetUgovora);
		nabPartijaPredmetUgovora.setNabPartija(this);

		return nabPartijaPredmetUgovora;
	}

	public NabPartijaPredmetUgovora removeNabPartijaPredmetUgovora(NabPartijaPredmetUgovora nabPartijaPredmetUgovora) {
		getNabPartijaPredmetUgovoras().remove(nabPartijaPredmetUgovora);
		nabPartijaPredmetUgovora.setNabPartija(null);

		return nabPartijaPredmetUgovora;
	}

}
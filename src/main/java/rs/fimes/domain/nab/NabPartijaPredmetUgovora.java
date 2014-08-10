package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the nab_partija_predmet_ugovora database table.
 * 
 */
@Entity
@Table(name="nab_partija_predmet_ugovora")
@NamedQuery(name="NabPartijaPredmetUgovora.findAll", query="SELECT n FROM NabPartijaPredmetUgovora n")
public class NabPartijaPredmetUgovora extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_partija_predmet_ugovora")
	private Integer idPartijaPredmetUgovora;

	//bi-directional many-to-one association to NabPartija
	@ManyToOne
	@JoinColumn(name="id_partija")
	private NabPartija nabPartija;

	//bi-directional many-to-one association to XnabVrstaPredmetaUgovora
	@ManyToOne
	@JoinColumn(name="id_predmet_ugovora")
	private XnabVrstaPredmetaUgovora xnabVrstaPredmetaUgovora;

	public NabPartijaPredmetUgovora() {
	}

	public Integer getIdPartijaPredmetUgovora() {
		return this.idPartijaPredmetUgovora;
	}

	public void setIdPartijaPredmetUgovora(Integer idPartijaPredmetUgovora) {
		this.idPartijaPredmetUgovora = idPartijaPredmetUgovora;
	}

	public NabPartija getNabPartija() {
		return this.nabPartija;
	}

	public void setNabPartija(NabPartija nabPartija) {
		this.nabPartija = nabPartija;
	}

	public XnabVrstaPredmetaUgovora getXnabVrstaPredmetaUgovora() {
		return this.xnabVrstaPredmetaUgovora;
	}

	public void setXnabVrstaPredmetaUgovora(XnabVrstaPredmetaUgovora xnabVrstaPredmetaUgovora) {
		this.xnabVrstaPredmetaUgovora = xnabVrstaPredmetaUgovora;
	}

}
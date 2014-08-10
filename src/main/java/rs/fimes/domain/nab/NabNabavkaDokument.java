package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.sql.Timestamp;


/**
 * The persistent class for the nab_nabavka_dokument database table.
 * 
 */
@Entity
@Table(name="nab_nabavka_dokument")
@NamedQuery(name="NabNabavkaDokument.findAll", query="SELECT n FROM NabNabavkaDokument n")
public class NabNabavkaDokument extends FimesDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_nabavka_dokument")
	private Integer idNabavkaDokument;

	@Column(name="fajl_relativna_putanja")
	private String fajlRelativnaPutanja;

	@Column(name="id_korisnik_azurirao")
	private Integer idKorisnikAzurirao;

	@Column(name="id_korisnik_kreirao")
	private Integer idKorisnikKreirao;

	@Column(name="trenutak_azuriranja")
	private Timestamp trenutakAzuriranja;

	@Column(name="trenutak_kreiranja")
	private Timestamp trenutakKreiranja;

	//bi-directional many-to-one association to NabOgla
	@ManyToOne
	@JoinColumn(name="id_oglas")
	private NabOgla nabOgla;

	//bi-directional many-to-one association to XnabVrstaDokumenta
	@ManyToOne
	@JoinColumn(name="id_vrsta_dokumenta")
	private XnabVrstaDokumenta xnabVrstaDokumenta;

	public NabNabavkaDokument() {
	}

	public Integer getIdNabavkaDokument() {
		return this.idNabavkaDokument;
	}

	public void setIdNabavkaDokument(Integer idNabavkaDokument) {
		this.idNabavkaDokument = idNabavkaDokument;
	}

	public String getFajlRelativnaPutanja() {
		return this.fajlRelativnaPutanja;
	}

	public void setFajlRelativnaPutanja(String fajlRelativnaPutanja) {
		this.fajlRelativnaPutanja = fajlRelativnaPutanja;
	}

	public Integer getIdKorisnikAzurirao() {
		return this.idKorisnikAzurirao;
	}

	public void setIdKorisnikAzurirao(Integer idKorisnikAzurirao) {
		this.idKorisnikAzurirao = idKorisnikAzurirao;
	}

	public Integer getIdKorisnikKreirao() {
		return this.idKorisnikKreirao;
	}

	public void setIdKorisnikKreirao(Integer idKorisnikKreirao) {
		this.idKorisnikKreirao = idKorisnikKreirao;
	}

	public Timestamp getTrenutakAzuriranja() {
		return this.trenutakAzuriranja;
	}

	public void setTrenutakAzuriranja(Timestamp trenutakAzuriranja) {
		this.trenutakAzuriranja = trenutakAzuriranja;
	}

	public Timestamp getTrenutakKreiranja() {
		return this.trenutakKreiranja;
	}

	public void setTrenutakKreiranja(Timestamp trenutakKreiranja) {
		this.trenutakKreiranja = trenutakKreiranja;
	}

	public NabOgla getNabOgla() {
		return this.nabOgla;
	}

	public void setNabOgla(NabOgla nabOgla) {
		this.nabOgla = nabOgla;
	}

	public XnabVrstaDokumenta getXnabVrstaDokumenta() {
		return this.xnabVrstaDokumenta;
	}

	public void setXnabVrstaDokumenta(XnabVrstaDokumenta xnabVrstaDokumenta) {
		this.xnabVrstaDokumenta = xnabVrstaDokumenta;
	}

}
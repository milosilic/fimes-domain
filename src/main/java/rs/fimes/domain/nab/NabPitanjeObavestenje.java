package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.sql.Timestamp;


/**
 * The persistent class for the nab_pitanje_obavestenje database table.
 * 
 */
@Entity
@Table(name="nab_pitanje_obavestenje")
@NamedQuery(name="NabPitanjeObavestenje.findAll", query="SELECT n FROM NabPitanjeObavestenje n")
public class NabPitanjeObavestenje extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pitanje_obavestenje")
	private Integer idPitanjeObavestenje;

	@Column(name="id_korisnik_odgovor")
	private Integer idKorisnikOdgovor;

	@Column(name="id_ponudjac_pitanje")
	private Integer idPonudjacPitanje;

	@Column(name="odgovor_obavestenje")
	private String odgovorObavestenje;

	private String pitanje;

	@Column(name="trenutak_odgovora_obavestenja")
	private Timestamp trenutakOdgovoraObavestenja;

	@Column(name="trenutak_pitanja")
	private Timestamp trenutakPitanja;

	//bi-directional many-to-one association to NabJavnaNabavka
	@ManyToOne
	@JoinColumn(name="id_javna_nabavka")
	private NabJavnaNabavka nabJavnaNabavka;

	public NabPitanjeObavestenje() {
	}

	public Integer getIdPitanjeObavestenje() {
		return this.idPitanjeObavestenje;
	}

	public void setIdPitanjeObavestenje(Integer idPitanjeObavestenje) {
		this.idPitanjeObavestenje = idPitanjeObavestenje;
	}

	public Integer getIdKorisnikOdgovor() {
		return this.idKorisnikOdgovor;
	}

	public void setIdKorisnikOdgovor(Integer idKorisnikOdgovor) {
		this.idKorisnikOdgovor = idKorisnikOdgovor;
	}

	public Integer getIdPonudjacPitanje() {
		return this.idPonudjacPitanje;
	}

	public void setIdPonudjacPitanje(Integer idPonudjacPitanje) {
		this.idPonudjacPitanje = idPonudjacPitanje;
	}

	public String getOdgovorObavestenje() {
		return this.odgovorObavestenje;
	}

	public void setOdgovorObavestenje(String odgovorObavestenje) {
		this.odgovorObavestenje = odgovorObavestenje;
	}

	public String getPitanje() {
		return this.pitanje;
	}

	public void setPitanje(String pitanje) {
		this.pitanje = pitanje;
	}

	public Timestamp getTrenutakOdgovoraObavestenja() {
		return this.trenutakOdgovoraObavestenja;
	}

	public void setTrenutakOdgovoraObavestenja(Timestamp trenutakOdgovoraObavestenja) {
		this.trenutakOdgovoraObavestenja = trenutakOdgovoraObavestenja;
	}

	public Timestamp getTrenutakPitanja() {
		return this.trenutakPitanja;
	}

	public void setTrenutakPitanja(Timestamp trenutakPitanja) {
		this.trenutakPitanja = trenutakPitanja;
	}

	public NabJavnaNabavka getNabJavnaNabavka() {
		return this.nabJavnaNabavka;
	}

	public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
		this.nabJavnaNabavka = nabJavnaNabavka;
	}

}
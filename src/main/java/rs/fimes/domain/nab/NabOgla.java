package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the nab_oglas database table.
 * 
 */
@Entity
@Table(name="nab_oglas")
@NamedQuery(name="NabOgla.findAll", query="SELECT n FROM NabOgla n")
public class NabOgla extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_oglas")
	private Integer idOglas;

	@Column(name="broj_sluzbenog_glasnika")
	private String brojSluzbenogGlasnika;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_broj_sluz_glasnika")
	private Date datumBrojSluzGlasnika;

	@Column(name="id_korisnik_azurirao")
	private Integer idKorisnikAzurirao;

	@Column(name="id_korisnik_kreirao")
	private Integer idKorisnikKreirao;

	@Column(name="id_korisnik_objavio")
	private Integer idKorisnikObjavio;

	private String naslov;

	private String opis;

	@Column(name="trenutak_azuriranja")
	private Timestamp trenutakAzuriranja;

	@Column(name="trenutak_kreiranja")
	private Timestamp trenutakKreiranja;

	@Column(name="trenutak_objavljivanja")
	private Timestamp trenutakObjavljivanja;

	//bi-directional many-to-one association to NabNabavkaDokument
	@OneToMany(mappedBy="nabOgla")
	private List<NabNabavkaDokument> nabNabavkaDokuments;

	//bi-directional many-to-one association to NabJavnaNabavka
	@ManyToOne
	@JoinColumn(name="id_javna_nabavka")
	private NabJavnaNabavka nabJavnaNabavka;

	//bi-directional many-to-one association to XnabStatusOglasa
	@ManyToOne
	@JoinColumn(name="id_status_oglasa")
	private XnabStatusOglasa xnabStatusOglasa;

	//bi-directional many-to-one association to XnabTipOglasa
	@ManyToOne
	@JoinColumn(name="id_tip_oglasa")
	private XnabTipOglasa xnabTipOglasa;

	//bi-directional many-to-one association to NabOglasPartija
	@OneToMany(mappedBy="nabOgla")
	private List<NabOglasPartija> nabOglasPartijas;

	//bi-directional many-to-one association to NabOglasPonuda
	@OneToMany(mappedBy="nabOgla")
	private List<NabOglasPonuda> nabOglasPonudas;

	public NabOgla() {
	}

	public Integer getIdOglas() {
		return this.idOglas;
	}

	public void setIdOglas(Integer idOglas) {
		this.idOglas = idOglas;
	}

	public String getBrojSluzbenogGlasnika() {
		return this.brojSluzbenogGlasnika;
	}

	public void setBrojSluzbenogGlasnika(String brojSluzbenogGlasnika) {
		this.brojSluzbenogGlasnika = brojSluzbenogGlasnika;
	}

	public Date getDatumBrojSluzGlasnika() {
		return this.datumBrojSluzGlasnika;
	}

	public void setDatumBrojSluzGlasnika(Date datumBrojSluzGlasnika) {
		this.datumBrojSluzGlasnika = datumBrojSluzGlasnika;
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

	public Integer getIdKorisnikObjavio() {
		return this.idKorisnikObjavio;
	}

	public void setIdKorisnikObjavio(Integer idKorisnikObjavio) {
		this.idKorisnikObjavio = idKorisnikObjavio;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
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

	public Timestamp getTrenutakObjavljivanja() {
		return this.trenutakObjavljivanja;
	}

	public void setTrenutakObjavljivanja(Timestamp trenutakObjavljivanja) {
		this.trenutakObjavljivanja = trenutakObjavljivanja;
	}

	public List<NabNabavkaDokument> getNabNabavkaDokuments() {
		return this.nabNabavkaDokuments;
	}

	public void setNabNabavkaDokuments(List<NabNabavkaDokument> nabNabavkaDokuments) {
		this.nabNabavkaDokuments = nabNabavkaDokuments;
	}

	public NabNabavkaDokument addNabNabavkaDokument(NabNabavkaDokument nabNabavkaDokument) {
		getNabNabavkaDokuments().add(nabNabavkaDokument);
		nabNabavkaDokument.setNabOgla(this);

		return nabNabavkaDokument;
	}

	public NabNabavkaDokument removeNabNabavkaDokument(NabNabavkaDokument nabNabavkaDokument) {
		getNabNabavkaDokuments().remove(nabNabavkaDokument);
		nabNabavkaDokument.setNabOgla(null);

		return nabNabavkaDokument;
	}

	public NabJavnaNabavka getNabJavnaNabavka() {
		return this.nabJavnaNabavka;
	}

	public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
		this.nabJavnaNabavka = nabJavnaNabavka;
	}

	public XnabStatusOglasa getXnabStatusOglasa() {
		return this.xnabStatusOglasa;
	}

	public void setXnabStatusOglasa(XnabStatusOglasa xnabStatusOglasa) {
		this.xnabStatusOglasa = xnabStatusOglasa;
	}

	public XnabTipOglasa getXnabTipOglasa() {
		return this.xnabTipOglasa;
	}

	public void setXnabTipOglasa(XnabTipOglasa xnabTipOglasa) {
		this.xnabTipOglasa = xnabTipOglasa;
	}

	public List<NabOglasPartija> getNabOglasPartijas() {
		return this.nabOglasPartijas;
	}

	public void setNabOglasPartijas(List<NabOglasPartija> nabOglasPartijas) {
		this.nabOglasPartijas = nabOglasPartijas;
	}

	public NabOglasPartija addNabOglasPartija(NabOglasPartija nabOglasPartija) {
		getNabOglasPartijas().add(nabOglasPartija);
		nabOglasPartija.setNabOgla(this);

		return nabOglasPartija;
	}

	public NabOglasPartija removeNabOglasPartija(NabOglasPartija nabOglasPartija) {
		getNabOglasPartijas().remove(nabOglasPartija);
		nabOglasPartija.setNabOgla(null);

		return nabOglasPartija;
	}

	public List<NabOglasPonuda> getNabOglasPonudas() {
		return this.nabOglasPonudas;
	}

	public void setNabOglasPonudas(List<NabOglasPonuda> nabOglasPonudas) {
		this.nabOglasPonudas = nabOglasPonudas;
	}

	public NabOglasPonuda addNabOglasPonuda(NabOglasPonuda nabOglasPonuda) {
		getNabOglasPonudas().add(nabOglasPonuda);
		nabOglasPonuda.setNabOgla(this);

		return nabOglasPonuda;
	}

	public NabOglasPonuda removeNabOglasPonuda(NabOglasPonuda nabOglasPonuda) {
		getNabOglasPonudas().remove(nabOglasPonuda);
		nabOglasPonuda.setNabOgla(null);

		return nabOglasPonuda;
	}

}
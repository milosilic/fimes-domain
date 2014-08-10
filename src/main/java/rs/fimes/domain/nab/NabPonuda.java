package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the nab_ponuda database table.
 * 
 */
@Entity
@Table(name="nab_ponuda")
@NamedQuery(name="NabPonuda.findAll", query="SELECT n FROM NabPonuda n")
public class NabPonuda extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ponuda")
	private Integer idPonuda;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_ponude")
	private Date datumPonude;

	@Column(name="id_korisnik_azurirao")
	private Integer idKorisnikAzurirao;

	@Column(name="id_korisnik_kreirao")
	private Integer idKorisnikKreirao;

	@Column(name="id_poslovni_partner")
	private Integer idPoslovniPartner;

	@Column(name="trenutak_azuriranja")
	private Timestamp trenutakAzuriranja;

	@Column(name="trenutak_kreiranja")
	private Timestamp trenutakKreiranja;

	@Column(name="trenutak_podnosenja")
	private Timestamp trenutakPodnosenja;

	//bi-directional many-to-one association to NabOglasPonuda
	@OneToMany(mappedBy="nabPonuda")
	private List<NabOglasPonuda> nabOglasPonudas;

	//bi-directional many-to-one association to NabJavnaNabavka
	@ManyToOne
	@JoinColumn(name="id_javna_nabavka")
	private NabJavnaNabavka nabJavnaNabavka;

	//bi-directional many-to-one association to NabPonudaDokument
	@OneToMany(mappedBy="nabPonuda")
	private List<NabPonudaDokument> nabPonudaDokuments;

	public NabPonuda() {
	}

	public Integer getIdPonuda() {
		return this.idPonuda;
	}

	public void setIdPonuda(Integer idPonuda) {
		this.idPonuda = idPonuda;
	}

	public Date getDatumPonude() {
		return this.datumPonude;
	}

	public void setDatumPonude(Date datumPonude) {
		this.datumPonude = datumPonude;
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

	public Integer getIdPoslovniPartner() {
		return this.idPoslovniPartner;
	}

	public void setIdPoslovniPartner(Integer idPoslovniPartner) {
		this.idPoslovniPartner = idPoslovniPartner;
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

	public Timestamp getTrenutakPodnosenja() {
		return this.trenutakPodnosenja;
	}

	public void setTrenutakPodnosenja(Timestamp trenutakPodnosenja) {
		this.trenutakPodnosenja = trenutakPodnosenja;
	}

	public List<NabOglasPonuda> getNabOglasPonudas() {
		return this.nabOglasPonudas;
	}

	public void setNabOglasPonudas(List<NabOglasPonuda> nabOglasPonudas) {
		this.nabOglasPonudas = nabOglasPonudas;
	}

	public NabOglasPonuda addNabOglasPonuda(NabOglasPonuda nabOglasPonuda) {
		getNabOglasPonudas().add(nabOglasPonuda);
		nabOglasPonuda.setNabPonuda(this);

		return nabOglasPonuda;
	}

	public NabOglasPonuda removeNabOglasPonuda(NabOglasPonuda nabOglasPonuda) {
		getNabOglasPonudas().remove(nabOglasPonuda);
		nabOglasPonuda.setNabPonuda(null);

		return nabOglasPonuda;
	}

	public NabJavnaNabavka getNabJavnaNabavka() {
		return this.nabJavnaNabavka;
	}

	public void setNabJavnaNabavka(NabJavnaNabavka nabJavnaNabavka) {
		this.nabJavnaNabavka = nabJavnaNabavka;
	}

	public List<NabPonudaDokument> getNabPonudaDokuments() {
		return this.nabPonudaDokuments;
	}

	public void setNabPonudaDokuments(List<NabPonudaDokument> nabPonudaDokuments) {
		this.nabPonudaDokuments = nabPonudaDokuments;
	}

	public NabPonudaDokument addNabPonudaDokument(NabPonudaDokument nabPonudaDokument) {
		getNabPonudaDokuments().add(nabPonudaDokument);
		nabPonudaDokument.setNabPonuda(this);

		return nabPonudaDokument;
	}

	public NabPonudaDokument removeNabPonudaDokument(NabPonudaDokument nabPonudaDokument) {
		getNabPonudaDokuments().remove(nabPonudaDokument);
		nabPonudaDokument.setNabPonuda(null);

		return nabPonudaDokument;
	}

}
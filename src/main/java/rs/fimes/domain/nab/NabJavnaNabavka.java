package rs.fimes.domain.nab;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import org.apache.poi.hssf.record.formula.functions.False;

import rs.fimes.domain.FimesDomain;
import rs.fimes.domain.core.OrgFirma;
import rs.fimes.domain.core.UsrKorisnik;

import java.util.Date;


/**
 * The persistent class for the nab_javna_nabavka database table.
 * 
 */
@Entity
@Table(name="nab_javna_nabavka")
public class NabJavnaNabavka extends FimesDomain implements Serializable {

    private static final long serialVersionUID = -8222180155853325824L;

    private Integer idJavnaNabavka;
    private NabPlan nabPlan;
    private String opis;
    private UsrKorisnik korisnikKreirao;
    private Date trenutakKreiranja;
    private UsrKorisnik korisnikAzurirao;
    private Date trenutakAzuriranja;
    private Boolean fPoPartijama;
    private XnabVrstaPostupka vrstaPostupka;
    private XnabStatusNabavke statusNabavke;
    private OrgFirma orgFirma;
    private String opravdanost;
    private String opisProcena;
    private String napomena;
    private XnabTipNabavke tipNabavke;
    private Integer mesecPokretanja;
    private Integer godinaPokretanja;
    private Integer mesecZakljucenja;
    private Integer godinaZakljucenja;
    private Integer mesecIzvrsenja;
    private Integer godinaIzvrsenja;
    private String interniBroj;
    private BigDecimal procenaSaPdv;
    private BigDecimal procenaBezPdv;
    private XnabVrstaPredmetaNabavke vrstaPredmetaNabavke;
    private XnabPredmetNabavke predmetNabavke;
    
    public NabJavnaNabavka(){
        
    }

    @Id
	@Column(name="id_javna_nabavka", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_javna_nabavka")
	@SequenceGenerator(name = "seq_nab_javna_nabavka", sequenceName = "seq_nab_javna_nabavka", initialValue = 1, allocationSize = 1)
    public Integer getIdJavnaNabavka() {
        return idJavnaNabavka;
    }

    public void setIdJavnaNabavka(Integer idJavnaNabavka) {
        this.idJavnaNabavka = idJavnaNabavka;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_plan", nullable = false)
    public NabPlan getNabPlan() {
        return nabPlan;
    }

    public void setNabPlan(NabPlan nabPlan) {
        this.nabPlan = nabPlan;
    }

    @Column(name="opis", nullable = false, length=4096)
    public String getOpis() {
        if ( null == opis) opis= "opis javne nabavke";
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_korisnik_kreirao", nullable = false)
    public UsrKorisnik getKorisnikKreirao() {
        return korisnikKreirao;
    }

    public void setKorisnikKreirao(UsrKorisnik korisnikKreirao) {
        this.korisnikKreirao = korisnikKreirao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="trenutak_kreiranja")
    public Date getTrenutakKreiranja() {
        if ( null == trenutakKreiranja ) trenutakKreiranja = new Date();
        return trenutakKreiranja;
    }

    public void setTrenutakKreiranja(Date trenutakKreiranja) {
        this.trenutakKreiranja = trenutakKreiranja;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_korisnik_azurirao", nullable = false)
    public UsrKorisnik getKorisnikAzurirao() {
        return korisnikAzurirao;
    }

    public void setKorisnikAzurirao(UsrKorisnik korisnikAzurirao) {
        this.korisnikAzurirao = korisnikAzurirao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="trenutak_azuriranja")
    public Date getTrenutakAzuriranja() {
        if ( null == trenutakAzuriranja ) trenutakAzuriranja = new Date();
        return trenutakAzuriranja;
    }

    public void setTrenutakAzuriranja(Date trenutakAzuriranja) {
        this.trenutakAzuriranja = trenutakAzuriranja;
    }

    @Column(name="f_po_partijama")
    public Boolean getfPoPartijama() {
        if ( null == fPoPartijama ) fPoPartijama=false;
        return fPoPartijama;
    }

    public void setfPoPartijama(Boolean fPoPartijama) {
        this.fPoPartijama = fPoPartijama;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_vrsta_postupka", nullable = false)
    public XnabVrstaPostupka getVrstaPostupka() {
        return vrstaPostupka;
    }

    public void setVrstaPostupka(XnabVrstaPostupka vrstaPostupka) {
        this.vrstaPostupka = vrstaPostupka;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_nabavke", nullable = false)
    public XnabStatusNabavke getStatusNabavke() {
        return statusNabavke;
    }

    public void setStatusNabavke(XnabStatusNabavke statusNabavke) {
        this.statusNabavke = statusNabavke;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_firma", nullable = false)
    public OrgFirma getOrgFirma() {
        return orgFirma;
    }

    public void setOrgFirma(OrgFirma orgFirma) {
        this.orgFirma = orgFirma;
    }
    @Column(name="opravdanost", nullable=false, length=512)
    public String getOpravdanost() {
        if(null == opravdanost) opravdanost = "ovo je opravdana nabavka.";
        return opravdanost;
    }

    public void setOpravdanost(String opravdanost) {
        this.opravdanost = opravdanost;
    }

    @Column(name="opis_procena", nullable=false, length=512)
    public String getOpisProcena() {
        if( null == opisProcena) opisProcena = "ove ide opsi prodena";
        return opisProcena;
    }

    public void setOpisProcena(String opisProcena) {
        this.opisProcena = opisProcena;
    }

    @Column(name="napomena", nullable=false, length=512)
    public String getNapomena() {
        if(null == napomena) napomena = "napomena";
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tip_nabavke", nullable =false)
    public XnabTipNabavke getTipNabavke() {
        return tipNabavke;
    }

    public void setTipNabavke(XnabTipNabavke tipNabavke) {
        this.tipNabavke = tipNabavke;
    }

    @Column(name="mesec_pokretanja", nullable=true)
    public Integer getMesecPokretanja() {
        return mesecPokretanja;
    }

    public void setMesecPokretanja(Integer mesecPokretanja) {
        this.mesecPokretanja = mesecPokretanja;
    }
    @Column(name="godina_pokretanja", nullable=true)
    public Integer getGodinaPokretanja() {
        return godinaPokretanja;
    }

    public void setGodinaPokretanja(Integer godinaPokretanja) {
        this.godinaPokretanja = godinaPokretanja;
    }
    @Column(name="mesec_zakljucenja", nullable=true)
    public Integer getMesecZakljucenja() {
        return mesecZakljucenja;
    }

    public void setMesecZakljucenja(Integer mesecZakljucenja) {
        this.mesecZakljucenja = mesecZakljucenja;
    }
    @Column(name="godina_zakljucenja", nullable=true)
    public Integer getGodinaZakljucenja() {
        return godinaZakljucenja;
    }
    
    public void setGodinaZakljucenja(Integer godinaZakljucenja) {
        this.godinaZakljucenja = godinaZakljucenja;
    }
    @Column(name="mesec_izvrsenja", nullable=true)
    public Integer getMesecIzvrsenja() {
        return mesecIzvrsenja;
    }

    public void setMesecIzvrsenja(Integer mesecIzvrsenja) {
        this.mesecIzvrsenja = mesecIzvrsenja;
    }
    @Column(name="godina_izvrsenja", nullable=true)
    public Integer getGodinaIzvrsenja() {
        return godinaIzvrsenja;
    }

    public void setGodinaIzvrsenja(Integer godinaIzvrsenja) {
        this.godinaIzvrsenja = godinaIzvrsenja;
    }

    @Column(name="interni_broj", length=128, nullable=true)
    public String getInterniBroj() {
        if (null == interniBroj ) interniBroj="2323";
        return interniBroj;
    }

    public void setInterniBroj(String interniBroj) {
        this.interniBroj = interniBroj;
    }

    @Column(name="procena_sa_pdv", precision=15)
    public BigDecimal getProcenaSaPdv() {
        return procenaSaPdv;
    }

    public void setProcenaSaPdv(BigDecimal procenaSaPdv) {
        this.procenaSaPdv = procenaSaPdv;
    }

    @Column(name="procena_bez_pdv", precision=15)
    public BigDecimal getProcenaBezPdv() {
        return procenaBezPdv;
    }

    public void setProcenaBezPdv(BigDecimal procenaBezPdv) {
        this.procenaBezPdv = procenaBezPdv;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_vrsta_predmeta_nabavke")
    public XnabVrstaPredmetaNabavke getVrstaPredmetaNabavke() {
        return vrstaPredmetaNabavke;
    }


    public void setVrstaPredmetaNabavke(XnabVrstaPredmetaNabavke vrstaPredmetaNabavke) {
        this.vrstaPredmetaNabavke = vrstaPredmetaNabavke;
    }
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_predmet_nabavke", nullable=false)
    public XnabPredmetNabavke getPredmetNabavke() {
        return predmetNabavke;
    }

    public void setPredmetNabavke(XnabPredmetNabavke predmetNabavke) {
        this.predmetNabavke = predmetNabavke;
    }
	
    
    @Override
    public String toString() {
        return "NabJavnaNabavka [idJavnaNabavka=" + idJavnaNabavka
                + ", nabPlan=" + nabPlan + ", opis=" + opis
                + ", korisnikKreirao=" + korisnikKreirao
                + ", trenutakKreiranja=" + trenutakKreiranja
                + ", korisnikAzurirao=" + korisnikAzurirao
                + ", trenutakAzuriranja=" + trenutakAzuriranja
                + ", fPoPartijama=" + fPoPartijama + ", vrstaPostupka="
                + vrstaPostupka + ", statusNabavke=" + statusNabavke
                + ", orgFirma=" + orgFirma + ", opravdanost=" + opravdanost
                + ", opisProcena=" + opisProcena + ", napomena=" + napomena
                + ", tipNabavke=" + tipNabavke + ", mesecPokretanja="
                + mesecPokretanja + ", godinaPokretanja=" + godinaPokretanja
                + ", mesecZakljucenja=" + mesecZakljucenja
                + ", godinaZakljucenja=" + godinaZakljucenja
                + ", mesecIzvrsenja=" + mesecIzvrsenja + ", godinaIzvrsenja="
                + godinaIzvrsenja + ", interniBroj=" + interniBroj
                + ", procenaSaPdv=" + procenaSaPdv + ", procenaBezPdv="
                + procenaBezPdv + ", vrstaPredmetaNabavke="
                + vrstaPredmetaNabavke + ", predmetNabavke=" + predmetNabavke
                + "]";
    }
	

}
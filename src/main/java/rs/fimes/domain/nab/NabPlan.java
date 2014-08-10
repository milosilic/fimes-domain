package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;
import rs.fimes.domain.core.OrgFirma;
import rs.fimes.domain.core.UsrKorisnik;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the nab_plan database table.
 * 
 */


@Entity
@Table(name = "nab_plan")
public class NabPlan extends FimesDomain implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idPlan;

    private String brojPlana;

    private Date datumIzrade;

    private Date datumUsvajanja;

    private Integer godina;


    private OrgFirma orgFirma;
//id korisnik kreirao
    private UsrKorisnik usrKorisnik;

    private String naziv;

    private Date trenutakKreiranja;

    public NabPlan() {
    }
    
    public NabPlan(Integer idPlan, String brojPlana, Date datumIzrade,
            Date datumUsvajanja, Integer godina, OrgFirma orgFirma,
            UsrKorisnik usrKorisnik, String naziv, Timestamp trenutakKreiranja) {
        super();
        this.idPlan = idPlan;
        this.brojPlana = brojPlana;
        this.datumIzrade = datumIzrade;
        this.datumUsvajanja = datumUsvajanja;
        this.godina = godina;
        this.orgFirma = orgFirma;
        this.usrKorisnik = usrKorisnik;
        this.naziv = naziv;
        this.trenutakKreiranja = trenutakKreiranja;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nab_plan")
    @SequenceGenerator(name = "seq_nab_plan", sequenceName = "seq_nab_plan", initialValue = 1, allocationSize = 1)
    @Column(name = "id_plan", unique = true, nullable = false)
    public Integer getIdPlan() {
        return this.idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    @Column(name = "broj_plana",  nullable = false, length = 128)
    public String getBrojPlana() {
        return this.brojPlana;
    }

    public void setBrojPlana(String brojPlana) {
        this.brojPlana = brojPlana;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "datum_izrade")
    public Date getDatumIzrade() {
        return this.datumIzrade;
    }

    public void setDatumIzrade(Date datumIzrade) {
        this.datumIzrade = datumIzrade;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "datum_usvajanja")
    public Date getDatumUsvajanja() {
        return this.datumUsvajanja;
    }

    public void setDatumUsvajanja(Date datumUsvajanja) {
        this.datumUsvajanja = datumUsvajanja;
    }

    public Integer getGodina() {
        return this.godina;
    }

    public void setGodina(Integer godina) {
        this.godina = godina;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_firma", nullable = false)
    public OrgFirma getOrgFirma() {
        return orgFirma;
    }

    public void setOrgFirma(OrgFirma orgFirma) {
        this.orgFirma = orgFirma;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_korisnik_kreirao", nullable = false)
    public UsrKorisnik getUsrKorisnik() {
        return this.usrKorisnik;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "trenutak_kreiranja")
    public Date getTrenutakKreiranja() {
        return this.trenutakKreiranja;
    }

    public void setTrenutakKreiranja(Date trenutakKreiranja) {
        this.trenutakKreiranja = trenutakKreiranja;
    }

    public void setUsrKorisnik(UsrKorisnik usrKorisnik) {
        this.usrKorisnik = usrKorisnik;
    }

    @Override
    public String toString() {
        return "NabPlan [idPlan=" + idPlan + ", brojPlana=" + brojPlana
                + ", datumIzrade=" + datumIzrade + ", datumUsvajanja="
                + datumUsvajanja + ", godina=" + godina + ", orgFirma="
                + orgFirma + ", usrKorisnik=" + usrKorisnik + ", naziv="
                + naziv + ", trenutakKreiranja=" + trenutakKreiranja + "]";
    }
    
    
    

}
package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;


/**
 * The persistent class for the xnab_vrsta_postupka database table.
 * 
 */
@Entity
@Table(name="xnab_vrsta_postupka")
public class XnabVrstaPostupka extends FimesDomain  implements Serializable {
    
	private static final long serialVersionUID = 1L;

	private Integer idVrstaPostupka;

	
	private Boolean fArhivirano;

	private String naziv;

	public XnabVrstaPostupka() {
	}

    @Id
    @Column(name="id_vrsta_postupka")
	public Integer getIdVrstaPostupka() {
		return this.idVrstaPostupka;
	}

	public void setIdVrstaPostupka(Integer idVrstaPostupka) {
		this.idVrstaPostupka = idVrstaPostupka;
	}

	@Column(name="f_arhivirano", nullable=false)
	public Boolean getFArhivirano() {
		return this.fArhivirano;
	}

	public void setFArhivirano(Boolean fArhivirano) {
		this.fArhivirano = fArhivirano;
	}

	@Column(name="naziv")
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

    @Override
    public String toString() {
        return "XnabVrstaPostupka [idVrstaPostupka=" + idVrstaPostupka
                + ", fArhivirano=" + fArhivirano + ", naziv=" + naziv + "]";
    }
	
	

}
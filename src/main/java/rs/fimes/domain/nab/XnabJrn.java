package rs.fimes.domain.nab;

import java.io.Serializable;

import javax.persistence.*;

import rs.fimes.domain.FimesDomain;

import java.util.List;


/**
 * The persistent class for the xnab_jrn database table.
 * 
 */
@Entity
@Table(name="xnab_jrn")
public class XnabJrn extends FimesDomain  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idJrn;

	private Boolean fDopunskiRecnik;

	private Boolean fDozvoljenIzbor;

	private String kod;

	private String opis;

	private XnabJrn idJrnNadredjena;


	public XnabJrn() {
	}

    @Id
    @Column(name="id_jrn")
	public Integer getIdJrn() {
		return this.idJrn;
	}

	public void setIdJrn(Integer idJrn) {
		this.idJrn = idJrn;
	}

    @Column(name="f_dopunski_recnik")
	public Boolean getFDopunskiRecnik() {
		return this.fDopunskiRecnik;
	}

	public void setFDopunskiRecnik(Boolean fDopunskiRecnik) {
		this.fDopunskiRecnik = fDopunskiRecnik;
	}

    @Column(name="f_dozvoljen_izbor")
	public Boolean getFDozvoljenIzbor() {
		return this.fDozvoljenIzbor;
	}

	public void setFDozvoljenIzbor(Boolean fDozvoljenIzbor) {
		this.fDozvoljenIzbor = fDozvoljenIzbor;
	}

	@Column(name="kod" , nullable=false, length=10)
	public String getKod() {
		return this.kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	@Column(name="opis", nullable=false, length=512)
	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jrn_nadredjena", nullable = true)

    public XnabJrn getIdJrnNadredjena() {
        return idJrnNadredjena;
    }

    public void setIdJrnNadredjena(XnabJrn idJrnNadredjena) {
        this.idJrnNadredjena = idJrnNadredjena;
    }


}
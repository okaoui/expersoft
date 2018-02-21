package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * Produit generated by hbm2java
 */
public class Produit implements java.io.Serializable {

	private Integer id;
	private String codProd;
	private String libProd;
	private String pnobe;
	private Integer noBe;
	private Integer noBs;
	private String pnobs;
	private Double bic;
	private String cptAch;
	private String cptVte;
	private String cptBic;
	private String codUom;
	private String codUom2;
	private Double puFarm;
	private Double puFou;

	public Produit() {
	}

	public Produit(String codProd, String libProd, String pnobe, Integer noBe, Integer noBs, String pnobs, Double bic,
			String cptAch, String cptVte, String cptBic, String codUom, String codUom2, Double puFarm, Double puFou) {
		this.codProd = codProd;
		this.libProd = libProd;
		this.pnobe = pnobe;
		this.noBe = noBe;
		this.noBs = noBs;
		this.pnobs = pnobs;
		this.bic = bic;
		this.cptAch = cptAch;
		this.cptVte = cptVte;
		this.cptBic = cptBic;
		this.codUom = codUom;
		this.codUom2 = codUom2;
		this.puFarm = puFarm;
		this.puFou = puFou;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodProd() {
		return this.codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public String getLibProd() {
		return this.libProd;
	}

	public void setLibProd(String libProd) {
		this.libProd = libProd;
	}

	public String getPnobe() {
		return this.pnobe;
	}

	public void setPnobe(String pnobe) {
		this.pnobe = pnobe;
	}

	public Integer getNoBe() {
		return this.noBe;
	}

	public void setNoBe(Integer noBe) {
		this.noBe = noBe;
	}

	public Integer getNoBs() {
		return this.noBs;
	}

	public void setNoBs(Integer noBs) {
		this.noBs = noBs;
	}

	public String getPnobs() {
		return this.pnobs;
	}

	public void setPnobs(String pnobs) {
		this.pnobs = pnobs;
	}

	public Double getBic() {
		return this.bic;
	}

	public void setBic(Double bic) {
		this.bic = bic;
	}

	public String getCptAch() {
		return this.cptAch;
	}

	public void setCptAch(String cptAch) {
		this.cptAch = cptAch;
	}

	public String getCptVte() {
		return this.cptVte;
	}

	public void setCptVte(String cptVte) {
		this.cptVte = cptVte;
	}

	public String getCptBic() {
		return this.cptBic;
	}

	public void setCptBic(String cptBic) {
		this.cptBic = cptBic;
	}

	public String getCodUom() {
		return this.codUom;
	}

	public void setCodUom(String codUom) {
		this.codUom = codUom;
	}

	public String getCodUom2() {
		return this.codUom2;
	}

	public void setCodUom2(String codUom2) {
		this.codUom2 = codUom2;
	}

	public Double getPuFarm() {
		return this.puFarm;
	}

	public void setPuFarm(Double puFarm) {
		this.puFarm = puFarm;
	}

	public Double getPuFou() {
		return this.puFou;
	}

	public void setPuFou(Double puFou) {
		this.puFou = puFou;
	}

}
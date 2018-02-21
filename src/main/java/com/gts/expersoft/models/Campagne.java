package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * Campagne generated by hbm2java
 */
public class Campagne implements java.io.Serializable {

	private Integer id;
	private String code;
	private String raisonSociale;
	private String address;
	private String activity;
	private String pays;
	private String ville;
	private String telephone;
	private String fax;
	private String siteweb;
	private String email;
	private String codeFiscalite;
	private String agrement;
	private String compteContribual;
	private String recolte;

	public Campagne() {
	}

	public Campagne(String code, String raisonSociale, String address, String activity, String pays, String ville,
			String telephone, String fax, String siteweb, String email, String codeFiscalite, String agrement,
			String compteContribual, String recolte) {
		this.code = code;
		this.raisonSociale = raisonSociale;
		this.address = address;
		this.activity = activity;
		this.pays = pays;
		this.ville = ville;
		this.telephone = telephone;
		this.fax = fax;
		this.siteweb = siteweb;
		this.email = email;
		this.codeFiscalite = codeFiscalite;
		this.agrement = agrement;
		this.compteContribual = compteContribual;
		this.recolte = recolte;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRaisonSociale() {
		return this.raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSiteweb() {
		return this.siteweb;
	}

	public void setSiteweb(String siteweb) {
		this.siteweb = siteweb;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodeFiscalite() {
		return this.codeFiscalite;
	}

	public void setCodeFiscalite(String codeFiscalite) {
		this.codeFiscalite = codeFiscalite;
	}

	public String getAgrement() {
		return this.agrement;
	}

	public void setAgrement(String agrement) {
		this.agrement = agrement;
	}

	public String getCompteContribual() {
		return this.compteContribual;
	}

	public void setCompteContribual(String compteContribual) {
		this.compteContribual = compteContribual;
	}

	public String getRecolte() {
		return this.recolte;
	}

	public void setRecolte(String recolte) {
		this.recolte = recolte;
	}

}
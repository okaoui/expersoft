package com.gts.expersoft.models;
// Generated Mar 9, 2018 3:36:12 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * PersonelId generated by hbm2java
 */
public class Personel implements java.io.Serializable {

	private String matPers;
	private String nomPers;
	private String matricule;
	private String datnais;
	private String lieunais;
	private String adrPers;
	private String telPers;
	private String emailPers;
	private String nopiece;
	private String grpsang;
	private String codNat;
	private String codEquip;
	private String codDep;
	private String libDep;
	private String cptPers;
	private String datentre;
	private String libFonc;
	private String nomBq;
	private String nocptBq;

	public Personel() {
	}

	public Personel(String matPers, String nomPers, String matricule, String datnais, String lieunais, String adrPers,
			String telPers, String emailPers, String nopiece, String grpsang, String codNat, String codEquip,
			String codDep, String libDep, String cptPers, String datentre, String libFonc, String nomBq,
			String nocptBq) {
		this.matPers = matPers;
		this.nomPers = nomPers;
		this.matricule = matricule;
		this.datnais = datnais;
		this.lieunais = lieunais;
		this.adrPers = adrPers;
		this.telPers = telPers;
		this.emailPers = emailPers;
		this.nopiece = nopiece;
		this.grpsang = grpsang;
		this.codNat = codNat;
		this.codEquip = codEquip;
		this.codDep = codDep;
		this.libDep = libDep;
		this.cptPers = cptPers;
		this.datentre = datentre;
		this.libFonc = libFonc;
		this.nomBq = nomBq;
		this.nocptBq = nocptBq;
	}

	public String getMatPers() {
		return this.matPers;
	}

	public void setMatPers(String matPers) {
		this.matPers = matPers;
	}

	public String getNomPers() {
		return this.nomPers;
	}

	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getDatnais() {
		return this.datnais;
	}

	public void setDatnais(String datnais) {
		this.datnais = datnais;
	}

	public String getLieunais() {
		return this.lieunais;
	}

	public void setLieunais(String lieunais) {
		this.lieunais = lieunais;
	}

	public String getAdrPers() {
		return this.adrPers;
	}

	public void setAdrPers(String adrPers) {
		this.adrPers = adrPers;
	}

	public String getTelPers() {
		return this.telPers;
	}

	public void setTelPers(String telPers) {
		this.telPers = telPers;
	}

	public String getEmailPers() {
		return this.emailPers;
	}

	public void setEmailPers(String emailPers) {
		this.emailPers = emailPers;
	}

	public String getNopiece() {
		return this.nopiece;
	}

	public void setNopiece(String nopiece) {
		this.nopiece = nopiece;
	}

	public String getGrpsang() {
		return this.grpsang;
	}

	public void setGrpsang(String grpsang) {
		this.grpsang = grpsang;
	}

	public String getCodNat() {
		return this.codNat;
	}

	public void setCodNat(String codNat) {
		this.codNat = codNat;
	}

	public String getCodEquip() {
		return this.codEquip;
	}

	public void setCodEquip(String codEquip) {
		this.codEquip = codEquip;
	}

	public String getCodDep() {
		return this.codDep;
	}

	public void setCodDep(String codDep) {
		this.codDep = codDep;
	}

	public String getLibDep() {
		return this.libDep;
	}

	public void setLibDep(String libDep) {
		this.libDep = libDep;
	}

	public String getCptPers() {
		return this.cptPers;
	}

	public void setCptPers(String cptPers) {
		this.cptPers = cptPers;
	}

	public String getDatentre() {
		return this.datentre;
	}

	public void setDatentre(String datentre) {
		this.datentre = datentre;
	}

	public String getLibFonc() {
		return this.libFonc;
	}

	public void setLibFonc(String libFonc) {
		this.libFonc = libFonc;
	}

	public String getNomBq() {
		return this.nomBq;
	}

	public void setNomBq(String nomBq) {
		this.nomBq = nomBq;
	}

	public String getNocptBq() {
		return this.nocptBq;
	}

	public void setNocptBq(String nocptBq) {
		this.nocptBq = nocptBq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Personel))
			return false;
		Personel castOther = (Personel) other;

		return ((this.getMatPers() == castOther.getMatPers()) || (this.getMatPers() != null
				&& castOther.getMatPers() != null && this.getMatPers().equals(castOther.getMatPers())))
				&& ((this.getNomPers() == castOther.getNomPers()) || (this.getNomPers() != null
						&& castOther.getNomPers() != null && this.getNomPers().equals(castOther.getNomPers())))
				&& ((this.getMatricule() == castOther.getMatricule()) || (this.getMatricule() != null
						&& castOther.getMatricule() != null && this.getMatricule().equals(castOther.getMatricule())))
				&& ((this.getDatnais() == castOther.getDatnais()) || (this.getDatnais() != null
						&& castOther.getDatnais() != null && this.getDatnais().equals(castOther.getDatnais())))
				&& ((this.getLieunais() == castOther.getLieunais()) || (this.getLieunais() != null
						&& castOther.getLieunais() != null && this.getLieunais().equals(castOther.getLieunais())))
				&& ((this.getAdrPers() == castOther.getAdrPers()) || (this.getAdrPers() != null
						&& castOther.getAdrPers() != null && this.getAdrPers().equals(castOther.getAdrPers())))
				&& ((this.getTelPers() == castOther.getTelPers()) || (this.getTelPers() != null
						&& castOther.getTelPers() != null && this.getTelPers().equals(castOther.getTelPers())))
				&& ((this.getEmailPers() == castOther.getEmailPers()) || (this.getEmailPers() != null
						&& castOther.getEmailPers() != null && this.getEmailPers().equals(castOther.getEmailPers())))
				&& ((this.getNopiece() == castOther.getNopiece()) || (this.getNopiece() != null
						&& castOther.getNopiece() != null && this.getNopiece().equals(castOther.getNopiece())))
				&& ((this.getGrpsang() == castOther.getGrpsang()) || (this.getGrpsang() != null
						&& castOther.getGrpsang() != null && this.getGrpsang().equals(castOther.getGrpsang())))
				&& ((this.getCodNat() == castOther.getCodNat()) || (this.getCodNat() != null
						&& castOther.getCodNat() != null && this.getCodNat().equals(castOther.getCodNat())))
				&& ((this.getCodEquip() == castOther.getCodEquip()) || (this.getCodEquip() != null
						&& castOther.getCodEquip() != null && this.getCodEquip().equals(castOther.getCodEquip())))
				&& ((this.getCodDep() == castOther.getCodDep()) || (this.getCodDep() != null
						&& castOther.getCodDep() != null && this.getCodDep().equals(castOther.getCodDep())))
				&& ((this.getLibDep() == castOther.getLibDep()) || (this.getLibDep() != null
						&& castOther.getLibDep() != null && this.getLibDep().equals(castOther.getLibDep())))
				&& ((this.getCptPers() == castOther.getCptPers()) || (this.getCptPers() != null
						&& castOther.getCptPers() != null && this.getCptPers().equals(castOther.getCptPers())))
				&& ((this.getDatentre() == castOther.getDatentre()) || (this.getDatentre() != null
						&& castOther.getDatentre() != null && this.getDatentre().equals(castOther.getDatentre())))
				&& ((this.getLibFonc() == castOther.getLibFonc()) || (this.getLibFonc() != null
						&& castOther.getLibFonc() != null && this.getLibFonc().equals(castOther.getLibFonc())))
				&& ((this.getNomBq() == castOther.getNomBq()) || (this.getNomBq() != null
						&& castOther.getNomBq() != null && this.getNomBq().equals(castOther.getNomBq())))
				&& ((this.getNocptBq() == castOther.getNocptBq()) || (this.getNocptBq() != null
						&& castOther.getNocptBq() != null && this.getNocptBq().equals(castOther.getNocptBq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMatPers() == null ? 0 : this.getMatPers().hashCode());
		result = 37 * result + (getNomPers() == null ? 0 : this.getNomPers().hashCode());
		result = 37 * result + (getMatricule() == null ? 0 : this.getMatricule().hashCode());
		result = 37 * result + (getDatnais() == null ? 0 : this.getDatnais().hashCode());
		result = 37 * result + (getLieunais() == null ? 0 : this.getLieunais().hashCode());
		result = 37 * result + (getAdrPers() == null ? 0 : this.getAdrPers().hashCode());
		result = 37 * result + (getTelPers() == null ? 0 : this.getTelPers().hashCode());
		result = 37 * result + (getEmailPers() == null ? 0 : this.getEmailPers().hashCode());
		result = 37 * result + (getNopiece() == null ? 0 : this.getNopiece().hashCode());
		result = 37 * result + (getGrpsang() == null ? 0 : this.getGrpsang().hashCode());
		result = 37 * result + (getCodNat() == null ? 0 : this.getCodNat().hashCode());
		result = 37 * result + (getCodEquip() == null ? 0 : this.getCodEquip().hashCode());
		result = 37 * result + (getCodDep() == null ? 0 : this.getCodDep().hashCode());
		result = 37 * result + (getLibDep() == null ? 0 : this.getLibDep().hashCode());
		result = 37 * result + (getCptPers() == null ? 0 : this.getCptPers().hashCode());
		result = 37 * result + (getDatentre() == null ? 0 : this.getDatentre().hashCode());
		result = 37 * result + (getLibFonc() == null ? 0 : this.getLibFonc().hashCode());
		result = 37 * result + (getNomBq() == null ? 0 : this.getNomBq().hashCode());
		result = 37 * result + (getNocptBq() == null ? 0 : this.getNocptBq().hashCode());
		return result;
	}

}
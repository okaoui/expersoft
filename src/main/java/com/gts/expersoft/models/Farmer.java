package com.gts.expersoft.models;
// Generated Feb 28, 2018 9:21:27 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.List;

/**
 * FarmerId generated by hbm2java
 */
public class Farmer implements java.io.Serializable {

	private String codFarm;
	private String nomFarm;
	private String adr;
	private String tel;
	private String fax;
	private String codNat;
	private String dnais;
	private String lnais;
	private String datentre;
	private String chemPhoto;
	private String nomP;
	private String nomM;
	private Integer sexe;
	private Integer nbEnfts;
	private Integer nbEpse;
	private String nopiece;
	private String mail;
	private List<Farmsurf> list;

	public Farmer() {
	}

	public Farmer(String codFarm, String nomFarm, String adr, String tel, String fax, String codNat, String dnais,
			String lnais, String datentre, String chemPhoto, String nomP, String nomM, Integer sexe, Integer nbEnfts,
			Integer nbEpse, String nopiece, String mail) {
		this.codFarm = codFarm;
		this.nomFarm = nomFarm;
		this.adr = adr;
		this.tel = tel;
		this.fax = fax;
		this.codNat = codNat;
		this.dnais = dnais;
		this.lnais = lnais;
		this.datentre = datentre;
		this.chemPhoto = chemPhoto;
		this.nomP = nomP;
		this.nomM = nomM;
		this.sexe = sexe;
		this.nbEnfts = nbEnfts;
		this.nbEpse = nbEpse;
		this.nopiece = nopiece;
		this.mail = mail;
	}

	public String getCodFarm() {
		return this.codFarm;
	}

	public void setCodFarm(String codFarm) {
		this.codFarm = codFarm;
	}

	public String getNomFarm() {
		return this.nomFarm;
	}

	public void setNomFarm(String nomFarm) {
		this.nomFarm = nomFarm;
	}

	public String getAdr() {
		return this.adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCodNat() {
		return this.codNat;
	}

	public void setCodNat(String codNat) {
		this.codNat = codNat;
	}

	public String getDnais() {
		return this.dnais;
	}

	public void setDnais(String dnais) {
		this.dnais = dnais;
	}

	public String getLnais() {
		return this.lnais;
	}

	public void setLnais(String lnais) {
		this.lnais = lnais;
	}

	public String getDatentre() {
		return this.datentre;
	}

	public void setDatentre(String datentre) {
		this.datentre = datentre;
	}

	public String getChemPhoto() {
		return this.chemPhoto;
	}

	public void setChemPhoto(String chemPhoto) {
		this.chemPhoto = chemPhoto;
	}

	public String getNomP() {
		return this.nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	public String getNomM() {
		return this.nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public Integer getSexe() {
		return this.sexe;
	}

	public void setSexe(Integer sexe) {
		this.sexe = sexe;
	}

	public Integer getNbEnfts() {
		return this.nbEnfts;
	}

	public void setNbEnfts(Integer nbEnfts) {
		this.nbEnfts = nbEnfts;
	}

	public Integer getNbEpse() {
		return this.nbEpse;
	}

	public void setNbEpse(Integer nbEpse) {
		this.nbEpse = nbEpse;
	}

	public String getNopiece() {
		return this.nopiece;
	}

	public void setNopiece(String nopiece) {
		this.nopiece = nopiece;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Farmsurf> getList() {
		return list;
	}

	public void setList(List<Farmsurf> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Farmer [codFarm=" + codFarm + ", nomFarm=" + nomFarm + ", adr=" + adr + ", tel=" + tel + ", fax=" + fax
				+ ", codNat=" + codNat + ", dnais=" + dnais + ", lnais=" + lnais + ", datentre=" + datentre
				+ ", chemPhoto=" + chemPhoto + ", nomP=" + nomP + ", nomM=" + nomM + ", sexe=" + sexe + ", nbEnfts="
				+ nbEnfts + ", nbEpse=" + nbEpse + ", nopiece=" + nopiece + ", mail=" + mail + "]";
	}

	

}

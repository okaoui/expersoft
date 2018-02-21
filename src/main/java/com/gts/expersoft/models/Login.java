package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * Login generated by hbm2java
 */
public class Login implements java.io.Serializable {

	private Integer id;
	private Utilisateur utilisateur;
	private Date loginDate;

	public Login() {
	}

	public Login(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Login(Utilisateur utilisateur, Date loginDate) {
		this.utilisateur = utilisateur;
		this.loginDate = loginDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getLoginDate() {
		return this.loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

}

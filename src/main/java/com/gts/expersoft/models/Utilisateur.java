package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Utilisateur generated by hbm2java
 */
public class Utilisateur implements java.io.Serializable {

	private Integer id;
	private Profile profile;
	private String nom;
	private String prenom;
	private String matricule;
	private String fonction;
	private String email;
	private String telephone;
	private String login;
	private String password;
	private List<Login> logins = new ArrayList<Login>();

	public Utilisateur() {
	}

	public Utilisateur(Profile profile) {
		this.profile = profile;
	}

	public Utilisateur(Profile profile, String nom, String prenom, String matricule, String fonction, String email,
			String telephone, String login, String password) {
		this.profile = profile;
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.fonction = fonction;
		this.email = email;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getFonction() {
		return this.fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Login> getLogins() {
		return logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	

}

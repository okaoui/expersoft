package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * FournId generated by hbm2java
 */
public class Fourn implements java.io.Serializable {

	private String codFou;
	private String raisonFou;
	private String nocc;
	private String norc;
	private String cptFou;
	private String agrement;
	private String adrFou;
	private String telFou;
	private String faxFou;
	private String obsFou;
	private String vilFou;
	private String paysFou;
	private String telexFou;
	private String mailFou;
	private String codTypf;
	private Integer bic;
	private String codUt;
	private String dateAdd;
	private String dateEdit;
	private String datentre;
	private String nocptBq;
	private String nomBq;

	public Fourn() {
	}

	public Fourn(String codFou, String raisonFou, String nocc, String norc, String cptFou, String agrement,
			String adrFou, String telFou, String faxFou, String obsFou, String vilFou, String paysFou, String telexFou,
			String mailFou, String codTypf, Integer bic, String codUt, String dateAdd, String dateEdit, String datentre,
			String nocptBq, String nomBq) {
		this.codFou = codFou;
		this.raisonFou = raisonFou;
		this.nocc = nocc;
		this.norc = norc;
		this.cptFou = cptFou;
		this.agrement = agrement;
		this.adrFou = adrFou;
		this.telFou = telFou;
		this.faxFou = faxFou;
		this.obsFou = obsFou;
		this.vilFou = vilFou;
		this.paysFou = paysFou;
		this.telexFou = telexFou;
		this.mailFou = mailFou;
		this.codTypf = codTypf;
		this.bic = bic;
		this.codUt = codUt;
		this.dateAdd = dateAdd;
		this.dateEdit = dateEdit;
		this.datentre = datentre;
		this.nocptBq = nocptBq;
		this.nomBq = nomBq;
	}

	public String getCodFou() {
		return this.codFou;
	}

	public void setCodFou(String codFou) {
		this.codFou = codFou;
	}

	public String getRaisonFou() {
		return this.raisonFou;
	}

	public void setRaisonFou(String raisonFou) {
		this.raisonFou = raisonFou;
	}

	public String getNocc() {
		return this.nocc;
	}

	public void setNocc(String nocc) {
		this.nocc = nocc;
	}

	public String getNorc() {
		return this.norc;
	}

	public void setNorc(String norc) {
		this.norc = norc;
	}

	public String getCptFou() {
		return this.cptFou;
	}

	public void setCptFou(String cptFou) {
		this.cptFou = cptFou;
	}

	public String getAgrement() {
		return this.agrement;
	}

	public void setAgrement(String agrement) {
		this.agrement = agrement;
	}

	public String getAdrFou() {
		return this.adrFou;
	}

	public void setAdrFou(String adrFou) {
		this.adrFou = adrFou;
	}

	public String getTelFou() {
		return this.telFou;
	}

	public void setTelFou(String telFou) {
		this.telFou = telFou;
	}

	public String getFaxFou() {
		return this.faxFou;
	}

	public void setFaxFou(String faxFou) {
		this.faxFou = faxFou;
	}

	public String getObsFou() {
		return this.obsFou;
	}

	public void setObsFou(String obsFou) {
		this.obsFou = obsFou;
	}

	public String getVilFou() {
		return this.vilFou;
	}

	public void setVilFou(String vilFou) {
		this.vilFou = vilFou;
	}

	public String getPaysFou() {
		return this.paysFou;
	}

	public void setPaysFou(String paysFou) {
		this.paysFou = paysFou;
	}

	public String getTelexFou() {
		return this.telexFou;
	}

	public void setTelexFou(String telexFou) {
		this.telexFou = telexFou;
	}

	public String getMailFou() {
		return this.mailFou;
	}

	public void setMailFou(String mailFou) {
		this.mailFou = mailFou;
	}

	public String getCodTypf() {
		return this.codTypf;
	}

	public void setCodTypf(String codTypf) {
		this.codTypf = codTypf;
	}

	public Integer getBic() {
		return this.bic;
	}

	public void setBic(Integer bic) {
		this.bic = bic;
	}

	public String getCodUt() {
		return this.codUt;
	}

	public void setCodUt(String codUt) {
		this.codUt = codUt;
	}

	public String getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(String dateAdd) {
		this.dateAdd = dateAdd;
	}

	public String getDateEdit() {
		return this.dateEdit;
	}

	public void setDateEdit(String dateEdit) {
		this.dateEdit = dateEdit;
	}

	public String getDatentre() {
		return this.datentre;
	}

	public void setDatentre(String datentre) {
		this.datentre = datentre;
	}

	public String getNocptBq() {
		return this.nocptBq;
	}

	public void setNocptBq(String nocptBq) {
		this.nocptBq = nocptBq;
	}

	public String getNomBq() {
		return this.nomBq;
	}

	public void setNomBq(String nomBq) {
		this.nomBq = nomBq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Fourn))
			return false;
		Fourn castOther = (Fourn) other;

		return ((this.getCodFou() == castOther.getCodFou()) || (this.getCodFou() != null
				&& castOther.getCodFou() != null && this.getCodFou().equals(castOther.getCodFou())))
				&& ((this.getRaisonFou() == castOther.getRaisonFou()) || (this.getRaisonFou() != null
						&& castOther.getRaisonFou() != null && this.getRaisonFou().equals(castOther.getRaisonFou())))
				&& ((this.getNocc() == castOther.getNocc()) || (this.getNocc() != null && castOther.getNocc() != null
						&& this.getNocc().equals(castOther.getNocc())))
				&& ((this.getNorc() == castOther.getNorc()) || (this.getNorc() != null && castOther.getNorc() != null
						&& this.getNorc().equals(castOther.getNorc())))
				&& ((this.getCptFou() == castOther.getCptFou()) || (this.getCptFou() != null
						&& castOther.getCptFou() != null && this.getCptFou().equals(castOther.getCptFou())))
				&& ((this.getAgrement() == castOther.getAgrement()) || (this.getAgrement() != null
						&& castOther.getAgrement() != null && this.getAgrement().equals(castOther.getAgrement())))
				&& ((this.getAdrFou() == castOther.getAdrFou()) || (this.getAdrFou() != null
						&& castOther.getAdrFou() != null && this.getAdrFou().equals(castOther.getAdrFou())))
				&& ((this.getTelFou() == castOther.getTelFou()) || (this.getTelFou() != null
						&& castOther.getTelFou() != null && this.getTelFou().equals(castOther.getTelFou())))
				&& ((this.getFaxFou() == castOther.getFaxFou()) || (this.getFaxFou() != null
						&& castOther.getFaxFou() != null && this.getFaxFou().equals(castOther.getFaxFou())))
				&& ((this.getObsFou() == castOther.getObsFou()) || (this.getObsFou() != null
						&& castOther.getObsFou() != null && this.getObsFou().equals(castOther.getObsFou())))
				&& ((this.getVilFou() == castOther.getVilFou()) || (this.getVilFou() != null
						&& castOther.getVilFou() != null && this.getVilFou().equals(castOther.getVilFou())))
				&& ((this.getPaysFou() == castOther.getPaysFou()) || (this.getPaysFou() != null
						&& castOther.getPaysFou() != null && this.getPaysFou().equals(castOther.getPaysFou())))
				&& ((this.getTelexFou() == castOther.getTelexFou()) || (this.getTelexFou() != null
						&& castOther.getTelexFou() != null && this.getTelexFou().equals(castOther.getTelexFou())))
				&& ((this.getMailFou() == castOther.getMailFou()) || (this.getMailFou() != null
						&& castOther.getMailFou() != null && this.getMailFou().equals(castOther.getMailFou())))
				&& ((this.getCodTypf() == castOther.getCodTypf()) || (this.getCodTypf() != null
						&& castOther.getCodTypf() != null && this.getCodTypf().equals(castOther.getCodTypf())))
				&& ((this.getBic() == castOther.getBic()) || (this.getBic() != null && castOther.getBic() != null
						&& this.getBic().equals(castOther.getBic())))
				&& ((this.getCodUt() == castOther.getCodUt()) || (this.getCodUt() != null
						&& castOther.getCodUt() != null && this.getCodUt().equals(castOther.getCodUt())))
				&& ((this.getDateAdd() == castOther.getDateAdd()) || (this.getDateAdd() != null
						&& castOther.getDateAdd() != null && this.getDateAdd().equals(castOther.getDateAdd())))
				&& ((this.getDateEdit() == castOther.getDateEdit()) || (this.getDateEdit() != null
						&& castOther.getDateEdit() != null && this.getDateEdit().equals(castOther.getDateEdit())))
				&& ((this.getDatentre() == castOther.getDatentre()) || (this.getDatentre() != null
						&& castOther.getDatentre() != null && this.getDatentre().equals(castOther.getDatentre())))
				&& ((this.getNocptBq() == castOther.getNocptBq()) || (this.getNocptBq() != null
						&& castOther.getNocptBq() != null && this.getNocptBq().equals(castOther.getNocptBq())))
				&& ((this.getNomBq() == castOther.getNomBq()) || (this.getNomBq() != null
						&& castOther.getNomBq() != null && this.getNomBq().equals(castOther.getNomBq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodFou() == null ? 0 : this.getCodFou().hashCode());
		result = 37 * result + (getRaisonFou() == null ? 0 : this.getRaisonFou().hashCode());
		result = 37 * result + (getNocc() == null ? 0 : this.getNocc().hashCode());
		result = 37 * result + (getNorc() == null ? 0 : this.getNorc().hashCode());
		result = 37 * result + (getCptFou() == null ? 0 : this.getCptFou().hashCode());
		result = 37 * result + (getAgrement() == null ? 0 : this.getAgrement().hashCode());
		result = 37 * result + (getAdrFou() == null ? 0 : this.getAdrFou().hashCode());
		result = 37 * result + (getTelFou() == null ? 0 : this.getTelFou().hashCode());
		result = 37 * result + (getFaxFou() == null ? 0 : this.getFaxFou().hashCode());
		result = 37 * result + (getObsFou() == null ? 0 : this.getObsFou().hashCode());
		result = 37 * result + (getVilFou() == null ? 0 : this.getVilFou().hashCode());
		result = 37 * result + (getPaysFou() == null ? 0 : this.getPaysFou().hashCode());
		result = 37 * result + (getTelexFou() == null ? 0 : this.getTelexFou().hashCode());
		result = 37 * result + (getMailFou() == null ? 0 : this.getMailFou().hashCode());
		result = 37 * result + (getCodTypf() == null ? 0 : this.getCodTypf().hashCode());
		result = 37 * result + (getBic() == null ? 0 : this.getBic().hashCode());
		result = 37 * result + (getCodUt() == null ? 0 : this.getCodUt().hashCode());
		result = 37 * result + (getDateAdd() == null ? 0 : this.getDateAdd().hashCode());
		result = 37 * result + (getDateEdit() == null ? 0 : this.getDateEdit().hashCode());
		result = 37 * result + (getDatentre() == null ? 0 : this.getDatentre().hashCode());
		result = 37 * result + (getNocptBq() == null ? 0 : this.getNocptBq().hashCode());
		result = 37 * result + (getNomBq() == null ? 0 : this.getNomBq().hashCode());
		return result;
	}

}

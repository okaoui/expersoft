package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * ClientId generated by hbm2java
 */
public class Client implements java.io.Serializable {

	private String codCli;
	private String raisonCli;
	private String nocc;
	private String norc;
	private String cptCli;
	private String agrement;
	private String adrCli;
	private String telCli;
	private String faxCli;
	private String obsCli;
	private String mailCli;
	private String codTypc;
	private Integer bic;
	private String codUt;
	private String dateAdd;
	private String dateEdit;
	private String datentre;
	private String nocptBq;
	private String nomBq;

	public Client() {
	}

	public Client(String codCli, String raisonCli, String nocc, String norc, String cptCli, String agrement,
			String adrCli, String telCli, String faxCli, String obsCli, String mailCli, String codTypc, Integer bic,
			String codUt, String dateAdd, String dateEdit, String datentre, String nocptBq, String nomBq) {
		this.codCli = codCli;
		this.raisonCli = raisonCli;
		this.nocc = nocc;
		this.norc = norc;
		this.cptCli = cptCli;
		this.agrement = agrement;
		this.adrCli = adrCli;
		this.telCli = telCli;
		this.faxCli = faxCli;
		this.obsCli = obsCli;
		this.mailCli = mailCli;
		this.codTypc = codTypc;
		this.bic = bic;
		this.codUt = codUt;
		this.dateAdd = dateAdd;
		this.dateEdit = dateEdit;
		this.datentre = datentre;
		this.nocptBq = nocptBq;
		this.nomBq = nomBq;
	}

	public String getCodCli() {
		return this.codCli;
	}

	public void setCodCli(String codCli) {
		this.codCli = codCli;
	}

	public String getRaisonCli() {
		return this.raisonCli;
	}

	public void setRaisonCli(String raisonCli) {
		this.raisonCli = raisonCli;
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

	public String getCptCli() {
		return this.cptCli;
	}

	public void setCptCli(String cptCli) {
		this.cptCli = cptCli;
	}

	public String getAgrement() {
		return this.agrement;
	}

	public void setAgrement(String agrement) {
		this.agrement = agrement;
	}

	public String getAdrCli() {
		return this.adrCli;
	}

	public void setAdrCli(String adrCli) {
		this.adrCli = adrCli;
	}

	public String getTelCli() {
		return this.telCli;
	}

	public void setTelCli(String telCli) {
		this.telCli = telCli;
	}

	public String getFaxCli() {
		return this.faxCli;
	}

	public void setFaxCli(String faxCli) {
		this.faxCli = faxCli;
	}

	public String getObsCli() {
		return this.obsCli;
	}

	public void setObsCli(String obsCli) {
		this.obsCli = obsCli;
	}

	public String getMailCli() {
		return this.mailCli;
	}

	public void setMailCli(String mailCli) {
		this.mailCli = mailCli;
	}

	public String getCodTypc() {
		return this.codTypc;
	}

	public void setCodTypc(String codTypc) {
		this.codTypc = codTypc;
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
		if (!(other instanceof Client))
			return false;
		Client castOther = (Client) other;

		return ((this.getCodCli() == castOther.getCodCli()) || (this.getCodCli() != null
				&& castOther.getCodCli() != null && this.getCodCli().equals(castOther.getCodCli())))
				&& ((this.getRaisonCli() == castOther.getRaisonCli()) || (this.getRaisonCli() != null
						&& castOther.getRaisonCli() != null && this.getRaisonCli().equals(castOther.getRaisonCli())))
				&& ((this.getNocc() == castOther.getNocc()) || (this.getNocc() != null && castOther.getNocc() != null
						&& this.getNocc().equals(castOther.getNocc())))
				&& ((this.getNorc() == castOther.getNorc()) || (this.getNorc() != null && castOther.getNorc() != null
						&& this.getNorc().equals(castOther.getNorc())))
				&& ((this.getCptCli() == castOther.getCptCli()) || (this.getCptCli() != null
						&& castOther.getCptCli() != null && this.getCptCli().equals(castOther.getCptCli())))
				&& ((this.getAgrement() == castOther.getAgrement()) || (this.getAgrement() != null
						&& castOther.getAgrement() != null && this.getAgrement().equals(castOther.getAgrement())))
				&& ((this.getAdrCli() == castOther.getAdrCli()) || (this.getAdrCli() != null
						&& castOther.getAdrCli() != null && this.getAdrCli().equals(castOther.getAdrCli())))
				&& ((this.getTelCli() == castOther.getTelCli()) || (this.getTelCli() != null
						&& castOther.getTelCli() != null && this.getTelCli().equals(castOther.getTelCli())))
				&& ((this.getFaxCli() == castOther.getFaxCli()) || (this.getFaxCli() != null
						&& castOther.getFaxCli() != null && this.getFaxCli().equals(castOther.getFaxCli())))
				&& ((this.getObsCli() == castOther.getObsCli()) || (this.getObsCli() != null
						&& castOther.getObsCli() != null && this.getObsCli().equals(castOther.getObsCli())))
				&& ((this.getMailCli() == castOther.getMailCli()) || (this.getMailCli() != null
						&& castOther.getMailCli() != null && this.getMailCli().equals(castOther.getMailCli())))
				&& ((this.getCodTypc() == castOther.getCodTypc()) || (this.getCodTypc() != null
						&& castOther.getCodTypc() != null && this.getCodTypc().equals(castOther.getCodTypc())))
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

		result = 37 * result + (getCodCli() == null ? 0 : this.getCodCli().hashCode());
		result = 37 * result + (getRaisonCli() == null ? 0 : this.getRaisonCli().hashCode());
		result = 37 * result + (getNocc() == null ? 0 : this.getNocc().hashCode());
		result = 37 * result + (getNorc() == null ? 0 : this.getNorc().hashCode());
		result = 37 * result + (getCptCli() == null ? 0 : this.getCptCli().hashCode());
		result = 37 * result + (getAgrement() == null ? 0 : this.getAgrement().hashCode());
		result = 37 * result + (getAdrCli() == null ? 0 : this.getAdrCli().hashCode());
		result = 37 * result + (getTelCli() == null ? 0 : this.getTelCli().hashCode());
		result = 37 * result + (getFaxCli() == null ? 0 : this.getFaxCli().hashCode());
		result = 37 * result + (getObsCli() == null ? 0 : this.getObsCli().hashCode());
		result = 37 * result + (getMailCli() == null ? 0 : this.getMailCli().hashCode());
		result = 37 * result + (getCodTypc() == null ? 0 : this.getCodTypc().hashCode());
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

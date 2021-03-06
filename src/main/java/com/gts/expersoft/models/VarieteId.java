package com.gts.expersoft.models;
// Generated Feb 21, 2018 10:30:28 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * VarieteId generated by hbm2java
 */
public class VarieteId implements java.io.Serializable {

	private String codVar;
	private String libProd;
	private String libVar;
	private String codProd;
	private String abrege;
	private Integer ordre;
	private Integer id;

	public VarieteId() {
	}

	public VarieteId(String codVar, String libProd, String libVar, String codProd, String abrege, Integer ordre,
			Integer id) {
		this.codVar = codVar;
		this.libProd = libProd;
		this.libVar = libVar;
		this.codProd = codProd;
		this.abrege = abrege;
		this.ordre = ordre;
		this.id = id;
	}

	public String getCodVar() {
		return this.codVar;
	}

	public void setCodVar(String codVar) {
		this.codVar = codVar;
	}

	public String getLibProd() {
		return this.libProd;
	}

	public void setLibProd(String libProd) {
		this.libProd = libProd;
	}

	public String getLibVar() {
		return this.libVar;
	}

	public void setLibVar(String libVar) {
		this.libVar = libVar;
	}

	public String getCodProd() {
		return this.codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public String getAbrege() {
		return this.abrege;
	}

	public void setAbrege(String abrege) {
		this.abrege = abrege;
	}

	public Integer getOrdre() {
		return this.ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VarieteId))
			return false;
		VarieteId castOther = (VarieteId) other;

		return ((this.getCodVar() == castOther.getCodVar()) || (this.getCodVar() != null
				&& castOther.getCodVar() != null && this.getCodVar().equals(castOther.getCodVar())))
				&& ((this.getLibProd() == castOther.getLibProd()) || (this.getLibProd() != null
						&& castOther.getLibProd() != null && this.getLibProd().equals(castOther.getLibProd())))
				&& ((this.getLibVar() == castOther.getLibVar()) || (this.getLibVar() != null
						&& castOther.getLibVar() != null && this.getLibVar().equals(castOther.getLibVar())))
				&& ((this.getCodProd() == castOther.getCodProd()) || (this.getCodProd() != null
						&& castOther.getCodProd() != null && this.getCodProd().equals(castOther.getCodProd())))
				&& ((this.getAbrege() == castOther.getAbrege()) || (this.getAbrege() != null
						&& castOther.getAbrege() != null && this.getAbrege().equals(castOther.getAbrege())))
				&& ((this.getOrdre() == castOther.getOrdre()) || (this.getOrdre() != null
						&& castOther.getOrdre() != null && this.getOrdre().equals(castOther.getOrdre())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null
						&& this.getId().equals(castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodVar() == null ? 0 : this.getCodVar().hashCode());
		result = 37 * result + (getLibProd() == null ? 0 : this.getLibProd().hashCode());
		result = 37 * result + (getLibVar() == null ? 0 : this.getLibVar().hashCode());
		result = 37 * result + (getCodProd() == null ? 0 : this.getCodProd().hashCode());
		result = 37 * result + (getAbrege() == null ? 0 : this.getAbrege().hashCode());
		result = 37 * result + (getOrdre() == null ? 0 : this.getOrdre().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}

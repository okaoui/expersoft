package com.gts.expersoft.models;
// Generated Mar 1, 2018 8:44:30 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * VillageId generated by hbm2java
 */
public class Village implements java.io.Serializable {

	private String codVil;
	private String libSpref;
	private String libVil;
	private String codSpref;
	private Double longGps;
	private Double latiGps;

	public Village() {
	}

	public Village(String codVil, String libSpref, String libVil, String codSpref, Double longGps, Double latiGps) {
		this.codVil = codVil;
		this.libSpref = libSpref;
		this.libVil = libVil;
		this.codSpref = codSpref;
		this.longGps = longGps;
		this.latiGps = latiGps;
	}

	public String getCodVil() {
		return this.codVil;
	}

	public void setCodVil(String codVil) {
		this.codVil = codVil;
	}

	public String getLibSpref() {
		return this.libSpref;
	}

	public void setLibSpref(String libSpref) {
		this.libSpref = libSpref;
	}

	public String getLibVil() {
		return this.libVil;
	}

	public void setLibVil(String libVil) {
		this.libVil = libVil;
	}

	public String getCodSpref() {
		return this.codSpref;
	}

	public void setCodSpref(String codSpref) {
		this.codSpref = codSpref;
	}

	public Double getLongGps() {
		return this.longGps;
	}

	public void setLongGps(Double longGps) {
		this.longGps = longGps;
	}

	public Double getLatiGps() {
		return this.latiGps;
	}

	public void setLatiGps(Double latiGps) {
		this.latiGps = latiGps;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Village))
			return false;
		Village castOther = (Village) other;

		return ((this.getCodVil() == castOther.getCodVil()) || (this.getCodVil() != null
				&& castOther.getCodVil() != null && this.getCodVil().equals(castOther.getCodVil())))
				&& ((this.getLibSpref() == castOther.getLibSpref()) || (this.getLibSpref() != null
						&& castOther.getLibSpref() != null && this.getLibSpref().equals(castOther.getLibSpref())))
				&& ((this.getLibVil() == castOther.getLibVil()) || (this.getLibVil() != null
						&& castOther.getLibVil() != null && this.getLibVil().equals(castOther.getLibVil())))
				&& ((this.getCodSpref() == castOther.getCodSpref()) || (this.getCodSpref() != null
						&& castOther.getCodSpref() != null && this.getCodSpref().equals(castOther.getCodSpref())))
				&& ((this.getLongGps() == castOther.getLongGps()) || (this.getLongGps() != null
						&& castOther.getLongGps() != null && this.getLongGps().equals(castOther.getLongGps())))
				&& ((this.getLatiGps() == castOther.getLatiGps()) || (this.getLatiGps() != null
						&& castOther.getLatiGps() != null && this.getLatiGps().equals(castOther.getLatiGps())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodVil() == null ? 0 : this.getCodVil().hashCode());
		result = 37 * result + (getLibSpref() == null ? 0 : this.getLibSpref().hashCode());
		result = 37 * result + (getLibVil() == null ? 0 : this.getLibVil().hashCode());
		result = 37 * result + (getCodSpref() == null ? 0 : this.getCodSpref().hashCode());
		result = 37 * result + (getLongGps() == null ? 0 : this.getLongGps().hashCode());
		result = 37 * result + (getLatiGps() == null ? 0 : this.getLatiGps().hashCode());
		return result;
	}

}

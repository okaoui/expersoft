package com.gts.expersoft.models;
// Generated Mar 9, 2018 3:36:12 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * StationId generated by hbm2java
 */
public class Station implements java.io.Serializable {

	private String codStat;
	private String libStat;
	private String libVil;
	private String codVil;
	private Double longGps;
	private Double latiGps;

	public Station() {
	}

	public Station(String codStat, String libStat, String libVil, String codVil, Double longGps, Double latiGps) {
		this.codStat = codStat;
		this.libStat = libStat;
		this.libVil = libVil;
		this.codVil = codVil;
		this.longGps = longGps;
		this.latiGps = latiGps;
	}

	public String getCodStat() {
		return this.codStat;
	}

	public void setCodStat(String codStat) {
		this.codStat = codStat;
	}

	public String getLibStat() {
		return this.libStat;
	}

	public void setLibStat(String libStat) {
		this.libStat = libStat;
	}

	public String getLibVil() {
		return this.libVil;
	}

	public void setLibVil(String libVil) {
		this.libVil = libVil;
	}

	public String getCodVil() {
		return this.codVil;
	}

	public void setCodVil(String codVil) {
		this.codVil = codVil;
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
		if (!(other instanceof Station))
			return false;
		Station castOther = (Station) other;

		return ((this.getCodStat() == castOther.getCodStat()) || (this.getCodStat() != null
				&& castOther.getCodStat() != null && this.getCodStat().equals(castOther.getCodStat())))
				&& ((this.getLibStat() == castOther.getLibStat()) || (this.getLibStat() != null
						&& castOther.getLibStat() != null && this.getLibStat().equals(castOther.getLibStat())))
				&& ((this.getLibVil() == castOther.getLibVil()) || (this.getLibVil() != null
						&& castOther.getLibVil() != null && this.getLibVil().equals(castOther.getLibVil())))
				&& ((this.getCodVil() == castOther.getCodVil()) || (this.getCodVil() != null
						&& castOther.getCodVil() != null && this.getCodVil().equals(castOther.getCodVil())))
				&& ((this.getLongGps() == castOther.getLongGps()) || (this.getLongGps() != null
						&& castOther.getLongGps() != null && this.getLongGps().equals(castOther.getLongGps())))
				&& ((this.getLatiGps() == castOther.getLatiGps()) || (this.getLatiGps() != null
						&& castOther.getLatiGps() != null && this.getLatiGps().equals(castOther.getLatiGps())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCodStat() == null ? 0 : this.getCodStat().hashCode());
		result = 37 * result + (getLibStat() == null ? 0 : this.getLibStat().hashCode());
		result = 37 * result + (getLibVil() == null ? 0 : this.getLibVil().hashCode());
		result = 37 * result + (getCodVil() == null ? 0 : this.getCodVil().hashCode());
		result = 37 * result + (getLongGps() == null ? 0 : this.getLongGps().hashCode());
		result = 37 * result + (getLatiGps() == null ? 0 : this.getLatiGps().hashCode());
		return result;
	}

}

package com.gts.expersoft.models;
// Generated Mar 9, 2018 3:36:12 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * LbefouId generated by hbm2java
 */
public class Lbefou implements java.io.Serializable {

	private String libCali;
	private Double qte1;
	private Double qte2;
	private Double qte3;
	private Double qteT;
	private Double mt1;
	private Double mt2;
	private Double mt3;
	private Double mtT;
	private Integer nobe;
	private String codCali;
	private Integer num;
	private String ins;
	private Double puQ1;
	private Double puQ2;
	private Double puQ3;
	private Double qteUtil;
	private Double qteRest;

	public Lbefou() {
	}

	public Lbefou(String libCali, Double qte1, Double qte2, Double qte3, Double qteT, Double mt1, Double mt2,
			Double mt3, Double mtT, Integer nobe, String codCali, Integer num, String ins, Double puQ1, Double puQ2,
			Double puQ3, Double qteUtil, Double qteRest) {
		this.libCali = libCali;
		this.qte1 = qte1;
		this.qte2 = qte2;
		this.qte3 = qte3;
		this.qteT = qteT;
		this.mt1 = mt1;
		this.mt2 = mt2;
		this.mt3 = mt3;
		this.mtT = mtT;
		this.nobe = nobe;
		this.codCali = codCali;
		this.num = num;
		this.ins = ins;
		this.puQ1 = puQ1;
		this.puQ2 = puQ2;
		this.puQ3 = puQ3;
		this.qteUtil = qteUtil;
		this.qteRest = qteRest;
	}

	public String getLibCali() {
		return this.libCali;
	}

	public void setLibCali(String libCali) {
		this.libCali = libCali;
	}

	public Double getQte1() {
		return this.qte1;
	}

	public void setQte1(Double qte1) {
		this.qte1 = qte1;
	}

	public Double getQte2() {
		return this.qte2;
	}

	public void setQte2(Double qte2) {
		this.qte2 = qte2;
	}

	public Double getQte3() {
		return this.qte3;
	}

	public void setQte3(Double qte3) {
		this.qte3 = qte3;
	}

	public Double getQteT() {
		return this.qteT;
	}

	public void setQteT(Double qteT) {
		this.qteT = qteT;
	}

	public Double getMt1() {
		return this.mt1;
	}

	public void setMt1(Double mt1) {
		this.mt1 = mt1;
	}

	public Double getMt2() {
		return this.mt2;
	}

	public void setMt2(Double mt2) {
		this.mt2 = mt2;
	}

	public Double getMt3() {
		return this.mt3;
	}

	public void setMt3(Double mt3) {
		this.mt3 = mt3;
	}

	public Double getMtT() {
		return this.mtT;
	}

	public void setMtT(Double mtT) {
		this.mtT = mtT;
	}

	public Integer getNobe() {
		return this.nobe;
	}

	public void setNobe(Integer nobe) {
		this.nobe = nobe;
	}

	public String getCodCali() {
		return this.codCali;
	}

	public void setCodCali(String codCali) {
		this.codCali = codCali;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getIns() {
		return this.ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public Double getPuQ1() {
		return this.puQ1;
	}

	public void setPuQ1(Double puQ1) {
		this.puQ1 = puQ1;
	}

	public Double getPuQ2() {
		return this.puQ2;
	}

	public void setPuQ2(Double puQ2) {
		this.puQ2 = puQ2;
	}

	public Double getPuQ3() {
		return this.puQ3;
	}

	public void setPuQ3(Double puQ3) {
		this.puQ3 = puQ3;
	}

	public Double getQteUtil() {
		return this.qteUtil;
	}

	public void setQteUtil(Double qteUtil) {
		this.qteUtil = qteUtil;
	}

	public Double getQteRest() {
		return this.qteRest;
	}

	public void setQteRest(Double qteRest) {
		this.qteRest = qteRest;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Lbefou))
			return false;
		Lbefou castOther = (Lbefou) other;

		return ((this.getLibCali() == castOther.getLibCali()) || (this.getLibCali() != null
				&& castOther.getLibCali() != null && this.getLibCali().equals(castOther.getLibCali())))
				&& ((this.getQte1() == castOther.getQte1()) || (this.getQte1() != null && castOther.getQte1() != null
						&& this.getQte1().equals(castOther.getQte1())))
				&& ((this.getQte2() == castOther.getQte2()) || (this.getQte2() != null && castOther.getQte2() != null
						&& this.getQte2().equals(castOther.getQte2())))
				&& ((this.getQte3() == castOther.getQte3()) || (this.getQte3() != null && castOther.getQte3() != null
						&& this.getQte3().equals(castOther.getQte3())))
				&& ((this.getQteT() == castOther.getQteT()) || (this.getQteT() != null && castOther.getQteT() != null
						&& this.getQteT().equals(castOther.getQteT())))
				&& ((this.getMt1() == castOther.getMt1()) || (this.getMt1() != null && castOther.getMt1() != null
						&& this.getMt1().equals(castOther.getMt1())))
				&& ((this.getMt2() == castOther.getMt2()) || (this.getMt2() != null && castOther.getMt2() != null
						&& this.getMt2().equals(castOther.getMt2())))
				&& ((this.getMt3() == castOther.getMt3()) || (this.getMt3() != null && castOther.getMt3() != null
						&& this.getMt3().equals(castOther.getMt3())))
				&& ((this.getMtT() == castOther.getMtT()) || (this.getMtT() != null && castOther.getMtT() != null
						&& this.getMtT().equals(castOther.getMtT())))
				&& ((this.getNobe() == castOther.getNobe()) || (this.getNobe() != null && castOther.getNobe() != null
						&& this.getNobe().equals(castOther.getNobe())))
				&& ((this.getCodCali() == castOther.getCodCali()) || (this.getCodCali() != null
						&& castOther.getCodCali() != null && this.getCodCali().equals(castOther.getCodCali())))
				&& ((this.getNum() == castOther.getNum()) || (this.getNum() != null && castOther.getNum() != null
						&& this.getNum().equals(castOther.getNum())))
				&& ((this.getIns() == castOther.getIns()) || (this.getIns() != null && castOther.getIns() != null
						&& this.getIns().equals(castOther.getIns())))
				&& ((this.getPuQ1() == castOther.getPuQ1()) || (this.getPuQ1() != null && castOther.getPuQ1() != null
						&& this.getPuQ1().equals(castOther.getPuQ1())))
				&& ((this.getPuQ2() == castOther.getPuQ2()) || (this.getPuQ2() != null && castOther.getPuQ2() != null
						&& this.getPuQ2().equals(castOther.getPuQ2())))
				&& ((this.getPuQ3() == castOther.getPuQ3()) || (this.getPuQ3() != null && castOther.getPuQ3() != null
						&& this.getPuQ3().equals(castOther.getPuQ3())))
				&& ((this.getQteUtil() == castOther.getQteUtil()) || (this.getQteUtil() != null
						&& castOther.getQteUtil() != null && this.getQteUtil().equals(castOther.getQteUtil())))
				&& ((this.getQteRest() == castOther.getQteRest()) || (this.getQteRest() != null
						&& castOther.getQteRest() != null && this.getQteRest().equals(castOther.getQteRest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getLibCali() == null ? 0 : this.getLibCali().hashCode());
		result = 37 * result + (getQte1() == null ? 0 : this.getQte1().hashCode());
		result = 37 * result + (getQte2() == null ? 0 : this.getQte2().hashCode());
		result = 37 * result + (getQte3() == null ? 0 : this.getQte3().hashCode());
		result = 37 * result + (getQteT() == null ? 0 : this.getQteT().hashCode());
		result = 37 * result + (getMt1() == null ? 0 : this.getMt1().hashCode());
		result = 37 * result + (getMt2() == null ? 0 : this.getMt2().hashCode());
		result = 37 * result + (getMt3() == null ? 0 : this.getMt3().hashCode());
		result = 37 * result + (getMtT() == null ? 0 : this.getMtT().hashCode());
		result = 37 * result + (getNobe() == null ? 0 : this.getNobe().hashCode());
		result = 37 * result + (getCodCali() == null ? 0 : this.getCodCali().hashCode());
		result = 37 * result + (getNum() == null ? 0 : this.getNum().hashCode());
		result = 37 * result + (getIns() == null ? 0 : this.getIns().hashCode());
		result = 37 * result + (getPuQ1() == null ? 0 : this.getPuQ1().hashCode());
		result = 37 * result + (getPuQ2() == null ? 0 : this.getPuQ2().hashCode());
		result = 37 * result + (getPuQ3() == null ? 0 : this.getPuQ3().hashCode());
		result = 37 * result + (getQteUtil() == null ? 0 : this.getQteUtil().hashCode());
		result = 37 * result + (getQteRest() == null ? 0 : this.getQteRest().hashCode());
		return result;
	}

}

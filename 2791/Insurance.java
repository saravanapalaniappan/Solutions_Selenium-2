package com.htc.coreJava4;

public class Insurance {

	private int insuranceId;

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public Insurance(int insuranceId) {
		super();
		this.insuranceId = insuranceId;
	}
	
	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", getInsuranceId()="
				+ getInsuranceId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	
}

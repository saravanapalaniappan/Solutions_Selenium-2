package com.htc.Qsn3;
import java.io.*;

public class Insurance   {
	String insurencename;
	int insurenceId;
	double amount;
	public Insurance(String insurencename, int insurenceId, double amount) {
		super();
		this.insurencename = insurencename;
		this.insurenceId = insurenceId;
		this.amount = amount;
	}
	public String getInsurencename() {
		return insurencename;
	}
	public void setInsurencename(String insurencename) {
		this.insurencename = insurencename;
	}
	public int getInsurenceId() {
		return insurenceId;
	}
	public void setInsurenceId(int insurenceId) {
		this.insurenceId = insurenceId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}

package com.htc.coreJavaExam;

public class ProductNotFoundException extends Exception {

	private String errmsg;

	public ProductNotFoundException(String errmsg) {
		super();
		this.errmsg = errmsg;
	}

	public ProductNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public String getErrmsg() {
		return errmsg;
	}
	
}

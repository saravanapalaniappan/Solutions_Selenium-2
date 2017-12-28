package com.htc.coreJavaExam;

public class InsufficientQuantityException extends Exception {

	private String errmsg;

	public InsufficientQuantityException() {
	}
	
	public InsufficientQuantityException(String errmsg) {
		super();
		this.errmsg = errmsg;
	}

	public String getErrmsg() {
		return errmsg;
	}
	
	
}

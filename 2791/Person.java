package com.htc.coreJava4;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String personName;
	private transient Insurance issId;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String personName, Insurance issId) {
		super();
		this.personName = personName;
		this.issId = issId;
	}

	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Insurance getIssId() {
		return issId;
	}
	public void setIssId(Insurance issId) {
		this.issId = issId;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", issId=" + issId
				+ ", getPersonName()=" + getPersonName() + ", getIssId()="
				+ getIssId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

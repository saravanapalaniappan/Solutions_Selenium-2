package com.htc.Qsn3;

import java.io.Serializable;

public class Person implements Serializable{

	transient Insurance insurence;

	public Insurance getInsurence() {
		return insurence;
	}

	public void setInsurence(Insurance insurence) {
		this.insurence = insurence;
	}

			
	}

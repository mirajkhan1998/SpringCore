package com.ba.bean;

public class Address {
	private int zipCode;
	private String locality;
	private String houseNumber;

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getZipCode() {
		return zipCode;
	}

}

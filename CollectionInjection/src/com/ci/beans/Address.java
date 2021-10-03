package com.ci.beans;

public class Address {
	private String addressLine;
	private int houseNumer;
	private String locality;

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public void setHouseNumer(int houseNumer) {
		this.houseNumer = houseNumer;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", houseNumer=" + houseNumer + ", locality=" + locality + "]";
	}

}

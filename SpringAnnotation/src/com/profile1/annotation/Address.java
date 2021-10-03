package com.profile1.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${addressLine1}")
	private String addressLine1;
	@Value("${addressLine2}")
	private String addressLine2;
	@Value("${city}")
	private String city;
	@Value("${state}")
	private String state;
	@Value("${zip}")
	private int zip;
	@Value("${country}")
	private String country;

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}

}

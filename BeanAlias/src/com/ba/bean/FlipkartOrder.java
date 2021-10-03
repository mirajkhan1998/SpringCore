package com.ba.bean;

import java.util.List;

public class FlipkartOrder {
    List<Product> product;
	Address address;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

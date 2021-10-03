package com.pc.beans;

public class Product {
	private String productId;
	private String productName;
	private String description;
	private Manufacturer manufacturer;
	private double cost;

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	

}

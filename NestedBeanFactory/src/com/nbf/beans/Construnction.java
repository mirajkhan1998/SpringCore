package com.nbf.beans;

public class Construnction {
	private String propertyType;
	private String location;
	private String sqfts;
	private double estimatedCost;

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setSqfts(String sqfts) {
		this.sqfts = sqfts;
	}

	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;

	}

	@Override
	public String toString() {
		return "Construnction [propertyType=" + propertyType + ", location=" + location + ", sqfts=" + sqfts
				+ ", estimatedCost=" + estimatedCost + "]";
	}
}

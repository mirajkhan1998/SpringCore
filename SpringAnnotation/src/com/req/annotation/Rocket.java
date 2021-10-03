package com.req.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Rocket {
	private String rocketNo;
	private int fuelCapacity;
	private String rocketType;

	public void setRocketNo(String rocketNo) {
		this.rocketNo = rocketNo;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
    @Required
	public void setRocketType(String rocketType) {
		this.rocketType = rocketType;
	}

	@Override
	public String toString() {
		return "Rocket [rocketNo=" + rocketNo + ", fuelCapacity=" + fuelCapacity + ", rocketType=" + rocketType + "]";
	}
	

}

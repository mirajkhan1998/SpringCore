package com.stereo.annotation;


public class Rocket {
	private String rocketNo;
	private int fuelCapacity;

	public void setRocketNo(String rocketNo) {
		this.rocketNo = rocketNo;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public String toString() {
		return "Rocket [rocketNo=" + rocketNo + ", fuelCapacity=" + fuelCapacity + "]";
	}

}

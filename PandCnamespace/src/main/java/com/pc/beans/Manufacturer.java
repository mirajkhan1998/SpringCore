package com.pc.beans;

public class Manufacturer {
	private String manufactureName;

	public Manufacturer(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	@Override
	public String toString() {
		return "Manufacturer [manufactureName=" + manufactureName + "]";
	}

}

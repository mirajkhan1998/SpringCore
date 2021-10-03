package com.autowrite.annotation;

public class Reciever {
	private String band;
	public int frequency;

	public void setBand(String band) {
		this.band = band;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Reciever [band=" + band + ", frequency=" + frequency + "]";
	}

}

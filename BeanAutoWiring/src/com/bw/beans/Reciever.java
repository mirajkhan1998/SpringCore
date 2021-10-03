package com.bw.beans;

public class Reciever {
	private double frequency;
	private String band;

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return "Reciever [frequency=" + frequency + ", band=" + band + "]";
	}
}

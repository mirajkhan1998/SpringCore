package com.javaanno.annotation;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named
public class Reciever {
	@Value("AM")
	private String band;
	@Value("radio")
	private String signalType;
    
	public void setBand(String band) {
		this.band = band;
	}

	public void setSignalType(String signalType) {
		this.signalType = signalType;
	}

	@Override
	public String toString() {
		return "Reciever [band=" + band + ", signalType=" + signalType + "]";
	}

}

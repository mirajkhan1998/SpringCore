package com.bw.beans;

public class Radio {
	Reciever reciever;

	public void setReciever(Reciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + "]";
	}
	
}

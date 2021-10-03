package com.primary.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	private Reciever reciever;
	private Reciever reciever1;

	@Autowired
	public void setReciever(Reciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + "]";
	}

}

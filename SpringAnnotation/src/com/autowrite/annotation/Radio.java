package com.autowrite.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Radio {
	private Reciever reciever;
	private NoiseController controller;

	@Autowired
	public void setReciever(Reciever reciever) {
		this.reciever = reciever;
	}
	Radio(){
		
	}
	@Autowired(required=false)
	Radio(NoiseController controller){
		this.controller=controller;
	}
	@Autowired(required = false)
	public Radio(Reciever reciever, NoiseController controller) {
		this.reciever = reciever;
		this.controller = controller;
	}
	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + "]";
	}

}

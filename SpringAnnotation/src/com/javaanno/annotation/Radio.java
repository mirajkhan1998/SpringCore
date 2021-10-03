package com.javaanno.annotation;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Radio {
	private Reciever reciever;
	private Reciever reciver1;

	@Inject
	@Resource()
	public void setReciever(Reciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + ", reciver1=" + reciver1 + "]";
	}

}

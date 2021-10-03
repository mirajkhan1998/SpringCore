package com.qualifier.annotation;

public class Engine {
	private int mode;
	private String type;

	public void setMode(int mode) {
		this.mode = mode;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [mode=" + mode + ", type=" + type + "]";
	}
	

}

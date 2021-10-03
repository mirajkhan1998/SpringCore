package com.nbf.beans;

public class A {
    B b;

	public void setB(B b) {
		this.b = b;
	}
    public String showMessage() {
    	String message=b.getMessage();
    	return message;
    }
}

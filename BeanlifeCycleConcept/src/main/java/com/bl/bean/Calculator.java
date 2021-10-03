package com.bl.bean;

public class Calculator {
	private int a;
	private int b;
	private int sum;

	public Calculator(int a) {
		this.a = a;
		// this.sum=a+b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void init() {
		System.out.println("init()");
		this.sum = this.a + this.b;
	}

	public void destroy() {
		System.out.println("destroy()");
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}

}

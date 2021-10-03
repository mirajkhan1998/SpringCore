package com.blp.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Calculator implements InitializingBean, DisposableBean {
	private int num1;
	private int num2;
	private int sum;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public Calculator(int num2) {
		this.num2 = num2;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		this.sum = this.num1 + this.num2;

	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", sum=" + sum + "]";
	}

}

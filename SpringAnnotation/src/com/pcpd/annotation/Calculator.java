package com.pcpd.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/pcpd/annotation/calculator.properties")
public class Calculator {
	private int a;
	@Value("${b}")
	private int b;
	private int sum;
	public Calculator(@Value("${a}") int a) {
		super();
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	@PostConstruct
	public void init() {
		System.out.println("init()");
		this.sum=this.a+this.b;
		//System.out.println(sum);
	}
	@PreDestroy
	public void release() {
		System.out.println("realeased()");
	}

	public int getSum() {
		return sum;
	}

}

package com.value.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/value/annotation/applicationValue.properties")
public class Rectangle {
	//@Value("#{appvalue.length}")
	@Value("${length}")
	private int length;
	//@Value("#{appvalue.breath}")
	@Value("${breath}")
	private int breath;

	public void setLength(int length) {
		this.length = length;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

}

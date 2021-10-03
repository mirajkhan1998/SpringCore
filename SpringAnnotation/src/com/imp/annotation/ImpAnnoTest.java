package com.imp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImpAnnoTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		Passenger passenger = context.getBean("passenger", Passenger.class);
		System.out.println(passenger);
	}

}

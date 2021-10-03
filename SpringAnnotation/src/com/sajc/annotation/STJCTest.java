package com.sajc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class STJCTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Policy policy = context.getBean("policy", Policy.class);
		System.out.println(policy);

	}

}

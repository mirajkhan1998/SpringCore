package com.primary.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryAnnoTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.primary.annotation");
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);
	}

}

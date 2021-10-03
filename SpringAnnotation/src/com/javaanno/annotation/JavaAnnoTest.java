package com.javaanno.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnoTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.javaanno.annotation");
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);

	}
}

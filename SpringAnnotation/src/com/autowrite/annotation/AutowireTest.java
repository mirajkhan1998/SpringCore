package com.autowrite.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/autowrite/annotation/autowire-annotation.xml");
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);
	}

}

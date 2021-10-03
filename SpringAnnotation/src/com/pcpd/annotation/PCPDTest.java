package com.pcpd.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PCPDTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.pcpd.annotation");
		Calculator cal = context.getBean("calculator", Calculator.class);
		System.out.println(cal.getSum());
		((ConfigurableApplicationContext) context).registerShutdownHook();
	}
}

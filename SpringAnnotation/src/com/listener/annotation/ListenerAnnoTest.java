package com.listener.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ListenerAnnoTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.listener.annotation");
		CityService service=context.getBean("cityService", CityService.class);
		service.addCity("c11", "hyderabad");
	}

}

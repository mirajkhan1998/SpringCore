package com.req.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RocketTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/req/annotation/req-anno.xml");
		Rocket rocket = context.getBean("rocket", Rocket.class);
		System.out.println(rocket);

	}

}

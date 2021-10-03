package com.profile.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileAnnoTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext();
		((ConfigurableApplicationContext)context).getEnvironment().setActiveProfiles("test");
		((AnnotationConfigApplicationContext)context).register(TestConfig.class);
		((ConfigurableApplicationContext)context).refresh();
		ConnectionFactory factory=context.getBean("factory", ConnectionFactory.class);
		System.out.println(factory);
	}

}

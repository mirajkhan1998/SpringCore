package com.value.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAnnoTest {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/value/annotation/value-anno.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext("com.value.annotation");
		Rectangle rectangle=context.getBean("rectangle", Rectangle.class);
		System.out.println(rectangle);

	}

}

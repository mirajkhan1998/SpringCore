package com.scope.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnoTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/scope/annotation/scope-anno.xml");
		Rectangle rectangle1=context.getBean("rectangle", Rectangle.class);
		Rectangle rectangle2=context.getBean("rectangle", Rectangle.class);
		System.out.println(rectangle1==rectangle2);
		

	}

}

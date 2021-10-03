package com.dependon.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DpOnTest {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/dependon/annotation/depend-anno.xml");
         ApplicationContext context=new AnnotationConfigApplicationContext("com.dependon.annotation");
	}

}

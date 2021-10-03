package com.impresource.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImpResourceTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerJavaConfig.class);
		Parcel parcel = context.getBean("parcel", Parcel.class);
		System.out.println(parcel);

	}

}

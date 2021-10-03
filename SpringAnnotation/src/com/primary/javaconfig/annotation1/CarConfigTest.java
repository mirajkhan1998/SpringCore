package com.primary.javaconfig.annotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarConfigTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
		Car car=context.getBean("car",Car.class);
		car.derive();
		System.out.println(car);
	}

}

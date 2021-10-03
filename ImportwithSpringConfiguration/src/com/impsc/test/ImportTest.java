package com.impsc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.impsc.bean.Passenger;

public class ImportTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/impsc/common/journey-config.xml");
		Passenger passenger=context.getBean("passenger", Passenger.class);
		System.out.println(passenger);
	}

}

package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.bean.CityService;

public class EventProcessingTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ep/common/application-context.xml");
		CityService cityService = context.getBean("cityService", CityService.class);
		cityService.addCity("c100", "hyd");
	}

}

package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ai.bean.Car;

@SuppressWarnings("deprecation")
public class AwareTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ai/common/application-context.xml"));
		Car car = beanFactory.getBean("car", Car.class);
		car.drive();
		// System.out.println(beanFactory);

	}

}

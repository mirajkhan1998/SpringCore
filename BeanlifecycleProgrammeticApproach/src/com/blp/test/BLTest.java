package com.blp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blp.bean.Calculator;

public class BLTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/blp/common/application-context.xml"));
		Calculator calculator = (Calculator) beanFactory.getBean("calculator", Calculator.class);
		System.out.println(calculator);
		((ConfigurableListableBeanFactory) beanFactory).destroySingletons();

	}

}

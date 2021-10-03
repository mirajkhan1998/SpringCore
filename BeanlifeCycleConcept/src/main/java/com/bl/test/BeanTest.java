package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.bean.Calculator;
@SuppressWarnings("deprecation")
public class BeanTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/bl/common/application-context.xml"));
		Calculator calculator=beanFactory.getBean("calculator", Calculator.class);
		System.out.println(calculator);
        ((ConfigurableListableBeanFactory)beanFactory).destroySingletons();
	}

}

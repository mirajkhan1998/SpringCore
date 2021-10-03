package com.ba.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.bean.Address;
import com.ba.bean.FlipkartOrderService;
import com.ba.bean.Product;

public class BalTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/ba/commons/application-context.xml"));
		FlipkartOrderService flipkartOrderService=beanFactory.getBean("flipkartOrderService", FlipkartOrderService.class);
		System.out.println(flipkartOrderService.placefOrder());
	}
}

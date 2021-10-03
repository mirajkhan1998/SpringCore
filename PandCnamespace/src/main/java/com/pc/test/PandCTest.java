package com.pc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pc.beans.Product;

@SuppressWarnings("deprecation")
public class PandCTest {

	public static void main(String[] args) {
	  BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/pc/common/application-context.xml"));
	  Product product=beanFactory.getBean("product", Product.class);
	  System.out.println(product);

	}

}

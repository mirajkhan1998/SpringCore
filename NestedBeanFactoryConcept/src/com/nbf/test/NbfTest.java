package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.A;

public class NbfTest {
	public static void main(String[] args) {
		BeanFactory parentFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/common/parent-bean.xml"));
		BeanFactory childFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/common/child-bean.xml"),parentFactory);
		A a = childFactory.getBean("a", A.class);
		System.out.println(a.showMessage());
	}
}

package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.A;

@SuppressWarnings("deprecation")
public class BATest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		A a = beanFactory.getBean("a,a2", A.class);
		System.out.println(a.showMessage());
	}
}
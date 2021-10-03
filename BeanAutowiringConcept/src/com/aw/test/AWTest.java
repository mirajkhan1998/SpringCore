package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.A;

public class AWTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/aw/common/application-context.xml"));
		A a = beanFactory.getBean("a", A.class);
		System.out.println(a.showMessage());
	}

}

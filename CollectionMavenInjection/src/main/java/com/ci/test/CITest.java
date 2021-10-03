package com.ci.test;

import java.util.Collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.CollectionDemo;

public class CITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ci/common/application-context.xml"));
		CollectionDemo demo = beanFactory.getBean("cdemo", CollectionDemo.class);
		System.out.println(demo);
	}

}

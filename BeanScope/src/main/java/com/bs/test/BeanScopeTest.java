package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.bean.Machine;

@SuppressWarnings("deprecation")
public class BeanScopeTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/bs/common/application-context.xml"));
		Machine machine1 = beanFactory.getBean("machine", Machine.class);
		Machine machine2 = beanFactory.getBean("machine", Machine.class);
		System.out.println("machine1==machine2?:" + (machine1 == machine2));

	}

}

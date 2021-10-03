package com.si.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.beans.MessageWriter;

public class SITest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/si/commons/application-context.xml"));
		MessageWriter messageWriter=beanFactory.getBean("messageWriter", MessageWriter.class);
		messageWriter.writeMessage("welcome to Sping");

	}

}

package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Contract;

public class NbfTest {

	public static void main(String[] args) {
		BeanFactory parentFactory=new XmlBeanFactory(new ClassPathResource("com/nbf/common/parent-context.xml"));
		BeanFactory childFactory=new XmlBeanFactory(new ClassPathResource("com/nbf/common/child-context.xml"),parentFactory);
		Contract contract=childFactory.getBean("contract", Contract.class);
		System.out.println(contract);

	}

}

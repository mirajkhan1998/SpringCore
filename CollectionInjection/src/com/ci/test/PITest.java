package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.Student;

public class PITest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/ci/commons/application-context.xml"));
		Student student=beanFactory.getBean("student", Student.class);
        System.out.println(student);
	}

}

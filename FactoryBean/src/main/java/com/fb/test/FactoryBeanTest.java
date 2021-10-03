package com.fb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fb.beans.Reminder;

@SuppressWarnings("deprecation")
public class FactoryBeanTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/fb/common/application-context.xml"));
		Reminder reminder=beanFactory.getBean("reminder", Reminder.class);
		System.out.println(reminder);

	}

}

package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Rocket;
import com.bpp.util.InstanceTracker;

public class BeanPostProcessorTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));
		BeanPostProcessor bpp=factory.getBean("instanceTrackerBeanPostProcessor", BeanPostProcessor.class);
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp);
		Rocket rocket=factory.getBean("rocket", Rocket.class);
		System.out.println("Instance:"+InstanceTracker.getInstances());
	}

}

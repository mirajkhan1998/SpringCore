package com.bfpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.bean.ConnectionHelper;

public class BFPPTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bfpp/common/application-context.xml"));
		//ConnectionHelper con = (ConnectionHelper) factory.getBean("conhelper", ConnectionHelper.class);
		//System.out.println(con);
		BeanFactoryPostProcessor processor=factory.getBean("bfpp",BeanFactoryPostProcessor.class);
		processor.postProcessBeanFactory((ConfigurableListableBeanFactory)factory);
		ConnectionHelper con=factory.getBean("conhelper", ConnectionHelper.class);
		System.out.println(con);
	}

}

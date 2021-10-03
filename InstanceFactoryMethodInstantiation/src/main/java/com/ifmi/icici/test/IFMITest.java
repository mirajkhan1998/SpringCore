package com.ifmi.icici.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifmi.icici.beans.StockManager;

@SuppressWarnings("deprecation")
public class IFMITest {

	public static void main(String[] args) {
		double stockPrice = 0;
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ifmi/common/application-context.xml"));
		StockManager stockManager = beanFactory.getBean("stockManager", StockManager.class);
		stockPrice = stockManager.getStockPrice("cipla");
		System.out.println("stockPrice:" + stockPrice);

	}
}

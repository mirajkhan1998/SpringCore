package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.bean.InsuranceService;

public class MethodReplacementTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		InsuranceService is = factory.getBean("insuranceService", InsuranceService.class);
		double premiumAmount = is.estimatePremiumAmount("PL1", 1020000, 12, 25, "male");
		System.out.println("EstimatePremiumAmount:" + premiumAmount);

	}

}

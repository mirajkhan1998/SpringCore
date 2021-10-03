package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.bean.InsuranceService;

public class MethodReplacement {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
        InsuranceService service=beanFactory.getBean("insuranceService", InsuranceService.class);
        double amount=service.estimatePremiumAmount("p001", 2, 2000, 20, "male");
        System.out.println(amount);
	}

}

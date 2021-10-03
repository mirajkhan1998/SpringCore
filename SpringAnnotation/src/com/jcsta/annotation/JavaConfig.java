package com.jcsta.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.jcsta.annotation")
public class JavaConfig {
	@Autowired
	Environment env;

	@Bean(autowire = Autowire.BY_NAME)
	public Policy policy() {
		Policy policy = new Policy();
		policy.setAge(Integer.parseInt(env.getProperty("age")));
		policy.setPolicyNo(env.getProperty("policyno"));
		policy.setTenure(Integer.parseInt(env.getProperty("tenure")));
		return policy;
	}

}

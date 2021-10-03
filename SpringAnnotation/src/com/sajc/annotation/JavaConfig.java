package com.sajc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/sajc/annotation/application.properties")
@ComponentScan(basePackages = "com.sajc.annotation")
public class JavaConfig {
	@Autowired
	Environment env;
	@Bean
	public Member member() {
		Member member=new Member();
		member.setPolicyHolderName(env.getProperty("policyholdername"));
		member.setUniqueNo(env.getProperty("uniqueno"));
		return member;
	}

}

package com.impresource.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/impresource/annotation/customer.properties")
@ComponentScan(basePackages = "com.impresource.annotation")
@ImportResource(locations = {"com/impresource/annotation/delivery-info.xml"})
public class CustomerJavaConfig {
	@Autowired
	private Environment env;

	@Bean
	public Customer customer() {
		Customer customer = new Customer();
		customer.setAge(Integer.parseInt(env.getProperty("age")));
		customer.setCustomerName(env.getProperty("customerName"));
		customer.setGender(env.getProperty("gender"));
		return customer;
	}
}

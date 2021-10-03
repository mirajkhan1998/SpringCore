package com.javaconfig.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	/**I can also use here like this for your choice name as beanName like this @Bean(name="car1") 
	 * we can also use beanAliasing like this @Bean{name={"car1","car2"}}*/
	@Bean(name = {"car","car1","car2"})
	public Car car() {
		return new Car();
	}

}

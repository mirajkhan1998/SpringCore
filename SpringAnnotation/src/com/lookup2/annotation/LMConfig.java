package com.lookup2.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lookup2.annotation")
public class LMConfig {
	@Autowired
	ApplicationContext context;
    @Bean
	public Launcher launcher() {
		return new Launcher() {

			@Override
			public Rocket getRocket() {
				return context.getBean("rocket", Rocket.class);
			}

		};

	}

}

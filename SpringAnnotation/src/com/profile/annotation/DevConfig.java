package com.profile.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/profile/annotation/dev-db.properties")
@Profile("dev")
public class DevConfig {
	@Autowired
	private Environment env;

	@Bean(name = { "factory" })
	public ConnectionFactory factory() {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setDriverClass(env.getProperty("driverClass"));
		factory.setUrl(env.getProperty("url"));
		factory.setUsername(env.getProperty("username"));
		factory.setPassword(env.getProperty("password"));
		return factory;
	}

}

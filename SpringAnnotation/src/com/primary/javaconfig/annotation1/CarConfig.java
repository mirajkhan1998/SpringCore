package com.primary.javaconfig.annotation1;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/primary/javaconfig/annotation1/engineProp.properties")
public class CarConfig {
	@Autowired
	Environment env;

	@Bean(autowire = Autowire.BY_TYPE)
	public Car car() {
		return new Car();
	}

	@Bean(name = "engine2")
	@Primary
	public Engine engine2() {
		Engine engine = new Engine();
		engine.setEngineNo(env.getProperty("engine_no"));
		engine.setEngineType(env.getProperty("engine_type"));
		return engine;
	}

	@Bean(name = "engine1")
	public Engine engine1() {
		Engine engine = new Engine();
		engine.setEngineNo(env.getProperty("engine_no"));
		engine.setEngineType(env.getProperty("engine_type"));
		return engine;
	}

}

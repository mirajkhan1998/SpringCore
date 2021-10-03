package com.imp.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/imp/annotation/passenger.properties")
public class PassengerConfig {
	@Autowired
	private Environment env;

	@Bean(autowire = Autowire.BY_TYPE)
	public Passenger passenger() {
		Passenger passenger = new Passenger();
		passenger.setPassengerName(env.getProperty("passengerName"));
		passenger.setAge(Integer.parseInt(env.getProperty("age")));
		passenger.setGender(env.getProperty("gender"));
		return passenger;
	}

}

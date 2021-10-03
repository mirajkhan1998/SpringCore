package com.imp.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/imp/annotation/ticket.properties")
public class TicketConfig {
	@Autowired
	private Environment env;

	@Bean
	public Ticket ticket() {
		Ticket ticket = new Ticket();
		ticket.setTicketNo(Integer.parseInt(env.getProperty("ticketNo")));
		ticket.setSource("hyderabd");
		ticket.setDestination("pune");
		return ticket;
	}

}

package com.imp.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { TicketConfig.class, PassengerConfig.class })
public class RootConfig {

}

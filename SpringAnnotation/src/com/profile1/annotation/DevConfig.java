package com.profile1.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profile1/annotation/branch-dev.properties")
@Profile("dev")
@Import(CommonConfig.class)
public class DevConfig {
	

}

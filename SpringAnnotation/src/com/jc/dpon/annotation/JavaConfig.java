package com.jc.dpon.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class JavaConfig {
	@Bean
	@DependsOn("cacheManager")
	public LoanManager loanManager() {
		return new LoanManager();
	}
    @Bean
	public CacheManager cacheManager() {
		return new CacheManager();
	}
}

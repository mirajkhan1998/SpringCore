package com.profile1.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { DevConfig.class, TestConfig.class })
public class RootConfig {

}

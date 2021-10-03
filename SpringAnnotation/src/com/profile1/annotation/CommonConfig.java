package com.profile1.annotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = { "com.profile1.annotation" })
public class CommonConfig {
	@Autowired
	protected Environment env;

	@Bean(autowire = Autowire.BY_TYPE)
	public Branch branch() {
		Branch branch = new Branch();
		branch.setBranchName(env.getProperty("branchName"));
		branch.setBranchNo(Integer.parseInt(env.getProperty("branchNo")));
		return branch;
	}

}

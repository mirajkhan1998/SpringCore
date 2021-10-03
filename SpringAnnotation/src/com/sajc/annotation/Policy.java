package com.sajc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//source code Available
@Component
@PropertySource("classpath:com/sajc/annotation/application.properties")
public class Policy {
	@Value("${policyno}")
	private String policyNo;
	@Value("${tenure}")
	private int tenure;
	@Value("${age}")
	private int age;
	Member member;

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Autowired
	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", tenure=" + tenure + ", age=" + age + ", member=" + member + "]";
	}
	

}

package com.jcsta.annotation;

import org.springframework.stereotype.Component;

//no source code
@Component
public class Policy {
	private String policyNo;
	private int tenure;
	private int age;
    private Member member;
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", tenure=" + tenure + ", age=" + age + ", member=" + member + "]";
	}


}

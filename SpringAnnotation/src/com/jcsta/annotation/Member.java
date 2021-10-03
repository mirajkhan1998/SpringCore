package com.jcsta.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/jcsta/annotation/application.properties")
public class Member {
	@Value("${uniqueno}")
	private String uniqueNo;
	@Value("${policyholdername}")
	private String policyHolderName;

	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	@Override
	public String toString() {
		return "Member [uniqueNo=" + uniqueNo + ", policyHolderName=" + policyHolderName + "]";
	}
	

}

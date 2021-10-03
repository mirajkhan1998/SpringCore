package com.sajc.annotation;

//no sourceCode
public class Member {
	private String uniqueNo;
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

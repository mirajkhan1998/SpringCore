package com.profile1.annotation;
//no source code
public class Branch {
	private int branchNo;
	private String branchName;
	private Address address;

	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", address=" + address + "]";
	}

}

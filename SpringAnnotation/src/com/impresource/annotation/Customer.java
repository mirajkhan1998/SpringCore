package com.impresource.annotation;

//no source code
//javaConfiguration approach
public class Customer {
	private String customerName;
	private int age;
	private String gender;

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", age=" + age + ", gender=" + gender + "]";
	}

}

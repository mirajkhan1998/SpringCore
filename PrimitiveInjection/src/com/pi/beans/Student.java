package com.pi.beans;

 public class Student {
     private int rollNo;
     private String name;
     private float fee;
	public  void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fee=" + fee + "]";
	}
	
	
	
     
}

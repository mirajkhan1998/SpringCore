package com.ci.beans;

import java.util.List;
import java.util.Set;

public class Student {
	private String name;
	private int roll;
	private List<String> courses;
	private Set<Address> address;

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", courses=" + courses + " , Address=" + address + "]";
	}

}

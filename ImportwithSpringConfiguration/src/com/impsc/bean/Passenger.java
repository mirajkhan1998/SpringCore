package com.impsc.bean;

public class Passenger {
	private String passengerName;
	private int age;
	private String gender;
	private Ticket ticket;

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", age=" + age + ", gender=" + gender + ", ticket="
				+ ticket + "]";
	}

}

package com.impsc.bean;

public class Ticket {
	private int ticketNo;
	private String source;
	private String destination;

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", source=" + source + ", destination=" + destination + "]";
	}

}

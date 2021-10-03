package com.nbf.beans;

import java.util.Date;

public class Contract {
	private String builderName;
	private Date date;
	private int days;
	private Construnction construnction;

	public Contract(Construnction construnction) {
		this.construnction = construnction;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Contract [builderName=" + builderName + ", date=" + date + ", days=" + days + ", construnction="
				+ construnction + "]";
	}

}

package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
	private int year;
	private int month;
	private int day;

	public CalendarFactoryBean(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Calendar getObject() throws Exception {
		Calendar cal = null;
		cal = Calendar.getInstance();
		cal.set(year, month, day);
		return cal;
	}

	@Override
	public Class<Calendar> getObjectType() {
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {

		return true;
	}

}

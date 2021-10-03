package com.fb.beans;

import java.util.Calendar;

public class Reminder {
	private String reminderName;
	private Calendar reminderDate;
	private String note;

	public Reminder(String reminderName, Calendar reminderDate) {
		this.reminderName = reminderName;
		this.reminderDate = reminderDate;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Reminder [reminderName=" + reminderName + ", reminderDate=" + reminderDate + ", note=" + note + "]";
	}

}

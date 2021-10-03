package com.sfmi.beans;

import java.util.Calendar;

public class Reminder {
	private String eventName;
	private Calendar eventTime;
	private String eventNotes;

	public Reminder(String eventName, Calendar eventTime) {
		this.eventName = eventName;
		this.eventTime = eventTime;
	}

	public void setEventNotes(String eventNotes) {
		this.eventNotes = eventNotes;
	}

	@Override
	public String toString() {
		return "Reminder [eventName=" + eventName + ", eventTime=" + eventTime + ", eventNotes=" + eventNotes + "]";
	}

}

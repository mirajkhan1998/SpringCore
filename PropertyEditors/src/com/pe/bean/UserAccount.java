package com.pe.bean;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class UserAccount {
	private String userName;
	private Date dob;
	private URL url;
	private String[] marks;
	private File photo;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public void setMarks(String[] marks) {
		this.marks = marks;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserAccount [userName=" + userName + ", dob=" + dob + ", url=" + url + ", marks="
				+ Arrays.toString(marks) + ", photo=" + photo + "]";
	}

	

}

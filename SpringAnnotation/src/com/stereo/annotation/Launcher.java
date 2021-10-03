package com.stereo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "rocket1")
public class Launcher {
	private Rocket rocket;

	@Autowired
	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}
	public Launcher() {
		System.out.println("Launcher called");
	}

	@Override
	public String toString() {
		return "Launcher [rocket=" + rocket + "]";
	}

}

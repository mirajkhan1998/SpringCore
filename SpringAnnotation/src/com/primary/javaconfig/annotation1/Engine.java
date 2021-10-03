package com.primary.javaconfig.annotation1;

import org.springframework.beans.factory.annotation.Value;

//no source code
public class Engine {
	private String engineType;
	private String engineNo;

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void start() {
		System.out.println("engine started");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", engineNo=" + engineNo + "]";
	}

}

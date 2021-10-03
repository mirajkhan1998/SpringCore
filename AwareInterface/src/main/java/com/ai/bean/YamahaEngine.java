package com.ai.bean;

public class YamahaEngine implements IEngine {

	@Override
	public boolean ignite() {
		System.out.println("Started....");
		return true;
	}

}

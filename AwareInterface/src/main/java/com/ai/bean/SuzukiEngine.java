package com.ai.bean;

public class SuzukiEngine implements IEngine {

	@Override
	public boolean ignite() {
		System.out.println("Started....");
		return true;
	}

}

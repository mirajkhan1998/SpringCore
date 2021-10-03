package com.ep.bean;

import org.springframework.context.ApplicationListener;

public class ReloadEventListener implements ApplicationListener<ReloadEvent> {

	@Override
	public void onApplicationEvent(ReloadEvent event) {
		System.out.println("calling cacheManager to ReloadCache");

	}

}

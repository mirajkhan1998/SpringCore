package com.listener.annotation;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class ReloadEventListener {
	@EventListener
	public void onReloadEvent(ReloadEvent event) {
		System.out.println("cache is loaded");
	}

}

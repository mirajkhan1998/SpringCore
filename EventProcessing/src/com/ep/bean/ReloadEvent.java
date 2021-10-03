package com.ep.bean;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent {

	public ReloadEvent(Object event) {
		super(event);
	}

}

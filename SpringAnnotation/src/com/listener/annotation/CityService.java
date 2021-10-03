package com.listener.annotation;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
@Component
public class CityService implements ApplicationEventPublisherAware {
	ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;

	}

	public void addCity(String id, String name) {
		System.out.println("city added");
		ReloadEvent event = new ReloadEvent(this);
		publisher.publishEvent(event);

	}

}

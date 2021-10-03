package com.ep.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CityService implements ApplicationEventPublisherAware {
	ApplicationEventPublisher publisher;

	public void addCity(String cityID, String cityName) {
		System.out.println("city Added");
		ReloadEvent event=new ReloadEvent(this);
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}

}

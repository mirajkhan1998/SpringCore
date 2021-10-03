package com.lookup.annotation;
//

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
abstract public class Launcher {
	private Rocket rocket;
	/*@Autowired
	private ApplicationContext context;*/
	public void launch() {
		rocket=getRocket();
		rocket.fire();
		System.out.println(rocket.hashCode());
	}
	/*@Autowired
	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}*/
	@Lookup
	public abstract Rocket getRocket() ;
	

}

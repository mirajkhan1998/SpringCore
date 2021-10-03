package com.lm.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

abstract public class Launcher {
	private Rocket rocket;
	//private BeanFactory factory;
    /*public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}*/
   /**I am becoming tightly coupled with spring framewotk classes */ 
	public abstract Rocket getRocket();
	public void launch() {
		rocket=getRocket();
    	//rocket=factory.getBean("rocket", Rocket.class);
    	rocket.fire();
    	System.out.println(rocket.hashCode());
    }

	/*@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory=factory;
		
	}*/
	
}

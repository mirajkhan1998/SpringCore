package com.lookup2.annotation;
//no source code
abstract public class Launcher {
	Rocket rocket;
    public void launch() {
    	rocket=getRocket();
    	rocket.fired();
    	System.out.println(rocket.hashCode());
    }
    public abstract Rocket getRocket();
}

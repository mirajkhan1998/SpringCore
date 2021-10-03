package com.primary.javaconfig.annotation1;
//no source code
public class Car {
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
   public void derive() {
	   //System.out.println("ready to derive");
	   engine.start();
   }
	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}

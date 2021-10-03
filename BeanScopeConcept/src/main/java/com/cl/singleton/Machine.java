package com.cl.singleton;

public class Machine {
    private static  Machine instance;
	private Machine() {

	}

	public static Machine getInstance() {
		if(instance==null) {
			instance=new Machine();
			return instance;
		}
		else 
			return instance;
		
	}
	public String message() {
		//System.out.println(instance);
		return "u are able to get instance";
	}

}

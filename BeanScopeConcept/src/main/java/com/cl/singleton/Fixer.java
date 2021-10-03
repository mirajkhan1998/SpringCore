package com.cl.singleton;

public class Fixer {
	public void fixed() {
		Machine machine=Machine.getInstance();
		System.out.println(machine.hashCode());
		System.out.println(machine.message());
	}

}

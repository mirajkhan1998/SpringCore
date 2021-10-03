package com.cl.singleton;

public class Assembler {
	public void assemble() {
		Machine machine=Machine.getInstance();
		System.out.println(machine.hashCode());
		System.out.println(machine.message());
		
	}

}

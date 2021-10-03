package com.thread.basic;

public class Test {

	public static void main(String[] args) {
		ThreadTest test=new ThreadTest();
		Thread t1=new Thread(test);
		Thread t2=new Thread(test);
		t1.start();
		t2.start();

	}

}

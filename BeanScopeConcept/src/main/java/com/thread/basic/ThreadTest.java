package com.thread.basic;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		int count = 0;
		for (int i = 0; i < 20; i++) {
			count++;
			System.out.println("java language");
		}
		System.out.println(count);
	}

}

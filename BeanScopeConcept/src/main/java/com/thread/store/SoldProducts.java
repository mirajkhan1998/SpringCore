package com.thread.store;

public class SoldProducts extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Sold products from store");
		}
	}
}

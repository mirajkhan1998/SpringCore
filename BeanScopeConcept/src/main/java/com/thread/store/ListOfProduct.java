package com.thread.store;

public class ListOfProduct extends Thread{
     public void run() {
    	for(int i=0;i<10;i++) {
    		System.out.println("product in store");
    	}
     }
}

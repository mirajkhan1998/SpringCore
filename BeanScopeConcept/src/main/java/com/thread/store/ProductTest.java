package com.thread.store;

public class ProductTest {

	public static void main(String[] args) {
		ListOfProduct lop=new ListOfProduct();
		SoldProducts sp=new SoldProducts();
		lop.start();
		sp.start();

	}

}

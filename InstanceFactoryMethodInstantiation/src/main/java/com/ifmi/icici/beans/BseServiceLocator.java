package com.ifmi.icici.beans;

public class BseServiceLocator {
	public StockInfo getService(String stockExchangeName) {
		return new StockInfoImpl();
	}
	/*public StockInfo getService() {
		return new StockInfoImpl();
	}*/

}

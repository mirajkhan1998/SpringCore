package com.ifmi.icici.beans;

public class StockManager {
	StockInfo stockInfo;

	public StockManager(StockInfo stockInfo) {
		this.stockInfo = stockInfo;
	}
	public double getStockPrice(String stockName) {
		double price=0;
		price=stockInfo.getStockPrice(stockName);
		return price;
	}
	

}

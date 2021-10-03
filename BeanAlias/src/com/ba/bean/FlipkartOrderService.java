package com.ba.bean;

public class FlipkartOrderService {
	FlipkartOrder flipkartOrder;

	ParcelService dtdcParcelService;
	ParcelService blueDartParcelService;

	public String placefOrder() {
		String awbNo = null;
		if (flipkartOrder.address.getZipCode() <= 1000  && flipkartOrder.address.getZipCode() >=5000) {
			awbNo = dtdcParcelService.parcel(flipkartOrder.getProduct(), flipkartOrder.getAddress());
		} else {
			awbNo = blueDartParcelService.parcel(flipkartOrder.getProduct(), flipkartOrder.getAddress());
		}
		return "you can track your flipkartOrder with tracking id:" + awbNo;

	}

	public void setFlipkartOrder(FlipkartOrder flipkartOrder) {
		this.flipkartOrder = flipkartOrder;
	}

	public void setDtdcParcelService(ParcelService dtdcParceeService) {
		this.dtdcParcelService = dtdcParceeService;
	}

	public void setBlueDartParcelService(ParcelService blueDartParcelService) {
		this.blueDartParcelService = blueDartParcelService;
	}

}

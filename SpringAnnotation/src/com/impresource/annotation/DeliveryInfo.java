package com.impresource.annotation;
//spring bean configuration file
public class DeliveryInfo {
	private String deliveryExecutive;
	private String recieverName;

	public void setDeliveryExecutive(String deliveryExecutive) {
		this.deliveryExecutive = deliveryExecutive;
	}

	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}

	@Override
	public String toString() {
		return "DeliveryInfo [deliveryExecutive=" + deliveryExecutive + ", recieverName=" + recieverName + "]";
	}

}

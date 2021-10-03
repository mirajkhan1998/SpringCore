package com.impresource.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//source code availabe
//stereotype annotation
@Component
public class Parcel {
	private Customer sender;
	private Customer reciever;
	private DeliveryInfo deliveryInfo;

	@Autowired
	public void setSender(Customer sender) {
		this.sender = sender;
	}

	@Autowired
	public void setReciever(Customer reciever) {
		this.reciever = reciever;
	}

	@Autowired
	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	@Override
	public String toString() {
		return "Parcel [sender=" + sender + ", reciever=" + reciever + ", deliveryInfo=" + deliveryInfo + "]";
	}

}

package com.si.beans;

public class MessageWriter {
     IMessageConverter messageConverter;
     public void writeMessage(String message) {
    	 String cmessage=null;
    	 cmessage=messageConverter.convert(message);
    	 System.out.println(cmessage);
    	 
     }
	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
     
}

package com.si.beans;

public class PdfMessageConverterImpl implements IMessageConverter{
	public String convert(String message) {
		return "<pdf>"+message+"</pdf>";
	}

}

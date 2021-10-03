package com.cpe.editor;

import java.beans.PropertyEditorSupport;

import com.cpe.bean.Rectangle;

public class RectanglePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String value) throws IllegalArgumentException {
		int length = 0;
		int breadth = 0;
		Rectangle rectangle = null;
		String[] token = null;
		token = value.split(",");
		length = Integer.parseInt(token[0]);
		breadth = Integer.parseInt(token[1]);
		rectangle=new Rectangle();
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		setValue(rectangle);

	}

}

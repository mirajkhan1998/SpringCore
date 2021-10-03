package com.cpe.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.bean.Rectangle;

public class RectangleCustomPropertyEditor implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Rectangle.class, new RectanglePropertyEditor());

	}

}

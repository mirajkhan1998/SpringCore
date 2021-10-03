package com.cpe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cpe.bean.Box;
import com.cpe.editor.RectangleCustomPropertyEditor;

@SuppressWarnings("deprecation")
public class CustomPropertyEditorTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/cpe/common/application-context.xml"));
		((ConfigurableListableBeanFactory) beanFactory).addPropertyEditorRegistrar(new RectangleCustomPropertyEditor());
		Box box = beanFactory.getBean("box", Box.class);
		System.out.println(box);
	}
    
}

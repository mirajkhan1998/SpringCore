package com.ai.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {
	IEngine engine;
	private String engineName;
	private BeanFactory beanFactory;

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public void drive() {
		IEngine engine = beanFactory.getBean(engineName, IEngine.class);
		boolean flag = false;
		flag = engine.ignite();
		if (flag == true)
			System.out.println("car is ready to derive with :" + engine);
		else
			System.out.println("failed to start the engine");
		//System.out.println(beanFactory);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;

	}

}

package com.bpp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bpp.util.InstanceTracker;

public class InstanceTrackerBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String id) throws BeansException {
		InstanceTracker.increment();
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String id) throws BeansException {
		return object;
	}

}

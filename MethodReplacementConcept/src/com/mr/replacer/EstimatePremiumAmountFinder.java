package com.mr.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class EstimatePremiumAmountFinder implements MethodReplacer {

	@Override
	public Object reimplement(Object object, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("estimatePremiumAmount")) {

			return Double.parseDouble("1111.222");
		}
		return null;
	}

}

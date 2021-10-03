package com.mr.bean;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class EstimatePremiumAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("estimatePremiumAmount")) {
			String policyNo = (String) args[0];
			long insurredAmount = (Long) args[1];
			int tenure = (Integer) args[2];
			int age = (Integer) args[3];
			String gender = (String) args[4];
			System.out.println("policyNo: " + policyNo + " " + "insurredAmount: " + insurredAmount + " " + "tenure: "
					+ tenure + "age: " + age + "gender: " + gender);
			return 6000;
		} else if (method.getName().equals("estimatePremiumAmount")) {
			String policyNo = (String) args[0];
			long insurredAmount = (Long) args[1];
			int tenure = (Integer) args[2];
			int age = (Integer) args[3];
			String gender = (String) args[4];
			String place = (String) args[5];
			System.out.println("policyNo: " + policyNo + " " + "insurredAmount: " + insurredAmount + " " + "tenure: "
					+ tenure + "age: " + age + "gender: " + gender + " place:" + place);
			return 7000;
		}
		return null;

	}

}

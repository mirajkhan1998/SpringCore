package com.scope.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**we can use @componet to define a class as bean definition*/
@Component
/**@lazy we can use @lazy to tell to the IocContainer don't create the object while creating the
 *object for singleTon bean definition */
@Lazy
/**@scope is used for how many object of a bean definition should be created within IocConatainer*/
@Scope(value = "prototype")
public class Rectangle {
	private int length;
	private int breath;

	public void setLength(int length) {
		this.length = length;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}
    public Rectangle() {
		System.out.println("rectangle() called");
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

}

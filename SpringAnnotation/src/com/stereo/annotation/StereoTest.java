package com.stereo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stereo/annotation/stereo-anno.xml");
		Launcher launcher=context.getBean("rocket1",Launcher.class);
		System.out.println(launcher);

	}

}

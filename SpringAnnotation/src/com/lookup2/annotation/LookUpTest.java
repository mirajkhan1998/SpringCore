package com.lookup2.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(LMConfig.class);
		Launcher launcher=context.getBean("launcher", Launcher.class);
		Launcher launcher1=context.getBean("launcher", Launcher.class);
		launcher.launch();
		launcher1.launch();
	}

}

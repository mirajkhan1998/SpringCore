package com.lm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lm.beans.Launcher;
import com.lm.beans.Rocket;

public class LookUpTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lm/common/application-context.xml"));
		Launcher launcher = factory.getBean("launcher", Launcher.class);
		Launcher launcher1 = factory.getBean("launcher", Launcher.class);
		//System.out.println(launcher);
        launcher.launch();
        launcher1.launch();
        //System.out.println(rocket1==rocket2);
	}

}

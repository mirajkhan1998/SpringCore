package com.lookup2.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rocket {
    public void fired() {
    	System.out.println("rocket fired");
    }
}

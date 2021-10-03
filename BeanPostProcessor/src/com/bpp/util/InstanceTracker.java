package com.bpp.util;

import java.util.concurrent.atomic.AtomicInteger;

public class InstanceTracker {
	public static AtomicInteger instances = new AtomicInteger(0);

	public static void increment() {
		instances.getAndIncrement();
	}

	public static int getInstances() {
		return instances.intValue();
	}

}

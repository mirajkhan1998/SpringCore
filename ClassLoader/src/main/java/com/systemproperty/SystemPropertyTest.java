package com.systemproperty;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SystemPropertyTest {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		Set<Entry<Object, Object>> set = props.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Object, Object> entry = itr.next();
			System.out.println(entry);
		}

	}

}

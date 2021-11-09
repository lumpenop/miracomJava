package com.edu.collection.test;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		
		Enumeration e = p.propertyNames();

		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String value = p.getProperty(name);
			System.out.println(name+"=========="+value);
		}
	}

}

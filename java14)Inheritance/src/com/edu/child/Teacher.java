package com.edu.child;

import com.edu.parent.Person;

public class Teacher extends Person {
	
	private String subject;

	public Teacher(String name, int age, String address, String subject) {
		super(name, age, address); // null, 0, null
		this.subject = subject;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() + " stuId:" + subject;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " stuId:" + subject;
	}
	
}

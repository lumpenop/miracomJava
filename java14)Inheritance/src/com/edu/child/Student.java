package com.edu.child;

import com.edu.parent.Person;

public class Student extends Person {
	
	private int stuid;

	public Student(String name, int age, String address, int stuid) {
		super(name, age, address); // null, 0, null
		this.stuid = stuid;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() + " stuId:" + stuid;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " stuId:" + stuid;
	}
	
	
}

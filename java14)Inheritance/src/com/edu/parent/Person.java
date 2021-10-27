package com.edu.parent;

public class Person {
	private String name;
	private int age;
	private String adress;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
	}
	
	public String getDetails() {
		return name + ", " + age + ", " + adress;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + age + ", " + adress;
	}
}

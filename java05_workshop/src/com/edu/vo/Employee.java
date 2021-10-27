package com.edu.vo;

public class Employee {
	private String name;
	private MyDate birthDate;
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, MyDate birthDate, double salary) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public MyDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + birthDate + ", " + salary;
	}
	
	
	
	
	
	
}

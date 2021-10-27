package com.edu.parent;

import com.edu.util.MyDate;

public class Employee {
	
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, MyDate birthDate, double salary) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public Employee(String name, MyDate birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	
//	public String getDetails() {
//		return name + ", " + birthDate.getDate() + ", " + salary;

	//	}  MyDate Class의 toString() 메소드를 오버라이딩 하여
	// 	.getDate() 메소드를 사용하지 않고 생략된 toString()으로 값을 return 받는다
	
	public String getDetails() {
		return name + ", " + birthDate + ", " + salary;
	}
	
	
}

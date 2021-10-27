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

	//	}  MyDate Class�� toString() �޼ҵ带 �������̵� �Ͽ�
	// 	.getDate() �޼ҵ带 ������� �ʰ� ������ toString()���� ���� return �޴´�
	
	public String getDetails() {
		return name + ", " + birthDate + ", " + salary;
	}
	
	
}

package com.edu.test;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("Peter", new MyDate(2000,1,1));
		Manager m = new Manager("James", new MyDate(1990, 07, 29), 30000.0, "IT");
		Engineer n = new Engineer("Tom", new MyDate(1990, 07, 29), 50000.0, "AI", 1000);
		System.out.println(m.getDetails());
		System.out.println(e.getDetails());
		
		System.out.println(n.getDetails());
		
		m.changeDept("Marketing");
		
		System.out.println(m.getDetails());
	}

}

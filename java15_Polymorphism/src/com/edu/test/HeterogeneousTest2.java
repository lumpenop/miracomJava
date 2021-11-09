package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class HeterogeneousTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emps = {
			new Manager("James", new MyDate(1990,1,1), 30000.0, "IT"),
			new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000),
			new Secretary("Jane", new MyDate(1955, 1,1), 35000.0, "Tom")
		};
		
		
		for(Employee e : emps) {
			System.out.println(e.getDetails());
			if(e instanceof Engineer) {
				System.out.println( (e.getSalary() * 12) + ((Engineer) e ).getBonus() );
			}else {
				System.out.println(e.getSalary() * 12);
			}
			
			System.out.println("------");
		}
	}

}

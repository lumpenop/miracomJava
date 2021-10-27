package com.edu.service.test;

import com.edu.service.EmployeeService;
import com.edu.vo.Manager;
import com.edu.vo.MyDate;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager("sw", new MyDate(1990,1,1), 1000.0, "IT", 100);
		Manager m2 = new Manager("sw2", new MyDate(1990,1,1), 1000.0, "IT2", 100);
		
		System.out.println(m1.getName());
		
		EmployeeService es = new EmployeeService();
		
				
		es.addManager(m1);
		es.addManager(m2);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		es.addManager(m1);
		
		
		System.out.println(es.binMidx[0]);
		System.out.println(es.managers[0]);
		
		es.deleteManager(1);
		
		System.out.println(es.binMidx[1]);
		System.out.println(es.managers[1]);
		
		es.deleteManager(1);
		es.addManager(m1);
	}

}

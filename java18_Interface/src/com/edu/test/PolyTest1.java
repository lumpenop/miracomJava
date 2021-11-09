package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee e = new Employee("Peter", new MyDate(2000,1,1));
		Employee m = new Manager("James", new MyDate(1990,1,1), 30000.0, "IT");
		Employee eg = new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000);
		Employee s = new Secretary("Jane", new MyDate(1955, 1,1), 35000.0, "Tom");
		
		
		System.out.println(m.getDetails()); //null, null, 0.0
//		System.out.println(e.getDetails()); //Peter, 2000-1-1, 100.0
		System.out.println(eg.getDetails());
		System.out.println(s.getDetails());
		
		((Manager) m ).changeDept("Marketing"); // 클래스 데이터타입 업캐스팅
		

	}

}

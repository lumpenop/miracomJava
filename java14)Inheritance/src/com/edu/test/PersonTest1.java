package com.edu.test;

import com.edu.child.Student;
import com.edu.child.Teacher;

public class PersonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("아이유", 28, "신사동", 123);
		Teacher t = new Teacher("강호동", 32, "신사동", "수학");
		
		System.out.println(s.getDetails());
		System.out.println(t.getDetails());
		
		System.out.println(s); 
		System.out.println(t);
		// toString() 이 생략된 상태기 때문에 s.toString()과 동일한 결과
	}

	
}

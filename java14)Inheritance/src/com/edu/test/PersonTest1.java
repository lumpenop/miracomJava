package com.edu.test;

import com.edu.child.Student;
import com.edu.child.Teacher;

public class PersonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("������", 28, "�Ż絿", 123);
		Teacher t = new Teacher("��ȣ��", 32, "�Ż絿", "����");
		
		System.out.println(s.getDetails());
		System.out.println(t.getDetails());
		
		System.out.println(s); 
		System.out.println(t);
		// toString() �� ������ ���±� ������ s.toString()�� ������ ���
	}

	
}

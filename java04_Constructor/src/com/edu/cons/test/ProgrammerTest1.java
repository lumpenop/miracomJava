package com.edu.cons.test;

public class ProgrammerTest1 {

	public static void main(String[] args) {
		
		NoteBook nb1 = new NoteBook("APPLE", 200, 4455);
		
		Programmer p1 = new Programmer("Lee", "LA", "Python", 0);
		
		System.out.println(nb1.brandName);
		System.out.println(p1.Salary);
	}

}

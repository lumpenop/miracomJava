package com.edu.cons.test;

import com.edu.cons.Programmer;
import com.edu.cons.NoteBook;

public class ProgrammerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer james = new Programmer("james", "NY", "JAVA", 300);
		
		
		james.setNoteBook(new NoteBook("APPLE", 250, 1234));
		
		james.getNoteBook().printInfo();
		
		
		System.out.println(james.getProgrammerInfo()); 
	}

}

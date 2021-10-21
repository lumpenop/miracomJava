package com.edu.oop.test;

import com.edu.oop2.NoteBook;

/*
 * NoteBookTest2 코드의 문제점 
 * 1. 클래스 필드 할당 부분이 코드를 너무 길게 만든다
 * 	-> 코드의 재사용성을
 */	

public class NoteBookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoteBook nb = new NoteBook();
		NoteBook nb2 = new NoteBook();
		
		
		
//		nb.brandName = "LG gram";
//		nb.price = 170;
//		nb.serialNumber = 1234;
//		
//		nb2.brandName = "SAMSUNG";
//		nb2.price = 185;
//		nb2.serialNumber = 4455;
		
		
		nb.setNoteBookInfo("LG gram", 170, 1234);
		nb2.setNoteBookInfo("SAMSUNG", 185, 4455);
		
		nb.printInfo();
		System.out.println(nb.getBrandName());
		
		
		nb2.printInfo();
		System.out.println(nb2.getBrandName());
		
		
		
	}

}

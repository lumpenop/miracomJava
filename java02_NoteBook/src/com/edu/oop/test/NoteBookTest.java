package com.edu.oop.test;

import com.edu.oop.NoteBook;

/*
 * ~Test class
 * ::
 * 실행클래스...main
 * ::
 * 1. 객체 생성
 * 2. 메모리에 올라간 멤버에 접근...
 *    field ---> 값 할당 (assign)
 *    method ---> 호출 (calling)
 */

public class NoteBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoteBook nb = new NoteBook();
		
		
		nb.brandName = "LG gram";
		nb.price = 170;
		nb.serialNumber = 1234;
		
		nb.printInfo();
		System.out.println(nb.getBrandName());
		
		
	}

}

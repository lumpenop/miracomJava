package com.edu.oop.test;

import com.edu.oop.NoteBook;

/*
 * ~Test class
 * ::
 * ����Ŭ����...main
 * ::
 * 1. ��ü ����
 * 2. �޸𸮿� �ö� ����� ����...
 *    field ---> �� �Ҵ� (assign)
 *    method ---> ȣ�� (calling)
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

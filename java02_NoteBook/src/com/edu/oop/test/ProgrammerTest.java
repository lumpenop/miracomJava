/**
 * 
 */
package com.edu.oop.test;

import com.edu.oop2.Programmer;

/*
 *  1. Programmer 2�� ����
 *  2. ������ Programmer ���� �Է�
 *  	�Էµ� �� ���
 */
public class ProgrammerTest {

	public static void main(String[] args) {
		
		
		Programmer p1 = new Programmer();
		Programmer p2 = new Programmer();
		 
		p1.setProgrammerInfo("P1", "Seoul", "Java", 3200);
		p2.setProgrammerInfo("P2", "Seoul", "Python", 3000);
		
		System.out.println(p1.getProgrammerInfo());
		System.out.println(p2.getProgrammerInfo());
	}

}

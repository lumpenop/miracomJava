/**
 * 
 */
package com.edu.oop.test;

import com.edu.oop2.Programmer;

/*
 *  1. Programmer 2명 생성
 *  2. 각각의 Programmer 정보 입력
 *  	입력된 값 출력
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

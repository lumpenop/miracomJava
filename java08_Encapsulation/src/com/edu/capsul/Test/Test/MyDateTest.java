package com.edu.capsul.Test;

import com.edu.capsul.MyDate;


/*
 *  Encapsulation Pattern 3����
 *  
 *  1. ��ä�� �ʵ忡 privateó���� �Ͽ� �ܺο��� ���� ������ �� ������ �մϴ�.
 *  2. private ó�� �� �ʵ�� getter/setter�θ� ������ �� �ֽ��ϴ�.
 *  3. setter�� ���� �ùٸ� ���� �Էµ� �� �ֵ��� ����� ����մϴ�. 
 */

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate md = new MyDate();
		
		System.out.println(md.getMonth());
		
		md.setMonth(3);
		md.setDay(30);
		
		System.out.println(md.getMonth());
		
	}

}

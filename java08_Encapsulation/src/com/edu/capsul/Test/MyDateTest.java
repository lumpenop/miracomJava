package com.edu.capsul.Test;

import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ��¥�� �Է����ּ���");
		
		System.out.println("�� �Է�");
		int month = sc.nextInt();
		
		System.out.println("�� �Է�");
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		
		System.out.println(md.getMonth());
		
		md.setMonth(month);
		md.setDay(day);
		
		System.out.println(md.getMonth());
		
	}

}

package com.edu.test;

import java.util.Scanner;

/*
 * Scanner Ŭ����
 * ::
 * ����� �ڵ忡 ���� ���� �Է¹޴°��� �ƴ϶�(�����Ͻ����� ���� �ϵ��ڵ��Ǿ��� �ִ�...)
 * new Account(10000);
 * 
 * ����������� ���� �Է¹����� �ֵ��� �Ҷ� �ʿ��� Ŭ������ Scanner
 */
public class ScannerTest1{
	public static void main(String[] args) {
		System.out.println("Ű����� ���ڸ� �Է��ϼ��� >>>>>");
		
		//1. Scanner ��ü�� ����...�޸𸮿� �ø���.
		Scanner sc = new Scanner(System.in);
		
		//2. Scanner�� ����� �̿��ؼ� ���� �޾ƿ�..
		int i=sc.nextInt(); // ���� ����
		int j = sc.nextInt();
		
		System.out.println("���ڰ� : "+i+","+j);

	}

}

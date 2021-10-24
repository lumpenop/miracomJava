package com.edu.test;

import java.util.Scanner;

/*
 * Scanner 클래스
 * ::
 * 실행시 코드에 값을 직접 입력받는것이 아니라(컴파일시점에 값이 하드코딩되어져 있다...)
 * new Account(10000);
 * 
 * 실행시점에서 값을 입력받을수 있도록 할때 필요한 클래스가 Scanner
 */
public class ScannerTest1{
	public static void main(String[] args) {
		System.out.println("키보드로 숫자를 입력하세요 >>>>>");
		
		//1. Scanner 객체를 생성...메모리에 올린다.
		Scanner sc = new Scanner(System.in);
		
		//2. Scanner의 기능을 이용해서 값을 받아옴..
		int i=sc.nextInt(); // 공백 기준
		int j = sc.nextInt();
		
		System.out.println("숫자값 : "+i+","+j);

	}

}

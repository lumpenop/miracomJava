package com.edu.capsul.Test;

import java.util.Scanner;

import com.edu.capsul.MyDate;


/*
 *  Encapsulation Pattern 3가지
 *  
 *  1. 객채의 필드에 private처리를 하여 외부에서 직접 접근할 수 없도록 합니다.
 *  2. private 처리 된 필드는 getter/setter로만 소통할 수 있습니다.
 *  3. setter를 통해 올바른 값만 입력될 수 있도록 제어문을 사용합니다. 
 */

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 날짜를 입력해주세요");
		
		System.out.println("월 입력");
		int month = sc.nextInt();
		
		System.out.println("일 입력");
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		
		System.out.println(md.getMonth());
		
		md.setMonth(month);
		md.setDay(day);
		
		System.out.println(md.getMonth());
		
	}

}

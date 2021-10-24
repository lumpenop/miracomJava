package com.edu.array.algo.test;

import java.util.Scanner;

public class CatchAMouseTest2 {
	
	
	private static String solve(int a, int b, int m) {
		
		int lenA = Math.abs(a - m);
		int lenB = Math.abs(b - m);

		String result = "";
		
		if(lenA < lenB) result = "Cat A";
		else if(lenA > lenB) result = "Cat B";
		else result = "Mouse Escapes"; 
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("위치를 입력해주세요");
		
		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result = solve(catA, catB, mouse);
		
		System.out.println("Result:: " + result );
		
		
	}

}

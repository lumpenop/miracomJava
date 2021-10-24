package com.edu.array.algo.test;

import java.util.Scanner;

/*
 * 인원 수를 입력 받아서 
 * 각각의 인원에 성격 유형을 입력 받은 후
 * 가장 많은 성격 유형을 출력
 * 성격 유형은 1~5의 값
 */

public class ArrayPersonTypeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
		
		int num = 6;
		
		int[] people = {1, 4, 4, 4, 5, 3};
		
		int[] count = new int[5];
		
		for(int i : people) {
			count[i-1]++; // index가 0 부터 시작
		}
		
		int max = count[0];
		for(int i : count) {
			if(i > max) max = i;
		} 
		
		System.out.println("result:: " + ++max);
		// index 위치에 따라 빼준 값 다시 더해줌
		
		
		
		

	}

}

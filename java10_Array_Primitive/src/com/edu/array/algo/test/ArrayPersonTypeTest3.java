package com.edu.array.algo.test;

import java.util.Scanner;

/*
 * �ο� ���� �Է� �޾Ƽ� 
 * ������ �ο��� ���� ������ �Է� ���� ��
 * ���� ���� ���� ������ ���
 * ���� ������ 1~5�� ��
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
			count[i-1]++; // index�� 0 ���� ����
		}
		
		int max = count[0];
		for(int i : count) {
			if(i > max) max = i;
		} 
		
		System.out.println("result:: " + ++max);
		// index ��ġ�� ���� ���� �� �ٽ� ������
		
		
		
		

	}

}

package com.edu.array.test;

public class BasicArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {11, 22, 33};
		
		
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
		
		
		int[] arr2 = {11, 22, 33};
		
	
		for(int i=0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println(arr2);
		
		arr = arr2;
		System.out.println(arr.toString());

	}

}

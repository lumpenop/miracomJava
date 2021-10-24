package com.edu.array.test;

public class BasicArrayCopyTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = {5, 6, 7, 8};
		
		System.arraycopy(arr, 0, arr2, 0, arr2.length);
	

		for(int i : arr) System.out.print(i);
		System.out.println();
		for(int i : arr2) System.out.print(i);
	}

}
